�Ž�ģʽ-----��ͼ����ɫ

�����ﵽ��Ŀ��

�кܶ಻ͬ�Ķ�����кܶ಻ͬ����ɫ���������ÿһ�������ϲ�ͬ����ɫ(һ�ν���һ����ɫ)�������ʵ�֡�

һ����뷨

���һ������ͼ���࣬�������״Ϊ����������(eg: AbstractShape----> Rectangular)������ͬ����ɫ�ټ̳�����(eg: Rectangular----> RedRectangular)��

��������Ʋ��������һ���µ��࣬��Ϊ�������ǳ���

�Ž�ģʽ

�Ž�ģʽ�����ǣ����Ǹ�ͼ�������һ��������(AbstractShape)�������������������һ���ӿڵĳ�Ա����( eg: protected Color color)���������ɫ�������Ƕ���һ���ӿ�(Color)�����ò�ͬ�ľ������ȥʵ������ӿ�(class Red implements Color)����ô���ĺô����ڲ����þ����ͼ��ȥʵ������ӿڣ�������һ��ʵ���������档

������ʱ��˵��

@Override
public void draw() {
    String animalName="è";
    super.color.paintAnimal(animalName);

}

@Override
public void paintAnimal(String animalName) {
// TODO Auto-generated method stub
	System.out.println("��"+animalName+"���ɻ�ɫ��");

}
	
��ε���

Color red=new Red();
AbstractAnimal cat=new Cat();
cat.setColor(red);
cat.draw();