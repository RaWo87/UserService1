package sda;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    Map<String,String> dictionary = new HashMap<>();

    public void addWord(String pol, String eng){
    if(!dictionary.containsKey(pol)){
        dictionary.put(pol,eng);
    }else {
        System.out.println("duplikat elo "+ pol);
    }
    }







}
