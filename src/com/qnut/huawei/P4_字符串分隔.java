package com.qnut.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P4_字符串分隔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            StringBuilder str = new StringBuilder();
            str.append(sc.nextLine());
            int num = str.length()%8;
            if (num > 0) {
                for (int i = 0; i < 8 - num; i++) {
                    str.append(0);
                }
            }
            for (int j = 0; j < str.length() / 8; j++) {
                arr.add(str.substring(j*8, (j+1)*8 ));
            }
        }
        for (String s: arr) {
            System.out.println(s);
        }
    }
}
