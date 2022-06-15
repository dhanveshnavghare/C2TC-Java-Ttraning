package loop;

public class loop {

	public static void main(String[] args) {
		System.out.println("Forloop"); 
		  for(int i=1,j=1,z=1; i<10||j<10||z<10;i++,j++,z++) // 
		  { 
			  j++;
			  
			  System.out.println("i="  +i   +  " and j="+j +"and Z=" +z); 
			 			  
		  }


		  // while loop 
		  System.out.println("while loop"); 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
	/*	// Do while loop
			int i = 1, j = 1;*/
			  System.out.println("Do While loop"); 
			do {
				i++;
				j++;
				System.out.println("i=" + i + " and j=" + j);
			    } while (i < 10 || j < 10);


	}

}
