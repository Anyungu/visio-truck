package com.liquid.visio.responses;

public class VisioTruckResponse {

	private Float deviceTemp;

	private Float ltd;

	private Float lng;

	private Float sysVolt;

	private String flat;

	public Float getDeviceTemp() {
		return deviceTemp;
	}

	public void setDeviceTemp(Float deviceTemp) {
		this.deviceTemp = deviceTemp;
	}

	public Float getLtd() {
		return ltd;
	}

	public void setLtd(Float ltd) {
		this.ltd = ltd;
	}

	public Float getLng() {
		return lng;
	}

	public void setLng(Float lng) {
		this.lng = lng;
	}

	public Float getSysVolt() {
		return sysVolt;
	}

	public void setSysVolt(Float sysVolt) {
		this.sysVolt = sysVolt;
	}

	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

}
