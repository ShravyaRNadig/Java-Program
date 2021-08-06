import java.io.*;
import java.lang.String;
class Maruthi{
	int baleno=5,ignis=7,ciaz=8;
	int baleno_cost=800000,ignis_cost=900000,ciaz_cost=700000;
	int baleno_p=0,ignis_p=0,ciaz_p=0;
	int b_p=0,i_p=0,c_p=0;
	int total_cost=0;
	public static void main(String s[])throws IOException
	{
		boolean f=true;
		Maruthi m=new Maruthi();
		System.out.println("\t\t\n\nWelcome to Maruti Suzuki Nexa \n\n\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(f)
		{
			String ch;
			
			System.out.println("\n\n");
			System.out.println("Enter your choice ::");
			System.out.println("\t1.Update");
			System.out.println("\t2.Sell");
			System.out.println("\t3.Total Sales");
			System.out.println("Enter your choice(*any other to exit) :: ");
			ch=br.readLine();
			if(ch.equals("1"))
				m.update();
			else if(ch.equals("2"))
				m.sell();
			else if(ch.equals("3"))
				m.display();
			else
				f=false;
		}
	}
	void update()throws IOException
	{
			System.out.println("\n Choose\n\t 1=>Baleno \t 2=>Ignis \t 3.Ciaz \n to update the prize.....");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String ch=br.readLine();
			int prize;
			System.out.print("Specify the prize.. ");
			prize=Integer.parseInt(br.readLine());
						if(ch.equals("1"))
							baleno_cost=prize;
							
						else if(ch.equals("2"))
							ignis_cost=prize;
						else if(ch.equals("3"))
							ciaz_cost=prize;
						else
							System.out.print("Invalid choice  ");
			
			System.out.println("Prize after updating is ::");
			System.out.println("Baleno => "+baleno_cost+" lkhs");
			System.out.println("Ignis  => "+ignis_cost+" lkhs");
			System.out.println("Ciaz   => "+ciaz_cost+" lkhs");
			
		}
	 void sell()throws IOException
	 {
			System.out.println(" ");
			System.out.println("\n Choose\n\t 1=>Baleno \t 2=>Ignis \t 3.Ciaz \n to purchase.....");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String ch=br.readLine();
			if(ch.equals("1")){
							if(baleno>0){
								baleno=baleno-1;
								b_p=b_p+1;
								baleno_p=baleno_p+baleno_cost;
								System.out.println("Successfully purchased... ");
							}
			}
			
							
			else if(ch.equals("2")){
								if(ignis>0){
								ignis=ignis-1;
								i_p=i_p+1;
								ignis_p=ignis_p+ignis_cost;
								System.out.println("Successfully purchased... ");
							}
			}
			else if(ch.equals("3")){
								if(ciaz>0){
								ciaz=ciaz-1;
								c_p=c_p+1;
								ciaz_p=ciaz_p+ciaz_cost;
								System.out.println("Successfully purchased... ");
							}
			}
			else
				System.out.print("Invalid choice  ");
		
	}
	 void display(){
			System.out.println(" ");
			System.out.println(" Baleno purchased is "+b_p+ " and  cost is :: "+baleno_p+" lkhs");
			System.out.println(" Ignis purchased is "+i_p+ " and  cost is :: "+ignis_p+" lkhs");
			System.out.println(" Ciaz purchased is "+c_p+ " and  cost is :: "+ciaz_p+" lkhs");
			System.out.println("================== ");
			System.out.println(" Total cost is  "+(ciaz_p+ignis_p+baleno_p)+" lkhs");
			
		}
}