package nom5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {


    public <T> ArrayList<T> newArrayList( T mas[]){
        ArrayList<T> arrayList = new ArrayList<T>();
        for(int i=0;i< mas.length;i++){
            arrayList.add(mas[i]);
        }
        return  arrayList;
    }

    public <T> HashSet<T> newHasSet(T mas[]){
        HashSet<T> hashSet = new HashSet<T>();
        for(int i=0;i< mas.length;i++){
            hashSet.add(mas[i]);
        }
        return  hashSet;
    }
    public <K,V> HashMap<K,V> newHashMap(K key[],V value[]){

        HashMap<K,V> hashMap = new HashMap<K, V>();
        if(key.length== value.length){
            for(int i=0;i< key.length;i++){
                hashMap.put(key[i],value[i]);
            }
            return  hashMap;
        }
       return  null;
    }


}
