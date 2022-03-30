import java.util.LinkedList;
import java.util.Scanner;


public class SmartCityApplication 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("===========================================================");
		System.out.println("                    PUNE SMART CITY                  ");
		System.out.println("===========================================================\n");
		
		System.out.println("****User Registration****");
		Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter firstName => \n");
        String firstName = scanner.nextLine();
        

        System.out.print(" Enter lastName => \n");
        String lastName = scanner.nextLine();
        

        System.out.print(" Enter userName => \n");
        String userName = scanner.nextLine();
        

        System.out.print(" Enter password => \n");
        String password = scanner.nextLine();
        

        System.out.print(" Enter emailId => \n");
        String emailId = scanner.nextLine();
        
        System.out.print(" Enter phoneNo => \n");
        long phoneNo = scanner.nextLong();
        
        CityDetails obj=new CityDetails("Divya");
        obj.showMenu();
	}
	
}

class CityDetails
{
	String userName1;
	
	CityDetails(String uname)
	{
		userName1=uname;
		
		System.out.println("****User Login****");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print(" Enter user name => ");
        String userName1 = scanner1.nextLine();
        
        System.out.print(" Enter password => ");
        String password1 = scanner1.nextLine();

        if ("divya".equals(userName1) && "password".equals(password1)) {
            System.out.println(" User successfully logged-in.. ");
        } else {
            System.out.println("\n In valid userName of password! please enter again");
            System.out.print(" Enter user name => ");
            String userName2 = scanner1.nextLine();
            
            System.out.print(" Enter password => ");
            String password2 = scanner1.nextLine();
        }
	}
	
	public void jobOppourtunities()
	{
		
		System.out.println("************************Add new job oppourtunities****************************** \n");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter new job oppourtunity: ");
		String op=s1.nextLine();
		
		System.out.println("\nNEW JOB OPPOURTUNITIES===>");
		System.out.println(op);
	}
	
	void hotels()
	{
		
		System.out.println("************************Book a hotel in the hotel lists****************************** \n");
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter your name: ");
        String name=s2.nextLine();
        System.out.println("Enter your address: ");
        String addr=s2.nextLine();
        System.out.println("Enter your mobile no: ");
        long mobno=s2.nextLong();
        System.out.println("\nDetails of user: \n");
        System.out.println("Name: "+name+"\n"+"Address: "+addr+"\n"+"Mobile no: "+mobno);
        
		System.out.println("Select a hotel 1 to 10: ");
		int h=s2.nextInt();
		if(h>0 && h<11)
		System.out.println("Congratulations!..");
		
		switch(h) {
		
        case 1:
        	System.out.println("Room is available in 'Choice Hotel'");
        	break;
        case 2:	
        	System.out.println("Room is available in 'Lemon Tree Premier City Center'");
        	break;
        case 3:	
        	System.out.println("Room is available in 'Hotel Shree Panchratna'");
        	break;
        case 4:	
        	System.out.println("Room is available in 'Hotel Shivam'");
        	break;
        case 5:	
        	System.out.println("Room is available in 'Marriott Suites Pune'");
        	break;
        case 6:	
        	System.out.println("Room is available in 'Four Points by Sheraton Hotel'");
        	break;
        case 7:	
        	System.out.println("Room is available in 'The Ritz-Carlton'");
        	break;
        case 8:	
        	System.out.println("Room is available in 'Blue Diamond'");
        	break;
        case 9:	
        	System.out.println("Room is available in 'Mind Space Hotel, Pimpri'");
        	break;
        case 10:	
        	System.out.println("Room is available in 'Kapila Business Hotel'");
        	break;
        default:
		    System.out.println("Invalid option!!Please enter again");
		    System.out.println("Select a hotel 1 to 10: \n");
			int h1=s2.nextInt();
			
			System.out.println("Room is available");
		    break;
		   
		}
		
	}	
		
    void ATMs()
	{
    	System.out.println("************************Check cash in a ATM****************************** \n");
		int acash1=10000,acash2=20000,acash3=30000,acash4=5000,acash5=15000;
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Select number from 1 to 5: ");
        int a=s3.nextInt();
        if(a>0 && a<6)
        System.out.println("Cash is available");
        
		if(a==1) {
			System.out.println("Cash in ATM 1: \n"+acash1);
		}
		else if(a==2) {
			System.out.println("Cash in ATM 2: \n"+acash2);
		}
		else if(a==3) {
			System.out.println("Cash in ATM 3: \n"+acash3);
		}
		else if(a==4) {
			System.out.println("Cash in ATM 4: \n"+acash4);
		}
		else if(a==5) {
			System.out.println("Cash in ATM 5: \n"+acash5);
		}
		else {
			System.out.println("Invalid option!!Please enter again");
			System.out.println("Select number from 1 to 5: ");
	        int a1=s3.nextInt();
	        if(a1>0 && a1<6)
	        System.out.println("Cash is available\n");
		}
		           
	}			           
				           
