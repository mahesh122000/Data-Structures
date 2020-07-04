class Util{
    int turns=0;
    Util(int turns){
        this.turns=turns;
    }
}
class Tree
{
    static int INF=Integer.MAX_VALUE;
    static int NumberOfTurns(Node root, int first, int second)
    {
        Node lc=lcs(root,first,second);
        int turns=-1;
        Util obj=new Util(0);
        if(lc.data==first||lc.data==second){
            
            int num=lc.data==first?second:first;
            numberOfTurnsUtil(lc.left,num,INF,'L',0,obj);
            numberOfTurnsUtil(lc.right,num,INF,'R',0,obj);
            turns=obj.turns;
        }else{
            numberOfTurnsUtil(lc.left,first,second,'L',0,obj);
            numberOfTurnsUtil(lc.right,first,second,'R',0,obj);
            turns=obj.turns+1;
        }
        return turns!=0?turns:-1;
    }
    
    static void numberOfTurnsUtil(Node root,int first,int second,char turn,int currentTurns,Util obj){
        if(root==null)
            return;
        if(root.data==first||root.data==second){
            obj.turns+=currentTurns;
        }
        int leftTurn=turn=='L'?currentTurns:currentTurns+1;
        int rightTurn=turn=='R'?currentTurns:currentTurns+1;
        numberOfTurnsUtil(root.left,first,second,'L',leftTurn,obj);
        numberOfTurnsUtil(root.right,first,second,'R',rightTurn,obj);
    }
    
    static Node lcs(Node root,int first,int second){
        if(root==null)
            return null;
        if(root.data==first||root.data==second)
            return root;
        Node left=lcs(root.left,first,second);
        Node right= lcs(root.right,first,second);
        if(left!=null&&right!=null)
            return root;
        return left!=null?left:right;
    }
    
}