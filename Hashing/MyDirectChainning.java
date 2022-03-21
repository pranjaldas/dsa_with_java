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

}
