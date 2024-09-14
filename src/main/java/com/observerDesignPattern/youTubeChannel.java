package com.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class youTubeChannel implements Subject {
	
	List<Observers> ob=new ArrayList<>();

	@Override
	public void subscribe(Observers ob) {
		// TODO Auto-generated method stub
		this.ob.add(ob);
		
	}

	@Override
	public void unSubscribe(Observers ob) {
		// TODO Auto-generated method stub
		this.ob.remove(ob);
		
	}

	@Override
	public void notifyChanges() {
		// TODO Auto-generated method stub
		for(Observers obs:this.ob) {
			obs.notifys();
		}	
	}

}
