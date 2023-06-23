package com.javad.jpaonetoone.controller;

import com.javad.jpaonetoone.model.Tutorial;
import com.javad.jpaonetoone.model.TutorialDetails;
import com.javad.jpaonetoone.repository.TutorialDetailsRepository;
import com.javad.jpaonetoone.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("tutorials")
public class TutorialDetailsController {

    @Autowired
    private TutorialRepository tutorialRepository;
    @Autowired
    private TutorialDetailsRepository tutorialDetailsRepository;

    @PostMapping("/{tutorialId}/details")
    public TutorialDetails save(@PathVariable Long tutorialId,@RequestBody TutorialDetails tutorialDetails){
        Tutorial tutorial=tutorialRepository.findById(tutorialId).get();
        tutorialDetails.setCreatedOn(new Date());
        tutorialDetails.setTutorial(tutorial);
        return tutorialDetailsRepository.save(tutorialDetails);

    }
}
