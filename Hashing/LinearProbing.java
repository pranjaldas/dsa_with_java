import java.util.*;
class LinearProbing{
    String[] hashTable;
    int usedCellsNumber;

    public LinearProbing(int size){
        hashTable = new String[size];
        usedCellsNumber=0;
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
    // TO GET LOAD FACTOR, IF LOAD FACTOR IS MORE THAN 7.5 WE GO FOR REHASH
    public double getLoadFactor(){
        return usedCellsNumber * 1.0/hashTable.length;
    }
    // REHASH
    public void rehash(String word){
        ArrayList<String> tempArrayList= new ArrayList<String>();
        for(String s : hashTable){
            if(s != null){
                tempArrayList.add(s);
            }
        }
        tempArrayList.add(word);
        hashTable = new String[hashTable.length * 2];
        for(String s: tempArrayList){
            insertIntoHashTable(s);
        }
    }
    public void insertIntoHashTable(String word){
        if(getLoadFactor() >= 7.5){
            rehash(word);
        }else{
            int hashVal= modASCIIhashFunction(word,hashTable.length);
            for(int i= hashVal; i<hashVal+hashTable.length;i++){
                int newIndex= i % hashTable.length;
                if(hashTable[newIndex] ==null ){
                    hashTable[newIndex]= word;
                    System.out.println(word+ " inserted");
                    break;
                }else{
                    System.out.println(word+ " not inserted in index "+newIndex+", going to check for next place");
                }
            }
        }
        usedCellsNumber++;

    }
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists");
            return;
        } else {
            System.out.println("\n----------HashTable----------");
            for (int i=0; i<hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }
    public boolean searchHashtable(String word){
        int index= modASCIIhashFunction(word, hashTable.length);
        for(int i= index;i <index+ hashTable.length; i++){
            int newIndex= i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex]== word){
                System.out.println(word+" found in the index "+newIndex);
                return true;
            }

        }
        return false;
    }
    public boolean deleteFromHashtable(String word){
        int index= modASCIIhashFunction(word, hashTable.length);
        for(int i= index;i <index+ hashTable.length; i++){
            int newIndex= i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex]== word){
                hashTable[newIndex]= null;
                System.out.println(word+" deleted successfully");
                return true;
            }

        }
        System.out.println(word+" not found to deleted");
        return false;
    }
}