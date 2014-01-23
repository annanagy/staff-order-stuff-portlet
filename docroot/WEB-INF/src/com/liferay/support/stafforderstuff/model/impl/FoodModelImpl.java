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

package com.liferay.support.stafforderstuff.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.model.FoodModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Food service. Represents a row in the &quot;StaffOrderStuff_Food&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.support.stafforderstuff.model.FoodModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FoodImpl}.
 * </p>
 *
 * @author Anna & Ádám
 * @see FoodImpl
 * @see com.liferay.support.stafforderstuff.model.Food
 * @see com.liferay.support.stafforderstuff.model.FoodModel
 * @generated
 */
public class FoodModelImpl extends BaseModelImpl<Food> implements FoodModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a food model instance should use the {@link com.liferay.support.stafforderstuff.model.Food} interface instead.
	 */
	public static final String TABLE_NAME = "StaffOrderStuff_Food";
	public static final Object[][] TABLE_COLUMNS = {
			{ "FoodId", Types.BIGINT },
			{ "CompanyId", Types.BIGINT },
			{ "GroupId", Types.BIGINT },
			{ "Name", Types.VARCHAR },
			{ "Price", Types.DOUBLE },
			{ "Unit", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table StaffOrderStuff_Food (FoodId LONG not null primary key,CompanyId LONG,GroupId LONG,Name VARCHAR(75) null,Price DOUBLE,Unit VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table StaffOrderStuff_Food";
	public static final String ORDER_BY_JPQL = " ORDER BY food.FoodId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY StaffOrderStuff_Food.FoodId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.support.stafforderstuff.model.Food"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.support.stafforderstuff.model.Food"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.support.stafforderstuff.model.Food"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long FOODID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.support.stafforderstuff.model.Food"));

	public FoodModelImpl() {
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
	}

	@Override
	public long getCompanyId() {
		return _CompanyId;
	}

	@Override
	public void setCompanyId(long CompanyId) {
		_CompanyId = CompanyId;
	}

	@Override
	public long getGroupId() {
		return _GroupId;
	}

	@Override
	public void setGroupId(long GroupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _GroupId;
		}

		_GroupId = GroupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public String getName() {
		if (_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _Name;
		}
	}

	@Override
	public void setName(String Name) {
		_Name = Name;
	}

	@Override
	public double getPrice() {
		return _Price;
	}

	@Override
	public void setPrice(double Price) {
		_Price = Price;
	}

	@Override
	public String getUnit() {
		if (_Unit == null) {
			return StringPool.BLANK;
		}
		else {
			return _Unit;
		}
	}

	@Override
	public void setUnit(String Unit) {
		_Unit = Unit;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Food.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Food toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Food)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FoodImpl foodImpl = new FoodImpl();

		foodImpl.setFoodId(getFoodId());
		foodImpl.setCompanyId(getCompanyId());
		foodImpl.setGroupId(getGroupId());
		foodImpl.setName(getName());
		foodImpl.setPrice(getPrice());
		foodImpl.setUnit(getUnit());

		foodImpl.resetOriginalValues();

		return foodImpl;
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

		if (!(obj instanceof Food)) {
			return false;
		}

		Food food = (Food)obj;

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
	public void resetOriginalValues() {
		FoodModelImpl foodModelImpl = this;

		foodModelImpl._originalGroupId = foodModelImpl._GroupId;

		foodModelImpl._setOriginalGroupId = false;

		foodModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Food> toCacheModel() {
		FoodCacheModel foodCacheModel = new FoodCacheModel();

		foodCacheModel.FoodId = getFoodId();

		foodCacheModel.CompanyId = getCompanyId();

		foodCacheModel.GroupId = getGroupId();

		foodCacheModel.Name = getName();

		String Name = foodCacheModel.Name;

		if ((Name != null) && (Name.length() == 0)) {
			foodCacheModel.Name = null;
		}

		foodCacheModel.Price = getPrice();

		foodCacheModel.Unit = getUnit();

		String Unit = foodCacheModel.Unit;

		if ((Unit != null) && (Unit.length() == 0)) {
			foodCacheModel.Unit = null;
		}

		return foodCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

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
		sb.append(", Unit=");
		sb.append(getUnit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

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
			"<column><column-name>Unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Food.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Food.class };
	private long _FoodId;
	private long _CompanyId;
	private long _GroupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _Name;
	private double _Price;
	private String _Unit;
	private long _columnBitmask;
	private Food _escapedModel;
}