package com.example.demo.redis;

public abstract class BasePrefix  implements KeyPrefix{
    private int expiredTime;
    private String prefix;

    public BasePrefix(String prefix) {
        this(0, prefix);
        // TODO Auto-generated constructor stub
    }
    public BasePrefix(int expiredTime, String prefix) {
        super();
        this.expiredTime = expiredTime;
        this.prefix = prefix;
    }
    public int expiredTime() { //默认0代表永不过期
        return expiredTime;
    }
    public String getPrefix() {
        String ClassName = getClass().getSimpleName();
        return ClassName+":"+prefix;
    }
}