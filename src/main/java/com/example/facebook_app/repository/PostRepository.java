package com.example.facebook_app.repository;

import com.example.facebook_app.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post getPostById(Long id);

}
