package matematica;

public class Triangulo {
	
	private double x, y, z;
	
	public Triangulo(double x) {
		this.x = x;
	}

	public Triangulo(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getArea() {
		double p = (x + y + z)/2.0;
		return Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}

	
	@Override
	public String toString() {
		return "Triangulo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		return true;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	
}
