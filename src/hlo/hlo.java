package hlo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class hlo {
	public static void main(String[] args) throws IOException {
		while(true) {
			Scanner sc =new Scanner(System.in);
			System.out.println("1-to display files.       "+"2-add,delete,search.         "+"3- exit the program.            ");
			 String pp = sc.next();
			 String path="D:\\hello\\project\\hlo\\";
			 int hc = Integer.parseInt(pp);
			switch(hc) {
			case 1:{
				 File f=new File(path);
				 File filename[]=f.listFiles();
				 for(File ff:filename) {
				 	System.out.println(ff.getName());
				 }
				
			}break;
			case 2:{while(true){
				Scanner sc1 =new Scanner(System.in);
				System.out.println("1 -add.          "+"2-delete.       "+"3-search.   "+"4- to main menu ");
				 String pq = sc1.next();
				 String path1="D:\\hello\\project\\hlo\\";
				 int hq = Integer.parseInt(pq);
				 switch(hq) {
				 case 1:{Scanner sc2=new Scanner(System.in);

				 ArrayList<String> al=new ArrayList<>();
				 while(true) {
				 System.out.println("enter the file name to create");
				 String filename=sc.next();
				 String finalname=path+filename;
				 System.out.println(finalname);
				 //create a file 
				 File f=new File(finalname);
				 boolean b=f.createNewFile();
				 if(b!=true) {
				 	System.out.println("the file not created");
				 }
				 else {
				 	al.add(filename);
				 	System.out.println("file created");
				 }
				 System.out.println("the collection of files is "+ al);
				 break;		 
				 } break;
				}
				case 2:{
					Scanner sc3=new Scanner(System.in);
					 System.out.println("enter the file name to be deleted");
					 String filname=sc.next();
					 String finalfile=path+filname;
					 File file=new File(finalfile);
					 file.delete();
					 System.out.println("file deleted");
				}break;
				case 3:
				{
					File f=new File(path);
					 Scanner sc4=new Scanner(System.in);
					 System.out.println("enter the file name to search");
					 String filsearchname=sc.next();
					 File filename[]=f.listFiles();
					 int flag=0;
					 for(File ff:filename) {
					 	if(ff.getName().equals(filsearchname)) {
					 		flag=1;
					 		break;
					 	}
					 	else {
					 		flag=0;
					 	}
				        }
					 if(flag==1) {
					 	System.out.println("found the file");
					 }
					 else {
					 	System.out.println("file is not found");
					 }
				}break;
				default:{
					
				}break;
				
				
			}break;
		}
        }break;
			case 3:{
				 System.exit(0);
			}
				break;
			
			}
			}
	}

}
