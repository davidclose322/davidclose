桥接模式-----将图形着色

期望达到的目的

有很多不同的动物，还有很多不同的颜色，现在想给每一个动物上不同的颜色(一次仅上一种颜色)，设计类实现。

一般的想法

设计一个抽象图形类，具体的形状为抽象类子类(eg: AbstractShape----> Rectangular)，而不同的颜色再继承子类(eg: Rectangular----> RedRectangular)。

这样的设计不宜与添加一个新的类，因为工作量非常大。

桥接模式

桥接模式做法是，还是给图形类设计一个抽象类(AbstractShape)，但是这个抽象类里有一个接口的成员变量( eg: protected Color color)。而针对颜色，做法是定义一个接口(Color)，再让不同的具体的类去实现这个接口(class Red implements Color)。这么做的好处在于不必让具体的图形去实现这个接口，而是用一个实现类来代替。

扩充类时的说明

@Override
public void draw() {
    String animalName="猫";
    super.color.paintAnimal(animalName);

}

@Override
public void paintAnimal(String animalName) {
// TODO Auto-generated method stub
	System.out.println("把"+animalName+"画成黄色。");

}
	
如何调用

Color red=new Red();
AbstractAnimal cat=new Cat();
cat.setColor(red);
cat.draw();