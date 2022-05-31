import java.util.List;
class Storage<E>{
    public void store(List<? extends E> list){
        list.forEach(i->System.out.println(i.toString()));
    }

}