package com.liquid.visio;

import com.liquid.visio.decoder.VisioTruckDecoder;
import com.liquid.visio.responses.VisioTruckResponse;

public class VisioTruck {

	public Float deviceTemp;

	public Float ltd;

	public Float lng;

	public Float sysVolt;

	public String flat;

	public VisioTruck(String message) throws Exception {

		VisioTruckResponse decode = VisioTruckDecoder.decode(message);

		this.deviceTemp = decode.getDeviceTemp();
		this.ltd = decode.getLtd();
		this.lng = decode.getLng();
		this.sysVolt = decode.getSysVolt();
		this.flat = decode.getFlat();

	}

}
