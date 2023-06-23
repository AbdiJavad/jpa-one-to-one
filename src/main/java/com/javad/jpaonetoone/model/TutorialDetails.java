package com.javad.jpaonetoone.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "tutorial_details")
public class TutorialDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "createdOn")
    private Date createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "tutorial_id")
    private Tutorial tutorial;
}
