
public class Boots extends Armor{

	Boots(String material) {
		super(material);
		//���ż�5���������ֵ
		super.setDefensePoint(getDefensePoint()+5);
		//���ż�5���;ò���ֵ
		super.setDefensePoint(getDefensePoint()+5);
	}
	
	Boots(){
		super();
	}

}
