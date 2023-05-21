package HashMap;
import java.util.HashMap;
import java.util.Map;
public class hashing {
    public static void main(String[] args){
        // country(key) , population(value)
        HashMap<String,Integer> hm = new HashMap<>();
        // Insertion
        hm.put("India" , 120);
        hm.put("US" , 30);
        hm.put("china" , 150);

        System.out.print(hm);

        //Search
        if(hm.containsKey("china")){
            System.out.println("Key is Present");
        }else{
            System.out.println("key is not present");
        }
        // get the value of key
        System.out.println(hm.get("china")); //key exist
        System.out.println(hm.get("Indonesia")); // key doesnot exist

        //Iteration
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
