package me.hadi.lombok.model;

import lombok.Builder;
import lombok.Value;

@Value
public class User {

     String username;
     String name;

    @Builder(toBuilder = true)
    User(String name,String email){
        this.username = email;
        this.name = name;
    }


}