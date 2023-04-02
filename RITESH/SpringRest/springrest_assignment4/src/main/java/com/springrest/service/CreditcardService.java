package com.springrest.service;

import org.springframework.stereotype.Service;

@Service
public class CreditcardService {

	public String getValidCard(String cardNo) {
		long six = Long.parseLong(cardNo.substring(0, 6));
		long four = Long.parseLong(cardNo.substring(0, 4));

		if (cardNo.length() == 16) {
			if ((six >= 601100 && six <= 601109) || (six >= 601120 && six <= 601149) || (six == 601174)
					|| (six >= 601177 && six <= 601179) || (six >= 601186 && six <= 601199)
					|| (six >= 644000 && six <= 659999)) {
				return "American Express";
			} else if (four >= 3528 && four <= 3589) {
				return "JCB";
			} else if ((six >= 510000 && six <= 559999) || (six >= 222100 && six <= 272099)) {
				return "MasterCard";
			}
		} else if (cardNo.length() == 15) {
			if (four == 2014 || four == 2149) {
				return "enRoute";
			}
		} else if (cardNo.length() == 19) {
			if (cardNo.charAt(0) == '4') {
				return "Visa";
			}
			else if(four >= 3528 && four <= 3589) {
				return "JCB";
			}
		} else if (cardNo.length() >= 16 && cardNo.length() <= 19) {
			if (four >= 3528 && four <= 3589) {
				return "JCB";
			}
		}

		return "Invalid Card";
	}

}
