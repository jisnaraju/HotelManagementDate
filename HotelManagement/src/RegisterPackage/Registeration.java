package RegisterPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CustomerPackage.Customer;
import bookingpackage.Booking;
public class Registeration {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
  	 public static int regNo=1,r1=0,b1=0,roomno=1;
  	   int date,total,k,endDate,startDate;
  	 public  static String name[]=new String[25];
  	 public  static  int reg[]=new int[25];
  	static  public    String email1[]=new String[25];
	Customer customer=new Customer();
	Booking b=new Booking();
	//customer object  created in register class and input assigning to the customer class
	public void register() throws IOException {
		reg[r1]=regNo;
        System.out.println("Enter your FirstName");
		customer.setFirstName(br.readLine());
		name[r1]=customer.getFirstName();
		System.out.println("Enter your MiddleName");
		customer.setMiddleName(br.readLine());
		System.out.println("Enter your LastName");
		customer.setLastName(br.readLine());
		System.out.println("Enter your email");
		customer.setEmail(br.readLine());
		email1[r1]=customer.getEmail();
		
		System.out.println("Enter your phone");
	    customer.setPhone(br.readLine());
		System.out.println("Enter your address");
		customer.setAddress(br.readLine());
		System.out.println("Enter your proofTyp");
		customer.setProofType(br.readLine());
		System.out.println("Enter your proofID");
		customer.setProofID(br.readLine());
		System.out.println("Thank you for registering. Your id is "+regNo);
		regNo++;
		r1++;
	}
	public void display()
	{
		System.out.println("Name is :"+customer.getFirstName()+customer.getMiddleName()+customer.getLastName());
		System.out.println("Email is :"+customer.getEmail());
		System.out.println("phoneNumber is  :"+customer.getPhone());
		System.out.println("address is  :"+customer.getAddress());
		System.out.println("ProofType is :"+customer.getProofType());
		System.out.println("ProofID is :"+customer.getProofID());
		
   }

	public void Book() throws IOException
	{
		
		System.out.println("Booking");
		System.out.println("AC/nAC");
		b.setAc(br.readLine());
		System.out.println("Single/Double cot");
		b.setCot(br.readLine());
		System.out.println("Cable/non Cable");
		b.setCable(br.readLine());
		System.out.println("wifi/non wifi");
		b.setWifi(br.readLine());
		System.out.println("laundry/non laundry");
		b.setLaundry(br.readLine());
		System.out.println("Booking date");
		b.setDate(Integer.parseInt(br.readLine()));
		b.datearray[b1]=b.getDate();
		b.roomarray[b1]=roomno;
		roomno++;
		b1++;
	}
	public void bookingdisplay()
	{
		if(b.getAc().equals("AC"))
			total=total+1000;
		
		else if(b.getAc().equals("nAC"))
			total=total+750;
		 if(b.getCot().equals("Double"))
			total=total+350;
		else if(b.getCot().equals("Single"))
			total=total+0;
		 if(b.getCable().equals("C"))
			total=total+50;
		else if(b.getCable().equals("nC"))
			total=total+0;
		 if(b.getWifi().equals("W"))
			total=total+200;
		else if(b.getWifi().equals("nW"))
			total=total+0;
		if(b.getLaundry().equals("L"))
			total=total+100;
		else if(b.getLaundry().equals("nL"))
			total=total+0;
		 System.out.println("The total charge is Rs."+total);
		 System.out.println("The services chosen are");
		// System.out.println(getAc()+"\n"+getCot()+" cot"+"\n"+getCable()+"\n"+getWifi()+"\n"+getLaundry());
		if(b.getAc().equals("AC") && b.getCot().equals("Double") ) 
			System.out.println("Double cot AC room");
		else if(b.getAc().equals("AC") && b.getCot().equals("Single") )
			System.out.println("Single cot AC room");
		else if(b.getAc().equals("nAC") && b.getCot().equals("Double") ) 
			System.out.println("Double cot nAC room");
		else if(b.getAc().equals("nAC") && b.getCot().equals("Single") )
			System.out.println("Single cot nAC room");
		 if(b.getCable().equals("C"))
			System.out.println("Cable connection enabled");
		else if(b.getCable().equals("nC"))
			System.out.println("Cable connection not enabled");
		 if(b.getWifi().equals("W"))
			System.out.println("Wi-Fi enabled");
		 else if(b.getWifi().equals("nW"))
			System.out.println("Wi-Fi not enabled");
		 if(b.getLaundry().equals("L"))
			System.out.println("with laundry service");
		else if(b.getLaundry().equals("nL"))
			System.out.println("without laundry service");
	}
	
	
	
}
