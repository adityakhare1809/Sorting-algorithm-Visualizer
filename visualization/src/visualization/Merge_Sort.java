package visualization;

public class Merge_Sort {
	
	public void merge_sort(Mai b,int l,int h)
	{
		b.setr(l);
		//b.setrr(h);
		if(l<h)
		{
			int mid=(l+h)/2;
			merge_sort(b,l,mid);
			merge_sort(b,mid+1,h);
			merge(l,mid,h,b);
		}
		b.repaint();
		try
		{
			Thread.sleep(600);
		}
		catch(Exception e) {}
	}
	
	public void merge(int l,int mid,int h,Mai b)
	{
		int n1=mid-l+1;
		int n2=h-mid;
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]=b.ar[l+i];
			//System.out.print(" L"+L[i]);
		}
		System.out.println();
		for(int i=0;i<n2;i++)
		{
			R[i]=b.ar[mid+1+i];
			//System.out.print(" R"+R[i]);
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				b.ar[k]=L[i];
				i++;
			}
			else
			{
				b.ar[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			b.ar[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			b.ar[k]=R[j];
			j++;
			k++;
		}
		
	}

}
