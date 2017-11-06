package com.ctrivia.android;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Ayush on 10/26/2017.
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}