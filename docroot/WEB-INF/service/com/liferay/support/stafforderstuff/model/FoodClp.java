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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.support.stafforderstuff.service.ClpSerializer;
import com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna & Ádám
 */
public class FoodClp extends BaseModelImpl<Food> implements Food {
	public FoodClp() {
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
	public long getPrimaryKey() {
		return _FoodId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFoodId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FoodId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		Long FoodId = (Long)attributes.get("FoodId");

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

	@Override
	public long getFoodId() {
		return _FoodId;
	}

	@Override
	public void setFoodId(long FoodId) {
		_FoodId = FoodId;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setFoodId", long.class);

				method.invoke(_foodRemoteModel, FoodId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _CompanyId;
	}

	@Override
	public void setCompanyId(long CompanyId) {
		_CompanyId = CompanyId;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_foodRemoteModel, CompanyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _GroupId;
	}

	@Override
	public void setGroupId(long GroupId) {
		_GroupId = GroupId;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_foodRemoteModel, GroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _Name;
	}

	@Override
	public void setName(String Name) {
		_Name = Name;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_foodRemoteModel, Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPrice() {
		return _Price;
	}

	@Override
	public void setPrice(double Price) {
		_Price = Price;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", double.class);

				method.invoke(_foodRemoteModel, Price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getQuantity() {
		return _Quantity;
	}

	@Override
	public void setQuantity(double Quantity) {
		_Quantity = Quantity;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", double.class);

				method.invoke(_foodRemoteModel, Quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnit() {
		return _Unit;
	}

	@Override
	public void setUnit(String Unit) {
		_Unit = Unit;

		if (_foodRemoteModel != null) {
			try {
				Class<?> clazz = _foodRemoteModel.getClass();

				Method method = clazz.getMethod("setUnit", String.class);

				method.invoke(_foodRemoteModel, Unit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFoodRemoteModel() {
		return _foodRemoteModel;
	}

	public void setFoodRemoteModel(BaseModel<?> foodRemoteModel) {
		_foodRemoteModel = foodRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _foodRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_foodRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FoodLocalServiceUtil.addFood(this);
		}
		else {
			FoodLocalServiceUtil.updateFood(this);
		}
	}

	@Override
	public Food toEscapedModel() {
		return (Food)ProxyUtil.newProxyInstance(Food.class.getClassLoader(),
			new Class[] { Food.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FoodClp clone = new FoodClp();

		clone.setFoodId(getFoodId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setName(getName());
		clone.setPrice(getPrice());
		clone.setQuantity(getQuantity());
		clone.setUnit(getUnit());

		return clone;
	}

	@Override
	public int compareTo(Food food) {
		long primaryKey = food.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FoodClp)) {
			return false;
		}

		FoodClp food = (FoodClp)obj;

		long primaryKey = food.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{FoodId=");
		sb.append(getFoodId());
		sb.append(", CompanyId=");
		sb.append(getCompanyId());
		sb.append(", GroupId=");
		sb.append(getGroupId());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", Price=");
		sb.append(getPrice());
		sb.append(", Quantity=");
		sb.append(getQuantity());
		sb.append(", Unit=");
		sb.append(getUnit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.support.stafforderstuff.model.Food");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FoodId</column-name><column-value><![CDATA[");
		sb.append(getFoodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CompanyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GroupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _FoodId;
	private long _CompanyId;
	private long _GroupId;
	private String _Name;
	private double _Price;
	private double _Quantity;
	private String _Unit;
	private BaseModel<?> _foodRemoteModel;
}