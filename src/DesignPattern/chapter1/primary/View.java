package DesignPattern.chapter1.primary;

import DesignPattern.chapter1.primary.Operation;
import DesignPattern.chapter1.primary.SqrtOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/13.
 */
public class View {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个数A : ");
        try {
            String paraA  = br.readLine();
            System.out.println("请输入一个符号B(+ - / *) : ");
            String operator = br.readLine();
            System.out.println("请输入另一个数C : ");
            String paraC =br.readLine();
            Operation op = new SqrtOperation();
            String result = op.operation(paraA,operator,paraC);
            System.out.println("运算结果 : "+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
