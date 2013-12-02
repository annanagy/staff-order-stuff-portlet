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

import com.liferay.support.stafforderstuff.model.Consumption;

import java.util.List;

/**
 * The persistence utility for the consumption service. This utility wraps {@link ConsumptionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see ConsumptionPersistence
 * @see ConsumptionPersistenceImpl
 * @generated
 */
public class ConsumptionUtil {
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
	public static void clearCache(Consumption consumption) {
		getPersistence().clearCache(consumption);
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
	public static List<Consumption> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Consumption> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Consumption> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Consumption update(Consumption consumption)
		throws SystemException {
		return getPersistence().update(consumption);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Consumption update(Consumption consumption,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(consumption, serviceContext);
	}

	/**
	* Returns all the consumptions where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @return the matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByConsumptionId(ConsumptionId);
	}

	/**
	* Returns a range of all the consumptions where ConsumptionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ConsumptionId the consumption ID
	* @param start the lower bound of the range of consumptions
	* @param end the upper bound of the range of consumptions (not inclusive)
	* @return the range of matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		long ConsumptionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByConsumptionId(ConsumptionId, start, end);
	}

	/**
	* Returns an ordered range of all the consumptions where ConsumptionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ConsumptionId the consumption ID
	* @param start the lower bound of the range of consumptions
	* @param end the upper bound of the range of consumptions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		long ConsumptionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConsumptionId(ConsumptionId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption findByConsumptionId_First(
		long ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException {
		return getPersistence()
				   .findByConsumptionId_First(ConsumptionId, orderByComparator);
	}

	/**
	* Returns the first consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumption, or <code>null</code> if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption fetchByConsumptionId_First(
		long ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConsumptionId_First(ConsumptionId, orderByComparator);
	}

	/**
	* Returns the last consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption findByConsumptionId_Last(
		long ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException {
		return getPersistence()
				   .findByConsumptionId_Last(ConsumptionId, orderByComparator);
	}

	/**
	* Returns the last consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumption, or <code>null</code> if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption fetchByConsumptionId_Last(
		long ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConsumptionId_Last(ConsumptionId, orderByComparator);
	}

	/**
	* Removes all the consumptions where ConsumptionId = &#63; from the database.
	*
	* @param ConsumptionId the consumption ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByConsumptionId(long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByConsumptionId(ConsumptionId);
	}

	/**
	* Returns the number of consumptions where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @return the number of matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByConsumptionId(long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByConsumptionId(ConsumptionId);
	}

	/**
	* Caches the consumption in the entity cache if it is enabled.
	*
	* @param consumption the consumption
	*/
	public static void cacheResult(
		com.liferay.support.stafforderstuff.model.Consumption consumption) {
		getPersistence().cacheResult(consumption);
	}

	/**
	* Caches the consumptions in the entity cache if it is enabled.
	*
	* @param consumptions the consumptions
	*/
	public static void cacheResult(
		java.util.List<com.liferay.support.stafforderstuff.model.Consumption> consumptions) {
		getPersistence().cacheResult(consumptions);
	}

	/**
	* Creates a new consumption with the primary key. Does not add the consumption to the database.
	*
	* @param ConsumptionId the primary key for the new consumption
	* @return the new consumption
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption create(
		long ConsumptionId) {
		return getPersistence().create(ConsumptionId);
	}

	/**
	* Removes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption that was removed
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption remove(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException {
		return getPersistence().remove(ConsumptionId);
	}

	public static com.liferay.support.stafforderstuff.model.Consumption updateImpl(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(consumption);
	}

	/**
	* Returns the consumption with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchConsumptionException} if it could not be found.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption findByPrimaryKey(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException {
		return getPersistence().findByPrimaryKey(ConsumptionId);
	}

	/**
	* Returns the consumption with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption, or <code>null</code> if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.stafforderstuff.model.Consumption fetchByPrimaryKey(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ConsumptionId);
	}

	/**
	* Returns all the consumptions.
	*
	* @return the consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the consumptions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of consumptions
	* @param end the upper bound of the range of consumptions (not inclusive)
	* @return the range of consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the consumptions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of consumptions
	* @param end the upper bound of the range of consumptions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the consumptions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of consumptions.
	*
	* @return the number of consumptions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ConsumptionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ConsumptionPersistence)PortletBeanLocatorUtil.locate(com.liferay.support.stafforderstuff.service.ClpSerializer.getServletContextName(),
					ConsumptionPersistence.class.getName());

			ReferenceRegistry.registerReference(ConsumptionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ConsumptionPersistence persistence) {
	}

	private static ConsumptionPersistence _persistence;
}