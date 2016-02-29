/**
 * @author peng.zhang@datayes.com
 *
 * @Copyright: 2015 www.datayes.com Inc. All rights reserved.
 *
 */
package com.test.service;

import java.util.List;

public class AccountData<T> {
	private double AvailableCash;
	private String clientId;
	private List<T> Positions;

	public double getAvailableCash () {
		return AvailableCash;
	}

	public void setAvailableCash (double availableCash) {
		AvailableCash = availableCash;
	}

	public String getClientId () {
		return clientId;
	}

	public void setClientId (String clientId) {
		this.clientId = clientId;
	}

	public List<T> getPositions () {
		return Positions;
	}

	public void setPositions (List<T> positions) {
		Positions = positions;
	}

}
