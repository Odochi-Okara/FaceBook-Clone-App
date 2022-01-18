package com.example.facebook_app.service;

import com.example.facebook_app.model.Comment;
import com.example.facebook_app.model.CommentLike;
import com.example.facebook_app.model.User;
import com.example.facebook_app.repository.CommentLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentLikeService {
    @Autowired
    CommentLikeRepository commentLikeRepository;

    public CommentLike getCommentLikeByCommentAndUser(Comment comment, User userObj) {
        return commentLikeRepository.getCommentLikeByCommentAndUser(comment, userObj);
    }

    public void addLike(CommentLike like) {
        commentLikeRepository.save(like);
    }


    public void deleteLike(CommentLike like) {
        commentLikeRepository.save(like);
    }
}
