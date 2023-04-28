package challenge4;

class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class threadFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		thread1 t1=new thread1();
		thread2 t2=new thread2();

		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++)
				{
					System.out.println("Three....");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		Thread t4=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Four");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}

			}
			
		});
		
		t1.start();
		t2.start();
	//	t2.join();
		t3.start();
		t3.join();
		t4.start();
		
	}

}
