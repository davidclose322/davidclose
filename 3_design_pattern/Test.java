public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color red=new Red();
		AbstractAnimal cat=new Cat();
		cat.setColor(red);
		cat.draw();
		
		Color blue = new Blue();
		cat.setColor(blue);
		cat.draw();
		
		Color green = new Green();
		cat.setColor(green);
		cat.draw();
	
		System.out.println("--ͬѧ��ӵĲ���--");
		Color yellow=new Yellow();	//��Ա��ӵ�����ɫ
		AbstractAnimal dog=new Dog(); //��Ա��ӵ�������
		System.out.println("ͬѧ��ӵ���״-��");
		dog.setColor(red);
		dog.draw();
		dog.setColor(blue);
		dog.draw();
		dog.setColor(yellow);
		dog.draw();
		dog.setColor(green);
		dog.draw();
		System.out.println("ͬѧ��ӵ���ɫ-��ɫ");
		dog.setColor(yellow);	//��Ա��ӵ���ɫ
		dog.draw();
		
	}

}
