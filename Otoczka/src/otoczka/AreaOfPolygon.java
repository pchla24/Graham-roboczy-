package otoczka;

import java.util.ArrayList;

public class AreaOfPolygon {

	public double calculateArea(ArrayList<Point> arr, Point a) {
		
		double sum = 0;
		for(int i=1; i<arr.size()-1; i++) {
			double tArea = calcTriangle(a, arr.get(i), arr.get(i+1));
			sum += tArea;
		}
		return sum;
	}
	
	public double calcTriangle(Point a, Point b, Point c) {
		double area = Math.abs((a.getX()-c.getX())*(b.getY()-a.getY())-
		         (a.getX()-b.getX())*(c.getY()-a.getY()))*0.5;
		return area;
	}
	
}
