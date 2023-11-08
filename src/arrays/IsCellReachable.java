package Arrays;

public class IsCellReachable {
    public static void main(String[] args){

    }
     public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy){
            if(t == 1){
                return false;
            }
        }
        int xCorDiff =sx-fx;
        int yCorDiff =sy-fy;

        if(xCorDiff < 0){
            xCorDiff = -xCorDiff;
        }
        if(yCorDiff < 0){
            yCorDiff = -yCorDiff;
        }
        int maxDiff = Math.max(xCorDiff , yCorDiff);
        if(maxDiff <= t){
            return true;
        }
        return false;
    }
}
