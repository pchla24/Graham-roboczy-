package otoczka;

public class Point implements CompareP {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compare(Point p) {
		
		double dx = p.x - this.x;
	        double dy = p.y - this.y;
	        double result = Math.atan2(dy, dx);
	        if(result < 0)
	        	return -1;
	        else if(result > 0)
	        	return 1;
	        else
	        	return 0;
	}

}
