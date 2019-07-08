package com.builder.users.controller;

import com.builder.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping(value = "/getUserInfo")
//    @RequestMapping(method = RequestMethod.GET, value = "/getUserInfo", produces = "application/json")
    public ResponseEntity<String> getEligibilityFlags() {
        return new ResponseEntity<String>(userProfileService.testVar(), HttpStatus.OK);
    }

}
