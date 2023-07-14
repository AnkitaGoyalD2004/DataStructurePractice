package HashMap;
import java.util.*;
public class DesignHashSet {
    Set<Integer> l;
    public void  MyHashSet() {
       l = new HashSet<>(); 
    }
    
    public void add(int key) {
        if(!l.contains(key)){
        l.add(key);
        }
    }
    
    public void remove(int key) {
        if(l.contains(key)){
            l.remove(key);
        }
    }
    
    public boolean contains(int key) {
        if(l.contains(key)){return true;}
        else{
            return false;
        }
        }
    }
