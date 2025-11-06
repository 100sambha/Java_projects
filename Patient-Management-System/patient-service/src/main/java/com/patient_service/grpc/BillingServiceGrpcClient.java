package com.patient_service.grpc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import billing_service.BillingRequest;
import billing_service.BillingResponse;
import billing_service.BillingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class BillingServiceGrpcClient {
	
	private final ManagedChannel channel;
	private final BillingServiceGrpc.BillingServiceBlockingStub blockingStub;
	
//	private static Logger log = LoggerFactory.getLogger(BillingServiceGrpcClient.class);
	
	public BillingServiceGrpcClient(
			@Value("${billing_service.service.address:localhost}") String serverAddress,
			@Value("${billing_service.service.grpc.port:9001}") int serverPort
			) {
		System.out.println("Connecting to billing service GRPC service at "+serverAddress+":"+serverPort);
		this.channel = ManagedChannelBuilder
				.forAddress(serverAddress, serverPort)
				.usePlaintext()
				.build();
		blockingStub = BillingServiceGrpc.newBlockingStub(channel);
	}
	
	public BillingResponse createBillingAccount(String patientId, String name, String email) {
		BillingRequest billingRequest = BillingRequest.newBuilder()
				.setPatientId(patientId)
				.setEmail(email)
				.setName(name)
				.build();

		BillingResponse response = blockingStub.createBillingAccount(billingRequest);
		System.out.println(response);
		return response;
	}	
}