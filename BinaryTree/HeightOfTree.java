public class HeightOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int item){
            data=item;
            left=right=null;

        }
    }
        public static int Height(Node root){
            if(root==null) return 0;
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            return Math.max(leftHeight, rightHeight)+1;


        }
    
    
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(Height(root));
        
    }
    
    
}
