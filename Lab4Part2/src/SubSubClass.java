
public class SubSubClass extends SubClass{
	private int c;
	public SubSubClass(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	public int getC() {
		return c;
	}
	public int getB() {
		return super.getB()*c;
	}
	public int getA() {
		return super.getA()*c;
	}
	public String toString() {
		return super.toString() + " c = " + c;
	}
}
