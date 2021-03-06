package com.nicomanu.triangle;

// Class Triangle
public class Triangle {



	private Point a;
	private Point b;
	private Point c;
	
	private double cote1, cote2, cote3, perimetre;

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}
	
	Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Triangle(int ax,int ay,int bx,int by,int cx,int cy) {
		this.a = new Point(ax,ay);
		this.b = new Point(bx,by);
		this.c = new Point(cx,cy);
	}
	
	public String identificationForme() {
		String forme = "non identifiable";
		if (cote1 == cote2 && cote2 == cote3) {
			forme = "triangle isoc�le";
		} else if (testTriangleRectangle()) {
			forme = "triangle rectangle";
		}
			
		
		return forme;
	}
	
	  public void calculLongueurCote()
	  {
	    cote1 = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+Math.pow((b.getY()-a.getY()),2));
	    cote2 = Math.sqrt(Math.pow((c.getX()-b.getX()),2)+Math.pow((c.getY()-b.getY()),2));
	    cote3 = Math.sqrt(Math.pow((a.getX()-c.getX()),2)+Math.pow((a.getY()-c.getY()),2));
	  }	

	public double calculPerimetre() {
		
		perimetre = cote1 + cote2 + cote3;
		return perimetre;
		
	}
	
	/**
	 * Test de la forme triangle rectangle
	 * @return
	 */
	public boolean testTriangleRectangle() {

//test du triangle rectangle
		boolean result1 = false;
		boolean result2 = false;
		boolean result3 = false;
		result1 = Math.abs((Math.pow(cote1,2) + Math.pow(cote2, 2) - Math.pow(cote3, 2))) < 0.01;
		result2 = Math.abs((Math.pow(cote2,2) + Math.pow(cote3, 2) - Math.pow(cote1, 2))) < 0.01;
		result3 = Math.abs((Math.pow(cote3,2) + Math.pow(cote1, 2) - Math.pow(cote2, 2))) < 0.01;
		
		return result1 || result2 || result3;

}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		calculLongueurCote();
		
		chaine.append("Le triangle est de forme : " + identificationForme());
		chaine.append("\nson p�rim�tre est de : " + calculPerimetre());
		
		return chaine.toString(); // super.toString();
	}
	
}
