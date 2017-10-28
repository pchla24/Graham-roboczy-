package otoczka;

public class MainHull {

	public static void main(String[] args) {
		
		int size = 7;
		Points points = new Points(size);
		
		Point p1 = new Point(6, 2);
		points.add(p1);
		Point p2 = new Point(7, 6);
		points.add(p2);
		Point p3 = new Point(6, 8);
		points.add(p3);
		Point p4 = new Point(7, 7);
		points.add(p4);
		Point p5 = new Point(18, 5);
		points.add(p5);
		Point p6 = new Point(16, 5);
		points.add(p6);
		Point p7 = new Point(15, 5);
		points.add(p7);
		

		points.doGrahamScan();
		
		//points.ptsS.printStack();
	}

}


