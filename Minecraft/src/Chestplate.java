
public class Chestplate extends Armor{

	Chestplate(String material) {
		super(material);
		//���ؼ�20���������ֵ
		super.setDefensePoint(getDefensePoint()+20);
		//���ؼ�20���;ò���ֵ
		super.setDefensePoint(getDefensePoint()+20);
	}
	Chestplate(){
		super();
	}

}
