package com.liferay.support.stafforderstuff;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.support.stafforderstuff.model.Food;
import com.liferay.support.stafforderstuff.service.FoodLocalServiceUtil;
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

		public void processAction(ActionRequest request, ActionResponse response)
				throws IOException, PortletException {

				_log.error("Inside processAction");

				//Code to add dummy entity here
				FoodLocalServiceUtil.addDummyFood();

				// Verify if the sendRedirect is necessary...
				sendRedirect(request, response);

		}

		private static Log _log = LogFactoryUtil.getLog(StaffOrderStuff.class);

}
