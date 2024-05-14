package com.furmi.katas;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        // your code
        Map<String,String> map = new HashMap<>();
        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put ("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put ("swedish", "Valkommen");
        map.put ("welsh", "Croeso");

        for (String key : map.keySet()){
            if (language.equals(key)){
                return map.get(key);
            }
        }
        return "Welcome";
    }
}
