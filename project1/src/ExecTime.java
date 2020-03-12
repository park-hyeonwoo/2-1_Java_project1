public class ExecTime {
		public static void main(String[] args) {
		int a=3;
		int result;
		long startTime, endTime, execTime1,execTime2;

		startTime=System.nanoTime();

		result=a*a;

		endTime=System.nanoTime();
		execTime1=endTime-startTime;

		startTime=System.nanoTime();
		
		result=(int)Math.pow(a,2);
		
		endTime=System.nanoTime();
		execTime2=endTime-startTime;

		System.out.println("Execution Time of a*a = " +execTime1);
		System.out.println("Execution Time of a^2 = " +execTime2);
		}
}