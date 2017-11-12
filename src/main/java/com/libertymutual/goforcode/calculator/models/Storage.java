package com.libertymutual.goforcode.calculator.models;

import java.util.ArrayList;

public class Storage {

	private ArrayList<Calculator> storeCalcs = new ArrayList<Calculator>(); 
		
	public void storeCalcs(Calculator calcs) {
		storeCalcs.add(0, calcs);
	}

	public ArrayList<Calculator> getStoreCalcs() {
		return storeCalcs;
	}

}
