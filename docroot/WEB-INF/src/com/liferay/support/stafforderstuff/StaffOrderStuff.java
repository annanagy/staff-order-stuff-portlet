package com.liferay.support.stafforderstuff;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil;
import com.liferay.support.stafforderstuff.service.StockLocalServiceUtil;
import com.liferay.support.stafforderstuff.service.impl.FoodLocalServiceImpl;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class StaffOrderStuff
 */
public class StaffOrderStuff extends MVCPortlet {

		public void doView(RenderRequest request, RenderResponse response)
				throws IOException, PortletException {

			_log.error("Inside doView");

			//discuss why is the call to supee necessary
			super.doView(request, response);

		}

		/*public void processAction(ActionRequest request, ActionResponse response)
				throws IOException, PortletException {

				_log.error("Inside processAction");

				//Code to add dummy entity here
				FoodLocalServiceUtil.addDummyFood();

				// Verify if the sendRedirect is necessary...
				sendRedirect(request, response);

		}*/

		public void addFood(ActionRequest request, ActionResponse response)
				throws Exception {
			_log.error("Inside addFood");

			String name = ParamUtil.getString(request, "name");
			double price = ParamUtil.getDouble(request, "price");
			String unit = ParamUtil.getString(request, "unit");

			FoodLocalServiceUtil.addFood(name, price, unit);
		}

		public void addStock(ActionRequest request, ActionResponse response)
				throws Exception {
			_log.error("Inside addStock");

			String name = ParamUtil.getString(request, "name");
			long foodId = ParamUtil.getLong(request, "foodId");
			double quantity = ParamUtil.getDouble(request, "quantity");
			int status = ParamUtil.getInteger(request, "status");

			StockLocalServiceUtil.addStock(name, foodId, quantity, status);
		}

		public void addDummyFood(ActionRequest request, ActionResponse response) 
				throws Exception {
			_log.error("Inside addDummyFood");

			String name = ParamUtil.getString(request, "name");
			_log.error("Received name: " + name);

			//FoodLocalServiceUtil.addDummyFood(name);
		}

		private static Log _log = LogFactoryUtil.getLog(StaffOrderStuff.class);

}
