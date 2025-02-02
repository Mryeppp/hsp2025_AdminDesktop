package Chapter13.Wrapper;

public class Wrapper01 {
    public static void main(String[] args) {
        Integer a = 127;
        int b = 127;

        int c = 128;
        Integer d = 128;
        //Inteager a = x ; 的底层代码 => Integer a = Integer.ValueOf(x)
        // x在-128 - 127 之间直接返回数字 相当于int a = x ;
        // 在其他范围是创建一个新的对象

        System.out.println(a==b); //true
        System.out.println(c==d); //false
    }
}
