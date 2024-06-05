-- Inserting data into the supplier table
INSERT INTO supplier (id, name, contact_number, address) VALUES
(1, 'Meat Supplier', '1234567890', '123 Street, City, Country'),
(2, 'Vegetable Supplier', '0987654321', '456 Avenue, City, Country'),
(3, 'Beverage Supplier', '1112223330', '789 Boulevard, City, Country'),
(4, 'Dairy Supplier', '4445556660', '321 Lane, City, Country');

-- Inserting data into the category table
INSERT INTO category (id, name) VALUES
(1, 'Steaks'),
(2, 'Sides'),
(3, 'Drinks'),
(4, 'Desserts');

-- Inserting data into the unit table
INSERT INTO unit (id, name) VALUES
(1, 'Kilogram'),
(2, 'Piece'),
(3, 'Liter'),
(4, 'Gram');

-- Inserting data into the product table
INSERT INTO product (id, name, minimum_quantity, supplier_id, category_id, unit_id) VALUES
(1, 'Ribeye Steak', 10, 1, 1, 2),
(2, 'French Fries', 20, 2, 2, 1),
(3, 'Red Wine', 15, 3, 3, 3),
(4, 'Cheesecake', 25, 4, 4, 2);

-- Inserting data into the size table
INSERT INTO size (id, name, product_id) VALUES
(1, 'Small', 2),
(2, 'Large', 2),
(3, 'Medium', 1),
(4, 'Extra Large', 1);

-- Inserting data into the branch table
INSERT INTO branch (id, name) VALUES
(1, 'Steakhouse Downtown'),
(2, 'Steakhouse Uptown'),
(3, 'Steakhouse Eastside'),
(4, 'Steakhouse Westside');

-- Inserting data into the branch_product table
INSERT INTO branch_product (id, quantity, branch_id, product_id) VALUES
(1, 100, 1, 1),
(2, 200, 2, 2),
(3, 150, 3, 3),
(4, 250, 4, 4);

-- Inserting data into the deposit_transaction table
INSERT INTO deposit_transaction (id, quantity, date, price, branch_product_id) VALUES
(1, 50, '2022-01-01', 100.00, 1),
(2, 100, '2022-01-02', 200.00, 2),
(3, 75, '2022-01-03', 150.00, 3),
(4, 125, '2022-01-04', 250.00, 4);

-- Inserting data into the withdraw_transaction table
INSERT INTO withdraw_transaction (id, quantity, date, price, branch_product_id) VALUES
(1, 10, '2022-01-03', 20.00, 1),
(2, 20, '2022-01-04', 40.00, 2),
(3, 15, '2022-01-05', 30.00, 3),
(4, 25, '2022-01-06', 50.00, 4);