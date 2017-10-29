package otoczka;

public class MainHull {

	public static void main(String[] args) {
		
		int size = 8;
		Points points = new Points(size);
		
		Point p1 = new Point(17, 3);
		points.add(p1);
		Point p2 = new Point(20, 9);
		points.add(p2);
		Point p3 = new Point(15, 10);
		points.add(p3);
		Point p4 = new Point(12, 13);
		points.add(p4);
		Point p5 = new Point(6, 9);
		points.add(p5);
		Point p6 = new Point(5, 12);
		points.add(p6);
		Point p7 = new Point(1, 6);
		points.add(p7);
		Point p8 = new Point(15, 6);
		points.add(p8);
		
		//points.mergeSort();
		//points.printPoints();

		points.doGrahamScan();
		
		//points.ptsS.printStack();
	}

}


