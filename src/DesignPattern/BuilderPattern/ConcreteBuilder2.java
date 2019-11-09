package DesignPattern.BuilderPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/19.
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("partA2");
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
