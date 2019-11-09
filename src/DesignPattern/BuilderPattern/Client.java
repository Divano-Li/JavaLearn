package DesignPattern.BuilderPattern;

/**
 * Description:Client side  get the Product without knowing the concrete construct procedure of the Product
 * Created by 徐礼林 on 2017/5/19.
 */
public class Client {
    public static void main(String[] args) {
        //Client side needs to construct  a Product.First, he needs a Director
        //Second,he needs to tell
        //指挥官
        Director director = new Director();
        ConcreteBuilder1 con1 = new ConcreteBuilder1();
        ConcreteBuilder2 con2 = new ConcreteBuilder2();
        director.construct(con1);
        director.construct(con2);
        Product product1 =con1.getResult();
        Product product2 =con2.getResult();
        product1.show();
        product2.show();
    }
}
