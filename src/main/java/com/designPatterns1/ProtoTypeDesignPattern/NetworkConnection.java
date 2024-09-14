package com.designPatterns1.ProtoTypeDesignPattern;

public class NetworkConnection implements Cloneable {
	
    private int ip;
    private String importantdata;
    
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public String getImportantdata() {
		return importantdata;
	}
	public void setImportantdata(String importantdata) {
		this.importantdata = importantdata;
	}
	
	
    
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantdata=" + importantdata + "]";
	}
	public void loadImportantData() {
		this.importantdata="very very important data";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
}
