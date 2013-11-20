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

import com.liferay.support.stafforderstuff.model.Consumption;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Consumption in entity cache.
 *
 * @author Anna & Ádám
 * @see Consumption
 * @generated
 */
public class ConsumptionCacheModel implements CacheModel<Consumption>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ConsumptionId=");
		sb.append(ConsumptionId);
		sb.append(", UserId=");
		sb.append(UserId);
		sb.append(", FoodId=");
		sb.append(FoodId);
		sb.append(", Date=");
		sb.append(Date);
		sb.append(", Quantity=");
		sb.append(Quantity);
		sb.append(", Unit=");
		sb.append(Unit);
		sb.append(", Status=");
		sb.append(Status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Consumption toEntityModel() {
		ConsumptionImpl consumptionImpl = new ConsumptionImpl();

		consumptionImpl.setConsumptionId(ConsumptionId);
		consumptionImpl.setUserId(UserId);
		consumptionImpl.setFoodId(FoodId);

		if (Date == Long.MIN_VALUE) {
			consumptionImpl.setDate(null);
		}
		else {
			consumptionImpl.setDate(new Date(Date));
		}

		consumptionImpl.setQuantity(Quantity);

		if (Unit == null) {
			consumptionImpl.setUnit(StringPool.BLANK);
		}
		else {
			consumptionImpl.setUnit(Unit);
		}

		consumptionImpl.setStatus(Status);

		consumptionImpl.resetOriginalValues();

		return consumptionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ConsumptionId = objectInput.readInt();
		UserId = objectInput.readInt();
		FoodId = objectInput.readInt();
		Date = objectInput.readLong();
		Quantity = objectInput.readDouble();
		Unit = objectInput.readUTF();
		Status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ConsumptionId);
		objectOutput.writeInt(UserId);
		objectOutput.writeInt(FoodId);
		objectOutput.writeLong(Date);
		objectOutput.writeDouble(Quantity);

		if (Unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Unit);
		}

		objectOutput.writeInt(Status);
	}

	public int ConsumptionId;
	public int UserId;
	public int FoodId;
	public long Date;
	public double Quantity;
	public String Unit;
	public int Status;
}