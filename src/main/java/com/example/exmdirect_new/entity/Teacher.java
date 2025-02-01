package com.example.exmdirect_new.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "teachers")
public class Teacher  extends User {
    @Column(nullable = false)
    private String subject; // Преподаваемый предмет

    @Column(nullable = true)
    private String classMentor; // Класс, в котором учитель является классным руководителем (не обязательно)

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassSubject> classSubjects; // В каких классах и какие предметы он ведет
}

