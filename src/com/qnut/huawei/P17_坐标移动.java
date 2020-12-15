package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P17_坐标移动 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(";");
            int xIndex = 0;
            int yIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i].charAt(0)) {
                    case 'W':
                        try {
                            int num = Integer.valueOf(arr[i].substring(1));
                            yIndex += num;
                        } catch (Exception e) {
                            break;
                        }
                        break;
                    case 'A':
                        try {
                            int num = Integer.valueOf(arr[i].substring(1));
                            xIndex -= num;
                        } catch (Exception e) {
                            break;
                        }
                        break;
                    case 'S':
                        try {
                            int num = Integer.valueOf(arr[i].substring(1));
                            yIndex -= num;
                        } catch (Exception e) {
                            break;
                        }
                        break;
                    case 'D':
                        try {
                            int num = Integer.valueOf(arr[i].substring(1));
                            xIndex += num;
                        } catch (Exception e) {
                            break;
                        }
                        break;
                    default:
                        break;

                }
            }
            System.out.println(xIndex + "," + yIndex);
        }
    }
}
