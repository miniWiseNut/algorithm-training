package com.qnut.huawei;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Description
        这题的重点在于查找时间和存储空间的处理即数据结构的选取。
        到底是map还是数组还是哈希表可以根据key的范围以及key-value对的个数选取。
        1：如果key取值范围小，那么数组是最合适的。但本题不适合，因为并没有给出key的范围，如果key很大如Integer.MAX-1，那么直接开一个这么大的数组会崩的的
        2：如果key的取值范围很大，但是key的个数少，那么哈希表比较合适
        3：如果key的取值范围很大而且key的个数很多，那么tree是比较合适的。本题目适合tree。
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P8_合并表记录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int total = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < total; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }
            map.forEach((key, value) -> {
                System.out.println(key + " " + value);
            });
        }
    }
}
