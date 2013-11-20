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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.support.stafforderstuff.model.Food;

import java.util.List;

/**
 * The persistence utility for the food service. This utility wraps {@link FoodPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see FoodPersistence
 * @see FoodPersistenceImpl
 * @generated
 */
public class FoodUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Food food) {
		getPersistence().clearCache(food);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Food> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Food> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Food> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Food update(Food food) throws SystemException {
		return getPersistence().update(food);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Food update(Food food, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(food, serviceContext);
	}

	/**
	* Returns all the foods where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @return the matching foods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(GroupId);
	}

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
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(GroupId, start, end);
	}

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
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findByGroupId(
		long GroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(GroupId, start, end, orderByComparator);
	}

	/**
	* Returns the first food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food findByGroupId_First(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException {
		return getPersistence().findByGroupId_First(GroupId, orderByComparator);
	}

	/**
	* Returns the first food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching food, or <code>null</code> if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food fetchByGroupId_First(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(GroupId, orderByComparator);
	}

	/**
	* Returns the last food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food findByGroupId_Last(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException {
		return getPersistence().findByGroupId_Last(GroupId, orderByComparator);
	}

	/**
	* Returns the last food in the ordered set where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching food, or <code>null</code> if a matching food could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food fetchByGroupId_Last(
		long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(GroupId, orderByComparator);
	}

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
	public static com.liferay.support.stafforderstuff.model.Food[] findByGroupId_PrevAndNext(
		int FoodId, long GroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(FoodId, GroupId, orderByComparator);
	}

	/**
	* Removes all the foods where GroupId = &#63; from the database.
	*
	* @param GroupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(GroupId);
	}

	/**
	* Returns the number of foods where GroupId = &#63;.
	*
	* @param GroupId the group ID
	* @return the number of matching foods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long GroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(GroupId);
	}

	/**
	* Caches the food in the entity cache if it is enabled.
	*
	* @param food the food
	*/
	public static void cacheResult(
		com.liferay.support.stafforderstuff.model.Food food) {
		getPersistence().cacheResult(food);
	}

	/**
	* Caches the foods in the entity cache if it is enabled.
	*
	* @param foods the foods
	*/
	public static void cacheResult(
		java.util.List<com.liferay.support.stafforderstuff.model.Food> foods) {
		getPersistence().cacheResult(foods);
	}

	/**
	* Creates a new food with the primary key. Does not add the food to the database.
	*
	* @param FoodId the primary key for the new food
	* @return the new food
	*/
	public static com.liferay.support.stafforderstuff.model.Food create(
		int FoodId) {
		return getPersistence().create(FoodId);
	}

	/**
	* Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FoodId the primary key of the food
	* @return the food that was removed
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food remove(
		int FoodId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException {
		return getPersistence().remove(FoodId);
	}

	public static com.liferay.support.stafforderstuff.model.Food updateImpl(
		com.liferay.support.stafforderstuff.model.Food food)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(food);
	}

	/**
	* Returns the food with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchFoodException} if it could not be found.
	*
	* @param FoodId the primary key of the food
	* @return the food
	* @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food findByPrimaryKey(
		int FoodId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchFoodException {
		return getPersistence().findByPrimaryKey(FoodId);
	}

	/**
	* Returns the food with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FoodId the primary key of the food
	* @return the food, or <code>null</code> if a food with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Food fetchByPrimaryKey(
		int FoodId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(FoodId);
	}

	/**
	* Returns all the foods.
	*
	* @return the foods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.support.stafforderstuff.model.Food> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the foods from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of foods.
	*
	* @return the number of foods
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FoodPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FoodPersistence)PortletBeanLocatorUtil.locate(com.liferay.support.stafforderstuff.service.ClpSerializer.getServletContextName(),
					FoodPersistence.class.getName());

			ReferenceRegistry.registerReference(FoodUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FoodPersistence persistence) {
	}

	private static FoodPersistence _persistence;
}