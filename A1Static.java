import java.io.IOException;

public class A1Static {
	/**
	 *
	 * @param y is the nth term 
	 * @return the method returns the nth number 
	 * @throws IOException used to declare exceptions that occur during the execution program
	 */
	public static int recursiveFib(int y) throws IOException{
		
		//Check if number is negative number 
		
		if(y<0) throw new IOException("Negative number error");
		if(y==0)
			return 0;
		 if (y==1)
			 return 1;
		 
		 
		 return recursiveFib(y-1) + recursiveFib(y-2);
	}
	
	public static int iterativeFib(int y) throws IOException {
		
		//check if number is negative 
		
		if(y<0)throw new IOException("Negative number error");
		int f1=0, f2=1, result=0;
		for(int i=0; i<=y; i++) {
			if(i<=1)
				result =1;
			else {
				result = f1 + f2;
				f1=f2;
			}
		}
		return result;
	}
	public static int recursiveFact(int y)throws IOException {
		
		//check if number is negative 
		if(y<0) throw new IOException ("Negative number error");
		if(y>0) return y* recursiveFact(y-1);
		else 
			return 1;
	}
	public static int iterativeFact(int y)throws IOException {
		
		// check if number is negative 
		
		if(y<0)throw new IOException ("Negative number error");
		int fac=1;
		for(int i=1; i<=y; i++) {
			fac*=i;
		}
		return fac;
	}
}
		
