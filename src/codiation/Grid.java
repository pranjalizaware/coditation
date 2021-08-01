package codiation;

import java.util.HashMap;

public class Grid {

	HashMap<Coordinate,Cell> hm = new HashMap<>();
	
	public void addCell(Coordinate co,Cell cell) {
		hm.put(co, cell);
	}
	
	public Cell getCell(Coordinate co)
	{
		return hm.get(co);
	}
	
	public void add500Cells()
	{
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<5;j++)
			{
				Coordinate co=new Coordinate(i,j);
				Cell c=new Cell(1);
				hm.put(co, c);
			}
		}
	}
	public static void main(String[]args)
	{
		Grid g=new Grid();
		g.add500Cells();
		System.out.println("finished adding 500 cells");
	}
}




class Coordinate
{
	int x;
	int y;
	public Coordinate() {
		super();
	}
	
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}