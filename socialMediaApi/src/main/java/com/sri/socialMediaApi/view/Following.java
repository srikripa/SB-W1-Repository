package com.sri.socialMediaApi.view;

import java.util.Set;

import com.sri.socialMediaApi.entity.User;

public class Following {
	
	private Set<User> following;	
	
	public Following(User user)	{
		setFollowing(user.getFollowing());
	}

	public Set<User> getFollowing() {
		return following;
	}

	public void setFollowing(Set<User> following) {
		this.following = following;
	}
}
