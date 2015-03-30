package com.st.app.designmode.strategy;

public class Zhaoyun {
	public static void main(String[] args) {
		Context context;
		System.out.println("刚到吴国，那里打开第一个");
		context=new Context(new BackDoor());
		context.operate();
		System.out.println("离开吴国老处");
		context=new Context(new GivenGreenLight());
		context.operate();
		System.out.println("碰到孙权的追兵，打开第三个");
		context=new Context(new BlockEnemy());
		context.operate();
	}
}
