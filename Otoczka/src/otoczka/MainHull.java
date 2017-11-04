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

		points.doGrahamScan();
		
	}

}


