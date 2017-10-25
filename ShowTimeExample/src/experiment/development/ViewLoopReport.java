package experiment.development;

public class ViewLoopReport {
	void viewReport(int loopNumber, int summary) {
		System.out.println("sum[" + loopNumber + "] = " + summary);
	}
	
	void viewReportLong(int loopNumber, long summary2) {
		System.out.println("sum[" + loopNumber + "] = " + summary2);
	}
	
	void viewFinishedReportLong(long timeStamp) {
		System.out.println("Passed time " + timeStamp);
	}
	
	void viewReportSeconds(double secondsDouble) {
		System.out.println("Seconds = " + secondsDouble/1000.0);
	}
}
