package com.tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by jimmy on 2017/7/5.
 * Gson中使用泛型
 */
public class GenericTest {
    public static void main(String[] args){
        Gson gson = new Gson();
        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";
        String[] strings = gson.fromJson(jsonArray, String[].class);
        System.out.println(strings);
        List<String> stringList = gson.fromJson(jsonArray, new TypeToken<List<String>>(){}.getType());
        System.out.println(stringList);
    }
}