    void touristSpots()
	{
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Dagdusheth Halwai Temple");
		list.add("Shaniwar Wada");
		list.add("Sarasbaug Ganapati Temple");
		list.add("Aga Khan Palace");
		list.add("Sinhagad Fort");
		
		System.out.println(list+"\n");
		
		System.out.println("************************Ticket to enter****************************** \n");
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter number from 1 to 5: ");
		int t=s4.nextInt();
		
		if(t>0 && t<6)
			System.out.println("You have a ticket to enter");
		String a1=list.element();
		String b1=list.get(1);
		String c1=list.get(2);
		String d1=list.get(3);
		String e1=list.getLast();
		
		if(t==1) {
		System.out.println(a1+"Entry timings: 06:00 am to 11:00 pm\n"+
				"Location: Ganpati Bhavan, Shivaji Road, Pune\n");
		}
		
	    else if(t==2) {
		System.out.println(b1+"Entry timings: 08:00 am to 06:30 pm\n"+
			    "Location: Shaniwar Peth, Pune\n");
		}
	    
		else if(t==3) {
		System.out.println(c1+"Location: It is located within a radius of 1 km from Swargate bus station\n"+
				"and 3.6 km from Pune Railway Station\n"+
				"Timings: 9 am to 6 pm every day\n");
		}
		
		else if(t==4) {
		System.out.println(d1+"Entry timings: 09:00 am to 05:30 pm\n"+
				"Location: Pune Nagar Road, Kalyani Nagar, Pune\n");
		}
		
		else if(t==5) {
		System.out.println(e1+"Location: It is located at Sinhagad Ghat Road\n"+
				"Opening Hours: between 05:00 am in the morning and get down by 06:00 pm in the evening\n"); 
		
		}
		else {
		System.out.println("Invalid option!!Please enter again");
		System.out.println("Enter number from 1 to 5: \n");
		int t1=s4.nextInt();
		
		System.out.println("You have a ticket to enter");
		
		}
		
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\nWelcome "+userName1);
		
		System.out.println("\n**********************MENU LIST****************************");
		System.out.println("A. Job oppourtunities");
		System.out.println("B. Show hotel list");
		System.out.println("C. Show ATM's list");
		System.out.println("D. Show tourists spots list");
		System.out.println("E. Exit");
		
		do {
			
			System.out.println("\nEnter an option");
			option=scanner.next().charAt(0);
			
			switch(option) {
			
			case 'A':
				System.out.println("========================JOB OPPOURTUNITIES=========================\n");
				
				String s1="===> Senior System Software Engineer- Capgemini, Pune";
				String s2="===> Senior Tools Software Engineer- Dream11, Pune";
				String s3="===> Lead Software Engineer- Qualys, Pune";
				String s4="===> Senior Software Engineer- Bajaj Finserv";
				String s5="===> Senior Software Development Engineer- Mastercard, Pune";
				String s6="===> Software Engineer-Amdocs, Pune";
				String s7="===> Technical Support Executive, Pune";
				String s8="===> Software Engineer, Back End- Google, Pune";
				String s9="===> AVP – Application Development- ReWise Analytics & Technologies Pvt. Ltd, Pune";
				String s10="===> Full-stack PHP Developer- Alliance Recruitment Agency, Pune\n";
						
				System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7+"\n"+s8+"\n"+s9+"\n"+s10);
				jobOppourtunities();
				
				break;
				
			case 'B':
				System.out.println("========================HOTELS IN THE CITY=========================\n");
				
				System.out.println("1. ---Choice Hotel---"+"\nAddress : Near Parsi Agyari, \nNana Peth,Pune\n");
				System.out.println("2. ---Lemon Tree Premier City Center---"+"\nAddress : Survey No. 40, \nConnaught Road\n");
				System.out.println("3.---Hotel Shree Panchratna---"+"\nAdress : Tadiwala Road\n");
				System.out.println("4.---Hotel Shivam---"+"\nAddress : Wilson Garden, \nNear Pune Railway Station\n");
				System.out.println("5.---Marriott Suites Pune---"+"\nAddress : Mundhwa, \nKoregaon Park Annex\n");
				System.out.println("6.---Four Points by Sheraton Hotel---"+"\nAddress : Nagar Road, \nViman Nagar, Near Airport\n");
				System.out.println("7.---The Ritz-Carlton---"+"\nAddress : Golf Course Square Airport Road\n");
				System.out.println("8.---Blue Diamond---"+"\nAddress : Koregaon Road\n");
				System.out.println("9.---Mind Space Hotel, Pimpri---"+"\nAddress : Opposite PCMC Building, \nOld Mumbai Highway\n");
				System.out.println("10.---Kapila Business Hotel---"+"\nAddress : Dholepatil Road\n");
				hotels();
				
				break;
				
			case 'C':
				System.out.println("========================ATM's IN CITY=========================\n");
				System.out.println("1. Balaji Services. 1st Floor, Chandan Nagar\n"+
						           "2. South Indian Bank ATM, Ground Floor, M.G. Road, Camp\n"+
						           "3. Andhra Bank ATM, Sachabir Street, Kasba Peth\n"+
						           "4. State Bank of India SBI ATM, Roshni Services, BPCL Petrol PumpKoregaon Park\n"+
						           "5. Central Bank of India ATM, Lakaki RoadShivaji Nagar\n");
				
				ATMs();
				break;
				
			case 'D':
				System.out.println("========================TOURIST SPOTS=========================\n");
				System.out.println("* Dagdusheth Halwai Temple\n"+
						 "* Shaniwar Wada\n"+
						 "* Sarasbaug Ganapati Temple\n"+
						 "* Aga Khan Palace\n"+
						 "* Sinhagad Fort\n");
				
				touristSpots();
				
				break;
				
			default:
				System.out.println("Invalid option!!Please enter again");
				break;
				
			}
			
		}while(option!='E');
		
		System.out.println("Thank you for using our services...");
		
		
	}
	
}	
	
	
	
	
	
	
		
	



	


