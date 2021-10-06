
public abstract class Armor extends Tools{
	//���ƣ����ϣ��;������ڸ���Tools����
	Armor(String material){
		super(material);
		if(material.equals("Leather"))	
			this.defensePoint = 25;
		if(material.equals("Iron"))	
			this.defensePoint = 50;
		if(material.equals("Golde"))
			this.defensePoint = 25;
		if(material.equals("Diamond"))
			this.defensePoint= 75;					
	}
	Armor(){
		super();
	}
	//���廤��ֵ
	private int defensePoint;
	
	//ȡ�û���ֵ
	public int getDefensePoint() {
		return this.defensePoint;
	}
	//ȡ���;�ֵ
	public int getToughness() {
		return super.getToughness();
		
	}
	//�趨����ֵ
	public void setDefensePoint(int defensePoint) {
		this.defensePoint = defensePoint;
	}
}
