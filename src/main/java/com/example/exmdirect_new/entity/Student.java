package com.example.exmdirect_new.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends User {

    @ManyToOne
    @JoinColumn(name = "school_class_id", nullable = false)
    private SchoolClass schoolClass; // связь с классом
}
