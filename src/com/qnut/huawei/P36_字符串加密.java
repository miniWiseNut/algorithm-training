package com.qnut.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P36_字符串加密 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pwdA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String pwdB = "abcdefghijklmnopqrstuvwxyz";
            String key = sc.nextLine();
            String pwd = sc.nextLine();
            char[] keyArr = key.toCharArray();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < keyArr.length; i++) {
                list.add(String.valueOf(keyArr[i]));
            }
            list = list.stream().distinct().collect(Collectors.toList());
            for (String s: list) {
                pwdA = pwdA.replace(s, "");
                pwdB = pwdB.replace(s, "");
            }
            StringBuilder aStr = new StringBuilder();
            StringBuilder bStr = new StringBuilder();
            for (String s: list) {
                if (s.toCharArray()[0] >= 'a' && s.toCharArray()[0] <= 'z') {
                    bStr.append(s);
                } else if (s.toCharArray()[0] >= 'A' && s.toCharArray()[0] <= 'Z') {
                    aStr.append(s);
                }
            }
            aStr.append(pwdA);
            bStr.append(pwdB);
            char[] pwdArr = pwd.toCharArray();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < pwdArr.length; i++) {
                if (pwdArr[i] >= 'a' && pwdArr[i] <= 'z') {
                    int em = pwdArr[i] - 'a';
                    result.append(String.valueOf(bStr.toString().charAt(em)));
                } else if (pwdArr[i] >= 'A' && pwdArr[i] <= 'Z') {
                    int em = pwdArr[i] - 'A';
                    result.append(String.valueOf(aStr.toString().charAt(em)));
                }
            }
            System.out.println(result);
        }
    }
}
