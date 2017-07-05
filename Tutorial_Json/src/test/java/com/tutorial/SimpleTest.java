package com.tutorial;

import com.google.gson.Gson;
import com.tutorial.pojo.Book;

/**
 * Created by jimmy on 2017/7/4.
 */
public class SimpleTest {

    public static void main(String[] args){
       // SimpleTest.toGsonTest();
       // SimpleTest.fromGsonTest();
       // SimpleTest.beanToJson();
        SimpleTest.beanFromJson();
    }

    //基本数据类型序列化
    public static void toGsonTest(){
        Gson gson = new Gson();
        String jsonNumber = gson.toJson(100);       // 100
        String jsonBoolean = gson.toJson(false);    // false
        String jsonString = gson.toJson("String");  // "String"
        System.out.println(jsonNumber+"--"+jsonBoolean+"--"+jsonString);
    }

    //基本数据类型反序列化
    public static void fromGsonTest(){
        Gson gson = new Gson();
        int i = gson.fromJson("100", int.class);              // 100
        double d = gson.fromJson("\"99.99\"", double.class);  // 99.99
        boolean b = gson.fromJson("true", boolean.class);     // true
        String str = gson.fromJson("String", String.class);   // String
        System.out.println(i+"--"+d+"--"+b+"--"+str+"--");
    }

    //pojo生成json
    public static void beanToJson(){
        Gson gson = new Gson();
        Book book = new Book();
        book.setId(1L);
        book.setName("Java");
        book.setPrice(99.0F);
        System.out.println(gson.toJson(book));
        //{"id":1,"name":"Java","price":99.0}
    }

    //解析json
    public static void beanFromJson(){
        Gson gson = new Gson();
        String json = "{\"id\":1,\"name\":\"Java\",\"price\":99.0}";
        Book book = gson.fromJson(json,Book.class);
        System.out.println(book.getId());
    }
}
