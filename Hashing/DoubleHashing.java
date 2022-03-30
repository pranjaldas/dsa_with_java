package Hashing;
import java.util.*;
class DoubleHashing{
    String[] hashTable;
    int usedCellsNumber;
    DoubleHashing(int size){
        hashTable = new String[size];
        usedCellsNumber=0;
    }
    // HASH FUNCTION 1
    public int modASCIIhashFunction(String word, int sizeOfhashtable){
        char[] wordToCharArr= word.toCharArray();
        int sum = 0;
        for(int i=0; i<wordToCharArr.length;i++){
            // CONVERTING CHAR TO INT MEANS FINDING THE ASCI VALUE OF THE CHARACTER
            sum += wordToCharArr[i];
        }
        return sum % sizeOfhashtable;
    }
    // HASH FUNCTION 2
    public int addAlldigits(int sum){
        int value= 0;
        while(sum > 0){
            value += sum % 10;
            sum = sum/10;
        }
        return value;
    }
    public int hashFunctionTwo(String word, int sizeOfhashtable){
        char[] wordToCharArr= word.toCharArray();
        int sum = 0;
        for(int i=0; i<wordToCharArr.length;i++){
            // CONVERTING CHAR TO INT MEANS FINDING THE ASCI VALUE OF THE CHARACTER
            sum += wordToCharArr[i];
        }
        while(sum > sizeOfhashtable){
            sum = addAlldigits(sum);
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
            int hashValueOne = modASCIIhashFunction(word, hashTable.length);
            int hashValueTwo= hashFunctionTwo(word,hashTable.length);
            for(int i=0 ;i< hashTable.length ;i++){
                int newIndex= hashValueOne + (hashValueTwo * i);
                if(hashTable[newIndex] == null){
                    hashTable[newIndex]= word;
                    usedCellsNumber++;
                    System.out.println(word+ " inserted successfully !!!");
                    return;
                }
            }
            System.out.println(word+ " not inserted successfully !!!");
        }
        

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
        int counter = 0;
        for(int i= index;i <index+ hashTable.length; i++){
            int newIndex= (index+(counter*counter)) % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex]== word){
                System.out.println(word+" found in the index "+newIndex);
                return true;
            }
            counter++;

        }
        return false;
    }
    public boolean deleteFromHashtable(String word){
        int index= modASCIIhashFunction(word, hashTable.length);
        int counter = 0;
        for(int i= index;i <index+ hashTable.length; i++){
            int newIndex= (index+ (counter *counter)) % hashTable.length;
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