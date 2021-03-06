package a3;

import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		File obj=new File("vocabulary.txt");
		Vocabulary v=new Vocabulary();
		BinaryTree b=new BinaryTree();
		input1 i1=new input1();
		
		//v.start();
		v.run();
		
		b.traverseInOrder(b.root);
		System.out.println(b.root);
		//System.out.println("Reading");
		
		//Node root=new Node();
		
		Scanner user_input=new Scanner(System.in);
		int choice;
		String query;
		
		do {
			
		System.out.println("\n\nSelect from the following options:");
		System.out.println("Press 1. Display BST build from Vocabulary File.");
		System.out.println("Press 2. Display Vectors build from Input files.");
		System.out.println("Press 3. View Match words and its frequency.");
		System.out.println("Press 4. Search a query.");
		System.out.println("Press 5. Exit.");
		choice=user_input.nextInt();
		
		
		switch(choice) {
		case 1:{
			System.out.println("\n.......................................................");
			System.out.println("Displaying BST from Vocabulary file");
			b.traverseInOrder(b.root);
			v.run();
		}break;
		
		case 2:{
			System.out.println("\n.......................................................");
			System.out.println("Displaying Vector from input files");
			i1.run();
			i1.displayVector();
			
		}break;
		case 3:{

			System.out.println("\n.......................................................");
			System.out.println("Displaying matched words and their frequency");
		}break;
		
		case 4:{
			System.out.println("Enter your query to be searched.");
			query=user_input.next();
			
			
			i1.searching(query);
			
		}break;
		
		case 5:{
			return;
		}
		
		default:{
			System.out.println("Invalid input");
		}
		
		}
		
		}while(choice!=5);
	}

}
