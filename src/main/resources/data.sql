insert into city (name, code) VALUES ('Bucharest', 'BUC');
insert into parking_facility (city_id, name) VALUES (1, 'Car Park');
insert into parking_facility (city_id, name) VALUES (1, 'Bike Park');
insert into vehicle (city_id, parking_facility_id, name, parked) VALUES (1, 1, 'Volvo', true);
insert into vehicle (city_id, parking_facility_id, name, parked) VALUES (1, 2, 'Pegas', false);
