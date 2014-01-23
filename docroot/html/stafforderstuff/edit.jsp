<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

This is the
<b>Staff Order Stuff Portlet</b>
portlet in Edit mode.

<portlet:actionURL var="addDummyFoodURL">
	<portlet:param name="javax.portlet.action" value="addDummyFood" />
</portlet:actionURL>
<form action="<%= addDummyFoodURL %>" method="post"
	name="<portlet:namespace />fm">
	<input type="text" name="<portlet:namespace />name" /> <input
		type="text" name="<portlet:namespace />price" /> <input type="text"
		name="<portlet:namespace />quantity" /> <select>
		<option value="pieces">pieces</option>
		<option value="liter">liter</option>
		<option value="unit3">unit3</option>
		<option value="unit4">unit4</option>
	</select> <input type="submit" value="Add_dummy_food_entity" />

</form>

