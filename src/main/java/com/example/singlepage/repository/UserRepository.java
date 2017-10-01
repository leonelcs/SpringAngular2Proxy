package com.example.singlepage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.singlepage.model.User;

@RepositoryRestResource(collectionResourceRel="user",path="user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
