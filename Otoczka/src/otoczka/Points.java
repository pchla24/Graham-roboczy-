package otoczka;


public class Points {

	Point[] pts;
	int nPoints;
	StackOfPoints ptsS = new StackOfPoints(nPoints);
	
	public Points(int max){
		pts = new Point[max];
		nPoints = 0;
	}
	
	public void add(Point p) {
		pts[nPoints++] = p;
	}
	
	public void printPoints() {
		for(int i=0; i < nPoints; i++) {
			System.out.println("Punkt( " + pts[i].getX() + ", " + pts[i].getY() + " )");
		}
	}
	
	public void mergeSort() 
	{ 
		Point[] secArr = new Point[nPoints];
		recMergeSort(secArr, 0, nPoints-1);
	}
	
	private void recMergeSort(Point[] secArr, int loBound, int upBound)
	{
		if(loBound == upBound) 
			return; 
		else
		{ 
			int mid = (loBound+upBound) / 2;
			recMergeSort(secArr, loBound, mid);
			recMergeSort(secArr, mid+1, upBound);
			merge(secArr, loBound, mid+1, upBound);
		} 
	}
	
	private void merge(Point[] secArr, int lowPtr, int highPtr, int upBound)
	{
		int j = 0; 
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upBound-lowerBound+1; 
		
		while(lowPtr <= mid && highPtr <= upBound)
			if( pts[lowPtr].compare(pts[highPtr]) < 0 )
				secArr[j++] = pts[lowPtr++];
			else
				secArr[j++] = pts[highPtr++];
		
		while(lowPtr <= mid)
			secArr[j++] = pts[lowPtr++];
		
		while(highPtr <= upBound)
			secArr[j++] = pts[highPtr++];
		
		for(j=0; j<n; j++)
			pts[lowerBound+j] = secArr[j];
	} 
	
	
	public static int isCounterClockwise(Point a, Point b, Point c) {
		
		double area = (b.getX()-a.getX())*(c.getY()-a.getY()) - (b.getY()-a.getY())*(c.getX()-a.getX());
		
		if(area < 0)
			return -1;
		else if(area > 0)
			return 1;
		else 
			return 0;
	}
	
	public void doGrahamScan() {
		
		this.mergeSort();
		
		ptsS.push(pts[0]);
		for(int i=0; i<nPoints-2; i++) {
			int result = isCounterClockwise(pts[i], pts[i+1], pts[i+2]);
			if(result == 1 || result == 0)
				ptsS.push(pts[i+1]);
			else 
				ptsS.push(pts[i+2]);
		}
	}
	
}
