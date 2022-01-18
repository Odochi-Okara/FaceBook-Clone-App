package com.example.facebook_app.repository;

import com.example.facebook_app.model.Post;
import com.example.facebook_app.model.PostLike;
import com.example.facebook_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostLikeRepository extends JpaRepository<PostLike, Long> {

    PostLike getPostLikeByPostAndAndUser(Post post, User user);

    void deleteAllByPostAndUser(Post post, User user);
}
