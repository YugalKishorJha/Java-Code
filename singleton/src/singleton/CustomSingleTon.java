package singleton;

public class CustomSingleTon {
	
	private static final CustomSingleTon MYONEREFRENCE;// intilise directly or using  static block 
	
	static
	{
		MYONEREFRENCE=new CustomSingleTon();
	}

	private  CustomSingleTon(){
		
	}
	
	
	// getter method and also the factory method for the SingleTon Class
	
	static public CustomSingleTon getCustomSingleTon()
	{
		return MYONEREFRENCE;
	}
	

}
