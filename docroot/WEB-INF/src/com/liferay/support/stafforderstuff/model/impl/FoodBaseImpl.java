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

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil;

/**
 * The extended model base implementation for the Food service. Represents a row in the &quot;StaffOrderStuff_Food&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FoodImpl}.
 * </p>
 *
 * @author Anna & Ádám
 * @see FoodImpl
 * @see com.liferay.support.stafforderstuff.model.Food
 * @generated
 */
public abstract class FoodBaseImpl extends FoodModelImpl implements Food {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a food model instance should use the {@link Food} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FoodLocalServiceUtil.addFood(this);
		}
		else {
			FoodLocalServiceUtil.updateFood(this);
		}
	}
}