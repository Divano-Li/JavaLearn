package innerClass;

public class TestInner {
    private int number = 100;
    public class Inner{
        private int number = 200;
        public void paint(){
            int number = 500;
            //局部覆盖原则
            System.out.println(number);
            //通过this引用内部类的成员属性
            System.out.println(this.number);
            //通过外部类名加this的方式访问外部类成员属性
            System.out.println(TestInner.this.number);
        }
    }

    public static void main(String args[]){
        //注意创建内部类对象分为两个步骤
        TestInner inner = new TestInner();
        TestInner.Inner in = inner.new Inner();
        in.paint();
    }
}
