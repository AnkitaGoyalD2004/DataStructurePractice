package Graph;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
           int count = 0;
           for (int i = 0; i < grid.length; i++) {
               for (int j = 0; j < grid[0].length; j++) {
                   if ( grid[i][j] == '1' && visited[i][j] != true) {
                       bfs(grid, i, j);
                       count++;
                   }
               }
           }
           return count;
       }
   
       static boolean visited[][];
   
       private static void bfs(char[][] grid, int i, int j) {
           if(grid[i][j] == '0'){return;}
           visited[i][j] = true;
           int xdir[] ={-1,0,+1,0};
           int ydir[] = {0,+1,0,-1};
           for(int z = 0;z<xdir.length;z++){
               int x = xdir[z]+i;
               int y = ydir[z]+j;
               if(x<grid.length && x>=0 && y< grid[0].length && y>=0 && visited[x][y]!=true){
                   bfs(grid,x,y);
               }
           }
           return; 
    }
}
