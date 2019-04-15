package test2;



import java.util.ArrayList;
import java.util.List;

public class MyList2 {
    //定义一个变量,用来接收传进来的集合参数
    private List<String> oldList;
    //构造函数,方便new对象的时候把原有的集合传入进来
    public MyList2 (List<String>strList){
        this.oldList=strList;
    }
    //定义一个方法,参数是一个接口
    public List<String> map (MapFunction mf){
        //定义一个历史的集合,用来装新的数据
        ArrayList<String> tmp = new ArrayList<>();
        //循环遍历集合元素,对每个元素进行操作
        for (String str : oldList) {
            //用接口对象调用接口的方法,对str做处理
            String newStr = mf.transform(str);
            tmp.add(newStr);//处理后的新字符串放进到历史的集合中去
        }
        return tmp;//返回去临时的集合
    }
}
