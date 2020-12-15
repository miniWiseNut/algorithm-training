package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P21_密码验证合格程序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pwd = sc.nextLine();
            char[] pwdChar = pwd.toCharArray();
            for (int i = 0; i < pwdChar.length; i++) {
                if (pwdChar[i] >= 'a' && pwdChar[i] <= 'c') {
                    pwdChar[i] = '2';
                } else if (pwdChar[i] >= 'd' && pwdChar[i] <= 'f') {
                    pwdChar[i] = '3';
                } else if (pwdChar[i] >= 'g' && pwdChar[i] <= 'i') {
                    pwdChar[i] = '4';
                } else if (pwdChar[i] >= 'j' && pwdChar[i] <= 'l') {
                    pwdChar[i] = '5';
                } else if (pwdChar[i] >= 'm' && pwdChar[i] <= 'o') {
                    pwdChar[i] = '6';
                } else if (pwdChar[i] >= 'p' && pwdChar[i] <= 's') {
                    pwdChar[i] = '7';
                } else if (pwdChar[i] >= 't' && pwdChar[i] <= 'v') {
                    pwdChar[i] = '8';
                } else if (pwdChar[i] >= 'w' && pwdChar[i] <= 'z') {
                    pwdChar[i] = '9';
                } else if (pwdChar[i] >= 'A' && pwdChar[i] < 'Z') {
                    String str = String.valueOf(pwdChar[i]).toLowerCase();
                    pwdChar[i] = ++str.toCharArray()[0];
                } else if (pwdChar[i] == 'Z') {
                    pwdChar[i] = 'a';
                }
            }
            System.out.println(new String(pwdChar));
        }
    }
}
