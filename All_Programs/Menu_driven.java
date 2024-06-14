import java.util.*;
import java.io.*;

class File_Name
{
	File_Name()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Name:"+f.getName());
		System.out.println("--------------------");
	}
}
class File_Path
{
	File_Path()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Path:"+f.getAbsolutePath());
		System.out.println("--------------------");
	}
}
class File_CanRead
{
	File_CanRead()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Can Read:"+f.canRead());
		System.out.println("--------------------");
	}
}
class File_CanWrite
{
	File_CanWrite()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Can Write:"+f.canWrite());
		System.out.println("--------------------");
	}
}
class File_Write
{
	File_Write()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Can Write:"+f.canWrite());
		System.out.println("--------------------");
	}
}
class File_Read
{
	File_Read()
	{
		File f= new File("Class-A.txt");
		System.out.println("--------------------");
		System.out.println("File Can Read:"+f.canRead());
		System.out.println("--------------------");
	}
}
class File_Rename
{
	File_Rename()
	{
		File f= new File("Class-A.txt");
		File f1= new File("Sem-1.txt");
		System.out.println("--------------------");
		System.out.println("File Rename:"+f.renameTo(f1));
		System.out.println("--------------------");
	}
}
class File_Delete
{
	File_Delete()
	{
		File f= new File("Class-A.txt");
		File f1= new File("Sem-1.txt");
		System.out.println("--------------------");
		System.out.println("File Delete:"+f.delete());
		System.out.println("--------------------");
	}
}

class Perform
{
	Scanner sc=new Scanner(System.in);
	int choice;
	Perform()
	{
		System.out.println("Enter Above Number:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				new File_Name();
				break;
			case 2:
				new File_Path();
				break;
			case 3:
				new File_CanRead();
				break;
			case 4:
				new File_CanWrite();
				break;
			case 5:
				new File_Write();
				break;
			case 6:
				new File_Read();
				break;
			case 7:
				new File_Rename();
				break;
			case 8:
				new File_Delete();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 5.");	
		}
	}
}
class Menu
{
	Menu()
	{
		System.out.println("------File-Menu------");
		System.out.println("1. File Name");
		System.out.println("2. File Path");
		System.out.println("3. File Can Read");
		System.out.println("4. File Can Write");
		System.out.println("5. File Write");
		System.out.println("6. File Read");
		System.out.println("7. File Rename");
		System.out.println("8. File Delete");
		System.out.println("9. Exit");
	}
}
class Menu_driven
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Menu m=new Menu();
			Perform p=new Perform();	
		}
	}
}