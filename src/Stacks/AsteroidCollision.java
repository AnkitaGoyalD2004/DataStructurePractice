package StacksAndQueues;
import java.util.Stack;
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
   Stack<Integer> s = new Stack<>();
   for(int i=0;i<asteroids.length;i++)
    {
        if(asteroids[i]<=0)
        {
            while(!s.isEmpty() && s.peek ()> 0 && s.peek()<asteroids[i]*-1)
                s.pop();
            
            if(!s.isEmpty() && s.peek()==asteroids[i]*-1){
                s.pop();}
                else if(!s.isEmpty() && s.peek() >= -1*asteroids[i]){
                continue;
            }else{
                s.push (asteroids[i]);}
        }
        else
           s.push(asteroids[i]);   
    }
    int n=s.size();
    int arr[]=new int[n];
    
    for(int i=n-1;i>=0;i--)
    arr[i]=s.pop();
    return arr;
	
    }
}
