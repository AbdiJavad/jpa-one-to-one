package com.javad.jpaonetoone.repository;

import com.javad.jpaonetoone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByTutorialId(Long tutorialId);
}
