package visualization;

public class Insertion_Sort {
	
	public void insertion(Mai b)
	{
		for(int i=1;i<b.ar.length;i++)
		{
			int s=b.ar[i];
			int r=-1;
			for(int j=0;j<i;j++)
			{
				b.setrr(j);
				b.setr(i);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e) {}
				b.repaint();
				if(b.ar[j]>s)
				{
					r=j;
					break;
				}
			}
			if(r!=-1)
			{
				int t=b.ar[i];
				for(int j=i;j>r;j--)
				{
					b.ar[j]=b.ar[j-1];
				}
				b.ar[r]=t;
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
