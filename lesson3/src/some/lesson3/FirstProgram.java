package lesson2;

public class FirstProgram {
	static int i = 10;
	
      public static void  main (String[] args){
	  int i = 10;
	  while (i >= 1){
		System.out.println(isEven(i));
		  i--;
	  }
	   for(int j = 10; j > 0; j--){
		   isEven(j);
	   }
         
    }
	
	public static boollen isEven(int i){
	 
		//   System.out.println(i);
		/*if (i % 2 == 0){
			return true;
		}else {
			return false;
		}*/
		return (i % 2 == 0);
	    
	   }
	}
