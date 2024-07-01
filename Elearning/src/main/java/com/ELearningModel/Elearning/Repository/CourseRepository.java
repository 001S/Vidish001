package com.ELearningModel.Elearning.Repository;

import com.ELearningModel.Elearning.Model.Course;
import com.ELearningModel.Elearning.Model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCourseName(String courseName);
    List<Course> findByAllTutor(Tutor tutor);
}
