package visualization;

public class Quick_Sort {
	
	public void Quick_sort(Mai b,int l,int h)
	{
		if(l<h)
		{
			int j=partition(l,h,b);
			Quick_sort(b,l,j);
			Quick_sort(b,j+1,h);
		}
		b.repaint();
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {}
		
	}
	
	public int partition(int l,int h,Mai b)
	{
		int pivot=b.ar[l];
		int i=l;
		int j=h;
		b.setpivot(l);
		while(i<j)
		{
			do {
				i++;
			}while(i<b.ar.length && b.ar[i]<=pivot);
			
			do {
				j--;
			}while(j>=0 && b.ar[j]>pivot);
			if(i<j)
			{
				int t=b.ar[i];
				b.ar[i]=b.ar[j];
				b.ar[j]=t;
			}
			b.repaint();
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
		if(j>=0)
		{
		b.ar[l]=b.ar[j];
		b.ar[j]=pivot;
		}
		b.repaint();
		return j;
	}

}
