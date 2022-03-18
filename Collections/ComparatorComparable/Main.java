import java.util.*;
class Main{
    public static void main(String[] args){
        // Comparable is used in the scenarios where We could modify the Model object.
        // Comparator is used in the scenarious when we could not modify the object 
        // as example id the model or the class imported from 3rd party library
        // in this kind of scenario we use comparable for sorting
        // Collections.sort method accepts two params, one as list of objects and the comparator object 
        // or the list of objects only
        ArrayList<Laptop> laptops=new ArrayList<Laptop>();
        laptops.add(new Laptop("LENOVO",78000,4));
        laptops.add(new Laptop("APPLE",50000,2));
        laptops.add(new Laptop("HP",12000,8));

        // Annonymous inner class used to define the body of compare method.
        // We could use a anoter class implementing Comparator in diff file to do the same.
        Comparator<Laptop> ramComparator= new Comparator<Laptop>(){
            public int compare(Laptop a, Laptop b){
                if(a.getRam() > b.getRam()) 
                    return 1;
                else
                    return 0;
            }
        };
        // Uses the comparator object created above to sort which define the compare method
        Collections.sort(laptops,ramComparator);

        for(Laptop laptop: laptops){
            System.out.println(laptop.getName());
        }
        // uses compareTo method in the Comparable interface implemented by the Laptop
        Collections.sort(laptops);

        for(Laptop laptop: laptops){
            System.out.println(laptop.getName());
        }

        
    }
}