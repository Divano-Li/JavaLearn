package String;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3.intern());

        //内存泄漏问题 subString 方法的缺陷
        String s4 = "aaaaa";
        s4.substring(1);
        s4.substring(1,2);

    }
}
