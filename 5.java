//max width of binary tree

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        // Your code here
        int maxWidth = 0;
        for(int level = 1; level<=height(root) ; level++){
            int width = getWidth(root, level);
            if(width>maxWidth)maxWidth = width;
        }
        return maxWidth;
    }
    static int getWidth(Node root, int level){
        if(root == null)return 0;
        if(level == 1)return 1;
        else if(level>1) return getWidth(root.left, level-1) +
                    getWidth(root.right, level-1);
        else return 0;
    }
    static int height(Node root){
        if(root==null)return 0;
        else return Math.max(height(root.left)+1, height(root.right)+1);
    }
}

https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1/?ref=self
