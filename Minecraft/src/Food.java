
public class Food {
	private String name;
	private int foodValue;
	
	Food(String name){
		this.name = name;		
		//ֻд������ʳ��
		if(name.equals("Aloe juice"))  //«��֭
			this.foodValue = 1;
		if(name.equals("Beef"))  //«��֭
			this.foodValue = 3;
		if(name.equals("Aloe juice"))  //«��֭
			this.foodValue = 2;		
	}
	
	public int getFoodValue() {
		return this.foodValue;
	}

}
