package com.bridgeit.designpattern.adapter;

public class PenAdapter implements Pen {
 PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);
	}

}
