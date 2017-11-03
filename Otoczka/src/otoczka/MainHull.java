package otoczka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainHull {

	public static void main(String[] args) throws FileNotFoundException {
		
		String path = args[0];
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		
		int size = scanner.nextInt();
		Points points = new Points(size);
		
		for(int i=0; i<size; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			Point p = new Point(x, y);
			points.add(p);
		}
		
		/*Points points = new Points(4);
		
		Point p1 = new Point(4, 4);
		Point p2 = new Point(2, 4);
		Point p3 = new Point(3, 1);
		Point p4 = new Point(3, 2);
		
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);*/
		
		
		//points.printPoints();				//sprawdzenie czy dobrze przeczyta³ z pliku
		
		
		//points.mergeSort();	
		//points.printPoints();				// test sortowania

		points.doGrahamScan();
		
		
	}

}


