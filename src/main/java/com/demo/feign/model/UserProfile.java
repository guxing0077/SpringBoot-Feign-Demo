package com.demo.feign.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfile {
	String login;
	String id;
	String nodeId;
	String avatarUrl;
	String gravatarId;
	String url;
	String htmlUrl;
	String followersUrl;
	String followingUrl;
	String gistsUrl;
	String starredUrl;
	String subscriptionsUrl;
	String organizationsUrl;
	String reposUrl;
	String eventsUrl;
	String receivedEventsUrl;
	String type;
	String siteAdmin;
	String name;
	String company;
	String blog;
	String location;
	String email;
	String hireable;
	String bio;
	String publicRepos;
	String publicGists;
	String followers;
	String following;
	String createdAt;
	String updatedAt;
}
