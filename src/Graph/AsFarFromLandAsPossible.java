package Graph;
import java.util.Queue;
import java.util.LinkedList;
public class AsFarFromLandAsPossible {
    class Pair{
        int row;
        int col;
        int dis;
        Pair(int row,int col,int dis){
         this.row=row;
         this.col=col;
         this.dis=dis;
        }
    }
    public int maxDistance(int[][] grid) {
        int[][] ans=new int[grid.length][grid[0].length];
        Queue<Pair> qu=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=grid[i][j];
                if(grid[i][j]==1)
                    qu.add(new Pair(i,j,0));
            }
        }
        if(qu.isEmpty())
            return -1;
        int maxdist=0;
        while(!qu.isEmpty()){
            Pair t=qu.poll();
            int currrow=t.row;
            int currcol=t.col;
            maxdist=t.dis;
            int[] diri={-1,0,1,0};
            int[] dirj={0,1,0,-1};
            for(int i=0;i<4;i++){
                int newi=currrow+diri[i];
                int newj=currcol+dirj[i];
                if(newi>=0 && newj>=0 && newi<ans.length && newj<ans[0].length && ans[newi][newj]==0){
                    ans[newi][newj]=1;
                    qu.add(new Pair(newi,newj,t.dis+1));
                }
            }
        }
        if(maxdist==0)
            return -1;
        return maxdist;
        
    }
}
