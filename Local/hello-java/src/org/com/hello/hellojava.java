package org.com.hello;
abstract class Roundshape
{

	 int rad = 4;
	 final float PI=3.14f;
	 public abstract void findarea();
	 public abstract void findvolume();
}
 class sphere extends Roundshape
{

	@Override
	public void findvolume() {
		
		System.out.println("Volume of sphere:"+((4/3)*PI*rad*rad*rad));
		System.out.println("First Change");
	}
	/*void findarea(int rad) 
	{
	
		this.rad=rad;
		System.out.println("Area of sphere:"+(4*PI*rad*rad));
		
	}
	void findvolume(int rad) 
	{
	
		this.rad=rad;
		System.out.println("Volume of sphere:"+((4/3)*PI*rad*rad*rad));
		
	}*/

	@Override
	public void findarea() {
		
		System.out.println("Area of sphere:"+(4*PI*rad*rad));
		
	}
}
public class hellojava 
 {

 	public static void main(String[] args) 
 	{
 		// int rad=4;
 		sphere s=new sphere();
 		s.findarea();
 		s.findvolume();
 	}

 }

