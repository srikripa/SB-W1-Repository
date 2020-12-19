package com.sri.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>	 {

}
