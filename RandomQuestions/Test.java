package dsa_with_java.RandomQuestions;
import java.util.*;
// PROBLEM TO TEST CALL BY VALUE AND CALL BY REFERENCE IN JAVA
// JAVA USES CALL BY REFERENCE ONLY
// HOW JVM USES THE STACK MEMORY AND HEAP MEMORY TO STORE OBJECTS IN HEAP AND REFERENCE IN STACK
class Test{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println("Before :"+list.toString());
        modify(list);
        System.out.println("Before :"+list.toString());
        
    }
    public static void modify(List<String> list1){
        List<String> list= new ArrayList<String>(list1);
        list.add("TEST");
    }

}