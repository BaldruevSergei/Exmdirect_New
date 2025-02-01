package com.example.exmdirect_new.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "class_subject")
public class ClassSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private SchoolClass schoolClass; // В каком классе ведётся предмет

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher; // Кто преподаёт

    @Column(nullable = false)
    private String subject; // Название предмета
}

