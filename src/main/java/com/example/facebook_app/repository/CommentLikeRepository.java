package com.example.facebook_app.repository;

import com.example.facebook_app.model.Comment;
import com.example.facebook_app.model.CommentLike;
import com.example.facebook_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    CommentLike getCommentLikeByCommentAndUser(Comment comment, User userObj);
}
