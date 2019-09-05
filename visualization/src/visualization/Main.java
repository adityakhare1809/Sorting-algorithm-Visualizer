package visualization;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Mai extends JPanel
{
		int[] ar= {25,150,100,60,113,544,422,355,450,576,278,100,34,500,336,67,30,57,22,330,129,360};
		int xloc=0;
		int yloc=550;
		int width=40;
		static int r=0;
		static int rr=0;
		static int pivot=0;
		public void setpivot(int p)
		{
			this.pivot=p;
		}
		public void setr(int y)
		{
			this.r=y;
		}
		
		public void setrr(int y)
		{
			this.rr=y;
		}
		public Mai()
		{
		setBackground(Color.black);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			draw(g);
			
		}
		
		public void draw(Graphics g)
		{
			for(int i=0;i<ar.length;i++)
			{
				if(i==r)
				{
					g.setColor(Color.green);
				}
				else if(i==rr)
				{
					g.setColor(Color.CYAN);
				}
				else if(i==pivot)
				{
					g.setColor(Color.red);
				}
				else
				g.setColor(Color.BLUE);
				xloc+=width+1;
				g.fillRect(xloc, yloc-ar[i], width, ar[i]);
				
			}
			xloc=0;
		}
		
	}


public class Main{
		public static void main(String[] args)
		{
		JFrame a=new JFrame("Sort Visualizer");
		Mai b=new Mai();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(1000,600);
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.add(b);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1 For Selection Sort");
		System.out.println("Press 2 For Bubble Sort");
		System.out.println("Press 3 For Insertion Sort");
		System.out.println("Press 4 For Quick Sort");
		System.out.println("Press 5 For Merge Sort");
		System.out.println("Press 6 For Radix Sort");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Selection_Sort ss=new Selection_Sort();
			ss.selection(b);
			break;
		case 2:
			Bubble_Sort bs=new Bubble_Sort();
			bs.bubble(b);
			break;
		case 3:
			Insertion_Sort is=new Insertion_Sort();
			is.insertion(b);
			break;
		case 4:
			Quick_Sort qs=new Quick_Sort();
			qs.Quick_sort(b, 0, b.ar.length);
			break;
		case 5:
			Merge_Sort ms=new Merge_Sort();
			ms.merge_sort(b, 0, b.ar.length -1);
			//b.repaint();
			//print(b.ar);
			break;
		case 6:
			Radix_Sort rs=new Radix_Sort();
			rs.radix(b);
			break;
		}
	}
		public static void print(int[] ar)
		{
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
}
