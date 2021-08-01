package codiation;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grid g=new Grid();
g.add500Cells();

Scanner s=new Scanner(System.in);

System.out.println("please enter no of tick");
int tickCount=s.nextInt();

for(int j=1;j<=tickCount;j++)
{
System.out.println("details of tick "+j);
System.out.println("please enter how many cells you want to add?(you can add max 100 cells)");
int cellCount=s.nextInt();

for(int i=1;i<=cellCount;i++)
{
	System.out.println("please enter coordinate of cell no "+i + ", in the format x y");
	int x=s.nextInt();
	int y=s.nextInt();
	System.out.println("please enter cell state(0 for dead, 1 for live)");
	int a=s.nextInt();
    Cell c=new Cell(a);
    Coordinate co=new Coordinate(x,y);
    g.addCell(co, c);
}   
    
}
	}

}
