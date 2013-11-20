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

import com.liferay.support.stafforderstuff.NoSuchFoodException;
import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.model.impl.FoodImpl;
import com.liferay.support.stafforderstuff.model.impl.FoodModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the food service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anna & Ádám
 * @see FoodPersistence
 * @see FoodUtil
 * @generated
 */
public class FoodPersistenceImpl extends BasePersistenceImpl<Food>
	implements FoodPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FoodUtil} to access the food persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FoodImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, FoodImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, FoodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, FoodImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, FoodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			FoodModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the foods where GroupId = &#63;.
	 *
	 * @param GroupId the group ID
	 * @return the matching foods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Food> findByGroupId(long GroupId) throws SystemException {
		return findByGroupId(GroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Food> findByGroupId(long GroupId, int start, int end)
		throws SystemException {
		return findByGroupId(GroupId, start, end, null);
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
	@Override
	public List<Food> findByGroupId(long GroupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { GroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { GroupId, start, end, orderByComparator };
		}

		List<Food> list = (List<Food>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Food food : list) {
				if ((GroupId != food.getGroupId())) {
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

			query.append(_SQL_SELECT_FOOD_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FoodModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GroupId);

				if (!pagination) {
					list = (List<Food>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Food>(list);
				}
				else {
					list = (List<Food>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first food in the ordered set where GroupId = &#63;.
	 *
	 * @param GroupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food
	 * @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a matching food could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food findByGroupId_First(long GroupId,
		OrderByComparator orderByComparator)
		throws NoSuchFoodException, SystemException {
		Food food = fetchByGroupId_First(GroupId, orderByComparator);

		if (food != null) {
			return food;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("GroupId=");
		msg.append(GroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFoodException(msg.toString());
	}

	/**
	 * Returns the first food in the ordered set where GroupId = &#63;.
	 *
	 * @param GroupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching food, or <code>null</code> if a matching food could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food fetchByGroupId_First(long GroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Food> list = findByGroupId(GroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Food findByGroupId_Last(long GroupId,
		OrderByComparator orderByComparator)
		throws NoSuchFoodException, SystemException {
		Food food = fetchByGroupId_Last(GroupId, orderByComparator);

		if (food != null) {
			return food;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("GroupId=");
		msg.append(GroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFoodException(msg.toString());
	}

	/**
	 * Returns the last food in the ordered set where GroupId = &#63;.
	 *
	 * @param GroupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching food, or <code>null</code> if a matching food could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food fetchByGroupId_Last(long GroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(GroupId);

		if (count == 0) {
			return null;
		}

		List<Food> list = findByGroupId(GroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Food[] findByGroupId_PrevAndNext(int FoodId, long GroupId,
		OrderByComparator orderByComparator)
		throws NoSuchFoodException, SystemException {
		Food food = findByPrimaryKey(FoodId);

		Session session = null;

		try {
			session = openSession();

			Food[] array = new FoodImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, food, GroupId,
					orderByComparator, true);

			array[1] = food;

			array[2] = getByGroupId_PrevAndNext(session, food, GroupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Food getByGroupId_PrevAndNext(Session session, Food food,
		long GroupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FOOD_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FoodModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(GroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(food);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Food> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the foods where GroupId = &#63; from the database.
	 *
	 * @param GroupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long GroupId) throws SystemException {
		for (Food food : findByGroupId(GroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(food);
		}
	}

	/**
	 * Returns the number of foods where GroupId = &#63;.
	 *
	 * @param GroupId the group ID
	 * @return the number of matching foods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long GroupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { GroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FOOD_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GroupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "food.GroupId = ?";

	public FoodPersistenceImpl() {
		setModelClass(Food.class);
	}

	/**
	 * Caches the food in the entity cache if it is enabled.
	 *
	 * @param food the food
	 */
	@Override
	public void cacheResult(Food food) {
		EntityCacheUtil.putResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodImpl.class, food.getPrimaryKey(), food);

		food.resetOriginalValues();
	}

	/**
	 * Caches the foods in the entity cache if it is enabled.
	 *
	 * @param foods the foods
	 */
	@Override
	public void cacheResult(List<Food> foods) {
		for (Food food : foods) {
			if (EntityCacheUtil.getResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
						FoodImpl.class, food.getPrimaryKey()) == null) {
				cacheResult(food);
			}
			else {
				food.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all foods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FoodImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FoodImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the food.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Food food) {
		EntityCacheUtil.removeResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodImpl.class, food.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Food> foods) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Food food : foods) {
			EntityCacheUtil.removeResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
				FoodImpl.class, food.getPrimaryKey());
		}
	}

	/**
	 * Creates a new food with the primary key. Does not add the food to the database.
	 *
	 * @param FoodId the primary key for the new food
	 * @return the new food
	 */
	@Override
	public Food create(int FoodId) {
		Food food = new FoodImpl();

		food.setNew(true);
		food.setPrimaryKey(FoodId);

		return food;
	}

	/**
	 * Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FoodId the primary key of the food
	 * @return the food that was removed
	 * @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food remove(int FoodId) throws NoSuchFoodException, SystemException {
		return remove((Serializable)FoodId);
	}

	/**
	 * Removes the food with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the food
	 * @return the food that was removed
	 * @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food remove(Serializable primaryKey)
		throws NoSuchFoodException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Food food = (Food)session.get(FoodImpl.class, primaryKey);

			if (food == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFoodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(food);
		}
		catch (NoSuchFoodException nsee) {
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
	protected Food removeImpl(Food food) throws SystemException {
		food = toUnwrappedModel(food);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(food)) {
				food = (Food)session.get(FoodImpl.class, food.getPrimaryKeyObj());
			}

			if (food != null) {
				session.delete(food);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (food != null) {
			clearCache(food);
		}

		return food;
	}

	@Override
	public Food updateImpl(com.liferay.support.stafforderstuff.model.Food food)
		throws SystemException {
		food = toUnwrappedModel(food);

		boolean isNew = food.isNew();

		FoodModelImpl foodModelImpl = (FoodModelImpl)food;

		Session session = null;

		try {
			session = openSession();

			if (food.isNew()) {
				session.save(food);

				food.setNew(false);
			}
			else {
				session.merge(food);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FoodModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((foodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { foodModelImpl.getOriginalGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { foodModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
			FoodImpl.class, food.getPrimaryKey(), food);

		return food;
	}

	protected Food toUnwrappedModel(Food food) {
		if (food instanceof FoodImpl) {
			return food;
		}

		FoodImpl foodImpl = new FoodImpl();

		foodImpl.setNew(food.isNew());
		foodImpl.setPrimaryKey(food.getPrimaryKey());

		foodImpl.setFoodId(food.getFoodId());
		foodImpl.setCompanyId(food.getCompanyId());
		foodImpl.setGroupId(food.getGroupId());
		foodImpl.setName(food.getName());
		foodImpl.setPrice(food.getPrice());
		foodImpl.setQuantity(food.getQuantity());
		foodImpl.setUnit(food.getUnit());

		return foodImpl;
	}

	/**
	 * Returns the food with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the food
	 * @return the food
	 * @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFoodException, SystemException {
		Food food = fetchByPrimaryKey(primaryKey);

		if (food == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFoodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return food;
	}

	/**
	 * Returns the food with the primary key or throws a {@link com.liferay.support.stafforderstuff.NoSuchFoodException} if it could not be found.
	 *
	 * @param FoodId the primary key of the food
	 * @return the food
	 * @throws com.liferay.support.stafforderstuff.NoSuchFoodException if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food findByPrimaryKey(int FoodId)
		throws NoSuchFoodException, SystemException {
		return findByPrimaryKey((Serializable)FoodId);
	}

	/**
	 * Returns the food with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the food
	 * @return the food, or <code>null</code> if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Food food = (Food)EntityCacheUtil.getResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
				FoodImpl.class, primaryKey);

		if (food == _nullFood) {
			return null;
		}

		if (food == null) {
			Session session = null;

			try {
				session = openSession();

				food = (Food)session.get(FoodImpl.class, primaryKey);

				if (food != null) {
					cacheResult(food);
				}
				else {
					EntityCacheUtil.putResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
						FoodImpl.class, primaryKey, _nullFood);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FoodModelImpl.ENTITY_CACHE_ENABLED,
					FoodImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return food;
	}

	/**
	 * Returns the food with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FoodId the primary key of the food
	 * @return the food, or <code>null</code> if a food with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Food fetchByPrimaryKey(int FoodId) throws SystemException {
		return fetchByPrimaryKey((Serializable)FoodId);
	}

	/**
	 * Returns all the foods.
	 *
	 * @return the foods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Food> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Food> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Food> findAll(int start, int end,
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

		List<Food> list = (List<Food>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FOOD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FOOD;

				if (pagination) {
					sql = sql.concat(FoodModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Food>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Food>(list);
				}
				else {
					list = (List<Food>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the foods from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Food food : findAll()) {
			remove(food);
		}
	}

	/**
	 * Returns the number of foods.
	 *
	 * @return the number of foods
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

				Query q = session.createQuery(_SQL_COUNT_FOOD);

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
	 * Initializes the food persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.support.stafforderstuff.model.Food")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Food>> listenersList = new ArrayList<ModelListener<Food>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Food>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FoodImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FOOD = "SELECT food FROM Food food";
	private static final String _SQL_SELECT_FOOD_WHERE = "SELECT food FROM Food food WHERE ";
	private static final String _SQL_COUNT_FOOD = "SELECT COUNT(food) FROM Food food";
	private static final String _SQL_COUNT_FOOD_WHERE = "SELECT COUNT(food) FROM Food food WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "food.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Food exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Food exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FoodPersistenceImpl.class);
	private static Food _nullFood = new FoodImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Food> toCacheModel() {
				return _nullFoodCacheModel;
			}
		};

	private static CacheModel<Food> _nullFoodCacheModel = new CacheModel<Food>() {
			@Override
			public Food toEntityModel() {
				return _nullFood;
			}
		};
}