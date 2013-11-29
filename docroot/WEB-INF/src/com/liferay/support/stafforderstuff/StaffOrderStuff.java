package com.liferay.support.stafforderstuff;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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

			super.doView(request, response);

		}

		public void processAction(ActionRequest request, ActionResponse response)
				throws IOException, PortletException {

				_log.error("Inside processAction");
				//Code to add dummy entity here

				// Verify if the sendRedirect is necessary...
				sendRedirect(request, response);

		}

		private static Log _log = LogFactoryUtil.getLog(StaffOrderStuff.class);

}
