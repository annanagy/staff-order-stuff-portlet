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

package com.liferay.support.stafforderstuff.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FoodLocalService}.
 *
 * @author Anna & Ádám
 * @see FoodLocalService
 * @generated
 */
public class FoodLocalServiceWrapper implements FoodLocalService,
	ServiceWrapper<FoodLocalService> {
	public FoodLocalServiceWrapper(FoodLocalService foodLocalService) {
		_foodLocalService = foodLocalService;
	}

	/**
	* Adds the food to the database. Also notifies the appropriate model listeners.
	*
	* @param food the food
	* @return the food that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food addFood(
		com.liferay.support.stafforderstuff.model.Food food)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.addFood(food);
	}

	/**
	* Creates a new food with the primary key. Does not add the food to the database.
	*
	* @param FoodId the primary key for the new food
	* @return the new food
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food createFood(
		long FoodId) {
		return _foodLocalService.createFood(FoodId);
	}

	/**
	* Deletes the food with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FoodId the primary key of the food
	* @return the food that was removed
	* @throws PortalException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food deleteFood(
		long FoodId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.deleteFood(FoodId);
	}

	/**
	* Deletes the food from the database. Also notifies the appropriate model listeners.
	*
	* @param food the food
	* @return the food that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food deleteFood(
		com.liferay.support.stafforderstuff.model.Food food)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.deleteFood(food);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _foodLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.support.stafforderstuff.model.Food fetchFood(long FoodId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.fetchFood(FoodId);
	}

	/**
	* Returns the food with the primary key.
	*
	* @param FoodId the primary key of the food
	* @return the food
	* @throws PortalException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food getFood(long FoodId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.getFood(FoodId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the foods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foods
	* @param end the upper bound of the range of foods (not inclusive)
	* @return the range of foods
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> getFoods(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.getFoods(start, end);
	}

	/**
	* Returns the number of foods.
	*
	* @return the number of foods
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFoodsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.getFoodsCount();
	}

	/**
	* Updates the food in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param food the food
	* @return the food that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Food updateFood(
		com.liferay.support.stafforderstuff.model.Food food)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.updateFood(food);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _foodLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_foodLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _foodLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void addFood(java.lang.String name, double price,
		java.lang.String unit) {
		_foodLocalService.addFood(name, price, unit);
	}

	@Override
	public void addDummyFood() {
		_foodLocalService.addDummyFood();
	}

	@Override
	public com.liferay.support.stafforderstuff.model.Food createDummyFood()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foodLocalService.createDummyFood();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FoodLocalService getWrappedFoodLocalService() {
		return _foodLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFoodLocalService(FoodLocalService foodLocalService) {
		_foodLocalService = foodLocalService;
	}

	@Override
	public FoodLocalService getWrappedService() {
		return _foodLocalService;
	}

	@Override
	public void setWrappedService(FoodLocalService foodLocalService) {
		_foodLocalService = foodLocalService;
	}

	private FoodLocalService _foodLocalService;
}