package otoczka;

public class MainHull {

	public static void main(String[] args) {
		
		int size = 5;
		Points points = new Points(size);
		
		Point p1 = new Point(1, 5);
		points.add(p1);
		Point p2 = new Point(3, 3);
		points.add(p2);
		Point p3 = new Point(4, 1);
		points.add(p3);
		Point p4 = new Point(2, 1);
		points.add(p4);
		Point p5 = new Point(1, 4);
		points.add(p5);
		
		points.printPoints();
		System.out.println("///////////////////////////////");
		
		points.mergeSort();				// chyba jest ok
		points.printPoints();
	}

}
