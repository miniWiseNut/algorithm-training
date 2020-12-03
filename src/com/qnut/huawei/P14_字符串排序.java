package com.qnut.huawei;

import java.util.*;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P14_字符串排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int total = sc.nextInt();
            // 方法1
            List<String> list = new ArrayList<>();
            for (int i = 0; i < total; i++) {
                list.add(sc.next());
            }
            Collections.sort(list);
            for (String s: list) {
                System.out.println(s);
            }

            // 方法2
//            String[] arr = new String[total];
//            for (int i = 0; i < total; i++) {
//                arr[i] = sc.next();
//            }
//            Arrays.sort(arr);
//            for (String s: arr) {
//                System.out.println(s);
//            }
        }
    }
}
