import java.util.Scanner;
public class NumTester{
	public static int promptUsers(Scanner in, String promt, int min, int max){
		System.out.println(promt);
		while(true){
			try{
				String val = in.next();
				int value = Integer.parseInt(val);
				if(min > value || max < value){
					throw new Exception();
				}else{
					return value;
				}
			}catch(Exception e){
				System.out.println("Expected a number between 1 cdkj");
			}
		}
	}
}