package experiment.development;

public class ShowTime {

	public static void main(String[] args) {
		
		long firstTime = System.currentTimeMillis();
		System.out.println(firstTime);
		
		int sum = 0;
		
		long sum2 = 1;
		
		ViewLoopReport vlr = new ViewLoopReport();
		
		for (int i = 1; i < 50; i++) {
			sum = sum + i;
			System.out.println("sum[" + i+ "]= " + sum);
			vlr.viewReport(i, sum);
			sum2 = sum2 * i;
			System.out.println("sum2[" + i + "]= " + sum2);
			vlr.viewReportLong(i, sum2);
		}
		
		System.out.println("sum = " + sum);
		System.out.println("sum2 = " + sum2);
		
		System.out.println(System.currentTimeMillis());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println(endTime - firstTime);
		vlr.viewFinishedReportLong(endTime - firstTime);
		
		double seconds = (double)(endTime - firstTime);
		System.out.println(seconds / 1000.);
		vlr.viewReportSeconds(seconds);
	}

}
