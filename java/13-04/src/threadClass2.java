class Eve extends Thread{

		// TODO Auto-generated method stub

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=2;i<50;i+=2)
			{
				System.out.println("Even");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
}

 class Od extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<50;i+=2)
		{
			System.out.println("Odd");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class threadClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eve ev=new Eve();
		Thread t3=new Thread(ev);
		
		Od od=new Od();
		Thread t4=new Thread(od);
		
		t3.start();
		t4.start();
	}

}
