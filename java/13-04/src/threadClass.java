 class even implements Runnable{

		// TODO Auto-generated method stub

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=2;i<50;i+=2)
			{
				System.out.println("Even");
			} 
		}
}

 class odd implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<50;i+=2)
		{
			System.out.println("Odd");
//			try {
//				Thread.sleep(200s);
//			}
		}
	}
	
}

public class threadClass
{
	public static void main(String[] args)
	{
		even ev=new even();
		Thread t1=new Thread(ev);
		
		odd od=new odd();
		Thread t2=new Thread(od);
		
		t1.start();
		t2.start();
		
	}
}
