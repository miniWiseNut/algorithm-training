package com.qnut.huawei;

import java.io.*;
import java.util.Scanner;

/**
 * @Description
 *  A Famous Saying: Much Ado About Nothing (2012/8).
 * @Author QNut
 * @Date
 * @Version 1.0
 **/
public class P26_字符串排序 {
    // 通过率 10%
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {{
//            String string = sc.nextLine();
//            StringBuilder sb = new StringBuilder();
//            char[] strArr = string.toCharArray();
//            for (int i = 0; i < strArr.length; i++) {
//                if (strArr[i] >= 'A' && strArr[i] <= 'z') {
//                    sb.append(strArr[i]);
//                    strArr[i] = '+';
//                }
//            }
//
//            char[] sortChar = sb.toString().toCharArray();
//            // 忽略大小写 保持原状排序(冒泡)
//            //外层循环控制排序趟数
//            for (int i = 0; i < sortChar.length - 1; i++) {
//                //内层循环控制每一趟排序多少次
//                for (int j = 0; j < sortChar.length - 1 - i; j++) {
//                    String now = String.valueOf(sortChar[j]).toLowerCase();
//                    String next = String.valueOf(sortChar[j + 1]).toLowerCase();
//                    if (now.charAt(0) > next.charAt(0)) {
//                        char newC = sortChar[j];
//                        sortChar[j] = sortChar[j + 1];
//                        sortChar[j + 1] = newC;
//                    }
//                }
//            }
//            string = new String(strArr);
//            for (int i = 0; i < sortChar.length; i++) {
//                string = string.replaceFirst("\\+", String.valueOf(sortChar[i]));
//            }
//            System.out.println(string);
//        }}
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null){
            char[] ch = s.toCharArray();
            char[] chars = new char[ch.length];
            int flag = 65,j = 0;
            while(flag <= 90){
                for(int i = 0; i < ch.length; i ++){
                    if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)){
                        if(ch[i] == flag || ch[i] == flag + 32){
                            chars[j] = ch[i];
                            j++;
                        }
                    }
                }
                flag++;
            }
            j = 0;
            for(int i = 0; i < ch.length; i ++){
                if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)){
                    ch[i] = chars[j];
                    j++;
                }
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
