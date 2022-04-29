/**
 * THIS IS TO EXPLAIN MARKER INTERFACE ALSO CALLED TAGS, 
 * MARKER INTERFACE IS USED TO PROVIDE PERMISSIONS,
 * AS EXAMPLE IF A CLASS IMPLEMENTS CLONABLE INTERFACE THEN ONLY WE COULD CLONE THE OBJECT
 * EITHER IT WILL THROW CloneNotSupportedException
 */
public class Driver {
 public static void main(String[] args){
     Student std1= new Student(1,"Masud");
     try {
        Student st2= (Student)std1.clone();
        // IF WE DO SHALLOW COPY HASHCODE REMAINS SAME
        // IF WE DO DEEP COPY HASHCODE IS DIFFERENT BECAUSE NEW OBJECT IS CREATED ALTHOUGH THE 
        // CONTENTS INSIDE THE OBJECT IS SAME
        Student st3= std1;
        System.out.println(st3.hashCode());
        System.out.println(std1.toString()+""+std1.hashCode());
        System.out.println(st2.toString()+""+st2.hashCode());
        st2.setRoll(2);
        System.out.println(std1.toString());
        System.out.println(st2.toString());
     } catch (Exception e) {
         e.printStackTrace();
     }
     

 }   
}
