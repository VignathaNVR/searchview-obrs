package com.obrs.service;



import org.springframework.cloud.openfeign.FeignClient;




@FeignClient(name="user-service")
public interface UserServiceClient {
	
	
}
