package com.example.demo.redis;

public class UserKey extends BasePrefix{

    public UserKey(String prefix) {
        super( prefix);
        // TODO Auto-generated constructor stub
    }


    public static UserKey getById=new UserKey("id");
    public static UserKey getByName=new UserKey("name");

    @Override
    public int expireSeconds() {
        return 60;
    }
}
