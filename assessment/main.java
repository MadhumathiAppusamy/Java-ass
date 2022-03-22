package assessment;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) 
	{
		ArrayList<Musicplayer> arraylist=new ArrayList<Musicplayer>();
		arraylist.add(new Musicplayer(1,"ennadhan","vijay","abc","def","aaa"));
		arraylist.add(new Musicplayer(2,"sodhanai","karthi","ghi","jkl","bbb"));
		arraylist.add(new Musicplayer(3,"pogumpadhai","karki","mno","pqr","ccc"));
		arraylist.add(new Musicplayer(4,"kaiveesum","vivek","stu","vwx","ddd"));
		Scanner sc=new Scanner(System.in);
		 do{
			 System.out.println("select the option:");
			 System.out.println("1 play a song");
			 System.out.println("2 search a song");
			 System.out.println("3 show all songs");
			 System.out.println("4 operate on song database");
			 
			 int option =sc.nextInt();
			 switch(option)
			 {
			 case 1:{
				 System.out.println("1 play all song");
				 System.out.println("2 play songs randomly");
				 System.out.println("3 play a particular song");
				 int option1= sc.nextInt();
				 switch(option1) 
				 {
				 case 1:
				 {
					 for (Musicplayer musicplayer : arraylist) 
					 {
						 System.out.println(musicplayer);
					 }
					 System.out.println("play all song");
					 break;
				 } 
				 case 2:
				 {
				Random rand=new Random();
				int randomnumber=rand.nextInt(arraylist.size());
				System.out.println(arraylist.get(randomnumber).getSong_title());
				 System.out.println("play songs randomly");
				 }
	  
				 case 3:
				//    ArrayList<Musicplayer> a=new ArrayList<Musicplayer>();
				    System.out.println("enter song  above 3 character");
				    String str=sc.next();
				    str=str.substring(0,3).toLowerCase();
				    int c=0;
				    for (Musicplayer musicplayer : arraylist) {
						if(musicplayer.getSong_title().toLowerCase().substring(0,3).equalsIgnoreCase(str)) {
				//1			a.add(musicplayer);
							System.out.println("playlist");
							System.out.println("Song name:"+musicplayer.getSong_title());
							System.out.println("song location:"+musicplayer.getSong_location());
							System.out.println("song description:"+musicplayer.getDescription());
							c=1;
						}
					}if(c==0) {
					        System.out.println("no song found");
				 }
					break;
				 default:
					        System.out.println("invalid input");
				 }
			 }
			 break;
			 case 2:
				           System.out.println("Enter the song");
				           String str1=sc.next();
				           str1 =str1.substring(0,3).toLowerCase();
				 int d=0;
				 for (Musicplayer musicplayer : arraylist) {
					   if((musicplayer.getSong_title().toLowerCase()).substring(0,3).equalsIgnoreCase(str1))
						
					      System.out.println("search list");
					      System.out.println("song name:"+musicplayer.getSong_title());
					      System.out.println("song location:"+musicplayer.getSong_location());
					      System.out.println("song description:"+musicplayer.getDescription());
					  d=1;
					}
				 if(d==0)
				 {
					 System.out.println("no song found");
						}
				 break;
		 }
		 
			 
			 
		 }while(true);
	}
}
			 