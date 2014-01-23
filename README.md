staff-order-stuff-portlet
=========================
--- Under Construction ---

Staff Order Stuff Portlet to manage orders and payments for Liferay version 6.2.10.

This project originally created as the Staff Catering Portlet but changed its functionality/name afterwards to handle general things not just food.

It serves educational purposes only (hopefully it will be used as well) and was started at the first Hungarian Liferay Codefest organized by our Developers.


### General description, main idea

Create a portlet to organize (order and pay) catering (and other stuff) for users. 


### Functionality, and some details

- This handles multiple types of food / drinks that an admin privileged user can modify. Add, remove, fill the stocks, verify that users paid, etc.
- Users can reserve food for themselves, or if they took one then fill in to decresase the overall number.
- After the stock is depleted, Every user pays for their food, and the admin registers/approves this
- Each entity has a price, quantity and name. Capable of sending emails to users.


### Use Case, workflow

- Admin ordered some food and registers it to this portlet
- User selects type of food / drink and the quantity they will / have consumed from a list.
- Portlet keeps track of what types of foods / drinks each user consumed, adds the amount of money due until being paid.
- If the food is emptied, then payment time
- Admin approves, keeps track of the income users have paid, by approving the payment (leading to status)


### Entities

USER >-< CONSUMPTION >-< FOOD
Food: id, name, price, quantity
Consumption: userid, foodid, date, quantity, status


### UI

...
