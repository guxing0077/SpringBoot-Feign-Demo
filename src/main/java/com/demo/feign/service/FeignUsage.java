package com.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.feign.model.UserProfile;

@FeignClient(name = "GITHUB-API", url = "https://api.github.com/")
public interface FeignUsage {

	@RequestMapping("users/{username}")
	UserProfile getGithubUserProfile(@PathVariable(name = "username") String username);

}
