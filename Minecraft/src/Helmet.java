
public class Helmet extends Armor{
	
	Helmet(String material) {
		//���ø��๹����
		super(material);
		//��ͷ��10���������ֵ
		super.setDefensePoint(getDefensePoint()+10);
		//��ͷ��10���;ò���ֵ
		super.setDefensePoint(getDefensePoint()+10);
	}
	Helmet(){
		super();
	}

	
}
