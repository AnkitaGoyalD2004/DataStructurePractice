package Strings;

public class MinimumPenalty {
    public static void main(String[] args){

    }
    public int bestClosingTime(String customers) {
        int currPen = 0;
     for(int i = 0 ; i < customers.length(); i++){
       if(customers.charAt(i) == 'Y'){
        currPen ++;
       }
     }
     int minPenalty = currPen;
     int earliestHour = 0;
     for(int i = 0 ; i < customers.length() ; i++){
        char c = customers.charAt(i);
        if(c == 'Y'){
            currPen -- ;
        }else{
            currPen++; 
        }
        if(currPen < minPenalty){
            earliestHour = i+1;
            minPenalty  = currPen ;
        }  
     }
     return earliestHour;
    }
}
