package com.ELearningModel.Elearning.DTO;

import com.ELearningModel.Elearning.Model.Tutor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDto {
    private String courseName;
    private String courseDescription;
    private String difficulty;
    private String url;
    private Tutor tutor;
}
