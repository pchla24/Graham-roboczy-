package otoczka;

public class MainHull {

	public static void main(String[] args) {
		
		int size = 5;
		Points points = new Points(size);
		
		Point p1 = new Point(3, 3);
		points.add(p1);
		Point p2 = new Point(2, 2);
		points.add(p2);
		Point p3 = new Point(7, 7);
		points.add(p3);
		Point p4 = new Point(1, 1);
		points.add(p4);
		Point p5 = new Point(9, 9);
		points.add(p5);
		
		//points.mergeSort();
		//points.printPoints();

		points.doGrahamScan();
		
		//points.ptsS.printStack();
	}

}


