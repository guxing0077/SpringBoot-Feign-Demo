package com.demo.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.feign.model.UserProfile;
import com.demo.feign.service.FeignUsage;

@RestController
@RequestMapping("v1/")
public class FeignExampleController {

	@Autowired
	FeignUsage gitClient;

	@GetMapping("/profile/{username}")
	UserProfile getProfile(@PathVariable(name="username") String username) {
		return gitClient.getGithubUserProfile(username);
	}

}
