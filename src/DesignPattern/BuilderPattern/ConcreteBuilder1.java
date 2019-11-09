package DesignPattern.BuilderPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/17.
 */
public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("partA1");
    }

    @Override
    public void BuildPartB() {
        product.add("paraB2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
