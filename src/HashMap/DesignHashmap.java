package HashMap;
import java.util.*;
public class DesignHashmap {
    HashMap<Integer,Integer> map;
    public void  MyHashMap() {
        map = new HashMap<>();
    }
    
    public void put(int key, int value) {
        map.put(key,value);
    }
    
    public int get(int key) {
        if(map.containsKey(key)){return map.get(key);}
        return -1;
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}
