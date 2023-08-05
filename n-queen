class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][]ch=new char[n][n];
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[0].length;j++){
                ch[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
       // List<String> l=new ArrayList<>();
        nqueen(ch,0,n,ans);
        return ans;
        
    }
    public static void nqueen(char [][]ch,int row,int tq,List<List<String>> ans){
        if(tq==0){
             List<String> l=new ArrayList<>();
            for(int i=0;i<ch.length;i++){
                String s="";
                for(int j=0;j<ch[i].length;j++){
                    s=s+ch[i][j];
                }
                l.add(s);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        if(row==ch.length){
            return; 
        }
        for(int col=0;col<ch[0].length;col++){
            if(isitpossible(ch,row,col)==true){
                ch[row][col]='Q';
                nqueen(ch,row+1,tq-1,ans);
                ch[row][col]='.';
            }

        }
    }
    public static boolean isitpossible(char [][]ch,int row,int col){
          //upper
       int r=row;
        while(r>=0){
            if(ch[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //left diag
         r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(ch[r][c]=='Q'){
                return false;
            }
            r--;
            c--;

        }
        //rigth diag
        r=row;
        c=col;
        while(r>=0 && c<ch[0].length){
            if(ch[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
      
    return true;
    }
}
