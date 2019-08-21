import java.util.Scanner;
class JavaStarter{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int fact=1;
		System.out.println("value of n is:"+n);
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is"+fact);

		//Fibinoci series
		int a=0,b=1,sum=0;
		System.out.print("Fibinonci series from 1 to 89 is:");
		while(sum<89)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}

		//Odd numbers between 35 ND 86
		System.out.print("Odd numbers between 35 and 86 are:");
		for(int i=36;i<86;i+=1){
			if(i%2!=0){
			System.out.println(i);
		}
		}

		//Table
		System.out.println("Table to its maximum limit");
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter an integer: ");
    	int num = input.nextInt();
    	System.out.println("You entered " + num);		
		int prod;
		for(int i=1;i<=num;i++){
			prod=num*i;
			System.out.println(num+"*"+i+"="+prod);
		}

		//question no.5
		
    	System.out.print("Enter 3 numbers: ");
    	int num1 = input.nextInt();
    	int num2 = input.nextInt();
    	int num3 = input.nextInt();
    	System.out.println("you entered numbers"+num1+" "+num2+" "+num3);
    	Boolean flag=true;
    	int sumofthree=num1+num2+num3;
    	if(num1<40)
    		flag=false;
    	if(num2<40)
    		flag=false;
    	if(num3<40)
    		flag=false;
    	if(sumofthree<125)
    		flag=false;
    	if(flag)
    		System.out.println("PASSING");
     if(!flag)
    		
    		 System.out.println("FAILING");

    		//Decimal to Binary Conversion

    	System.out.println("Enter the deimal number");	
    	int dec=input.nextInt();
		int d;
		String s="";
		while(dec>0)
		{
			d=dec%2;
			s= d+s;
			dec=dec/2;
		}
		System.out.println(s);
		
	}
	
    	}

