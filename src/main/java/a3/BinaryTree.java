package a3;

public class BinaryTree {

	
	class Node {    
	    String value; 
	        Node left, right; 
	          
	        Node(String value){ 
	            this.value = value; 
	            left = null; 
	            right = null; 
	        }

	       
			public Node() {
				
			} 
	    }
	 Node root;
	//binary tree
	public void insert(String value)
	{
		root=insertvalue(root,value);
	}
	 public Node insertvalue(Node node, String value) {
		 
		 
		 if(node==null)
		 {
			 return node;
		 }
	 int leng1=value.length();
	 int leng2;
	 if(node.value==null)
	 {
		 leng2=0;
	 }else
	 {
		 leng2=node.value.length();
	 }
	// System.out.println(leng1+" "+leng2);
	 
	        if (leng1 <= leng2) 
	        { 
	        	if (node.left != null) {
	        	insertvalue(node.left, value);
	        	} else 
	        	{ 
	        		System.out.println(" Inserted " + value + " to left of " + node.value); 
	        	node.left = new Node(value); 
	        	} 
	        } else if (leng1 > leng2) {
	          if (node.right != null) {
	            insertvalue(node.right, value);
	          } else 
	          {
	            System.out.println("  Inserted " + value + " to right of " + node.value);
	            node.right = new Node(value);
	          }
	        }
	        return node;
	 }
	 
	 public void traverseInOrder(Node node) {
	        if (node != null) {
	            traverseInOrder(node.left);
	            System.out.print(" " + node.value);
	            traverseInOrder(node.right);
	        }
	        else
	        	System.out.println("NULL");
	     }
	
	
	
}
