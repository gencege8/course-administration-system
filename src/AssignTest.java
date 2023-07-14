import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.*;



public class AssignTest {
	
	enum MenuItems{
		item1("(1) Add a new course"), item2("(2) Add a new assignment/Labwork/Project"), item3("(3) Submit assignment/Labwork/Project"), item4("(4) Grade assignment/Labwork/Project"), item5("(5) Display grades"), item6("(6) Display sorted grades"), item7("(7) Schedule courses"), item8("(8) Lecturer/Student registration"), item9("(9) Course registration"), item10("(10) Display schedule"), item11("(11) Exit");
		
		private String items;
		
		MenuItems(String a){
			items=a;
		}
		String getItems() {
			return items;
		}
	}
	public static void main(String[] args) {
		Scanner myScanner= new Scanner(System.in);
		Course[] courseArray= new Course[10];
		Assignment[] assignmentArray= new Assignment[10];
		Submission[] submissionArray= new Submission[10];
		ArrayList<Integer> gradeArray= new ArrayList<>();
		ArrayList<Integer> gradeArray1= new ArrayList<>();
		ArrayList<Integer> gradeArray2= new ArrayList<>();
		int i=0;
		int k=0;
		int x=0;
		int switchInt;
		do
		{
			
			for(MenuItems a : MenuItems.values()) {
				System.out.println(a.getItems());
			}
			System.out.printf("%s\n", "Please enter a number");
			switchInt=myScanner.nextInt();
			myScanner.nextLine();
			switch(switchInt) {
			
				case 1:
					if(i==9)
					{
						System.out.printf("Array size reached\n");
					}
					else
					{
						courseArray[i]=new Course();
						i++;
					}	
					break;
				case 2:
					if(k==9)
					{
						System.out.printf("Array size reached\n");
					}
					else
					{
						
						assignmentArray[k]=new Assignment();
						k++;
					
					}	
					break;
				
				case 3:
					if(x==9)
					{
						System.out.printf("Array size reached\n");
					}
					else
					{
						String assnId;
						String name;
						int b=0;
						int enable=0;
						System.out.printf("%s\n","Enter course name");
						name=myScanner.nextLine();
						System.out.printf("%s\n","Enter assignment id");
						assnId=myScanner.nextLine();
						do {
				
								if (assnId.equals(assignmentArray[b].assignmentId)==true)
								{
									if(name.equals(assignmentArray[b].courseName)==true)
									{	
									 enable=1;
									}
								}
								b++;
						}
						while(assignmentArray[b]!=null);
						if (enable==1)
						{
							
							submissionArray[x]=new Submission();
							submissionArray[x].setCourseName(name);
							submissionArray[x].setAssignmentId(assnId);
							x++;
						}
						else
						{
							System.out.println("no such assignment");
						}
						
					}
					break;
					
				case 4:
					String name3;
					String assnId2;
					int grd;
					int dec;
					int dec1;
					int dec2;
					int j=0;
					int c=0;
					int dfrk=0;
					int mfrk=0;
					int yfrk=0;
					System.out.printf("%s\n","Enter course name");
					name3=myScanner.nextLine();
					System.out.printf("%s\n","Enter assignment id");
					assnId2=myScanner.nextLine();
					do
					{
						
						if(assnId2.equals(assignmentArray[j].assignmentId) == true)
						{
							if(name3.equals(assignmentArray[j].courseName) == true)
							{	
								do
								{
							
									if(submissionArray[c].assignmentId.equals(assnId2) == true)
									{
										if(name3.equals(submissionArray[c].courseName)== true)
										{	
											System.out.println("Enter grade for student id" + submissionArray[c].studentId);
											grd=myScanner.nextInt();
											myScanner.nextLine();
											mfrk=(assignmentArray[j].getMonth()-submissionArray[c].getMonth());
											dfrk=(assignmentArray[j].getDay()-submissionArray[c].getDay());
											yfrk=(assignmentArray[j].getYear()-submissionArray[c].getYear());
											dec=dfrk*10;
											dec1=dfrk*15;
											dec2=dfrk*20;
											for(int f=0 ; f<10 ; f++)
											{
												String test="A" + f;
												String test1="L" + f;
												String test2="P" + f;
												if(submissionArray[c].assignmentId.equals(test)==true)
												{
													if(dfrk >= 10 && yfrk!=0 && mfrk!=0)
													{
														grd=0;
													}
													else
													{
														grd=grd+dec;
													}	
													submissionArray[c].setGrade(grd);
													gradeArray.add(submissionArray[c].grade);
													
												}
												else if(submissionArray[c].assignmentId.equals(test1)==true)
												{
													if(dfrk >= 7 && yfrk!=0 && mfrk!=0)
													{
														grd=0;
													}
													else
													{
														grd=grd+dec1;
													}	
													submissionArray[c].setGrade(grd);
													gradeArray1.add(submissionArray[c].grade);
													
												}
												else if(submissionArray[c].assignmentId.equals(test2)==true)
												{
													if(dfrk >= 5 && yfrk!=0 && mfrk!=0)
													{
														grd=0;
													}
													else
													{
														grd=grd+dec2;
													}	
													submissionArray[c].setGrade(grd);
													gradeArray2.add(submissionArray[c].grade);
													
												}
											}
										}	
						    	 
									}
						    	c++;
						
								}
								while(submissionArray[c]!=null);
							}		
						}
						j++;
							
					}
					while(assignmentArray[j]!=null);
					break;
				
				case 5:
					int f=0;
					String name4;
					String assnId3;
					System.out.printf("%s\n","Enter course name");
					name4=myScanner.nextLine();
					System.out.printf("%s\n","Enter assignment id");
					assnId3=myScanner.nextLine();
					do
					{
					
				     if(submissionArray[f].assignmentId.equals(assnId3)== true)
				     {
				    	 if(name4.equals(submissionArray[f].courseName) == true)
				    	 { 
				    		 System.out.println("Student Name:" + submissionArray[f].studentName + " Student Id:" + submissionArray[f].studentId + " Course Name:" + submissionArray[f].courseName + " Grade:" + submissionArray[f].grade);
				    	 }
				     }
				     f++;
				
					}
					while(submissionArray[f]!=null);
					break;
				
				case 6:
					
					int z=0;
					String name5;
					String assnId4;
					System.out.printf("%s\n","Enter course name");
					name5=myScanner.nextLine();
					System.out.printf("%s\n","Enter assignment id");
					assnId4=myScanner.nextLine();
					do
					{
					
				     if(submissionArray[z].assignmentId.equals(assnId4)== true)
				     {
				    	 if(name5.equals(submissionArray[z].courseName) == true)
				    	 {
				    		 for(int u=0 ; u<10 ; u++)
								{
									String test="A" + u;
									String test1="L" + u;
									String test2="P" + u;
									if(assnId4.equals(test)==true)
									{
										gradeArray.sort(Comparator.reverseOrder());
										for (int n = 0 ; n < gradeArray.size()-1 ; n++) 
										{ 		      
											System.out.print(gradeArray.get(n)+ ";" +gradeArray.get(gradeArray.size())); 		
										}
									}
									else if(assnId4.equals(test1)==true)
									{
										gradeArray1.sort(Comparator.reverseOrder());
										for (int n = 0 ; n < gradeArray1.size() ; n++) 
										{ 		      
											System.out.print(gradeArray1.get(n)+ ";" +gradeArray1.get(gradeArray1.size())); 		
										}
									}
									else if(assnId4.equals(test2)==true)
									{
										gradeArray2.sort(Comparator.reverseOrder());
										for (int n = 0 ; n < gradeArray2.size() ; n++) 
										{ 		      
											System.out.print(gradeArray2.get(n)+ ";" +gradeArray2.get(gradeArray2.size()));	
										}
									}	
				    	 }
				     }
				   
				
					}
				     z++;
					}  
					while(submissionArray[z]!=null);
					break;
					
				case 7:
					
					
					
					
			}	
		
	}
		while(switchInt!=11);
		
	}
}


