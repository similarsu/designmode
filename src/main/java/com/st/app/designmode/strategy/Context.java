package com.st.app.designmode.strategy;
/***
 * 锦囊
 * @author coolearth
 *
 */
public class Context {
	private IStrategy strategy;
	public Context(IStrategy strategy){
		this.strategy=strategy;
	}
	public void operate(){
		this.strategy.operate();
	}
}
