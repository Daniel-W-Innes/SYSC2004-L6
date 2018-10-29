import java.net.URL;

public class SubSubClass extends SubClass {
	private int c;
	private URL cOther;

	public SubSubClass(int a, int b, int c, String str, Integer bWrapper, URL cOther) {
		super(a, b, str, bWrapper);
		this.c = c;
		this.cOther = cOther;
	}

	public int getC() {
		return c;
	}

	public int getB() {
		return super.getB() * c;
	}

	public int getA() {
		return super.getA() * c;
	}

	public String toString() {
		return super.toString() + " /" + " c = " + c + " " + cOther;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		return (this.c == ((SubSubClass) o).c) && (this.cOther.equals(((SubSubClass) o).cOther)) && super.equals(o);
	}
}
