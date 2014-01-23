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

package com.liferay.support.stafforderstuff.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.support.stafforderstuff.StaffOrderStuff;
import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.service.base.FoodLocalServiceBaseImpl;

/**
 * The implementation of the food local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.support.stafforderstuff.service.FoodLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Anna & Ádám
 * @see com.liferay.support.stafforderstuff.service.base.FoodLocalServiceBaseImpl
 * @see com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil
 */
public class FoodLocalServiceImpl extends FoodLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil} to access the food local service.
	 */
	
	public void addDummyFood() {

		_log.error("Inside addDummyFood()");
		try {
			Food food = createDummyFood();
			addFood(food);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Food createDummyFood() throws SystemException {

		_log.error("Inside createDummyFood()");
		long foodId = CounterLocalServiceUtil.increment(Food.class.getName());
		Food food = foodPersistence.create(foodId);

		long companyId = 1;
		food.setCompanyId(companyId);

		long groupId = 1;
		food.setGroupId(groupId);

		String name = "DummyFood" + String.valueOf(foodId);
		food.setName(name);
		//double price = (short) foodId; // ;-)

		double price = 100.56d;
		food.setPrice(price);

		String unit = "pcs";
		food.setUnit(unit);

		return food;
	}
	
/*	public void addFood(int foodId, long companyId, long groupId,
			String name, double price, double quantity, String unit) {

			_log.error("Currently doing nothing in addFood(lotsofparams)");
			//Copy pasted the relevant info from service.xml

			//<column name="FoodId" type="long" primary="true"></column>
			//<column name="CompanyId" type="long"></column>
			//<column name="GroupId" type="long"></column>
			//<column name="Name" type="String"></column>
			//<column name="Price" type="double"></column>
			//<column name="Quantity" type="double"></column>
			//<column name="Unit" type="String"></column>

			//User user = userPersistence.findByPrimaryKey(userId);

			//
	}
*/
	private static Log _log = LogFactoryUtil.getLog(FoodLocalServiceImpl.class);
}