package com.coderioter.learn.advancedjava.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TrackerFollowUp {
	private int waitDuration = 60;
	private int pingInterval = 5;
	private int i;
	
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	public TrackerFollowUp(int waitDuration, int pingInterval) {
		super();
		this.waitDuration = waitDuration;
		this.pingInterval = pingInterval;
		i=0;
	}

	public ScheduledExecutorService followUp() {
		final Runnable follower = new Runnable() {
			public void run() {
				System.out.println("beep:"+i++);
			}
		};
		final ScheduledFuture<?> followHandle = scheduler.scheduleAtFixedRate(follower, 0, pingInterval, TimeUnit.SECONDS);
		
		scheduler.schedule(new Runnable() {
			public void run() {
				followHandle.cancel(true);
				scheduler.shutdownNow();
			}
		}, waitDuration, TimeUnit.SECONDS);
		return scheduler;
	}
}