package data_clumps.after;

import java.util.Date;

public class Rental{
	private String name;
	private Date start;
	private Date end;
	
	public Rental(String name, Date start, Date end) {
		super();
		this.name = name;
		this.start=start;
		this.end=end;
		
	}
	
	public String getName(){
		return name;
	}
	
	public Date getStart() {
		return start;
	}
	
	public Date getEnd() {
		return end;
	}
	
}