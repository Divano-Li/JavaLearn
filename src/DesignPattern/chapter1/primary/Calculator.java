package DesignPattern.chapter1.primary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:简单的计算器
 * Created by 徐礼林 on 2017/4/13.
 */
public class Calculator {
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入数字 A : ");
            String A  = br.readLine();
            System.out.println("请输入运算符号(+,-,*,%) : ");
            String B = br.readLine();
            System.out.println("请输入数字 C : ");
            String C = br.readLine();
            String result="";
            switch (B){
                case "+":
                    result = String.valueOf(Double.parseDouble(A)+Double.parseDouble(C));
                    break;
                case "-":
                    result = String.valueOf(Double.parseDouble(A)-Double.parseDouble(C));
                    break;
                case "*":
                    result = String.valueOf(Double.parseDouble(A)*Double.parseDouble(C));
                    break;
                case "/":
                    if(B=="0"){
                        System.out.println("除数不为0");
                        break;
                    }else{
                        result = String.valueOf(Double.parseDouble(A)/Double.parseDouble(C));
                        break;
                    }
            }
            System.out.println("计算结果: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
