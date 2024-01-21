/**
 * 
 */
package com.coderioter.learn.advancedjava.scheduledexecutorservice;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author shake
 *
 */
public class SchdulerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrackerFollowUp trackerFollowUp = new TrackerFollowUp(10, 2);
		ScheduledExecutorService service = trackerFollowUp.followUp();
		try {
			service.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("waiting");
	}

}
