//bean class for ProjectionBean class

package com.main;

public class Summary 
{
	private String batch;
	private double sum;
	private double min;
	private double max;
	private double avg;
	private long count;
	@Override
	public String toString() {
		return "Summary [batch=" + batch + ", sum=" + sum + ", min=" + min + ", max=" + max + ", avg=" + avg
				+ ", count=" + count + "]";
	}
	
	public Summary() 
	{
		super();
		
	}
	
	
	public Summary(String batch, double sum, double min, double max, double avg, long count) {
		super();
		this.batch = batch;
		this.sum = sum;
		this.min = min;
		this.max = max;
		this.avg = avg;
		this.count = count;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getMin() {
		return min; 
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	
	

}
