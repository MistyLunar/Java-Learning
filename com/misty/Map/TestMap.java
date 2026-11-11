package com.misty.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "abandon");
        map.put(15, "moon");
        map.put(65, "night");
        map.put(65, "MoonNight");
        System.out.println(map.get(65));
    }
}
