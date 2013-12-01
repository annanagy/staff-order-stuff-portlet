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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Food}.
 * </p>
 *
 * @author Anna & Ádám
 * @see Food
 * @generated
 */
public class FoodWrapper implements Food, ModelWrapper<Food> {
	public FoodWrapper(Food food) {
		_food = food;
	}

	@Override
	public Class<?> getModelClass() {
		return Food.class;
	}

	@Override
	public String getModelClassName() {
		return Food.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FoodId", getFoodId());
		attributes.put("CompanyId", getCompanyId());
		attributes.put("GroupId", getGroupId());
		attributes.put("Name", getName());
		attributes.put("Price", getPrice());
		attributes.put("Quantity", getQuantity());
		attributes.put("Unit", getUnit());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FoodId = (Integer)attributes.get("FoodId");

		if (FoodId != null) {
			setFoodId(FoodId);
		}

		Long CompanyId = (Long)attributes.get("CompanyId");

		if (CompanyId != null) {
			setCompanyId(CompanyId);
		}

		Long GroupId = (Long)attributes.get("GroupId");

		if (GroupId != null) {
			setGroupId(GroupId);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		Double Price = (Double)attributes.get("Price");

		if (Price != null) {
			setPrice(Price);
		}

		Double Quantity = (Double)attributes.get("Quantity");

		if (Quantity != null) {
			setQuantity(Quantity);
		}

		String Unit = (String)attributes.get("Unit");

		if (Unit != null) {
			setUnit(Unit);
		}
	}

	/**
	* Returns the primary key of this food.
	*
	* @return the primary key of this food
	*/
	@Override
	public int getPrimaryKey() {
		return _food.getPrimaryKey();
	}

	/**
	* Sets the primary key of this food.
	*
	* @param primaryKey the primary key of this food
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_food.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the food ID of this food.
	*
	* @return the food ID of this food
	*/
	@Override
	public int getFoodId() {
		return _food.getFoodId();
	}

	/**
	* Sets the food ID of this food.
	*
	* @param FoodId the food ID of this food
	*/
	@Override
	public void setFoodId(int FoodId) {
		_food.setFoodId(FoodId);
	}

	/**
	* Returns the company ID of this food.
	*
	* @return the company ID of this food
	*/
	@Override
	public long getCompanyId() {
		return _food.getCompanyId();
	}

	/**
	* Sets the company ID of this food.
	*
	* @param CompanyId the company ID of this food
	*/
	@Override
	public void setCompanyId(long CompanyId) {
		_food.setCompanyId(CompanyId);
	}

	/**
	* Returns the group ID of this food.
	*
	* @return the group ID of this food
	*/
	@Override
	public long getGroupId() {
		return _food.getGroupId();
	}

	/**
	* Sets the group ID of this food.
	*
	* @param GroupId the group ID of this food
	*/
	@Override
	public void setGroupId(long GroupId) {
		_food.setGroupId(GroupId);
	}

	/**
	* Returns the name of this food.
	*
	* @return the name of this food
	*/
	@Override
	public java.lang.String getName() {
		return _food.getName();
	}

	/**
	* Sets the name of this food.
	*
	* @param Name the name of this food
	*/
	@Override
	public void setName(java.lang.String Name) {
		_food.setName(Name);
	}

	/**
	* Returns the price of this food.
	*
	* @return the price of this food
	*/
	@Override
	public double getPrice() {
		return _food.getPrice();
	}

	/**
	* Sets the price of this food.
	*
	* @param Price the price of this food
	*/
	@Override
	public void setPrice(double Price) {
		_food.setPrice(Price);
	}

	/**
	* Returns the quantity of this food.
	*
	* @return the quantity of this food
	*/
	@Override
	public double getQuantity() {
		return _food.getQuantity();
	}

	/**
	* Sets the quantity of this food.
	*
	* @param Quantity the quantity of this food
	*/
	@Override
	public void setQuantity(double Quantity) {
		_food.setQuantity(Quantity);
	}

	/**
	* Returns the unit of this food.
	*
	* @return the unit of this food
	*/
	@Override
	public java.lang.String getUnit() {
		return _food.getUnit();
	}

	/**
	* Sets the unit of this food.
	*
	* @param Unit the unit of this food
	*/
	@Override
	public void setUnit(java.lang.String Unit) {
		_food.setUnit(Unit);
	}

	@Override
	public boolean isNew() {
		return _food.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_food.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _food.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_food.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _food.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _food.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_food.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _food.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_food.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_food.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_food.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FoodWrapper((Food)_food.clone());
	}

	@Override
	public int compareTo(com.liferay.support.stafforderstuff.model.Food food) {
		return _food.compareTo(food);
	}

	@Override
	public int hashCode() {
		return _food.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.support.stafforderstuff.model.Food> toCacheModel() {
		return _food.toCacheModel();
	}

	@Override
	public com.liferay.support.stafforderstuff.model.Food toEscapedModel() {
		return new FoodWrapper(_food.toEscapedModel());
	}

	@Override
	public com.liferay.support.stafforderstuff.model.Food toUnescapedModel() {
		return new FoodWrapper(_food.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _food.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _food.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_food.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FoodWrapper)) {
			return false;
		}

		FoodWrapper foodWrapper = (FoodWrapper)obj;

		if (Validator.equals(_food, foodWrapper._food)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Food getWrappedFood() {
		return _food;
	}

	@Override
	public Food getWrappedModel() {
		return _food;
	}

	@Override
	public void resetOriginalValues() {
		_food.resetOriginalValues();
	}

	private Food _food;
}