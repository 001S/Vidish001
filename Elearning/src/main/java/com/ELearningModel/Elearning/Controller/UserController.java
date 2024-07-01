package com.ELearningModel.Elearning.Controller;

import com.ELearningModel.Elearning.DTO.UserDto;
import com.ELearningModel.Elearning.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
@GetMapping(value= "/user")
    public String newUser(Model model){
    model.addAttribute("userDto", new UserDto());
    return "user";
}
@PostMapping(value="/user")
    public String saveUser(UserDto userDto, Model model){
    try{
        userService.createUser(userDto);
        return "user";
    }
    catch (Exception e){
        e.printStackTrace();
        model.addAttribute("e", e);
        return "error";
    }
}

}
