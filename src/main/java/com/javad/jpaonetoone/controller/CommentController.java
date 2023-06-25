package com.javad.jpaonetoone.controller;

import com.javad.jpaonetoone.model.Comment;
import com.javad.jpaonetoone.repository.CommentRepository;
import com.javad.jpaonetoone.repository.TutorialRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tutorials")
public class CommentController {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/{tutorialId}/comments")
    public Comment save(@PathVariable("tutorialId") Long tutorialId, @RequestBody Comment comment) throws Exception {
        Comment comment1 = tutorialRepository.findById(tutorialId).map(tutorial -> {
            comment.setTutorial(tutorial);
            return commentRepository.save(comment);
        }).orElseThrow(() -> new Exception("Not Found"));
        return comment1;
    }

    @GetMapping("/{tutorialId}/comments")
    public List<Comment> findAllCommentByTutorialId(@PathVariable("tutorialId") Long tutorialId) throws Exception {
        if (!tutorialRepository.existsById(tutorialId))
            throw new Exception("Not Found");
        return commentRepository.findByTutorialId(tutorialId);

    }

}
