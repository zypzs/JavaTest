package ThreadTest;

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1("�߳�1");
		MyThread1 thread2 = new MyThread1("�߳�2");
		
		//ͨ��ʵ��Runnable�ӿڵ��߳�����Ҫ����Thread�����ʵ����
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
		System.out.println(name + "����" + i);
	}
	
}
