package challenge4;

public class thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("One");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Two");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		t2.start();
	}

}
