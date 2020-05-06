package com.example.tryx.hello;

public class helloBean {
    private  String meassage;

    public helloBean(String message) {
        this.meassage = message;
    }

    public String getMeassage() {
        return meassage;
    }

    public void setMeassage(String meassage) {
        this.meassage = meassage;
    }

    @Override
    public String toString() {
        return "helloBean{" +
                "meassage='" + meassage + '\'' +
                '}';
    }
}
