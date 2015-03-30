package com.st.app.designmode.singleton;

public class Minister {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//第一天
		Emperor emperor1=Emperor.getInstance();
		emperor1.emperorInfo();
		//第二天
		Emperor emperor2=Emperor.getInstance();
		emperor2.emperorInfo();
		//第三天
		Emperor emperor3=Emperor.getInstance();
		emperor3.emperorInfo();
	}

}
