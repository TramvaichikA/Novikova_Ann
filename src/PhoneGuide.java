package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneGuide {
    private HashMap <String,List<String>> pg=new HashMap<>();
    private List <String > number_list;

    public void add(String last_name, String number) {
        if (pg.containsKey(last_name)) {
            number_list = pg.get(last_name);
            number_list.add(number);
            pg.put(last_name, number_list);
        } else {
            number_list = new ArrayList<>();
            number_list.add(number);
            pg.put(last_name, number_list);
        }
    }
    public List<String> get(String last_name) {
        return pg.get(last_name);
    }

}