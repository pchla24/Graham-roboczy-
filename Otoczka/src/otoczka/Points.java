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
	
	
	private boolean isCounterClockwise(Point a, Point b, Point c) {
        double r = (c.getX() - b.getX())*(a.getY() - b.getY())
                - (a.getX() - b.getX())*(c.getY() - b.getY());
        return r > 0;

    }
	
	public void doGrahamScan() {
		
		this.mergeSort();
		this.printPoints();
		System.out.println("===============");
		
		ptsS.push(pts[0]);
		ptsS.push(pts[1]);
		Point b, c;
		for(int i = 2; i < pts.length; i++) {
            b = ptsS.pop();
            c = pts[i];
            while(isCounterClockwise(ptsS.peek(), b, c)) {
                b = ptsS.pop();
            }
            ptsS.push(b);
            ptsS.push(c);
		}
		
		ptsS.printStack();
		
	}
	
}
