package ThreadTest;

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1("线程1");
		MyThread1 thread2 = new MyThread1("线程2");
		
		//通过实现Runnable接口的线程类需要利用Thread类进行实例化
	    Thread t1 = new Thread(thread1);
	    Thread t2 = new Thread(thread2);
	    
	    t1.start();
	    t2.start();
	}
}

class MyThread1 implements Runnable{

	private String name;
	public MyThread1(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0;i < 10; i++)
		System.out.println(name + "运行" + i);
	}
	
}
