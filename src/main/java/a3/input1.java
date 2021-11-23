package a3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;




public class input1 extends Thread {
	BinaryTree b=new BinaryTree();
	Vector<String> vec_tor = new Vector<String>();
	//reading input1 file
		public void run() {
			
			//reading from file
			String[] words;
					try {

						FileReader reading=new FileReader("input1.txt");
					//reads first byte
					Scanner reader=new Scanner(reading);
					while(reader.hasNext()) {
						
						String data=reader.next();
						words=data.split(" ");
						int size=words.length;
						for(int i=0;i<=size-1;i++) {
						String value=words[i];
						//System.out.println(words[i]);
						vec_tor.add(value);
						}
						
		}
				
					}
		 catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
					//reading from input file 2
					
							try {

								FileReader reading=new FileReader("input2.txt");
							//reads first byte
							Scanner reader=new Scanner(reading);
							while(reader.hasNext()) {
								
								String data=reader.next();
								words=data.split(" ");
								int size=words.length;
								for(int i=0;i<=size-1;i++) {
								String value=words[i];
								//System.out.println(words[i]);
								vec_tor.add(value);
								}
								
				}
						
							}
				 catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
					
		}
		
		public void displayVector() {
			System.out.println("Vector:"+ vec_tor);
		}
		
		 public void frequency() {
			 int [] fr = new int [vec_tor.size()];  
			 int visited = -1;
			 for(int i = 0; i < vec_tor.size(); i++){  
		            int count = 1;  
		            for(int j = i+1; j < vec_tor.size(); j++){  
		                //if(vec_tor.get(i) == b.getValue())
		                {  
		                    count++;  
		                    //To avoid counting same element again  
		                    fr[j] = visited;  
		                }  
		            }
		            if(fr[i] != visited)  
		                fr[i] = count; 
			 }
			 
			 for(int i = 0; i < vec_tor.size(); i++) {
				 System.out.println(vec_tor.get(i) + "has frequency "+ fr[i]);
			 }
		 } 
		 public void searching(String str) {
			System.out.println(vec_tor.size());
			 for(int i=0;i<vec_tor.size();i++) {
				 
			 if(str.equals(vec_tor.get(i))) {
				 System.out.println(str + " found");
			 }
		 }
		 
		 }
}
	

