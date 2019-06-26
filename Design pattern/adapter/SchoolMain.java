package com.bridgeit.designpattern.adapter;

public class SchoolMain {

	public static void main(String[] args) {
	
Pen p = new PenAdapter();
		
AssignmentWork aw = new AssignmentWork();
aw.setP(p);
aw.writeAssignment("I already wrote my assignment");

	}

}
