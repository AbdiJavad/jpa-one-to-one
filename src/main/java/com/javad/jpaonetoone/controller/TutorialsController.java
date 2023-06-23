package com.javad.jpaonetoone.controller;

import com.javad.jpaonetoone.model.Tutorial;
import com.javad.jpaonetoone.model.TutorialDetails;
import com.javad.jpaonetoone.repository.TutorialDetailsRepository;
import com.javad.jpaonetoone.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tutorials")
public class TutorialsController {

    @Autowired
    private TutorialRepository tutorialRepository;
    @Autowired
    private TutorialDetailsRepository tutorialDetailsRepository;
@PostMapping
    public Tutorial save(@RequestBody Tutorial tutorial){
        return tutorialRepository.save(tutorial);
    }



}
