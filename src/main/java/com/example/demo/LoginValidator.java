package com.example.demo;
/*
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate (Object object, Errors e) {
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "firstName", "firsName.empty");
    }
}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Service
public class LoginValidator implements Validator {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean supports(Class aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors e) {
        //ValidationUtils.rejectIfEmpty(e, "username", "username.empty");

        User user = (User) object;

        if(user.getEmail() == null || user.getEmail().equals("")){
            e.rejectValue("e-post","username.empty");
        }

        if(!userRepository.existsUserByEmail(user.getEmail())) {
            e.rejectValue("username", "wrong username");
        }

        if(user.getPassword() == null || user.getPassword().equals("") ){
            e.rejectValue("password", "incorrect");
        }

    }
}*/
