package com.st.app.designmode.proxy;

public class Ximenqing {
	public static void main(String[] args) {
		//把王婆叫出来,找潘金莲
		Wangpo wangpo;
		wangpo=new Wangpo();
		//明面上是王婆做事，实际上是潘金莲在做
		wangpo.makeEyeswithMan();
		wangpo.makeHappywithMan();
		//把王婆叫出来,找贾氏
		wangpo=new Wangpo(new Jiashi());
		//明面上是王婆做事，实际上是贾氏在做
		wangpo.makeEyeswithMan();
		wangpo.makeHappywithMan();
	}
}
