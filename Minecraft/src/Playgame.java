
public class Playgame {
	public static void main(String[] args) {
		//ʹ��Ĭ�Ϲ���������һ�����steve
		Player steve = new Player();

		System.out.println("����Ƥ��Ь�ӣ����ƤЬ��");
		System.out.println("��ǰ����ֵ: "+steve.getDefense());	    
		Boots boots1 = new Boots("Iron");
		System.out.println("Ь�ӵķ���ֵ: "+boots1.getDefensePoint());
		steve.wearArmor(boots1);
		System.out.println("��ǰ����ֵ: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("������ʯЬ��");
		Boots boots2 = new Boots("Diamond");
		System.out.println("Ь�ӵķ���ֵ: "+boots2.getDefensePoint());
		steve.wearArmor(boots2);
		System.out.println("��ǰ����ֵ: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("�ٴ������ؼ�");
		Chestplate chestplate = new Chestplate("Golden");
		System.out.println("�ؼ׵ķ���ֵ: "+chestplate.getDefensePoint());
		System.out.println("��ǰ����ֵ: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("ɱ¾���������ڸ��ǣ�");
		System.out.println("�ҵĹ���ֵ: "+steve.getAtk());
		System.out.println("�����ҵ�ʯ��");
		Sword stonesword = new Sword("Stone");
		stonesword.setOwner(steve);
		System.out.println("ʯ���Ĺ���ֵ: "+stonesword.getAtk());
		System.out.println("ʯ�����;�ֵ: "+stonesword.getToughness());
		steve.getHand(stonesword);
		System.out.println("�ҵĹ���ֵ: "+steve.getAtk());
		System.out.println("�����ҵ�����");
		Sword ironsword = new Sword("Iron");
		ironsword.setOwner(steve);
		System.out.println("�����Ĺ���ֵ: "+ironsword.getAtk());
		System.out.println("�������;�ֵ: "+ironsword.getToughness());
		steve.getHand(ironsword);
		System.out.println("�ҵĹ���ֵ: "+steve.getAtk());
		
		System.out.println("  ");
		System.out.println("ȥ�ڵ���");
		System.out.println("�ҵ��ڿ�Ч��: "+steve.getMinespeed());
		System.out.println("����������");
		Pickaxe pickaxe = new Pickaxe("Iron");
		pickaxe.setOwner(steve);
		steve.getHand(pickaxe);
		System.out.println("������ڿ�Ч��: "+pickaxe.getMinespeed());
		System.out.println("�ҵ��ڿ�Ч��: "+steve.getMinespeed());
		System.out.println(" ");
		
		System.out.println("  ");
		steve.changeHunger(-10);
		System.out.println("�е�����øɷ���");
		System.out.println("�ҵı���ֵ: "+steve.getHunger());
		System.out.println("�Ը�ţ��");
		steve.eatFood(new Food("Beef"));
		System.out.println("�ҵı���ֵ: "+steve.getHunger());
		System.out.println("�������«��֭�����ɾ��������xdm");
		steve.eatFood(new Food("Aloe juice"));
		System.out.println("�ҵı���ֵ: "+steve.getHunger());
		
		
		
	}

}
