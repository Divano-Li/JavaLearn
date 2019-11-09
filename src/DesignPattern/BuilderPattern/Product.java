package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:一个产品由各个部分组成
 * Created by 徐礼林 on 2017/5/17.
 */
public class Product {
    //对象的创建独立于其组成部分及其装配方式
    List<String> parts = new ArrayList<String>();
    public Product(){
    }
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.println("此产品由以下这些部分组成");
        for(String str : parts){
            System.out.println(str);
        }
    }
}
