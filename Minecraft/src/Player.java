
public class Player {
	
	/*�������*/
	private String name;    //�������
	private int health=20;    //���Ѫ��Ĭ��20
	private int hunger=20;    //��Ҽ���ֵĬ��20
	private int defensePoint=20;    //��ҷ���ֵĬ��20
    private int atk=20;  //��ҵĹ�����Ĭ��20  ��������
    private int minespeed=20;  //����ڿ��ٶ�Ĭ��20
    private int woodsspeed=20;  //��ҿ����ٶ�Ĭ��20

	/*���װ��*/
	private Chestplate chestplate = new Chestplate();
	private Boots boots = new Boots();
	private Helmet helmet = new Helmet();
	private Legging legging = new Legging();
	
	/*�������*/
    public Player(String name) {
		this.name=name;
	}
    
    public Player() {
    	this("steve");
    }  //Ĭ�ϵ��������
    
    
    //����ֵ�鿴���ı�
    
    public void changeName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    //���Ѫ���ı�
    public void changeHealth(int i) {
    	this.health = this.health + i;
    }
    //�鿴��ҵ�ǰѪ��
    public int getHealth() {
    	return this.health;
    }
    //��Ҽ���ֵ�ı�
    public void changeHunger(int i) {
    	this.hunger = this.hunger + i;
    }
    public int getHunger() {
    	return this.hunger;
    }
    //��ҷ���ֵ�ı�
    public void changeDefense(int i) {
    	this.defensePoint = this.defensePoint + i;
    }
    public int getDefense() {
    	return this.defensePoint;
    }
    //��ҹ���ֵ�ı�
    public void changeAtk(int i) {
    	   	this.atk = this.atk + i;   	    	
    }
    public int getAtk() {
    	return this.atk;
    }
    //����ڿ��ٶȸı�
    public void changeMinespeed(int i) {
    	this.minespeed = this.minespeed + i;
    }
    public int getMinespeed() {
    	return this.minespeed;
    }
    //��ҿ����ٶȸı�
    public void changeWoodspeed(int i) {
    	this.woodsspeed = this.woodsspeed + i;
    }
    public int getWoodspeed() {
    	return this.woodsspeed;
    }

  
    //һЩ����
    public void wearArmor(Helmet helmet) {
    	this.changeDefense(-this.helmet.getDefensePoint());
    	this.helmet = helmet;
    	this.changeDefense(helmet.getDefensePoint());
    }
    
    public void wearArmor(Chestplate chestplate) {
    	this.changeDefense(-this.chestplate.getDefensePoint());
    	this.chestplate = chestplate;
    	this.changeDefense(chestplate.getDefensePoint());
    }
    
    public void wearArmor(Legging legging) {
    	this.changeDefense(-this.legging.getDefensePoint());
    	this.legging = legging;
    	this.changeDefense(legging.getDefensePoint());
    }
    
    public void wearArmor(Boots boots) {
    	this.changeDefense(-this.boots.getDefensePoint());
    	this.boots = boots;
    	this.changeDefense(boots.getDefensePoint());
    }
    //���Ϲ���
    public void getHand(Handable taget) {
    	taget.getOutHand();
    	taget.getInHand(); 
    }

    //�Զ���
    public void eatFood(Food food) {
    	this.hunger = this.hunger + food.getFoodValue();
    }
    
}




