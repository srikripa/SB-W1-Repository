package com.sri.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>	{

}
