import java.util.Scanner;

public class AddString {
    public static void add(String a,String b){
    	int length1 = a.length();
    	int length2 = b.length();
    	StringBuffer str=new StringBuffer();
    	String bigstring;
    	String smallstring;
    	int big,small;
    	int total;
    	int carry = 0;
    	if(length1==length2){
    		big=small=length1;
    		bigstring=a;
    	    smallstring=b;
    	}else if(length1>length2){
    		big=length1;
    		small=length2;
    		bigstring=a;
    	    smallstring=b;
    	}else{
    		big=length2;
    		small=length1;
    		bigstring=b;
    	    smallstring=a;
    	}
    	for(int i=small-1;i>=0;i--){
    		total=Integer.parseInt(String.valueOf(smallstring.charAt(i)))+Integer.parseInt(String.valueOf(bigstring.charAt((big-small+i))))+carry;
    		carry=total/10;
    		total=total%10;    		
    	    str.append(total);
    	}
        for(int i=big-small-1;i>=0;i--){
    		int sum= Integer.parseInt(String.valueOf(bigstring.charAt(i)))+carry;
    	    carry=sum/10;
    	    str.append(sum);
        }
    	if(carry>0)
        str.append(carry);
    	System.out.println("==========================================================");
    	System.out.println(str.reverse());
    }
    
	public static void main(String args[]){		
		Scanner sc=new Scanner(System.in);
		while(1==1){
		String a=sc.next();
		String b=sc.next();
        add(a,b);
		}
    }
}