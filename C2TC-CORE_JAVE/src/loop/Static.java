package loop;

public class Static {

	int roll;
	String name;
    static String college="St.john college of engineering and management";
	
	void display()
	{
		System.out.println(roll+" "+name+" "+college);	
	}
//	Static_(int r, String n){  
//		   roll = r;  
//		   name = n;  
		   
	static void change()
	{
		college="Mumbai University";
	}

	
	
	public  Static(String name,int roll) {
		super();
		this.name=name;
		this.roll=roll;
	
	}
	
	public static void main(String[] args) {
		Static s1=new Static("AAA",1);
		Static s2=new Static("BBB",2);
		s1.display();
		s2.display();
		
		Static.change();
		s1.display();
		s2.display();
	}

	
	}

