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
		
		double angle;
		angle = this.x*p.y - this.y*p.x;
		if(angle > 0)
			return 1;
		else if(angle < 0)
			return -1;
		else {
			if(this.x < p.x)
				return -1;
			else
				return 1;
		}

	}

}
