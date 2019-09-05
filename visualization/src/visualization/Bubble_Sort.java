package visualization;

public class Bubble_Sort {
	public void bubble(Mai b)
	{
		
		for(int i=0;i<b.ar.length;i++)
		{
			for(int j=i+1;j<b.ar.length;j++)
			{
				if(b.ar[i]>b.ar[j])
				{
					int t=b.ar[i];
					b.ar[i]=b.ar[j];
					b.ar[j]=t;
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
