create table StaffOrderStuff_Consumption (
	ConsumptionId LONG not null primary key,
	UserId INTEGER,
	FoodId INTEGER,
	Date DATE null,
	Quantity DOUBLE,
	Unit VARCHAR(75) null,
	Status INTEGER
);

create table StaffOrderStuff_Food (
	FoodId LONG not null primary key,
	CompanyId LONG,
	GroupId LONG,
	Name VARCHAR(75) null,
	Price DOUBLE,
	Unit VARCHAR(75) null
);

create table StaffOrderStuff_Stock (
	StockId LONG not null primary key,
	CompanyId LONG,
	GroupId LONG,
	UserId LONG,
	Name VARCHAR(75) null,
	FoodId LONG,
	FoodName VARCHAR(75) null,
	Quantity DOUBLE,
	Unit VARCHAR(75) null,
	Status INTEGER
);