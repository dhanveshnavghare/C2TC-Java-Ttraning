package loop;

public class breaks {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
        {
       	 if(i == 1)  //if match then not print , it will continue to check next condition 
       	 {
       	continue; // break;   
       	 }
       	 System.out.println(i);
        }


	}

}
