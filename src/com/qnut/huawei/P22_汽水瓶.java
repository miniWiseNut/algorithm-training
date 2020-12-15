package com.qnut.huawei;

import java.util.Scanner;

/**
 * @Description
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P22_汽水瓶 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int total = 0;

            total = drink(num, total);
            if (total != 0) {
                System.out.println(total);
            }
        }
    }

    private static int drink(int num, int total) {
        if (num > 2) {
            int now = num / 3;
            int last = num % 3;
            total += now;
            int thisTime = now + last;
            if (thisTime > 2) {
                total = drink(thisTime, total);
            } else if (thisTime == 2) {
                total +=1;
            }
        }

        return total;
    }
}
