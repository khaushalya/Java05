import java.util.*; 
class Example {
	public static double convert(double y){
		y*=1000;
		int x =(int)y;
		int tem = (int)x%10;
		if(tem>4){x+=10;}
		x/=10;
		y=(double)x/100.00;
		return y;
		}
	public static double leasinAmount(double lease,double rate,double year){
		double cal_up=lease*((rate/100)/12);
		double cal2 = (1+((rate/100)/12));
		double cal3 = 1-(Math.pow(cal2,-(12*year)));
		double leaseAmount = cal_up/cal3;
		return leaseAmount;
		}
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		boolean x=true;
		L1:do{System.out.println("                                                        _  _______  ________ ________");
		System.out.println("                                                       | \\/       \\|        |        \\");
		System.out.println("                                                        \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
		System.out.println("                                                       |  | $$   \\$| $$__      | $$");
		System.out.println("                                                       | $| $$     | $$  \\     | $$");
		System.out.println("                                                       | $| $$   __| $$$$$     | $$");
		System.out.println("                                                       | $| $$__/  | $$____    | $$");
		System.out.println("                                                       | $$\\$$    $| $$    \\   | $$");
		System.out.println("                                                        \\$$ \\$$$$$$ \\$$$$$$$    \\$$");
		System.out.println(" _______           __   __   _____              _         _____    _    _   _                  _______    ____    _____");
		System.out.println("|__   __|   /\\     \\ \\ / /  / ____|     /\\     | |       / ____|  | |  | | | |          /\\    |__   __|  / __ \\  |     \\");
		System.out.println("   | |     /  \\     \\ V /  | |         /  \\    | |      | |       | |  | | | |         /  \\      | |    | |  | | | |_)  |");
		System.out.println("   | |    / /\\ \\     > <   | |        / /\\ \\   | |      | |       | |  | | | |        / /\\ \\     | |    | |  | | |  _  /");
		System.out.println("   | |   / ____ \\   / . \\  | |____   / ____ \\  | |___   | |____   | |__| | | |____   / ____ \\    | |    | |__| | | | \\ \\");
		System.out.println("   |_|	/_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|   \\____/  |______| /_/    \\_\\   |_|     \\____/  |_|  \\_\\");
		System.out.println("===============================================================================================================================");
		System.out.println("\n\n                       [01] Withholding Tax");
		System.out.println("                       [02] Payable Tax");
		System.out.println("                       [03] Income Tax");
		System.out.println("                       [04] Social Security Contribution Levy (SSCL) Tax Tax");
		System.out.println("                       [05] Leasing payment");
		System.out.println("                       [06] Exit\n");
		System.out.print("Enter an option to continue -> ");
		int choice = input.nextInt();
		//----------------------------------------Withholding Tax----------------------------------------------------------------
		
		
		if(choice==1){
			System.out.println("+------------------------------------------------------------------------------------+");
			System.out.println("|                              WITHHOLDING TAX                                       |");
			System.out.println("+------------------------------------------------------------------------------------+");
			System.out.println("\n\n                       [01] Rent Tax");
			System.out.println("                       [02] Bank Interest Tax");
			System.out.println("                       [03] Dividend Tax");
			System.out.println("                       [04] Exit\n");
			System.out.print("Enter an option to continue -> ");
			int choice1 = input.nextInt();
			//----------------------------------------Rent Tax-----------------------------------------------------
			if(choice1==1){
				L2:do{
					System.out.println("\n+------------------------------------------------------------------------------------+");
					System.out.println("|                              RENT TAX                                              |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("Enter your rent          : ");
				double rent = input.nextDouble();
				if(rent<0){
					System.out.println("\n        Invalid input\n\n");
					System.out.print("Do you want to enter the correct value agin (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L2;}
					if(cho=='n'||cho=='n'){continue L1;}
					
					}
				if(rent>100000){
					rent*=.1;
					System.out.println("\nYou have to pay rent tax : "+rent);
					}
				else{
					System.out.println("\nYou don\'t have to pay Rent Tax...");
					}
				System.out.print("Do you want to calculate another rent tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L2;}
					if(cho=='n'||cho=='n'){continue L1;}
				}while(x);
			}
			//----------------------------------------Bank Interest Tax-----------------------------------------------------
			if(choice1==2){
				L3:do{
					System.out.println("\n+------------------------------------------------------------------------------------+");
					System.out.println("|                           BANK INTEREST TAX                                        |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("\nEnter your bank interest per year    : ");
						double interest = input.nextDouble();
					if(interest<0){
					System.out.println("\n        Invalid input\n\n");
					System.out.print("Do you want to enter the correct value agin (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L3;}
					if(cho=='n'||cho=='n'){continue L1;}
					
					}
						double y =interest*(5.0/100) ;	
					System.out.print("\nYou have pay bank interest tax per year : "+y);
					System.out.print("\n\nDo you want to calculate another bank interest tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L3;}
					if(cho=='n'||cho=='n'){continue L1;}
					}while(x);
				}
			//----------------------------------------Dividend Tax-----------------------------------------------------
			if(choice1==3){
				L4:do{
					System.out.println("\n+------------------------------------------------------------------------------------+");
					System.out.println("|                                DIVIDEND TAX                                        |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("\nEnter your total divident per year    : ");
						double divident = input.nextDouble();
					if(divident<0){
						System.out.println("\n        Invalid input\n\n");
					System.out.print("Do you want to enter the correct value agin (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L4;}
					if(cho=='n'||cho=='n'){continue L1;}
						}
					if(divident>100000){
						divident-=100000;
						divident*=.14;
						int temp=(int)divident*100;
						divident =(double)temp/100.00;
						System.out.println("\nYou have pay divident tax per year : "+divident);
						}
					else{
						System.out .println("You dont have to pay Dividend Tax ");
					
						}
					System.out.print("\n\nDo you want to calculate another dividend tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L4;}
					if(cho=='n'||cho=='n'){continue L1;}
					}while(x);
				}
			//----------------------------------------Exit-----------------------------------------------------
			if(choice1==4){
				return;
				}
			
			}//---------end(WITHHOLDING TAX)
			
			
			
			
		//----------------------------------------Payable Tax----------------------------------------------------------------
		if(choice==2){
			L5:do{
				System.out.println("\n+------------------------------------------------------------------------------------+");
				System.out.println("|                                 PAYABLE TAX                                        |");
				System.out.println("+------------------------------------------------------------------------------------+");
				System.out.print("\nEnter your employee payment per month : ");
				double payment = input.nextInt();
				if(payment<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate another payable tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L5;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
				double tax=0;
				if(payment>=100000){
					if(payment>=100000 && payment<=141667){tax=(payment-100000)*0.06;}
					else if(payment>141667 && payment<=183333){tax=2500+(payment-141667)*0.12; }
					else if(payment>183333 && payment<=225000){tax=7500+(payment-183333)*0.18; }
					else if(payment>225000 && payment<=266667){tax=15000+(payment-225000)*0.24; }
					else if(payment>266667 && payment<=308333){tax=25000+(payment-266667)*0.30; }
					else if(payment>308333){tax=37500+(payment-308333)*0.36; }
					System.out.print("\nYou have to payble tax per month : "+tax);}
				else{
					System.out.print("\nPayable Tax is charged above Rs.100 000 and no tax is charged up to Rs.100 000");
					}
					System.out.print("\n\nDo you want to calculate another payable tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L5;}
					if(cho=='n'||cho=='n'){continue L1;}
				}while(x);
			
			}
			//----------------------------------------Income Tax----------------------------------------------------------------
		if(choice==3){
			L6:do{
				System.out.println("\n+------------------------------------------------------------------------------------+");
				System.out.println("|                                  INCOME TAX                                        |");
				System.out.println("+------------------------------------------------------------------------------------+");
				System.out.print("\nEnter your employee payment per month : ");
				double payment = input.nextInt();
				if(payment<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate another payable tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L6;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
				double tax=0;
				if(payment>=100000){
					if(payment>=100000 && payment<=141667){tax=(payment-100000)*0.06;}
					else if(payment>141667 && payment<=183333){tax=2500+(payment-141667)*0.12; }
					else if(payment>183333 && payment<=225000){tax=7500+(payment-183333)*0.18; }
					else if(payment>225000 && payment<=266667){tax=15000+(payment-225000)*0.24; }
					else if(payment>266667 && payment<=308333){tax=25000+(payment-266667)*0.30; }
					else if(payment>308333){tax=37500+(payment-308333)*0.36; }
					System.out.print("\nYou have to payble tax per month : "+tax);}
				else{
					System.out.print("\nPayable Tax is charged above Rs.100 000 and no tax is charged up to Rs.100 000");
					System.out.print("\n\nDo you want to calculate another payable tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L6;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
				}while(x);
			
			}
			//----------------------------------------Social Security Contribution Levy (SSCL) Tax ----------------------------------------------------------------
		if(choice==4){
			L7:do{
				System.out.println("\n+------------------------------------------------------------------------------------+");
				System.out.println("|                 SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                       |");
				System.out.println("+------------------------------------------------------------------------------------+");
				System.out.print("\nEnter valuve of Goods or service : ");
				double value = input.nextDouble();
				if(value<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate another SSCL tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L7;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
				double tax1=value*0.025;
				double vat = (value*1.025)*0.15;
				System.out.print("\nYou have to pay SSCL tax : "+convert(vat+tax1));
				System.out.print("\n\nDo you want to calculate another SSCL tax (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L7;}
					if(cho=='n'||cho=='n'){continue L1;}
				}while(x);
			}
			//----------------------------------------Leasing payment----------------------------------------------------------------
		if(choice==5){
			System.out.println("+------------------------------------------------------------------------------------+");
			System.out.println("|                              LEASING PAYMENT                                       |");
			System.out.println("+------------------------------------------------------------------------------------+");
			System.out.println("\n\n                       [01] Calculate monthly installment");
			System.out.println("                       [02] Search leasing catagory");
			System.out.println("                       [03] Find leasing amount");
			System.out.println("                       [04] Exit\n");
			System.out.print("Enter an option to continue -> ");
			int choice3 = input.nextInt();
			//----------------------------------------Calculate monthly installment----------------------------------------------------------------
			if(choice3==1){
				L8:do{
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.println("|                        CALCULATE LEASING PAYMENT                                   |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("\nEnter lease amount         : ");
					double lease =input.nextDouble();
					if(lease<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate another leasing payment (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L8;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
					System.out.print("\nEnter annual interest rate : ");
					double rate =input.nextDouble();
					while(rate<=0){
						System.out.print("\nInvalid annual interest rate...Enter the correct valur again..");
						System.out.print("\nEnter annual interest rate       : ");
						rate =input.nextDouble();}
					System.out.print("\nEnter number of year       : ");
					double year =input.nextDouble();
					
					while(year>5){
						System.out.print("\nInvalid number of year...Enter the correct valur again..");
						System.out.print("\nEnter number of year       : ");
						year =input.nextDouble();}
			
					System.out.println("\nYour monthly installment : "+convert(leasinAmount(lease,rate,year)));
					System.out.print("\n\nDo you want to calculate another installment (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L8;}
					if(cho=='n'||cho=='n'){continue L1;}
					}while(x);
				}
			//----------------------------------------Search leasing catagory----------------------------------------------------------------
			if(choice3==2){
				L9:do{
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.println("|                        SEARCH LEASNG CATAGORY                                      |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("\nEnter lease amount         : ");
					double lease =input.nextDouble();
					if(lease<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate leasing catagoty (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L9;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
					System.out.print("\nEnter annual interest rate : ");
					double rate =input.nextDouble();
					while(rate<=0){
						System.out.print("\nInvalid annual interest rate...Enter the correct valur again..");
						System.out.print("\nEnter annual interest rate       : ");
						rate =input.nextDouble();}
					System.out.println("\nYour monthly installment for 3 year leasing plan : "+convert(leasinAmount(lease,rate,3)));
					System.out.println("\nYour monthly installment for 4 year leasing plan : "+convert(leasinAmount(lease,rate,4)));
					System.out.println("\nYour monthly installment for 5 year leasing plan : "+convert(leasinAmount(lease,rate,5)));
					System.out.print("\n\nDo you want to search another leasing catagory (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L9;}
					if(cho=='n'||cho=='n'){continue L1;}
					}while(x);
				}
			//----------------------------------------Find leasing amount----------------------------------------------------------------
			if(choice3==3){
				L10:do{
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.println("|                        	FIND LEASING AMOUNT                                      |");
					System.out.println("+------------------------------------------------------------------------------------+");
					System.out.print("\nEnter the monthly leasing payment amount you can afford : ");
					double monthly_installment =input.nextDouble();
					if(monthly_installment<0){
					System.out.print("\n        Invalid input\n\n");
					System.out.print("\n\nDo you want to calculate another leasing amount (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L10;}
					if(cho=='n'||cho=='n'){continue L1;}
					}
					System.out.print("\nEnter number of year                                    : ");
					double num_of_year =input.nextDouble();
					while(num_of_year>5){
						System.out.print("\nInvalid number of year...Enter the correct valur again..");
						System.out.print("\nEnter number of year       : ");
						num_of_year =input.nextDouble();}
					System.out.print("\nEnter annual interest rate                              : ");
					double rate =input.nextDouble();
					while(rate<=0){
						System.out.print("\nInvalid annual interest rate...Enter the correct valur again..");
						System.out.print("\nEnter annual interest rate       : ");
						rate =input.nextDouble();}
					rate/=100;
					double num_months = num_of_year*12;
					double a =Math.pow((1+(rate/12)),(12* num_of_year*-1));
					double loan_amount= (monthly_installment*(1-a))/(rate/12);
					System.out.println("\nYou can get a lease amount                              : "+convert(loan_amount));
					System.out.print("\n\nDo you want to calculate another leasing amount (Y/N) : ");
					char cho = input.next().charAt(0);
					if(cho=='y'||cho=='Y'){continue L10;}
					if(cho=='n'||cho=='n'){continue L1;}
					}while(x);
				}
			//----------------------------------------Exit----------------------------------------------------------------
			if(choice3==4){continue L1;}
			}
		//----------------------------------------Exit ----------------------------------------------------------------
		if(choice==6){return;}
		}while(x);
	}
}
