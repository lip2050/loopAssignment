package skipNumberInLoop;

public class SkipNumberInLoop {
	
public static void main(String[] args) {
		
		for(int j=1; j<=20; j++){
			
			if(j%5==0)
			{
				continue;
				
			}
			System.out.println("Print Number  :  "+ j);
		}
	}

}
