package HashMap;
import java.util.*;
public class Implementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n ; //n is nodes
        private int N; // N is the bucket
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0 ; i < 4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key){
          int bi = key.hashCode();
          return Math.abs(bi)%N; // because we need value between (0 to N-1)
         }

        private int SearchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i   = 0 ; i < ll.size() ; i++){
                if(ll.get(i).key == key){
                    return i; // di
                }
            }
            return -1;
        }

       public void rehash(){
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N*2];

        for(int  i= 0 ; i<N*2 ; i ++){
            buckets[i] = new LinkedList<>();
        }
         
        for(int  i = 0 ; i < oldBucket.length; i++){
        LinkedList<Node> ll = oldBucket[i];
        for(int j = 0 ; j < ll.size(); j++){
            Node node = ll.get(j);
            put(node.key , node.value);
        }

        }

       }

       public void put(K key , V value){
       int bi = hashFunction(key);
       int di = SearchInLL(key, bi);

       if(di == -1){// key doesn't exist
       buckets[bi].add(new Node(key,value));
       n++;
       }else{ // key exist
       Node data = buckets[bi].get(di);
       data.value = value;
       }
       double lambda = (double)n/N;
       if(lambda > 2.0){
        // rehashing
        rehash();

       }
    }
    }

}
