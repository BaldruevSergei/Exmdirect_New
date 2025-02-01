package com.example.exmdirect_new.entity;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "school_classes")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_teacher_id")
    private Teacher classTeacher;

    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassSubject> subjects;

}
