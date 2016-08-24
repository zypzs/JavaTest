package ThreadTest;

/**
 * �̳�Thread���ʵ��Runnable�ӿڵ��������ϵ��
 * ʹ��Thread��ʵ�ֶ��߳��޷��ﵽ��Դ�����Ŀ�ģ�������Runnable����ʵ����Դ����
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
//		Thread1 t1 = new Thread1();
//		Thread1 t2 = new Thread1();
//		t1.run();
//		t2.run();

		Thread2  mt = new Thread2();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.run();
		t2.run();
	}

}

class Thread1 extends Thread{
	private int num = 10;
	public void run(){
		while(this.num >= 0){
			System.out.println("num : " + num--);
		}
	}
}

class Thread2 implements Runnable{
	private int num = 10;
	public void run(){
		while(this.num >= 0){
			System.out.println("num ddfa: " + num--);
		}
	}
}
