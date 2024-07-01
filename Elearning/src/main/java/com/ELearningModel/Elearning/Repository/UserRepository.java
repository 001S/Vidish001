package com.ELearningModel.Elearning.Repository;

import com.ELearningModel.Elearning.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByusername(String username);
    User findByemail(String email);
}
