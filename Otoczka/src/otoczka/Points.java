package otoczka;


public class Points {

	Point[] pts;
	int nPoints;
	
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
	
	
}
