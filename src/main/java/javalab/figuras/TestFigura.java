package javalab.figuras;

public class TestFigura {
	public static void main(String[] args) {
		Circulo c = new Circulo(20);
		System.out.println(c);
		System.out.println("Area: "+c.area());
		c = new Circulo(30);
		System.out.println(c);
		System.out.println("Area: "+c.area());
		c = new Circulo(10);
		System.out.println(c);
		System.out.println("Area: "+c.area());
	}
}
