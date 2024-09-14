package com.observerDesignPattern;

interface Subject {
	void subscribe(Observers ob);
	void unSubscribe(Observers ob);
	void notifyChanges();
}
