package ThreadTest;

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("线程1");
		MyThread thread2 = new MyThread("线程2");
		MyThread thread3 = new MyThread("线程3");
//		thread1.run();
//		thread2.run();
//		thread3.run();
		//如果要启动一个线程的话，必须要用start()
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0;i < 10; i++)
		System.out.println(name + "运行" + i);
	}
}
