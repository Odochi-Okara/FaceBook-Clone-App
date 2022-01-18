package com.example.facebook_app.service;

import com.example.facebook_app.model.Post;
import com.example.facebook_app.model.PostLike;
import com.example.facebook_app.model.User;
import com.example.facebook_app.repository.PostLikeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostLikeService {
    @Autowired
    PostLikeRepository postLikeRepository;

    public PostLike getPostLikeByPostAndUser(Post post, User user) {
        return postLikeRepository.getPostLikeByPostAndAndUser(post, user);
    }

    public void addLike(PostLike like) {
        postLikeRepository.save(like);
    }

    public void deleteLike(PostLike like) {
        postLikeRepository.delete(like);
    }

    public void deleteAllPostLike(Post post, User user) {
        postLikeRepository.deleteAllByPostAndUser(post, user);
    }
}
