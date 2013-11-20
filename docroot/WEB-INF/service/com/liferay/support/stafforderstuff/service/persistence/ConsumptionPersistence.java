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

import com.liferay.support.stafforderstuff.model.Consumption;

/**
 * The persistence interface for the consumption service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see ConsumptionPersistenceImpl
 * @see ConsumptionUtil
 * @generated
 */
public interface ConsumptionPersistence extends BasePersistence<Consumption> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConsumptionUtil} to access the consumption persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the consumptions where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @return the matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		int ConsumptionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findByConsumptionId(
		int ConsumptionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption findByConsumptionId_First(
		int ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException;

	/**
	* Returns the first consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumption, or <code>null</code> if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption fetchByConsumptionId_First(
		int ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption findByConsumptionId_Last(
		int ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException;

	/**
	* Returns the last consumption in the ordered set where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumption, or <code>null</code> if a matching consumption could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption fetchByConsumptionId_Last(
		int ConsumptionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumptions where ConsumptionId = &#63; from the database.
	*
	* @param ConsumptionId the consumption ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByConsumptionId(int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumptions where ConsumptionId = &#63;.
	*
	* @param ConsumptionId the consumption ID
	* @return the number of matching consumptions
	* @throws SystemException if a system exception occurred
	*/
	public int countByConsumptionId(int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the consumption in the entity cache if it is enabled.
	*
	* @param consumption the consumption
	*/
	public void cacheResult(
		com.liferay.support.stafforderstuff.model.Consumption consumption);

	/**
	* Caches the consumptions in the entity cache if it is enabled.
	*
	* @param consumptions the consumptions
	*/
	public void cacheResult(
		java.util.List<com.liferay.support.stafforderstuff.model.Consumption> consumptions);

	/**
	* Creates a new consumption with the primary key. Does not add the consumption to the database.
	*
	* @param ConsumptionId the primary key for the new consumption
	* @return the new consumption
	*/
	public com.liferay.support.stafforderstuff.model.Consumption create(
		int ConsumptionId);

	/**
	* Removes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption that was removed
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption remove(
		int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException;

	public com.liferay.support.stafforderstuff.model.Consumption updateImpl(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumption with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchConsumptionException} if it could not be found.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption
	* @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption findByPrimaryKey(
		int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.support.stafforderstuff.NoSuchConsumptionException;

	/**
	* Returns the consumption with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption, or <code>null</code> if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.support.stafforderstuff.model.Consumption fetchByPrimaryKey(
		int ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumptions.
	*
	* @return the consumptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumptions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumptions.
	*
	* @return the number of consumptions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}