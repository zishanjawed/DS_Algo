import java.util.*;


public class Main{
    
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(){
            
        }
        
        public Node(int data, Node left, Node right){
            
            this.data = data;
            this.left = left;
            this.right = right;
            
        }
    }
    
    public static class Pair{
        
        Node node;
        int state;
        
        public Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }
    
    public static Node constuctor(Integer[] arr){
        
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0],null,null);
        
        st.push(new Pair(root,0));
        
        for(int i =1 ; i < arr.length; i++){
            
            Pair s = st.peek();
            if(arr[i] == null){
                
                s.state++;
                
                if(s.state > 1){
                    st.pop();
                }
            }
            else{
                
                Node nn = new Node(arr[i],null,null);
                if( s.state == 0 ){
                
                    s.node.left = nn;
                    s.state++;
                }
                else if( s.state == 1 ){
                    
                    s.node.right = nn;
                    st.pop();
                }
            
                st.push(new Pair(nn,0));
            }
            
            
            
            
            
        }
        
        
        return root;
        
    }
    
    public static void display(Node node){
        if(node == null){
            return;
        }
        

        // Printing Level wise

        String s = "";
        s += (node.left == null) ? "." : node.left.data + "<-";
        s += node.data + "->";
        s += (node.right == null) ? ".": node.right.data ;
        
        System.out.println(s);
        
        
        display(node.left);
        display(node.right);
        
        
    }
    
    
    
    public static void main(String[] args){
        
        Integer[] arr = {10,20,40,null,80,null,null,50,null,null,30,null,60,70,null,null,null};
        
        
        Node root = constuctor(arr);
        display(root);
    }
    
}