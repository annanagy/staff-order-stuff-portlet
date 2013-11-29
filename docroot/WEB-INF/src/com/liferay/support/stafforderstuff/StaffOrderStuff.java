package com.liferay.support.stafforderstuff;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class StaffOrderStuff
 */
public class StaffOrderStuff extends MVCPortlet {

		public void doView(RenderRequest request, RenderResponse response)
				throws IOException {

			_log.error("Inside doView");

		}

		public void processAction(ActionRequest req, ActionResponse resp)
				throws IOException {

				_log.error("Inside processAction");
				//Code to add dummy entity here

				// Verify if the sendRedirect is necessary...
				sendRedirect(req, resp);

		}

		private static Log _log = LogFactoryUtil.getLog(StaffOrderStuff.class);

}
