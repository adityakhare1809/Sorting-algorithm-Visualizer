package visualization;
import java.io.*;
import java.util.*;
public class Radix_Sort {
	
	public void radix(Mai b)
	{
		int max=0;
		for(int i=0;i<b.ar.length;i++)
		{
			if(b.ar[i]>max)
			{
				max=b.ar[i];
			}
		}
		int l=(Integer.toString(max)).length();
		String[] arr=new String[b.ar.length];
		for(int i=0;i<arr.length;i++)
		{
			String t=Integer.toString(b.ar[i]);
			while(t.length()<l)
			{
				t="0"+t;
			}
			arr[i]=t;
		}
		List<String>[] ll=new List[10];
		
		for(int i=l-1;i>=0;i--)
		{
			for(int j=0;j<arr.length;j++)
			{
				String s=arr[j];
				int c=Character.getNumericValue(s.charAt(i));
				if(ll[c]==null)
				{
					ll[c]=new ArrayList<String>();
				}
				ll[c].add(s);
			}
			int h=0;
			for(int j=0;j<ll.length;j++)
			{
				List<String> tt=ll[j];
				if(tt!=null)
				{
					while(tt.isEmpty()==false)
					{
						arr[h]=tt.get(0);
						tt.remove(0);
						h++;
					}
				}
			}
			b.setrr(i);
			write(b,arr);
		}
		
		//write(b,arr);
		
	}
	
	public void write(Mai b,String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			b.ar[i]=Integer.parseInt(arr[i]);
			System.out.print(b.ar[i]+" ");
		}
		System.out.println();
		b.repaint();
		try {
			Thread.sleep(2500);
		}
		catch(Exception e) {}
	}

}
