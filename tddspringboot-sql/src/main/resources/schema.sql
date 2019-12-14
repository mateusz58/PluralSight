CREATE TABLE IF NOT EXISTS products (
    id  SERIAL,
    name VARCHAR(128) NOT NULL,
    quantity INTEGER NOT NULL,
    version INTEGER NOT NULL
);

-- INSERT INTO products(id,name,quantity,version) VALUES (1,"Product 1", 10,1);
-- INSERT INTO products(id,name,quantity,version) VALUES (2,"Product 2", 5,2);
