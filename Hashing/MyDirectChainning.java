import java.util.LinkedList;
public class MyDirectChainning {
    // HASH TABLE IS GOING TO  BE AN ARRAY OF LINKED LIST
    public  LinkedList<String>[] hashTable;
    public int maxChainSize=5;


    public MyDirectChainning(int size){
        hashTable = new LinkedList[size];
    }

    public int modASCIIhashFunction(String word, int sizeOfhashtable){
        char[] wordToCharArr= word.toCharArray();
        int sum = 0;
        for(int i=0; i<wordToCharArr.length;i++){
            // CONVERTING CHAR TO INT MEANS FINDING THE ASCI VALUE OF THE CHARACTER
            sum += wordToCharArr[i];
        }
        return sum % sizeOfhashtable;
    }

    public void insert(String word){
        int hashValue = modASCIIhashFunction(word, hashTable.length);
        if(hashTable[hashValue]==null){
            // NEW CELL
            hashTable[hashValue]= new LinkedList<String>();
            hashTable[hashValue].add(word);
        }else{
            System.out.print("Collision happened \n");
            hashTable[hashValue].add(word);
        }
    }
    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("Hash table is empty");
        }else{
            System.out.println("\n----------HashTable----------");
            for(int i=0;i< hashTable.length;i++){
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }

    public boolean searchHashtable(String word){
        int index= modASCIIhashFunction(word,hashTable.length);
        if(hashTable==null){
            System.out.println("Hash table is empty \n");
            return false;
        }
        if(hashTable[index] != null && hashTable[index].contains(word)){
            System.out.println(word +" found in index "+index);
            return true;
        }else{
            System.out.println(word +" not found in index ");
            return false;
        }
    }
    public void deleteElement(String word){
        if(searchHashtable(word)){
            int index = modASCIIhashFunction(word,hashTable.length);
            hashTable[index].remove(word);
            System.out.println(word+" deleted successfully");
        }else{
            System.out.println(word+" not found to delete");
        }
    }

}
