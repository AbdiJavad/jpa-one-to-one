package com.javad.jpaonetoone.model;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "published")
    private Boolean published;
}
