package a3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class input1 {

	//reading input1 file
		public void reading_input1() {
			Vector<String> vec_tor = new Vector<String>();
			//reading from file
			String[] words;
					try {

						FileReader reading=new FileReader("input1.txt");
					//reads first byte
					Scanner reader=new Scanner(reading);
					while(reader.hasNext()) {
						
						String data=reader.next();
						words=data.split(" ");
						for(int i=0;!(words[i]=="\0");i++) {
						String value=words[i];
						System.out.println(words[i]);
						vec_tor.add(value);
						}
						
		}
				
					}
		 catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		}
	
}
