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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.support.stafforderstuff.model.Food;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Food in entity cache.
 *
 * @author Anna & Ádám
 * @see Food
 * @generated
 */
public class FoodCacheModel implements CacheModel<Food>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{FoodId=");
		sb.append(FoodId);
		sb.append(", CompanyId=");
		sb.append(CompanyId);
		sb.append(", GroupId=");
		sb.append(GroupId);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Price=");
		sb.append(Price);
		sb.append(", Unit=");
		sb.append(Unit);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Food toEntityModel() {
		FoodImpl foodImpl = new FoodImpl();

		foodImpl.setFoodId(FoodId);
		foodImpl.setCompanyId(CompanyId);
		foodImpl.setGroupId(GroupId);

		if (Name == null) {
			foodImpl.setName(StringPool.BLANK);
		}
		else {
			foodImpl.setName(Name);
		}

		foodImpl.setPrice(Price);

		if (Unit == null) {
			foodImpl.setUnit(StringPool.BLANK);
		}
		else {
			foodImpl.setUnit(Unit);
		}

		foodImpl.resetOriginalValues();

		return foodImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FoodId = objectInput.readLong();
		CompanyId = objectInput.readLong();
		GroupId = objectInput.readLong();
		Name = objectInput.readUTF();
		Price = objectInput.readDouble();
		Unit = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(FoodId);
		objectOutput.writeLong(CompanyId);
		objectOutput.writeLong(GroupId);

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		objectOutput.writeDouble(Price);

		if (Unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Unit);
		}
	}

	public long FoodId;
	public long CompanyId;
	public long GroupId;
	public String Name;
	public double Price;
	public String Unit;
}