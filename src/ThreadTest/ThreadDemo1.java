package ThreadTest;

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("�߳�1");
		MyThread thread2 = new MyThread("�߳�2");
		MyThread thread3 = new MyThread("�߳�3");
//		thread1.run();
//		thread2.run();
//		thread3.run();
		//���Ҫ����һ���̵߳Ļ�������Ҫ��start()
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
		System.out.println(name + "����" + i);
	}
}
