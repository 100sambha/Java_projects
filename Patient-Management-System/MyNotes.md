# Insert Commands (data.sql)

## Individual Inserts
```sql
INSERT INTO Address (id, city, state, country) 
VALUES ('8f2b9153-c3e6-453e-9777-6d914a9712fe', 'Nagar', 'MH', 'IND');

INSERT INTO Address (id, city, state, country) 
VALUES ('4ea34780-a30f-4f2c-9bf7-f15e6a7d3d76', 'Pune', 'MH', 'IND');

INSERT INTO Address (id, city, state, country) 
VALUES ('c7743a76-1e68-49fc-be0e-75c8dc2cc50c', 'Beed', 'MH', 'IND');

INSERT INTO Address (id, city, state, country) 
VALUES ('d4473eab-3be9-445e-9b9b-5878fa0db762', 'Latur', 'MH', 'IND');

INSERT INTO Address (id, city, state, country) 
VALUES ('f9b26a5e-ea44-4925-ac81-6078d98f94b1', 'Nagar', 'MH', 'IND');
```


## Multi Row Inserts
```sql
INSERT INTO Patient (id, name, email, date_of_birth, registered_date, address_id) VALUES
  ('72b0da01-9fe4-41ad-af72-541a5ea8acd6', 'Shankar', '100sambha@gmail.com', '2025-02-02', '2025-02-03', '8f2b9153-c3e6-453e-9777-6d914a9712fe'),
  ('dfbab196-aca3-4496-b78b-08ea8f614279', 'Shankar', '101sambha@gmail.com', '2025-02-02', '2025-02-03', '4ea34780-a30f-4f2c-9bf7-f15e6a7d3d76'),
  ('93b9c47f-c955-47ff-b054-9f00738964d6', 'Shankar', '102sambha@gmail.com', '2025-02-02', '2025-02-03', 'c7743a76-1e68-49fc-be0e-75c8dc2cc50c'),
  ('80b0cf94-bd7c-42db-89a7-d8d192680200', 'Shankar', '103sambha@gmail.com', '2025-02-02', '2025-02-03', 'd4473eab-3be9-445e-9b9b-5878fa0db762'),
  ('3d520727-d250-4c4e-a3b2-61ff8b28f27c', 'Shankar', '104sambha@gmail.com', '2025-02-02', '2025-02-03', 'f9b26a5e-ea44-4925-ac81-6078d98f94b1');
```
```sql
 - SELECT * FROM PATIENT;
 - SELECT * FROM PATIENT;
 - SHOW COLUMNS FROM PATIENT;
 - SHOW COLUMNS FROM ADDRESS;
```

## validated Annotation use
```java
> @Validated({UpdatePatientValidationGroup.class, Default.class})		-->used with controller class methods
> @NotBlank(groups=UpdatePatientValidationGroup.class, message="Required")	-->We can ignore this field when we are updating the filed in json, only if we are not setting it in service class update method, like in create method. used with model classes
```

# Docker

1. **Lightweight Containers**  
   - Docker simplifies building and deploying applications using **lightweight, portable containers**.  

2. **Cross-Platform Compatibility**  
   - A single Docker image can run on multiple environments (Windows, Linux, or cloud platforms like AWS, Azure, GCP).  

3. **All-in-One Packaging**  
   - Source code (e.g., Java), configuration files, and dependencies can be bundled together in a single Docker image.  

4. **Image → Container**  
   - A Docker image acts as a **blueprint**.  
   - From this blueprint, we can create one or many **Docker containers** (the actual running instances of the app).  

5. **Docker Image Registry**  
   - Docker images can be uploaded to a **registry** (e.g., Docker Hub, AWS ECR, Azure Container Registry, or a private/local registry).  
   - Registries let us **store, manage, and distribute** images.  

6. **Pull & Run**  
   - From a registry, we can **pull an image** and start containers based on it.  
   - This is where the **application actually runs**.   

## Docker Commands

   **Pull Image**
   - docker pull postgres:latest

   **Show Images**
   - docker images

   **Show Containers**
   - docker ps
   - docker ps -a

   **Show Networks**
   - docker network ls
   - docker network create patient-network
   - docker inspect patient-network

   **Create container from Images**
   - docker run -d \
      --name postgres-db \
      --network patient-network \
      -e POSTGRES_USER=root \
      -e POSTGRES_PASSWORD=admin \
      -e POSTGRES_DB=patients_records \
      -e TZ=Asia/Kolkata \
      -v my_pgdata:/var/lib/postgresql \
      -p 5000:5432 \
      postgres:latest      
   
   **Start and stop container**
   - docker start postgres-db
   - docker stop postgres-db

   **Excute Container in iterative or detached mode**
   - docker exec -it postgres-db psql -U root -d patients_records
   
### Some postgres-db commands

