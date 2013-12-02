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
import com.liferay.support.stafforderstuff.service.ConsumptionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna & Ádám
 */
public class ConsumptionClp extends BaseModelImpl<Consumption>
	implements Consumption {
	public ConsumptionClp() {
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
	public long getPrimaryKey() {
		return _ConsumptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConsumptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ConsumptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		Long ConsumptionId = (Long)attributes.get("ConsumptionId");

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

	@Override
	public long getConsumptionId() {
		return _ConsumptionId;
	}

	@Override
	public void setConsumptionId(long ConsumptionId) {
		_ConsumptionId = ConsumptionId;

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setConsumptionId", long.class);

				method.invoke(_consumptionRemoteModel, ConsumptionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUserId() {
		return _UserId;
	}

	@Override
	public void setUserId(int UserId) {
		_UserId = UserId;

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", int.class);

				method.invoke(_consumptionRemoteModel, UserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFoodId() {
		return _FoodId;
	}

	@Override
	public void setFoodId(int FoodId) {
		_FoodId = FoodId;

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setFoodId", int.class);

				method.invoke(_consumptionRemoteModel, FoodId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDate() {
		return _Date;
	}

	@Override
	public void setDate(Date Date) {
		_Date = Date;

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_consumptionRemoteModel, Date);
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

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", double.class);

				method.invoke(_consumptionRemoteModel, Quantity);
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

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setUnit", String.class);

				method.invoke(_consumptionRemoteModel, Unit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(int Status) {
		_Status = Status;

		if (_consumptionRemoteModel != null) {
			try {
				Class<?> clazz = _consumptionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_consumptionRemoteModel, Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConsumptionRemoteModel() {
		return _consumptionRemoteModel;
	}

	public void setConsumptionRemoteModel(BaseModel<?> consumptionRemoteModel) {
		_consumptionRemoteModel = consumptionRemoteModel;
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

		Class<?> remoteModelClass = _consumptionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_consumptionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConsumptionLocalServiceUtil.addConsumption(this);
		}
		else {
			ConsumptionLocalServiceUtil.updateConsumption(this);
		}
	}

	@Override
	public Consumption toEscapedModel() {
		return (Consumption)ProxyUtil.newProxyInstance(Consumption.class.getClassLoader(),
			new Class[] { Consumption.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConsumptionClp clone = new ConsumptionClp();

		clone.setConsumptionId(getConsumptionId());
		clone.setUserId(getUserId());
		clone.setFoodId(getFoodId());
		clone.setDate(getDate());
		clone.setQuantity(getQuantity());
		clone.setUnit(getUnit());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(Consumption consumption) {
		long primaryKey = consumption.getPrimaryKey();

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

		if (!(obj instanceof ConsumptionClp)) {
			return false;
		}

		ConsumptionClp consumption = (ConsumptionClp)obj;

		long primaryKey = consumption.getPrimaryKey();

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

		sb.append("{ConsumptionId=");
		sb.append(getConsumptionId());
		sb.append(", UserId=");
		sb.append(getUserId());
		sb.append(", FoodId=");
		sb.append(getFoodId());
		sb.append(", Date=");
		sb.append(getDate());
		sb.append(", Quantity=");
		sb.append(getQuantity());
		sb.append(", Unit=");
		sb.append(getUnit());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.support.stafforderstuff.model.Consumption");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ConsumptionId</column-name><column-value><![CDATA[");
		sb.append(getConsumptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UserId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoodId</column-name><column-value><![CDATA[");
		sb.append(getFoodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ConsumptionId;
	private int _UserId;
	private int _FoodId;
	private Date _Date;
	private double _Quantity;
	private String _Unit;
	private int _Status;
	private BaseModel<?> _consumptionRemoteModel;
}