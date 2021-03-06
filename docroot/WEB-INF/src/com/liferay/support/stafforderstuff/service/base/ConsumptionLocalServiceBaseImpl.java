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

package com.liferay.support.stafforderstuff.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.support.stafforderstuff.model.Consumption;
import com.liferay.support.stafforderstuff.service.ConsumptionLocalService;
import com.liferay.support.stafforderstuff.service.persistence.ConsumptionPersistence;
import com.liferay.support.stafforderstuff.service.persistence.FoodPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the consumption local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.support.stafforderstuff.service.impl.ConsumptionLocalServiceImpl}.
 * </p>
 *
 * @author Anna & Ádám
 * @see com.liferay.support.stafforderstuff.service.impl.ConsumptionLocalServiceImpl
 * @see com.liferay.support.stafforderstuff.service.ConsumptionLocalServiceUtil
 * @generated
 */
public abstract class ConsumptionLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ConsumptionLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.support.stafforderstuff.service.ConsumptionLocalServiceUtil} to access the consumption local service.
	 */

	/**
	 * Adds the consumption to the database. Also notifies the appropriate model listeners.
	 *
	 * @param consumption the consumption
	 * @return the consumption that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Consumption addConsumption(Consumption consumption)
		throws SystemException {
		consumption.setNew(true);

		return consumptionPersistence.update(consumption);
	}

	/**
	 * Creates a new consumption with the primary key. Does not add the consumption to the database.
	 *
	 * @param ConsumptionId the primary key for the new consumption
	 * @return the new consumption
	 */
	@Override
	public Consumption createConsumption(long ConsumptionId) {
		return consumptionPersistence.create(ConsumptionId);
	}

	/**
	 * Deletes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ConsumptionId the primary key of the consumption
	 * @return the consumption that was removed
	 * @throws PortalException if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Consumption deleteConsumption(long ConsumptionId)
		throws PortalException, SystemException {
		return consumptionPersistence.remove(ConsumptionId);
	}

	/**
	 * Deletes the consumption from the database. Also notifies the appropriate model listeners.
	 *
	 * @param consumption the consumption
	 * @return the consumption that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Consumption deleteConsumption(Consumption consumption)
		throws SystemException {
		return consumptionPersistence.remove(consumption);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Consumption.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return consumptionPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return consumptionPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return consumptionPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return consumptionPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return consumptionPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Consumption fetchConsumption(long ConsumptionId)
		throws SystemException {
		return consumptionPersistence.fetchByPrimaryKey(ConsumptionId);
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
	public Consumption getConsumption(long ConsumptionId)
		throws PortalException, SystemException {
		return consumptionPersistence.findByPrimaryKey(ConsumptionId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return consumptionPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<Consumption> getConsumptions(int start, int end)
		throws SystemException {
		return consumptionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of consumptions.
	 *
	 * @return the number of consumptions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConsumptionsCount() throws SystemException {
		return consumptionPersistence.countAll();
	}

	/**
	 * Updates the consumption in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param consumption the consumption
	 * @return the consumption that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Consumption updateConsumption(Consumption consumption)
		throws SystemException {
		return consumptionPersistence.update(consumption);
	}

	/**
	 * Returns the consumption local service.
	 *
	 * @return the consumption local service
	 */
	public com.liferay.support.stafforderstuff.service.ConsumptionLocalService getConsumptionLocalService() {
		return consumptionLocalService;
	}

	/**
	 * Sets the consumption local service.
	 *
	 * @param consumptionLocalService the consumption local service
	 */
	public void setConsumptionLocalService(
		com.liferay.support.stafforderstuff.service.ConsumptionLocalService consumptionLocalService) {
		this.consumptionLocalService = consumptionLocalService;
	}

	/**
	 * Returns the consumption persistence.
	 *
	 * @return the consumption persistence
	 */
	public ConsumptionPersistence getConsumptionPersistence() {
		return consumptionPersistence;
	}

	/**
	 * Sets the consumption persistence.
	 *
	 * @param consumptionPersistence the consumption persistence
	 */
	public void setConsumptionPersistence(
		ConsumptionPersistence consumptionPersistence) {
		this.consumptionPersistence = consumptionPersistence;
	}

	/**
	 * Returns the food local service.
	 *
	 * @return the food local service
	 */
	public com.liferay.support.stafforderstuff.service.FoodLocalService getFoodLocalService() {
		return foodLocalService;
	}

	/**
	 * Sets the food local service.
	 *
	 * @param foodLocalService the food local service
	 */
	public void setFoodLocalService(
		com.liferay.support.stafforderstuff.service.FoodLocalService foodLocalService) {
		this.foodLocalService = foodLocalService;
	}

	/**
	 * Returns the food persistence.
	 *
	 * @return the food persistence
	 */
	public FoodPersistence getFoodPersistence() {
		return foodPersistence;
	}

	/**
	 * Sets the food persistence.
	 *
	 * @param foodPersistence the food persistence
	 */
	public void setFoodPersistence(FoodPersistence foodPersistence) {
		this.foodPersistence = foodPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.support.stafforderstuff.model.Consumption",
			consumptionLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.support.stafforderstuff.model.Consumption");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Consumption.class;
	}

	protected String getModelClassName() {
		return Consumption.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = consumptionPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.support.stafforderstuff.service.ConsumptionLocalService.class)
	protected com.liferay.support.stafforderstuff.service.ConsumptionLocalService consumptionLocalService;
	@BeanReference(type = ConsumptionPersistence.class)
	protected ConsumptionPersistence consumptionPersistence;
	@BeanReference(type = com.liferay.support.stafforderstuff.service.FoodLocalService.class)
	protected com.liferay.support.stafforderstuff.service.FoodLocalService foodLocalService;
	@BeanReference(type = FoodPersistence.class)
	protected FoodPersistence foodPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ConsumptionLocalServiceClpInvoker _clpInvoker = new ConsumptionLocalServiceClpInvoker();
}