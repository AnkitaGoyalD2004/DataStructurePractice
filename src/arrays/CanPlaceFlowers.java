package Arrays;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[]flowerbed, int n) {
        int count =0;
        int i =1;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                flowerbed[0]=1;
                count++;
            }
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            count++;
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            count++;
        }
        while(i<flowerbed.length-1){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1){
                flowerbed[i]=1;
                count++;
                i++;
            }
            else{
                i++;
            }
        }if(count>=n){
            return true;
        }
        return false;
    }
}
