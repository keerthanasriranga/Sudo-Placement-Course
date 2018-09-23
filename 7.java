class GfG
{
    
    public static boolean printAncestors(Node node, int x)
    {
        // add your code here
        boolean a =  p(node, x);
        System.out.print("");
        return a;
        
    }
    static boolean p(Node node, int x){
        if(node == null)return false;
        if(node.data == x)return true;
        if(p(node.left, x) || p(node.right, x)){
            System.out.print(node.data + " ");
            return true;
        }
        return false;
    }
}

https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1/?ref=self
