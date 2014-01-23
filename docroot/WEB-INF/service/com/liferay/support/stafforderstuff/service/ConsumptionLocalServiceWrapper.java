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
 * Provides a wrapper for {@link ConsumptionLocalService}.
 *
 * @author Anna & Ádám
 * @see ConsumptionLocalService
 * @generated
 */
public class ConsumptionLocalServiceWrapper implements ConsumptionLocalService,
	ServiceWrapper<ConsumptionLocalService> {
	public ConsumptionLocalServiceWrapper(
		ConsumptionLocalService consumptionLocalService) {
		_consumptionLocalService = consumptionLocalService;
	}

	/**
	* Adds the consumption to the database. Also notifies the appropriate model listeners.
	*
	* @param consumption the consumption
	* @return the consumption that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption addConsumption(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.addConsumption(consumption);
	}

	/**
	* Creates a new consumption with the primary key. Does not add the consumption to the database.
	*
	* @param ConsumptionId the primary key for the new consumption
	* @return the new consumption
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption createConsumption(
		long ConsumptionId) {
		return _consumptionLocalService.createConsumption(ConsumptionId);
	}

	/**
	* Deletes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption that was removed
	* @throws PortalException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption deleteConsumption(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.deleteConsumption(ConsumptionId);
	}

	/**
	* Deletes the consumption from the database. Also notifies the appropriate model listeners.
	*
	* @param consumption the consumption
	* @return the consumption that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption deleteConsumption(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.deleteConsumption(consumption);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _consumptionLocalService.dynamicQuery();
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
		return _consumptionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _consumptionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _consumptionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _consumptionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _consumptionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.support.stafforderstuff.model.Consumption fetchConsumption(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.fetchConsumption(ConsumptionId);
	}

	/**
	* Returns the consumption with the primary key.
	*
	* @param ConsumptionId the primary key of the consumption
	* @return the consumption
	* @throws PortalException if a consumption with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption getConsumption(
		long ConsumptionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.getConsumption(ConsumptionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.liferay.support.stafforderstuff.model.Consumption> getConsumptions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.getConsumptions(start, end);
	}

	/**
	* Returns the number of consumptions.
	*
	* @return the number of consumptions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConsumptionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.getConsumptionsCount();
	}

	/**
	* Updates the consumption in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consumption the consumption
	* @return the consumption that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.stafforderstuff.model.Consumption updateConsumption(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumptionLocalService.updateConsumption(consumption);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _consumptionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_consumptionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _consumptionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConsumptionLocalService getWrappedConsumptionLocalService() {
		return _consumptionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConsumptionLocalService(
		ConsumptionLocalService consumptionLocalService) {
		_consumptionLocalService = consumptionLocalService;
	}

	@Override
	public ConsumptionLocalService getWrappedService() {
		return _consumptionLocalService;
	}

	@Override
	public void setWrappedService(
		ConsumptionLocalService consumptionLocalService) {
		_consumptionLocalService = consumptionLocalService;
	}

	private ConsumptionLocalService _consumptionLocalService;
}