| Command                         	| Description                                       		|
|-----------------------------------|-----------------------------------------------------------|
| `\l`                            	| List databases                                   			|
| `\list`                        	| List databases                                  			|
| `\c database_name`            	| Connect to a database										|
| `\dt`                           	| List tables in the current database               		|
| `\d table_name`               	| Show table structure (columns, types, constraints)		|
| `CREATE DATABASE dbname;`   		| Create a new database										|
| `DROP DATABASE dbname;`      		| Delete a database											|
| `\c dbname`                    	| Connect to a different database							|
| `SELECT current_database();`		| Show current database										|

      
   Here kafka won't working for local java springboot code here listeners need to update because we are using kafka from 
   docker
   
   **Create Kafka container from image**
	- docker run -d \
		  --name kafka \
		  --network patient-network \
		  -e KAFKA_NODE_ID=1 \
		  -e KAFKA_PROCESS_ROLES=broker,controller \
		  -e KAFKA_CONTROLLER_LISTENER_NAMES=CONTROLLER \
		  -e KAFKA_CONTROLLER_QUORUM_VOTERS=1@kafka:9093 \
		  -e KAFKA_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,EXTERNAL:PLAINTEXT,PLAINTEXT:PLAINTEXT \
		  -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092,EXTERNAL://localhost:9094 \
		  -e KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:9092,CONTROLLER://0.0.0.0:9093,EXTERNAL://0.0.0.0:9094 \
		  -p 9092:9092 \
		  -p 9093:9093 \
		  -p 9094:9094 \
		  apache/kafka:latest

   
   ***Commands***
   -  docker exec -it kafka bash
   
   -  /opt/kafka/bin/kafka-console-producer.sh --topic patient-service --bootstrap-server localhost:9092
   -  /opt/kafka/bin/kafka-console-consumer.sh --topic patient-service --bootstrap-server localhost:9092 --from-beginning
   
   
   
### Java Docker commands

**Build Command**
- docker build -t my_app_patient .

**Run Docker image (create container)**

- docker run -d
  --name patient-service
  --network patient-network
  -e SPRING_DATASOURCE_URL=jdbc:postgresql://postgres-db:5432/patients_records
  -e SPRING_DATASOURCE_USERNAME=root
  -e SPRING_DATASOURCE_PASSWORD=admin
  -e SPRING_JPA_HIBERNATE_DDL_AUTO=update
  -e SPRING_SQL_INIT_MODE=always
  -e BILLING_SERVICE_SERVICE_ADDRESS=billing-service
  -e BILLING_SERVICE_SERVICE_GRPC_PORT=9001
  -e SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9094
  -p 8090:8090
  my_app_patient
  

**Build Command**
- docker build -t my_app_billing .

**Run Docker image (create container)**

- docker run -d
	--name billing-service
	--network patient-network
	-p 8091:8091
	-p 9001:9001
	my_app_billing:latest
	
**Build Command**
- docker build -t my_app_analytical .

**Run Docker image (create container)**

- docker run -d
	--name analytical-service
	--network patient-network
    -e SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9092
	-p 8092:8092
	my_app_analytical:latest


**Build Command**
- docker build -t my_app_gateway .
	   	
**Run Docker image (create container)**
- docker run -d
	--name gateway-service
	--network patient-network
	-p 8096:8096
	my_app_gateway:latest
	

## gRPC - gRPC stands for g Remote Procedure Call developed by google
- proto file can be used to we can describe gRPC service as well as request and response


        - id: patient-service
          uri: http://localhost:8090
          predicates:
            - Path=/api/patient/**
          filters:
            - StripPrefix=1

        - id: api-docs-patient-docs
          uri: http://localhost:8090
          predicates:
            - Path=/api-docs/patients
          filters:
            - RewritePath=/api-docs/patients,/v3/api-docs



**Build Command**
- docker build -t my_app_auth .


**Run Docker image (create container)**
- docker run -d \
	--name auth-service \
	--network patient-network \
	-e SPRING_DATASOURCE_URL=jdbc:postgresql://postgres-db:5432/patients_records \
	-e SPRING_DATASOURCE_USERNAME=root \
	-e SPRING_DATASOURCE_PASSWORD=admin \
	-e SPRING_JPA_HIBERNATE_DDL_AUTO=update \									--needed to set none because of data.sql
	-e SPRING_DATASOURCE_DRIVER_CLASS_NAME=org.postgresql.Driver \
	-e SPRING_SQL_INIT_MODE=always \											--Needed to be removed after dev/qa
	-e JWT_SECRET=89f2c4da73b19ef4a6c8e9b1d3f547aa1c2d9ef98b23cf451e78a4cd924b6f1e \
	-p 8098:8098 \
	my_app_auth
	
	
**Build Command**
- docker build -t my_app_gateway .

**Run Docker image (create container)**
- docker run -d \
	--name gateway-service \
	--network patient-network \
	-p 8096:8096 \
	my_app_gateway
	
	
	
	