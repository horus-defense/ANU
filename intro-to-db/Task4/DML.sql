INSERT INTO customer (customer_id, customer_name, city) VALUES
(1, 'Mahmoud Ahmed', 'Alexandria'),
(2, 'Mohamed Ali', 'Cairo'),
(3, 'Mostafa Hassan', 'Mansoura'),
(4, 'Mariam Adel', 'Alexandria');

INSERT INTO `order` (order_id, order_date, customer_id) VALUES
(1, '2026-11-20', 1),
(2, '2026-11-21', 2),
(3, '2026-11-22', 1),
(4, '2026-11-23', 3);

INSERT INTO item (item_id, unit_price) VALUES
(1, 150.00),
(2, 250.00),
(3, 500.00),
(4, 750.00);

INSERT INTO order_item (order_id, item_id, quantity) VALUES
(1, 1, 2),
(1, 2, 3),
(2, 2, 1),
(2, 3, 2),
(3, 1, 4),
(4, 3, 1);

INSERT INTO warehouse (warehouse_id, warehouse_city) VALUES
(1, 'Alexandria'),
(2, 'Arica'),
(8, 'Cairo'),
(9, 'Tanta');

INSERT INTO shipment (order_id, warehouse_id, ship_date) VALUES
(1, 8, '2026-11-21'),
(2, 2, '2026-11-22'),
(3, 8, '2026-11-23'),
(4, 1, '2026-11-24');
