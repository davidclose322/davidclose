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
	
		System.out.println("--同学添加的部分--");
		Color yellow=new Yellow();	//组员添加的新颜色
		AbstractAnimal dog=new Dog(); //组员添加的三角形
		System.out.println("同学添加的形状-狗");
		dog.setColor(red);
		dog.draw();
		dog.setColor(blue);
		dog.draw();
		dog.setColor(yellow);
		dog.draw();
		dog.setColor(green);
		dog.draw();
		System.out.println("同学添加的颜色-黄色");
		dog.setColor(yellow);	//组员添加的绿色
		dog.draw();
		
	}

}
