package com.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

// concept of copying the existing object rather than creating new instance from the scratch because creating new object may be costly
// this approach save costly resource and time especially when object creation is heavy process
public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String impData;
	private List<String> domains=new ArrayList<String>();
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImpData() {
		return impData;
	}
	public void setImpData(String impData) {
		this.impData = impData;
	}
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", impData=" + impData + ", domains=" + domains + "]";
	}
	public void loadImpData() throws InterruptedException {
		this.impData="this is important data";
		domains.add("www.rrr.com");
		domains.add("www.srh.com");
		domains.add("www.rcb.com");
		Thread.sleep(5000);
		
	}
	
	//  this is for swallow copy
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	// this is for deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		NetworkConnection nt=new NetworkConnection();
		nt.setIp(this.getIp());
		nt.setImpData(this.getImpData());
		for(String d:this.getDomains()) {
			nt.getDomains().add(d);
		}
		return nt;
	}

}
