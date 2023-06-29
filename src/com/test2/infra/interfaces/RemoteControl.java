package com.test2.infra.interfaces;

public interface RemoteControl {
	
	
	public static final int max_volum = 10;
	public static final int min_volum = 0;
	
	public void turnon();
	public void turnoff();
	public int setvolume(int volum);

	public void setmute(boolean mute);		

	public void changeBattery();
	

}
