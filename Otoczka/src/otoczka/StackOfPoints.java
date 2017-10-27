package otoczka;

import java.util.ArrayList;

public class StackOfPoints {
	
	public ArrayList<Point> ptsStack;
	
	public StackOfPoints(int size) {
		ptsStack = new ArrayList(size);
	}
	
	public boolean isEmpty() {
		return ptsStack.isEmpty();
	}
	
	public void push(Point pt) {
		ptsStack.add(pt);
	}
	
	public Point pop() {
		Point tmp;
		tmp = ptsStack.remove(ptsStack.size() - 1);
		return tmp;
	}
}
