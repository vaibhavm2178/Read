	
	import java.io.File;
	 import java.util.Scanner;
	 import java.io.IOException;
	 
	import java.io.FileNotFoundException;
	import java.util.regex.*;
	public class a{
	    public static void main(String[] args) {
			
			String x = args[0]; 
			
int count=0 ;
		int count1=0 ;
		 int count2=0;	
		 
		 File file = new File(x);
		
		 
		
		 
	try (Scanner sc = new Scanner(file)){
		   
		 
		
		while(sc.hasNext()){
					  String s = sc.nextLine();
					  
					  System.out.println("The text is:\n"+s);
					   	Pattern p = Pattern.compile("[\\s]");
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			
			count++;
		}double b = count+1;
		
		
		System.out.println("Words: "+(int)b);
		Pattern q = Pattern.compile("[.!?]");
		Matcher n = q.matcher(s);
		
		while(n.find()) {
			count1++;
		}
		double c = count1;
		if(s.endsWith(".")){
		}else{
		c=c+1;}
		System.out.println("Sentences: "+(int)c);
		
		for(int i = 0; i<s.length();i++){
			if(s.charAt(i) ==' '){
			}else{
				count2++;
			}
		}double a = count2;
		System.out.println("Characters: "+(int)a);
		
		if(b!=0&&(c!=0&&a!=0)){
			
		
		double score =(double) ((4.71*(a/b))+(0.5*(b/c)))-21.43;
		double score1 = Math.round(score*100)/100.0;
		System.out.println("The score is: "+score1);
		if(score1<=1){
			System.out.println("This text should be understood by 5-6-year-olds.");
		}else if(score1<=2){
		System.out.println("This text should be understood by 6-7-year-olds.");
		}else if(score1<=3){
		System.out.println("This text should be understood by 7-9-year-olds.");
		}else if(score1<=4){
		System.out.println("This text should be understood by 9-10-year-olds.");
		}else if(score1<=5){
		System.out.println("This text should be understood by 10-11-year-olds.");
		}else if(score1<=6){
		System.out.println("This text should be understood by 11-12-year-olds.");
		}else if(score1<=7){
		System.out.println("This text should be understood by 12-13-year-olds.");
		}else if(score1<=8){
		System.out.println("This text should be understood by 13-14-year-olds.");
		}else if(score1<=9){
		System.out.println("This text should be understood by 14-15-year-olds.");
		}else if(score1<=10){
		System.out.println("This text should be understood by 15-16-year-olds.");
		}else if(score1<=11){
		System.out.println("This text should be understood by 16-17-year-olds.");
		}else if(score1<=12){
		System.out.println("This text should be understood by 17-18-year-olds.");
		}else if(score1<=13){
		System.out.println("This text should be understood by 18-24-year-olds.");
		}else if(score1<=14||score1>14){
		System.out.println("This text should be understood by 24+-year-olds.");
		}
		}
		
				  };
	}catch(FileNotFoundException e){
	        System.out.println(" No File Found: ");
	}
	  }
	}