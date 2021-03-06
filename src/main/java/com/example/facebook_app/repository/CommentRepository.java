package com.example.facebook_app.repository;

import com.example.facebook_app.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment getCommentById(Long commentId);

    List<Comment> findAllByPostId(Long id);
}
