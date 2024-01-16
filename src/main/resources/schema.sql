create table if not exists netology.persons (
	name VARCHAR(50),
	surname VARCHAR(50),
	age int,
	phone_number VARCHAR(12),
	city_of_living VARCHAR(50),
	primary key (name, surname, age)
)