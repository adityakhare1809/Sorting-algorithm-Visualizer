package visualization;

public class Selection_Sort {
	
	//int r=0;
	public void selection(Mai b)
	{
		for(int i=0;i<b.ar.length;i++)
		{
			int min=b.ar[i];
			int x=-1;
			for(int j=i+1;j<b.ar.length;j++)
			{
				if(b.ar[j]<min)
				{
					min=b.ar[j];
					x=j;
					b.setrr(j);
					b.setr(i);
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e) {}
					b.repaint();
				}
				
			
			}
			if(x!=-1)
			{
				int t=b.ar[i];
				b.ar[i]=b.ar[x];
				b.ar[x]=t;
			}
			b.setr(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			b.repaint();
		
		}
	}

}
