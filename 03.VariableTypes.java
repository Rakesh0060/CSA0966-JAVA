class VariableTypes {
  int a = 9,
  b = 10;
  void learnClass(){
  int local_j = 45;
    String s = "VariableTypes........ Learining"; 
	System.out.println("Value of local_j is :"+local_j);
	System.out.println("Value of s is :"+s);
  }
  
  public static void main(String s[]){
		
	String text = "contains text";
	int wholeNumber = 123;
	double floatingPoint = 3.141592653;
	boolean trueOrFalse = true;

	System.out.println("Text variable: " + text);
	System.out.println("Integer variable: " + wholeNumber);
	System.out.println("Floating-point variable: " + floatingPoint);
	System.out.println("Boolean: " + trueOrFalse);
	 {
		int local_j = 105; // A local variable
		String s1 = "VariableTypes Learining"; 
		System.out.println("Value of local_j from block is :"+local_j);
		System.out.println("Value of s block is :"+s1);
	}
  //System.out.println("Value of s is :"+s1); 
 
	/*VariableTypes vt = new  VariableTypes();
	vt.learnClass();*/  
  }
}
