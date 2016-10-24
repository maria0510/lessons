
class LightBulb{
 private String serialId = "l";
	
	public void on (){
		heatTheBulb();
	}
	public void off() {
		
	}
	public void switchBulb() {
		state = !state;
	}
	
	public boolen equalTo(LightBulb bubl) {
		
		return state == bubl.state;
	}
	private void heatTheBulb() {
		
	}
	
	public static void main(String ...args){
		
	}
}