package com.qnut.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P23_删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            char[] charArr = str.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (map.containsKey(charArr[i])) {
                    map.put(charArr[i], map.get(charArr[i]) + 1);
                } else {
                    map.put(charArr[i], 1);
                }
            }

            int minNum = Integer.MAX_VALUE;
            for (Integer value: map.values()) {
                if (value < minNum) {
                    minNum = value;
                }
            }
            for (Character key: map.keySet()) {
                if (map.get(key) == minNum) {
                    str = str.replace(String.valueOf(key), "");
                }
            }
            System.out.println(str);
        }
    }
}
