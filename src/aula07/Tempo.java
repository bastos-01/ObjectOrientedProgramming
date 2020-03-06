package aula07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tempo {
	private int h,m,s;
	
	public Tempo() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH,mm,ss");
	    LocalDateTime now = LocalDateTime.now();
	    h = Integer.parseInt(dtf.format(now).split(",")[0]);
	    m = Integer.parseInt(dtf.format(now).split(",")[1]);
	    s = Integer.parseInt(dtf.format(now).split(",")[2]);
	    
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "(" + h + ", " + m + ", " + s + ")";
	}
	
	
	
	
	
}
