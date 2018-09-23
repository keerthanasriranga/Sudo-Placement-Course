class GfG
{
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
          // Your code here
          if(k>height(root))return;
          else if(k==0)System.out.print(root.data+" ");
          else{
              if(root.left!=null)printKdistance(root.left, k-1);
              if(root.right!=null)printKdistance(root.right, k-1);
          }
     }
     static int height(Node root){
         if(root==null)return 0;
         else return Math.max(height(root.left)+1, height(root.right)+1);
     }
}

https://practice.geeksforgeeks.org/problems/k-distance-from-root/1/?ref=self
