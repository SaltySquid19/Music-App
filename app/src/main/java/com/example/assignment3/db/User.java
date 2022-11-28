package com.example.assignment3.db;


import androidx.room.*;


@Entity(tableName = "User")
public class User {//data structure
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String username;
    public String password;
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
