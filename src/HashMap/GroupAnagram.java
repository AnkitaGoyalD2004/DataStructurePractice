package HashMap;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hm = new HashMap<>();
        List<List<String>> ans  = new ArrayList<>();
        for(String e : strs ){
            char c[] = e.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!hm.containsKey(s)){
                hm.put(s,new ArrayList<>());
            }
            hm.get(s).add(e);
        }
        ans.addAll(hm.values());
        return ans;
    }
}
