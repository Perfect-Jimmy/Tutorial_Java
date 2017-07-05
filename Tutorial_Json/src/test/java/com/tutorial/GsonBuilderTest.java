package com.tutorial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tutorial.pojo.Student;

/**
 * Created by jimmy on 2017/7/5.
 */
public class GsonBuilderTest {

    public static void main(String[] args){
        //nullTest();
    }
    //输出null值
    public static void nullTest(){
        Student student = new Student();
        student.setName("jimmy");
        student.setEmail("xxx@sss");
        Gson gson = new Gson();
        String str = gson.toJson(student);
        System.out.println(str); //  {"stuName":"jimmy","emailAddress":"xxx@sss"}
        Gson gsonBuilder = new GsonBuilder()
                                .serializeNulls() //序列化null
                                .create();
        String string = gsonBuilder.toJson(student);
        System.out.println(string);//{"id":null,"stuName":"jimmy","emailAddress":"xxx@sss"}
    }
}
