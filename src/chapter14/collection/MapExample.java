package chapter14.collection;

import chapter12.Language;
import chapter12.User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, User> myMap = new TreeMap<>();
        myMap.put("poxos@mail.com", new User("poxos", "poxosyan", "poxos@mail.com", Language.RU));
        myMap.put("petros@mail.com", new User("petros", "poxosyan", "petros@mail.com", Language.RU));
        myMap.put("martiros@mail.com", new User("Martiros", "poxosyan", "petros@mail.com", Language.RU));
        myMap.put("aramayis@mail.com", new User("Aramayis", "poxosyan", "petros@mail.com", Language.RU));

//        for (String key : myMap.keySet()) {
//            System.out.println(key + " -> " + myMap.get(key));
//        }

//        for (User value : myMap.values()) {
//            System.out.println(value);
//        }
        for (Map.Entry<String, User> stringUserEntry : myMap.entrySet()) {
            System.out.println(stringUserEntry.getKey() + " -> " + stringUserEntry.getValue());
//            System.out.println(stringUserEntry);
        }
    }
}
