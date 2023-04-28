import java.util.Scanner;

public class app {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter university name:");
		String uName=sc.nextLine();
		
		University university=new University();
		university.setName(uName);
		
		int choice;
		do
		{
			System.out.println("1.Add College\n 2.Delete College\n 3.Display Colleges \n4.Exit \nEnter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1://add
						String detail=sc.nextLine();
						if(detail.equals(""))
							detail=sc.nextLine();
						College college=College.createCollege(detail);
						university.addCollegeToUniversity(college);
						System.out.println("College successfully added");
						
				case 2://delete
						System.out.println("enter the aname of thr college to be deleted");
						String name=sc.nextLine();
						if(name.equals(""))
							name=sc.nextLine();
						Boolean status=university.removeCollege(name);
						if(status==true)
							System.out.println("deleted successfully");
						else
							System.out.println("not found");
						break;
						
				case 3://display
						university.displayColleges();
						break;
						
				case 4: System.exit(0);
								
			}
		}while(choice<4);

	}

}
