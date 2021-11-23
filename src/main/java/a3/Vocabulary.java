package a3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Vocabulary extends Thread {
	//binary tree

	public void run() {
	//	Node root=new Node();
		//reading from file
		BinaryTree bt=new BinaryTree();
		String[] words;
				try {

					FileReader reading=new FileReader("vocabulary.txt");
					
					//reads first byte
				Scanner reader=new Scanner(reading);
				while(reader.hasNext()) {
					
					String data=reader.next();
					words=data.split(",");
					
				for(int i=0;i<=7;i++){//(words[i]!="\0");i++) {
					
						String value=words[i];
							
					//System.out.println(words[i]);
					bt.insert(value);
					}
					
	}
//				traverseInOrder(root);
				}
	 catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	}
	
		
	
		
		
		
		
			
}
