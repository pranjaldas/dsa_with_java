class Printer{
    /**
     * The Synchronized keyword make the method thread safe so that no two thread access the method at the same tim
     */
    synchronized public void print(String name){
        for (int i = 1; i <= 10; i++) {
            System.out.println(name+" thread: "+i);
        }
    }
}