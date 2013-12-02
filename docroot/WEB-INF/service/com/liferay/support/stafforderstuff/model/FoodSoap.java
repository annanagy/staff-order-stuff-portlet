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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Anna & Ádám
 * @generated
 */
public class FoodSoap implements Serializable {
	public static FoodSoap toSoapModel(Food model) {
		FoodSoap soapModel = new FoodSoap();

		soapModel.setFoodId(model.getFoodId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setName(model.getName());
		soapModel.setPrice(model.getPrice());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUnit(model.getUnit());

		return soapModel;
	}

	public static FoodSoap[] toSoapModels(Food[] models) {
		FoodSoap[] soapModels = new FoodSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FoodSoap[][] toSoapModels(Food[][] models) {
		FoodSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FoodSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FoodSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FoodSoap[] toSoapModels(List<Food> models) {
		List<FoodSoap> soapModels = new ArrayList<FoodSoap>(models.size());

		for (Food model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FoodSoap[soapModels.size()]);
	}

	public FoodSoap() {
	}

	public long getPrimaryKey() {
		return _FoodId;
	}

	public void setPrimaryKey(long pk) {
		setFoodId(pk);
	}

	public long getFoodId() {
		return _FoodId;
	}

	public void setFoodId(long FoodId) {
		_FoodId = FoodId;
	}

	public long getCompanyId() {
		return _CompanyId;
	}

	public void setCompanyId(long CompanyId) {
		_CompanyId = CompanyId;
	}

	public long getGroupId() {
		return _GroupId;
	}

	public void setGroupId(long GroupId) {
		_GroupId = GroupId;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public double getPrice() {
		return _Price;
	}

	public void setPrice(double Price) {
		_Price = Price;
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

	private long _FoodId;
	private long _CompanyId;
	private long _GroupId;
	private String _Name;
	private double _Price;
	private double _Quantity;
	private String _Unit;
}