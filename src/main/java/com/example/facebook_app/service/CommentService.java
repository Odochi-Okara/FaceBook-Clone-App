package com.example.facebook_app.service;

import com.example.facebook_app.model.Comment;
import com.example.facebook_app.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<Comment> findAll(Long id) {
        return commentRepository.findAllByPostId(id);
    }

    public void addComment(Comment comment1) {
        commentRepository.save(comment1);
    }

    public Comment getCommentById(Long commentId) {
        return commentRepository.getCommentById(commentId);
    }

    public void editComment(Comment comment, String comment1) {
        comment.setComment(comment1);
        commentRepository.save(comment);
    }

    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }
}
