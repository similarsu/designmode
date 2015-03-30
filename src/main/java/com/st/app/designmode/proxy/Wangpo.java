package com.st.app.designmode.proxy;

public class Wangpo implements KindWomen{
	private KindWomen kindWomen;
	
	public Wangpo(){
		this.kindWomen=new Panjinlian();
	}
	
	public Wangpo(KindWomen kindWomen){
		this.kindWomen=kindWomen;
	}

	public void makeEyeswithMan() {
		// TODO Auto-generated method stub
		this.kindWomen.makeEyeswithMan();
	}

	public void makeHappywithMan() {
		// TODO Auto-generated method stub
		this.kindWomen.makeHappywithMan();
		
	}
}
