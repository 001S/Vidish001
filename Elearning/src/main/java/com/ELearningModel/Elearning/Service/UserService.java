package com.ELearningModel.Elearning.Service;

import com.ELearningModel.Elearning.DTO.UserDto;
import com.ELearningModel.Elearning.Model.User;
import com.ELearningModel.Elearning.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
public void createUser(UserDto userDto) throws IllegalStateException{
if(null !=userRepository.findByusername(userDto.getUserName())){
    throw new IllegalStateException("Already user there " + userDto.getUserName());
} else if(null != userRepository.findByemail(userDto.getEmail())){
    throw new IllegalStateException("Email id is invalid or already be there "+ userDto.getEmail());
    }
   String username = userDto.getUserName();
   String password = new BCryptPasswordEncoder(8).encode(userDto.getPasswoord());
   String name = userDto.getName();
   String surname = userDto.getSurname();
   String email = userDto.getEmail();
    LocalDate date = LocalDate.now();

    User user= new User(username, password, name, surname, email, date);
    userRepository.save(user);
}
public void update(User user) throws IllegalStateException{
    User add = userRepository.findByusername(user.getUsername());

    add.setName(user.getName());
    add.setSurname(user.getSurname());
    add.setEmail(user.getEmail());
    userRepository.save(add);
}
public void patch(User user){
    User current = userRepository.findByusername(user.getUsername());

    current.setDetails(user.getDetails());
    userRepository.save(current);
}
}
