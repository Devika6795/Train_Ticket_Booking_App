package com.display_train;

public class DisplayTrain {
	    public int id;
		public String trainName;
		public String trainFrom;
		public String trainTo;
		public String trainDate;
		public String trainTiming;
	public DisplayTrain(int id,String trainName, String trainFrom, String trainTo, String trainTiming) {
			
			this.trainName = trainName;
			this.trainFrom = trainFrom;
			this.trainTo = trainTo;
		    this.trainDate = trainDate;
			this.trainTiming = trainTiming;
		}
	@Override
	public String toString() {
		return "DisplayTrain [id=" + id + ", trainName=" + trainName + ", trainFrom=" + trainFrom + ", trainTo="
				+ trainTo + ", trainDate=" + trainDate + ", trainTiming=" + trainTiming + "]";
	}
	
	

		

	}

