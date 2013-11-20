/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.support.stafforderstuff.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Anna & Ádám
 * @generated
 */
public class ConsumptionSoap implements Serializable {
	public static ConsumptionSoap toSoapModel(Consumption model) {
		ConsumptionSoap soapModel = new ConsumptionSoap();

		soapModel.setConsumptionId(model.getConsumptionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setFoodId(model.getFoodId());
		soapModel.setDate(model.getDate());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUnit(model.getUnit());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ConsumptionSoap[] toSoapModels(Consumption[] models) {
		ConsumptionSoap[] soapModels = new ConsumptionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConsumptionSoap[][] toSoapModels(Consumption[][] models) {
		ConsumptionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConsumptionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConsumptionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConsumptionSoap[] toSoapModels(List<Consumption> models) {
		List<ConsumptionSoap> soapModels = new ArrayList<ConsumptionSoap>(models.size());

		for (Consumption model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConsumptionSoap[soapModels.size()]);
	}

	public ConsumptionSoap() {
	}

	public int getPrimaryKey() {
		return _ConsumptionId;
	}

	public void setPrimaryKey(int pk) {
		setConsumptionId(pk);
	}

	public int getConsumptionId() {
		return _ConsumptionId;
	}

	public void setConsumptionId(int ConsumptionId) {
		_ConsumptionId = ConsumptionId;
	}

	public int getUserId() {
		return _UserId;
	}

	public void setUserId(int UserId) {
		_UserId = UserId;
	}

	public int getFoodId() {
		return _FoodId;
	}

	public void setFoodId(int FoodId) {
		_FoodId = FoodId;
	}

	public Date getDate() {
		return _Date;
	}

	public void setDate(Date Date) {
		_Date = Date;
	}

	public double getQuantity() {
		return _Quantity;
	}

	public void setQuantity(double Quantity) {
		_Quantity = Quantity;
	}

	public String getUnit() {
		return _Unit;
	}

	public void setUnit(String Unit) {
		_Unit = Unit;
	}

	public int getStatus() {
		return _Status;
	}

	public void setStatus(int Status) {
		_Status = Status;
	}

	private int _ConsumptionId;
	private int _UserId;
	private int _FoodId;
	private Date _Date;
	private double _Quantity;
	private String _Unit;
	private int _Status;
}