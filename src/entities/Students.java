package entities;

public class Students {
	
	public String name;
	public double g1;
	public double g2;
	public double g3;
	
	
	public double finalGrade() {
		return g1 + g2 + g3;
	}
	
	public void result() {
		if ((g1 + g2 + g3) >= 60) {
			System.out.println("APPROVED");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSED %.2f POINT(S)", Math.abs((finalGrade() - 60)));
		}
	}
	
	
	
}
