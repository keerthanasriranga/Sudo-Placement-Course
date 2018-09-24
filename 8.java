class GfG
{
    public static int getLevel(Node root, int key)
    {
        // add your code here
        return getLevelOfNode(root, key, 1);
    }
    
    static int getLevelOfNode(Node root, int key, int level){
        if(root==null)return 0;
        if(root.data==key)return level;
        int leftLevel = getLevelOfNode(root.left, key, level+1);
        if(leftLevel!=0)return leftLevel;
        int rightLevel = getLevelOfNode(root.right, key, level+1);
        return rightLevel;
   }
}

https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1/?ref=self
    
   
