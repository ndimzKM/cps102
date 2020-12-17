import java.util.Scanner;
public class Another{
		public static int readInt(Scanner in, String prompt, String error, int min, int max){
			boolean isBetweenMaxMin = false;
			int integer = 0;
			while(!isBetweenMaxMin){
				System.out.println(prompt);
				integer = in.nextInt();
				if(integer >= min && integer <= max){
					isBetweenMaxMin = true;
					return integer;
				}else{
					throw new IllegalArgumentException(error);
				}
			}

			return integer;
			
		}
	}