import java.sql.*;
import java.util.Scanner;

class Connect
{
	Scanner sc=new Scanner(System.in);
	String url;
	String unm;
	String pwd;
	Connection con;
	Connect()
	{
		try
		{
			//load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create connection
			 url="jdbc:mysql://localhost:3306/bca";
			 unm="root";
			 pwd="";
			 con=DriverManager.getConnection(url,unm,pwd);

			if(con.isClosed())
			{
				System.out.println("Connection not created");
			}
			else
			{
				System.out.println("Connection is created...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Create_tb extends Connect
{
	Create_tb()
	{
		try
		{
			String q="create table stud(sid int(20) primary key auto_increment, stud_name varchar(100) not null, stud_stream varchar(100) not null)";

			//create statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);

			System.out.println("table created in Data-Base...");
			con.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}

class Insert extends Connect
{
	Insert()
	{
		try
		{
			System.out.println("Enter Student Name:");
			String snm=sc.nextLine();

			System.out.println("Enter Student Stream:");
			String stream=sc.nextLine();

			String q="Insert into stud (stud_name,stud_stream) values('"+snm+"','"+stream+"')";

			//get the PreparedStatemnet Object

			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.executeUpdate();

			if(con.isClosed())
			{
				System.out.println("Your Data is not inserted...");
			}
			else
			{
				System.out.println("Your Data is inserted...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Display extends Connect
{
	Display()
	{
		try
		{
			//create Statement
			Statement stmt=con.createStatement();
			String q="Select * from stud";
			ResultSet rs=stmt.executeQuery(q);
			System.out.println("\t Student-ID \t Student-Name \t Student Stream");
			System.out.println("\t========================================================\n");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("\t----------------------------------------------------------------------------\n");
			}
			con.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Search extends Connect
{
	Search()
	{
		try 
		{
				Statement stmt=con.createStatement(); 
                System.out.println("Enter Search Record");
                int s_r=sc.nextInt(); 
                String q="Select * from stud where sid='"+s_r+"'";
              
                ResultSet rs=stmt.executeQuery(q);  

                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
               
                con.close();
                
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Update extends Connect
{
	Update()
	{
		try 
        {
			    Statement stmt=con.createStatement(); 
                System.out.println("Enter Update Record");
                int s_r=sc.nextInt(); 
            
			    String q="Select * from stud where sid='"+s_r+"'";
              
                ResultSet rs=stmt.executeQuery(q);  

                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
                String u_query="update stud set stud_name = 'Cartoon',stud_stream='BCA' WHERE sid = '"+s_r+"'";
                int upd_row=stmt.executeUpdate(u_query);

                System.out.println("Row Affected..."+upd_row);
                con.close();           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}
}

class Delete extends Connect
{
	Delete()
	{
		try 
        {         
                Statement stmt=con.createStatement(); 

                System.out.println("Enter Delete Record");
                int s_r=sc.nextInt(); 
                String q="Select * from stud";
                ResultSet rs=stmt.executeQuery(q);  
                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
                String d_query="Delete from stud where sid='"+s_r+"'";
                int r_affect=stmt.executeUpdate(d_query);
                System.out.println("Row Affected..."+r_affect);
                con.close();           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
	}
}

class Case extends Connect
{
	Case()
	{
		System.out.println("---------------------------");
		System.out.println("Enter Your Choice:");
		int no=sc.nextInt();
		switch(no)
		{
			case 1: 
				new Connect();
				break;
			case 2: 
				new Create_tb();
				break;
			case 3: 
				new Insert();
				break;
			case 4: 
				new Display();
				break;
			case 5:
				new Search();
				break;
			case 6:
				new Update();
				break;
			case 7:
				new Delete();
				break;
			case 8:
				System.out.println("Exiting...."); 
				System.exit(0);
				break;
			default:
				System.out.println("Enter Above Given Number...");
		}
	}
}

class Menu
{
	Menu()
	{
		System.out.println("---------------------------");
		System.out.println("1. Connection");
		System.out.println("2. Create Table");
		System.out.println("3. Insert Data");
		System.out.println("4. Display");
		System.out.println("5. Search");		
		System.out.println("6. Update");
		System.out.println("7. Delete");		
		System.out.println("8. Exit");
		System.out.println("---------------------------");
	}
}

class Driven
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Menu m=new Menu();
			Case c=new Case();
		}
	}
}