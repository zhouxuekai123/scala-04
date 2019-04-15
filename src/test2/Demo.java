package test2;



import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String[]arr={"hello","jim","sorry"};
        List<String> list = Arrays.asList(arr);
        //对集合进行具体的业务逻辑
        //new一个对象,把集合参数通过构造方法传进去
        MyList2 myList = new MyList2(list);
        //对象.方法名调用方法, 参数是一个匿名的对象,重写转换方法的具体逻辑
        List<String> result = myList.map(new MapFunction() {
            @Override
            public String transform(String str) {
                return str.toUpperCase();
            }
        });

        //循环遍历结果集合
        for (String s : result) {
            System.out.println(s);
        }
    }
}
