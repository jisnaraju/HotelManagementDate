package mainpackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import CustomerPackage.Customer;
import RegisterPackage.Registeration;
import bookingpackage.Booking;
public class Main {
	public static void main(String[] args) throws IOException {
		Registeration reg=new Registeration(); 
		Customer cu=new Customer();
		Booking bu= new Booking();
		
		 	String c,e;
		    int r=0,rNo,start,end;
            int date,regNo=0,bookNo=0,k=0,exit=1;
		 	int choice;
		 
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("Menu");
		System.out.println("Enter your choice\n1.Registeration\n2.Booking\n3.Check Status\n4.Email\n5.All Bookings\n6.All customers\n7.Exit");
		choice=Integer.parseInt(br.readLine());

		switch(choice) {
		case 1:
			//do {
				reg.register();
				reg.display();
				//System.out.println("Do you want to continue registration (y/n)?");
				//e=br.readLine();
			//}while(e.equals("y"));
			break;
		case 2:
			do {
		    reg.Book();
		    reg.bookingdisplay();
            System.out.println("Do you want to proceed?(y/n)?");
		    c = br.readLine();
		    }while(c.equals("n"));
			System.out.println("Thank you for booking. Your room number is"+(reg.roomno-1));
			break;
			
		case 3:
		{int flag=0;
			System.out.println("Enter your room number");
			r=Integer.parseInt(br.readLine());
			for(int i=0;i<25;i++)
			{
				if(bu.roomarray[i]==r)
				{
					System.out.println("Room is already Booked");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Room is not Booked");
			break;
		}
		case 4:
		{
			System.out.println("Enter the Register No");
			rNo=Integer.parseInt(br.readLine());
			for(int i=0;i<25;i++)
			{
				if(reg.reg[i]==rNo)
				{
			System.out.println("Enter the New Email ID");
			reg.email1[i]=br.readLine();
			System.out.println("New email : "+reg.email1[i]);
			}}
			break;
			
		}
		case 5:
		{
			System.out.println("Enter the start date");
			start=Integer.parseInt(br.readLine());
			System.out.println("Enter the end date");
			end=Integer.parseInt(br.readLine());
			System.out.println("ID   Room");
			for(int i=0;i<20;i++)
			{
				if((bu.datearray[i]>=start)&&(bu.datearray[i]<=end))
				{
					System.out.println(reg.reg[i]+" "+bu.roomarray[i]);
					
				}
			}
			break;
		}	
		case 6:
		{
			for(int i=0;(i<20)&&(reg.name[i]!=null);i++)
			{
				System.out.println(reg.name[i]+"  "+reg.reg[i]+"  "+bu.datearray[i]+"  "+bu.roomarray[i]);
			}
			
		}
		case 7:
		{
			
			exit=0;
			break;
		}
		}
	}while(exit==1);
}
}
		
	

	
