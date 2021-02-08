package com.danilopaixao.algorithm.devpleno;

/**
 * Clock Angle Problem Algorithm
 * Find the Angle between hour hand and minute hand at the given time
 * 
        //   12:00
		//   angle hour: 0
		//   angle minute: 0
		
		//   12:15
		//   angle hour: 7.5 graus
		//   angle minute: 90 graus

		//   12:30
		//   angle hour: 15 graus
		//   angle minute: 180 graus
		
		//   12:45
		//   angle hour: 22.5 graus
		//   angle minute: 225 graus

 * @author user
 *
 */
public class AngleOfClockHands {
	
	public static void main(String[] args) {
		getAngle(12, 0);
		getAngle(12, 15);
		getAngle(12, 45);
		getAngle(12, 30);
		getAngle(1, 0);
		getAngle(1, 15);
		getAngle(1, 30);
		getAngle(1, 45);
		getAngle(2, 0);
		getAngle(3, 0);
		getAngle(3, 30);
	}
	
	private static double getAngle(int hour, int minute) {
		System.out.println(hour + ":" + minute);		
		
		double minuteAngle = 0;
		
		if(hour == 12) {
			hour = 0;
		}
		
		double anglePerMinuteMinutePointer = 6;
		minuteAngle = minute * anglePerMinuteMinutePointer;
		
		double anglePerMinuteHourPointer = 0.5;
		//each hour is 30 graus
		double hourAngle = (hour*30)+ anglePerMinuteHourPointer * minute;
		
		System.out.println("hourAngle: "+ hourAngle);
		System.out.println("minuteAngle: "+ minuteAngle);
		
		if(minuteAngle > hourAngle) {
			System.out.println(minuteAngle - hourAngle);
		}else {
			System.out.println(hourAngle - minuteAngle);
		}
		System.out.println("----------------");
		return 0.0;
	}

}
