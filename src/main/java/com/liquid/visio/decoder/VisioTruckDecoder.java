package com.liquid.visio.decoder;

import java.util.ArrayList;
import java.util.List;

import com.liquid.visio.responses.VisioTruckResponse;

public class VisioTruckDecoder {

	public static VisioTruckResponse decode(String message) {

		List<String> splitParts = SplitParts(message, 2);

		String decider = splitParts.get(0);
		System.out.println(decider);

		if (decider.contentEquals("1f") || decider.contentEquals("2f") || decider.contentEquals("3f")
				|| decider.contentEquals("4f") || decider.contentEquals("5f") || decider.contentEquals("6f")) {

			Float lat = (convertToDecimal(splitParts.get(2) + splitParts.get(3) + splitParts.get(4) + splitParts.get(5))
					/ 100000) - 90;
			Float lng = (convertToDecimal(splitParts.get(6) + splitParts.get(7) + splitParts.get(8) + splitParts.get(9))
					/ 100000) - 180;

			Float temp = convertToDecimal(splitParts.get(10)) - 100;
			Float volt = convertToDecimal(splitParts.get(11)) * 14;

			VisioTruckResponse visioTruckResponse = new VisioTruckResponse();

			visioTruckResponse.setDeviceTemp(temp);
			visioTruckResponse.setLng(lng);
			visioTruckResponse.setLtd(lat);
			visioTruckResponse.setSysVolt(volt);
			return visioTruckResponse;

		}

		VisioTruckResponse visioTruckResponse = new VisioTruckResponse();
		visioTruckResponse.setFlat("Ignore");
		return visioTruckResponse;

	}

	private static List<String> SplitParts(String string, int partitionSize) {
		List<String> parts = new ArrayList<String>();
		int len = string.length();
		for (int i = 0; i < len; i += partitionSize) {

			parts.add(string.substring(i, Math.min(len, i + partitionSize)));
		}
		return parts;
	}

	private static Float convertToDecimal(String string) {

		Float parseFloat = (float) Long.parseLong(string, 16);

		return parseFloat;
	}

}
