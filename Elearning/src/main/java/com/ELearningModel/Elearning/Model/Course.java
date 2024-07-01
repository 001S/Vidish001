package com.ELearningModel.Elearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name= "courseId" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;
    @Column(name = "name", nullable = false, unique = true)
    private String courseName;
    @Column(name= "description", nullable = false)
    private String courseDescription;
    @Column(name="difficulty")
    private String courseDifficulty;
    @Column(name="details")
    private String courseDetails;
    @Column(name= "url")
    private String courseUrl;
}
