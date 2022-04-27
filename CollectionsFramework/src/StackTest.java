import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<String> stack=new Stack<>();
        stack.add("Hii");
        stack.add("hellow");
        stack.push("hii");
        stack.pop();
//        System.out.println(stack.get(0));
        stack.forEach(consumer->System.out.println(consumer));
    }
}
