package otoczka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainHull {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("points.txt");
		Scanner scanner = new Scanner(file);
		
		int size = scanner.nextInt();
		Points points = new Points(size);
		
		for(int i=0; i<size; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			Point p = new Point(x, y);
			points.add(p);
		}
		
		//points.printPoints();
		
		
		//points.mergeSort();
		//points.printPoints();

		points.doGrahamScan();
		
		//points.ptsS.printStack();*/
	}

}


