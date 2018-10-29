
public class MyClass {
	private int a;
	private String aString;
	public MyClass(int a, String str) {
		this.a = a;
		aString = str;
	}
	public int getA() {
		return a;
	}
	public String toString() {
		return "a = " + a + " " + aString;
	}
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		return (this.a == ((MyClass) o).a)&&(this.aString == ((MyClass) o).aString);
	}
}
