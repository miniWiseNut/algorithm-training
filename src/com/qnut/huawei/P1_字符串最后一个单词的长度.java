package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P1_字符串最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s = scan.nextLine();
            String[] arr = s.split(" ");
            System.out.println(arr[arr.length - 1].length());
        }
    }
}
