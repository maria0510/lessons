package some.lesson4;

class MoreArraysExample {
   
   LightBulb light = new LightBulb();
   
	public static void main(String ...args) {
		int[] a1 = new int[5];
		int[] a3 = new int[] {1, 2};
		int[] a4 = {1, 2};
		
		int[][] aa1 = new int[5][5];
		
		int[][] aa2 = new int[5][];
		aa2[0] = new int[5];
		aa2[1] = new int[4];
		aa2[2] = new int[3];
		aa2[3] = new int[2];
		aa2[4] = new int[1];
		
		int[][] aa3 = {{0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0},{0, 0}};
		//Prisvoenie(a1);
		//Vivod(a3);
		Vivod1(aa3);
		int aaa1 = new int[1][][];
		System.out.println(aaa1[0]);
		
		
	}
	
	public static void Prisvoenie (int[] a1) {
		int b = 0;
		for(int j = 0; j < a1.length; j++) {
		    a1[j] = b;
		    b++;
		
	    }
	}
	
	public static void Vivod (int[] a1) {
		
		for(int j = 0; j < a1.length; j++) {
		    
			System.out.println("A1[" + j + "] = " + a1[j]);
	    }
	}
	public static void Vivod1 (int[][] a1) {
		
		//for(int j = 0; j < a1.length; j++) {
			for (int b = 0; b < a1.length; b++ ){
				System.out.print(a1[0][b]);	
			}
		    
			
	    
	}
	
	public static void varargs(String ...args){
		for (int i = 0; i < args.length; i++){
			System.out.print(arg[i] + " ");
		}	
	}
	
	public static void varargsWithLeadingParameter(String leadingString, String ...args){
		System.out.println("Starting from: " + leadingString + " ");
		varargs(args);
		
		System.out.println("\n" + args.length);
	}
}  

