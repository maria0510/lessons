class Main {
	public static void main(String ...args){
		
		LightBulb bubl = new LightBulb();
		bubl.on();
		
		LightBulb bubl2 = new LightBulb();
		bubl.switchBubl();
		
		if(bubl.equlTo(bubl2)){
			
			System.out.println("AAAAA");
		}else {
			System.out.println("BBBB");
		}
		
		LightBulb bubl3 = new LightBulb();
	}
}