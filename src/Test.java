/**
 * @author chenhz
 * @create 2020/12/23 14:29
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello word!");
        System.out.println(say("github"));
        System.out.println(add(1,2));
        System.out.println(divide(1,2));
        System.out.println(multi(1,2));
        System.out.println(div(1,2));
    }
    public static String say(String str){
        return str;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int divide(int a,int b){
        return a-b;
    }
    public static int multi(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}
