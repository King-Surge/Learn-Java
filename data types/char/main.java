class GFG {
  
	public static void main(String args[])
	{
    
    // Creating and initializing custom character
		char a = 'G';
    
    // Integer data type is generally used for numeric values
		int i = 89;
    
    // use byte and short if memory is a constraint
		byte b = 4;
    
    /* 
    
    this will give error as number is
    larger than byte range
    
    byte b1 = 7888888955;
    */

		short s = 56;
    
    /*
    
    this will give error as number is
    larger than short range
    short s1 = 87878787878;
    
    */

    // by default fraction value is a double in java
		double d = 4.355453532;

		float f = 4.7333434f;
	
		// to hold big range of numbers we use long data type
		long l = 12121;
			
		System.out.println("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("long: " + l);
	}
}


        byte b = 4;
 
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
