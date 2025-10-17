package com.billing_service.grpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import billing_service.BillingResponse;
import billing_service.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {
	
	private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);
	
	public void createBillingAccount(billing_service.BillingRequest billingRequest, 
			StreamObserver<billing_service.BillingResponse> responseObserver) {
		
		log.info("createBillingAccount request received {}", billingRequest.toString());
		
		BillingResponse response = BillingResponse.newBuilder()
				.setAccountId("12345")
				.setStatus("Active")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
