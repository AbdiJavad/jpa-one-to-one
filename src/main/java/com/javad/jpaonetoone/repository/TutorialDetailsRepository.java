package com.javad.jpaonetoone.repository;

import com.javad.jpaonetoone.model.TutorialDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails,Long> {
}
