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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Consumption}.
 * </p>
 *
 * @author Anna & Ádám
 * @see Consumption
 * @generated
 */
public class ConsumptionWrapper implements Consumption,
	ModelWrapper<Consumption> {
	public ConsumptionWrapper(Consumption consumption) {
		_consumption = consumption;
	}

	@Override
	public Class<?> getModelClass() {
		return Consumption.class;
	}

	@Override
	public String getModelClassName() {
		return Consumption.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ConsumptionId", getConsumptionId());
		attributes.put("UserId", getUserId());
		attributes.put("FoodId", getFoodId());
		attributes.put("Date", getDate());
		attributes.put("Quantity", getQuantity());
		attributes.put("Unit", getUnit());
		attributes.put("Status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ConsumptionId = (Integer)attributes.get("ConsumptionId");

		if (ConsumptionId != null) {
			setConsumptionId(ConsumptionId);
		}

		Integer UserId = (Integer)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		Integer FoodId = (Integer)attributes.get("FoodId");

		if (FoodId != null) {
			setFoodId(FoodId);
		}

		Date Date = (Date)attributes.get("Date");

		if (Date != null) {
			setDate(Date);
		}

		Double Quantity = (Double)attributes.get("Quantity");

		if (Quantity != null) {
			setQuantity(Quantity);
		}

		String Unit = (String)attributes.get("Unit");

		if (Unit != null) {
			setUnit(Unit);
		}

		Integer Status = (Integer)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}
	}

	/**
	* Returns the primary key of this consumption.
	*
	* @return the primary key of this consumption
	*/
	@Override
	public int getPrimaryKey() {
		return _consumption.getPrimaryKey();
	}

	/**
	* Sets the primary key of this consumption.
	*
	* @param primaryKey the primary key of this consumption
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_consumption.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the consumption ID of this consumption.
	*
	* @return the consumption ID of this consumption
	*/
	@Override
	public int getConsumptionId() {
		return _consumption.getConsumptionId();
	}

	/**
	* Sets the consumption ID of this consumption.
	*
	* @param ConsumptionId the consumption ID of this consumption
	*/
	@Override
	public void setConsumptionId(int ConsumptionId) {
		_consumption.setConsumptionId(ConsumptionId);
	}

	/**
	* Returns the user ID of this consumption.
	*
	* @return the user ID of this consumption
	*/
	@Override
	public int getUserId() {
		return _consumption.getUserId();
	}

	/**
	* Sets the user ID of this consumption.
	*
	* @param UserId the user ID of this consumption
	*/
	@Override
	public void setUserId(int UserId) {
		_consumption.setUserId(UserId);
	}

	/**
	* Returns the food ID of this consumption.
	*
	* @return the food ID of this consumption
	*/
	@Override
	public int getFoodId() {
		return _consumption.getFoodId();
	}

	/**
	* Sets the food ID of this consumption.
	*
	* @param FoodId the food ID of this consumption
	*/
	@Override
	public void setFoodId(int FoodId) {
		_consumption.setFoodId(FoodId);
	}

	/**
	* Returns the date of this consumption.
	*
	* @return the date of this consumption
	*/
	@Override
	public java.util.Date getDate() {
		return _consumption.getDate();
	}

	/**
	* Sets the date of this consumption.
	*
	* @param Date the date of this consumption
	*/
	@Override
	public void setDate(java.util.Date Date) {
		_consumption.setDate(Date);
	}

	/**
	* Returns the quantity of this consumption.
	*
	* @return the quantity of this consumption
	*/
	@Override
	public double getQuantity() {
		return _consumption.getQuantity();
	}

	/**
	* Sets the quantity of this consumption.
	*
	* @param Quantity the quantity of this consumption
	*/
	@Override
	public void setQuantity(double Quantity) {
		_consumption.setQuantity(Quantity);
	}

	/**
	* Returns the unit of this consumption.
	*
	* @return the unit of this consumption
	*/
	@Override
	public java.lang.String getUnit() {
		return _consumption.getUnit();
	}

	/**
	* Sets the unit of this consumption.
	*
	* @param Unit the unit of this consumption
	*/
	@Override
	public void setUnit(java.lang.String Unit) {
		_consumption.setUnit(Unit);
	}

	/**
	* Returns the status of this consumption.
	*
	* @return the status of this consumption
	*/
	@Override
	public int getStatus() {
		return _consumption.getStatus();
	}

	/**
	* Sets the status of this consumption.
	*
	* @param Status the status of this consumption
	*/
	@Override
	public void setStatus(int Status) {
		_consumption.setStatus(Status);
	}

	@Override
	public boolean isNew() {
		return _consumption.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_consumption.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _consumption.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_consumption.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _consumption.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _consumption.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_consumption.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _consumption.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_consumption.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_consumption.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_consumption.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConsumptionWrapper((Consumption)_consumption.clone());
	}

	@Override
	public int compareTo(Consumption consumption) {
		return _consumption.compareTo(consumption);
	}

	@Override
	public int hashCode() {
		return _consumption.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Consumption> toCacheModel() {
		return _consumption.toCacheModel();
	}

	@Override
	public Consumption toEscapedModel() {
		return new ConsumptionWrapper(_consumption.toEscapedModel());
	}

	@Override
	public Consumption toUnescapedModel() {
		return new ConsumptionWrapper(_consumption.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _consumption.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _consumption.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_consumption.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConsumptionWrapper)) {
			return false;
		}

		ConsumptionWrapper consumptionWrapper = (ConsumptionWrapper)obj;

		if (Validator.equals(_consumption, consumptionWrapper._consumption)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Consumption getWrappedConsumption() {
		return _consumption;
	}

	@Override
	public Consumption getWrappedModel() {
		return _consumption;
	}

	@Override
	public void resetOriginalValues() {
		_consumption.resetOriginalValues();
	}

	private Consumption _consumption;
}