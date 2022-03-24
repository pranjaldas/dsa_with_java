public class Driver {
    public static void main(String args[]){
        // MyDirectChainning directChaining = new MyDirectChainning(15); 
        // directChaining.insert("word");
        // directChaining.insert("pranjal");
        // directChaining.insert("ghikl");
        // directChaining.insert("jnjr");
        // directChaining.displayHashTable();
        // directChaining.searchHashtable("pranjal");
        // LinearProbing mLinearProbing = new LinearProbing(15);
        // mLinearProbing.insertIntoHashTable("Pranjal");
        // mLinearProbing.insertIntoHashTable("Das");
        // mLinearProbing.insertIntoHashTable("Dipali");
        // mLinearProbing.insertIntoHashTable("Munu");
        // mLinearProbing.displayHashTable();
        // System.out.println(mLinearProbing.searchHashtable("Das"));
        // mLinearProbing.deleteFromHashtable("Das");
        // mLinearProbing.deleteFromHashtable("Das");
        // mLinearProbing.displayHashTable();
        QuadraticProbing mQuadraticProbing = new QuadraticProbing(15);
        mQuadraticProbing.insertIntoHashTable("Pranjal");
        mQuadraticProbing.insertIntoHashTable("Das");
        mQuadraticProbing.insertIntoHashTable("Dipali");
        mQuadraticProbing.insertIntoHashTable("Munu");
        mQuadraticProbing.displayHashTable();
        // System.out.println(mProbing.searchHashtable("Das"));
        // mQuadraticProbing.deleteFromHashtable("Das");
        // mQuadraticProbing.deleteFromHashtable("Das");
        // mQuadraticProbing.displayHashTable();
    }
    
}
