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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.support.stafforderstuff.NoSuchConsumptionException;
import com.liferay.support.stafforderstuff.model.Consumption;
import com.liferay.support.stafforderstuff.model.impl.ConsumptionImpl;
import com.liferay.support.stafforderstuff.model.impl.ConsumptionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the consumption service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see ConsumptionPersistence
 * @see ConsumptionUtil
 * @generated
 */
public class ConsumptionPersistenceImpl extends BasePersistenceImpl<Consumption>
	implements ConsumptionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConsumptionUtil} to access the consumption persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConsumptionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, ConsumptionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, ConsumptionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSUMPTIONID =
		new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, ConsumptionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConsumptionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMPTIONID =
		new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, ConsumptionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByConsumptionId",
			new String[] { Long.class.getName() },
			ConsumptionModelImpl.CONSUMPTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONSUMPTIONID = new FinderPath(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByConsumptionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the consumptions where ConsumptionId = &#63;.
	 *
	 * @param ConsumptionId the consumption ID
	 * @return the matching consumptions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Consumption> findByConsumptionId(long ConsumptionId)
		throws SystemException {
		return findByConsumptionId(ConsumptionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Consumption> findByConsumptionId(long ConsumptionId, int start,
		int end) throws SystemException {
		return findByConsumptionId(ConsumptionId, start, end, null);
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
	@Override
	public List<Consumption> findByConsumptionId(long ConsumptionId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMPTIONID;
			finderArgs = new Object[] { ConsumptionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONSUMPTIONID;
			finderArgs = new Object[] {
					ConsumptionId,
					
					start, end, orderByComparator
				};
		}

		List<Consumption> list = (List<Consumption>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Consumption consumption : list) {
				if ((ConsumptionId != consumption.getConsumptionId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONSUMPTION_WHERE);

			query.append(_FINDER_COLUMN_CONSUMPTIONID_CONSUMPTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConsumptionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ConsumptionId);

				if (!pagination) {
					list = (List<Consumption>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Consumption>(list);
				}
				else {
					list = (List<Consumption>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Consumption findByConsumptionId_First(long ConsumptionId,
		OrderByComparator orderByComparator)
		throws NoSuchConsumptionException, SystemException {
		Consumption consumption = fetchByConsumptionId_First(ConsumptionId,
				orderByComparator);

		if (consumption != null) {
			return consumption;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ConsumptionId=");
		msg.append(ConsumptionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsumptionException(msg.toString());
	}

	/**
	 * Returns the first consumption in the ordered set where ConsumptionId = &#63;.
	 *
	 * @param ConsumptionId the consumption ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching consumption, or <code>null</code> if a matching consumption could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption fetchByConsumptionId_First(long ConsumptionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Consumption> list = findByConsumptionId(ConsumptionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Consumption findByConsumptionId_Last(long ConsumptionId,
		OrderByComparator orderByComparator)
		throws NoSuchConsumptionException, SystemException {
		Consumption consumption = fetchByConsumptionId_Last(ConsumptionId,
				orderByComparator);

		if (consumption != null) {
			return consumption;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ConsumptionId=");
		msg.append(ConsumptionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConsumptionException(msg.toString());
	}

	/**
	 * Returns the last consumption in the ordered set where ConsumptionId = &#63;.
	 *
	 * @param ConsumptionId the consumption ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching consumption, or <code>null</code> if a matching consumption could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption fetchByConsumptionId_Last(long ConsumptionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByConsumptionId(ConsumptionId);

		if (count == 0) {
			return null;
		}

		List<Consumption> list = findByConsumptionId(ConsumptionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the consumptions where ConsumptionId = &#63; from the database.
	 *
	 * @param ConsumptionId the consumption ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByConsumptionId(long ConsumptionId)
		throws SystemException {
		for (Consumption consumption : findByConsumptionId(ConsumptionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(consumption);
		}
	}

	/**
	 * Returns the number of consumptions where ConsumptionId = &#63;.
	 *
	 * @param ConsumptionId the consumption ID
	 * @return the number of matching consumptions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByConsumptionId(long ConsumptionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONSUMPTIONID;

		Object[] finderArgs = new Object[] { ConsumptionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONSUMPTION_WHERE);

			query.append(_FINDER_COLUMN_CONSUMPTIONID_CONSUMPTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ConsumptionId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CONSUMPTIONID_CONSUMPTIONID_2 = "consumption.ConsumptionId = ?";

	public ConsumptionPersistenceImpl() {
		setModelClass(Consumption.class);
	}

	/**
	 * Caches the consumption in the entity cache if it is enabled.
	 *
	 * @param consumption the consumption
	 */
	@Override
	public void cacheResult(Consumption consumption) {
		EntityCacheUtil.putResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionImpl.class, consumption.getPrimaryKey(), consumption);

		consumption.resetOriginalValues();
	}

	/**
	 * Caches the consumptions in the entity cache if it is enabled.
	 *
	 * @param consumptions the consumptions
	 */
	@Override
	public void cacheResult(List<Consumption> consumptions) {
		for (Consumption consumption : consumptions) {
			if (EntityCacheUtil.getResult(
						ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
						ConsumptionImpl.class, consumption.getPrimaryKey()) == null) {
				cacheResult(consumption);
			}
			else {
				consumption.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all consumptions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConsumptionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConsumptionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the consumption.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Consumption consumption) {
		EntityCacheUtil.removeResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionImpl.class, consumption.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Consumption> consumptions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Consumption consumption : consumptions) {
			EntityCacheUtil.removeResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
				ConsumptionImpl.class, consumption.getPrimaryKey());
		}
	}

	/**
	 * Creates a new consumption with the primary key. Does not add the consumption to the database.
	 *
	 * @param ConsumptionId the primary key for the new consumption
	 * @return the new consumption
	 */
	@Override
	public Consumption create(long ConsumptionId) {
		Consumption consumption = new ConsumptionImpl();

		consumption.setNew(true);
		consumption.setPrimaryKey(ConsumptionId);

		return consumption;
	}

	/**
	 * Removes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ConsumptionId the primary key of the consumption
	 * @return the consumption that was removed
	 * @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption remove(long ConsumptionId)
		throws NoSuchConsumptionException, SystemException {
		return remove((Serializable)ConsumptionId);
	}

	/**
	 * Removes the consumption with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the consumption
	 * @return the consumption that was removed
	 * @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption remove(Serializable primaryKey)
		throws NoSuchConsumptionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Consumption consumption = (Consumption)session.get(ConsumptionImpl.class,
					primaryKey);

			if (consumption == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConsumptionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(consumption);
		}
		catch (NoSuchConsumptionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Consumption removeImpl(Consumption consumption)
		throws SystemException {
		consumption = toUnwrappedModel(consumption);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(consumption)) {
				consumption = (Consumption)session.get(ConsumptionImpl.class,
						consumption.getPrimaryKeyObj());
			}

			if (consumption != null) {
				session.delete(consumption);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (consumption != null) {
			clearCache(consumption);
		}

		return consumption;
	}

	@Override
	public Consumption updateImpl(
		com.liferay.support.stafforderstuff.model.Consumption consumption)
		throws SystemException {
		consumption = toUnwrappedModel(consumption);

		boolean isNew = consumption.isNew();

		ConsumptionModelImpl consumptionModelImpl = (ConsumptionModelImpl)consumption;

		Session session = null;

		try {
			session = openSession();

			if (consumption.isNew()) {
				session.save(consumption);

				consumption.setNew(false);
			}
			else {
				session.merge(consumption);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ConsumptionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((consumptionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMPTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						consumptionModelImpl.getOriginalConsumptionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONSUMPTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMPTIONID,
					args);

				args = new Object[] { consumptionModelImpl.getConsumptionId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONSUMPTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONSUMPTIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
			ConsumptionImpl.class, consumption.getPrimaryKey(), consumption);

		return consumption;
	}

	protected Consumption toUnwrappedModel(Consumption consumption) {
		if (consumption instanceof ConsumptionImpl) {
			return consumption;
		}

		ConsumptionImpl consumptionImpl = new ConsumptionImpl();

		consumptionImpl.setNew(consumption.isNew());
		consumptionImpl.setPrimaryKey(consumption.getPrimaryKey());

		consumptionImpl.setConsumptionId(consumption.getConsumptionId());
		consumptionImpl.setUserId(consumption.getUserId());
		consumptionImpl.setFoodId(consumption.getFoodId());
		consumptionImpl.setDate(consumption.getDate());
		consumptionImpl.setQuantity(consumption.getQuantity());
		consumptionImpl.setUnit(consumption.getUnit());
		consumptionImpl.setStatus(consumption.getStatus());

		return consumptionImpl;
	}

	/**
	 * Returns the consumption with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the consumption
	 * @return the consumption
	 * @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConsumptionException, SystemException {
		Consumption consumption = fetchByPrimaryKey(primaryKey);

		if (consumption == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConsumptionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return consumption;
	}

	/**
	 * Returns the consumption with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchConsumptionException} if it could not be found.
	 *
	 * @param ConsumptionId the primary key of the consumption
	 * @return the consumption
	 * @throws com.liferay.support.stafforderstuff.NoSuchConsumptionException if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption findByPrimaryKey(long ConsumptionId)
		throws NoSuchConsumptionException, SystemException {
		return findByPrimaryKey((Serializable)ConsumptionId);
	}

	/**
	 * Returns the consumption with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the consumption
	 * @return the consumption, or <code>null</code> if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Consumption consumption = (Consumption)EntityCacheUtil.getResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
				ConsumptionImpl.class, primaryKey);

		if (consumption == _nullConsumption) {
			return null;
		}

		if (consumption == null) {
			Session session = null;

			try {
				session = openSession();

				consumption = (Consumption)session.get(ConsumptionImpl.class,
						primaryKey);

				if (consumption != null) {
					cacheResult(consumption);
				}
				else {
					EntityCacheUtil.putResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
						ConsumptionImpl.class, primaryKey, _nullConsumption);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConsumptionModelImpl.ENTITY_CACHE_ENABLED,
					ConsumptionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return consumption;
	}

	/**
	 * Returns the consumption with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ConsumptionId the primary key of the consumption
	 * @return the consumption, or <code>null</code> if a consumption with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Consumption fetchByPrimaryKey(long ConsumptionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ConsumptionId);
	}

	/**
	 * Returns all the consumptions.
	 *
	 * @return the consumptions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Consumption> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Consumption> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Consumption> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Consumption> list = (List<Consumption>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONSUMPTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONSUMPTION;

				if (pagination) {
					sql = sql.concat(ConsumptionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Consumption>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Consumption>(list);
				}
				else {
					list = (List<Consumption>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the consumptions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Consumption consumption : findAll()) {
			remove(consumption);
		}
	}

	/**
	 * Returns the number of consumptions.
	 *
	 * @return the number of consumptions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONSUMPTION);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the consumption persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.support.stafforderstuff.model.Consumption")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Consumption>> listenersList = new ArrayList<ModelListener<Consumption>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Consumption>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConsumptionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONSUMPTION = "SELECT consumption FROM Consumption consumption";
	private static final String _SQL_SELECT_CONSUMPTION_WHERE = "SELECT consumption FROM Consumption consumption WHERE ";
	private static final String _SQL_COUNT_CONSUMPTION = "SELECT COUNT(consumption) FROM Consumption consumption";
	private static final String _SQL_COUNT_CONSUMPTION_WHERE = "SELECT COUNT(consumption) FROM Consumption consumption WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "consumption.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Consumption exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Consumption exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConsumptionPersistenceImpl.class);
	private static Consumption _nullConsumption = new ConsumptionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Consumption> toCacheModel() {
				return _nullConsumptionCacheModel;
			}
		};

	private static CacheModel<Consumption> _nullConsumptionCacheModel = new CacheModel<Consumption>() {
			@Override
			public Consumption toEntityModel() {
				return _nullConsumption;
			}
		};
}