
public class SubClass extends MyClass {
	private int b;
	private Integer bWrapper;

	public SubClass(int a, int b, String str, Integer bWrapper) {
		super(a, str);
		this.bWrapper = bWrapper;
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public int getA() {
		return super.getA() * 2;
	}

	public String toString() {
		return super.toString() + " /" + " b = " + b + " " + bWrapper;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		return (this.bWrapper.equals(((SubClass) o).bWrapper)) && (this.b == ((SubClass) o).b) && super.equals(o);
	}
}
