create table StaffOrderStuff_Consumption (
	ConsumptionId INTEGER not null primary key,
	UserId INTEGER,
	FoodId INTEGER,
	Date DATE null,
	Quantity DOUBLE,
	Unit VARCHAR(75) null,
	Status INTEGER
);

create table StaffOrderStuff_Food (
	FoodId INTEGER not null primary key,
	CompanyId LONG,
	GroupId LONG,
	Name VARCHAR(75) null,
	Price DOUBLE,
	Quantity DOUBLE,
	Unit VARCHAR(75) null
);