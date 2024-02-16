package com.vasscompany.webapp.springweb.models.dto;

import com.vasscompany.webapp.springweb.models.User;

import lombok.Data;

@Data
public class UserDto {
    private String title;
    private User user;

}
