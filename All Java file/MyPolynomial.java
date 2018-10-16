public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i=coeffs.length-1; i>=0; i--) {
            if(i != 0) {
                str += coeffs[i] + "x^" + i + "+";
            } else {
                str += coeffs[i];
            }
        }
        return str;
    }

	public double[] getCoeffs() { return coeffs; }

    public int getDegree() { return coeffs.length - 1; }

    public double evaluate(double x) {
        double temp = 0;
        for(int i=coeffs.length-1; i>=0; i--) {
            temp += coeffs[i] * Math.pow(x, i);
        }
        return temp;
    }

    public MyPolynomial add(MyPolynomial right) {
		double[] temp = right.getCoeffs();
		for(int i=0; i<coeffs.length; i++) {
			coeffs[i] += temp[i];		
		}
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] temp = right.getCoeffs();
		for(int i=0; i<coeffs.length; i++) {
			coeffs[i] *= temp[i];		
		}
        return this;
    }
}
