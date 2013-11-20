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

package com.liferay.support.stafforderstuff.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.support.stafforderstuff.model.Food;

/**
 * The persistence interface for the food service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see FoodPersistenceImpl
 * @see FoodUtil
 * @generated
 */
public interface FoodPersistence extends BasePersistence<Food> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FoodUtil} to access the food persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the foods where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @return the matching foods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the foods where GroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param GroupId the group ID
	* @param start the lower bound of the range of foods
	* @param end the upper bound of the range of foods (not inclusive)
	* @return the range of matching foods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the foods where GroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param GroupId the group ID
	* @param start the lower bound of the range of foods
	* @param end the upper bound of the range of foods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food findByGroupId_First(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException;

	/**
	* Returns the first food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching food, or <code>null</code> if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food fetchByGroupId_First(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food findByGroupId_Last(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException;

	/**
	* Returns the last food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching food, or <code>null</code> if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food fetchByGroupId_Last(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the foods before and after the current food in the ordered set where GroupId = &#63;.
	*
	* @param FoodId the primary key of the current food
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food[] findByGroupId_PrevAndNext(
		int FoodId, long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException;

	/**
	* Removes all the foods where GroupId = &#63; from the database.
	*
	* @param GroupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foods where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @return the number of matching foods
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the food in the entity cache if it is enabled.
	*
	* @param food the food
	*/
	public void cacheResult(com.liferay.support.stafforderstuff.model.Food food);

	/**
	* Caches the foods in the entity cache if it is enabled.
	*
	* @param foods the foods
	*/
	public void cacheResult(
		java.util.List<com.liferay.support.stafforderstuff.model.Food> foods);

	/**
	* Creates a new food with the primary key. Does not add the food to the database.
	*
	* @param FoodId the primary key for the new food
	* @return the new food
	*/
	public com.liferay.support.stafforderstuff.model.Food create(int FoodId);

	/**
	* Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FoodId the primary key of the food
	* @return the food that was removed
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food remove(int FoodId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException;

	public com.liferay.support.stafforderstuff.model.Food updateImpl(
		com.liferay.support.stafforderstuff.model.Food food)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the food with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchFoodException} if it could not be found.
	*
	* @param FoodId the primary key of the food
	* @return the food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food findByPrimaryKey(
		int FoodId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException;

	/**
	* Returns the food with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FoodId the primary key of the food
	* @return the food, or <code>null</code> if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Food fetchByPrimaryKey(
		int FoodId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the foods.
	*
	* @return the foods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the foods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.FoodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foods
	* @param end the upper bound of the range of foods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of foods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the foods from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foods.
	*
	* @return the number of foods
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}