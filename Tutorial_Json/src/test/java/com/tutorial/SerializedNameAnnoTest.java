package com.tutorial;

import com.google.gson.Gson;
import com.tutorial.pojo.Student;

/**
 * Created by jimmy on 2017/7/4.
 */
public class SerializedNameAnnoTest {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setId(1L);
        stu.setName("jimmy");
        stu.setEmail("jimmy@test.com");
        //
        Gson gson = new Gson();
       // System.out.println(gson.toJson(stu));
        //{"id":1,"stuName":"jimmy","emailAddress":"jimmy@test.com"}
        String str1 = "{\"id\":1,\"stuName\":\"jimmy\",\"email_address\":\"jimmy@test.com\"}";
        Student stu1 = gson.fromJson(str1,Student.class);
        System.out.println(stu1.getEmail());
        String str2 = "{\"id\":1,\"stuName\":\"jimmy\",\"email\":\"jimmy@test.com\"}";
        Student stu2 = gson.fromJson(str2,Student.class);
        System.out.println(stu2.getEmail());
    }
}
