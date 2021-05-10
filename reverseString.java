package Arrays;
import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String ip = s.nextLine();
int s_length = ip.length() - 1;

String s_d = "";
String ans = "";
try {
for(int i = s_length;i>=0;i--) {
s_d = ip.valueOf(ip.charAt(i));
ans = ans + s_d;

}

}catch(Exception e) {
	System.out.println(e);
}
System.out.println(ans);

	}

}
