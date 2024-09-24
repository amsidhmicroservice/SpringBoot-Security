-- Inserting sample users (username, password, enabled)
INSERT INTO users (username, password, enabled) VALUES ('dummy', '{noop}Pass@123', true);
INSERT INTO users (username, password, enabled) VALUES ('admin', '{bcrypt}$2a$12$I18W4gtMEbCQIOcxrZA/iuJHeLIE3IwtiQMoPJrAfwOw1riX/rCii', true);

-- Inserting roles/authorities (username, authority)
INSERT INTO authorities (username, authority) VALUES ('dummy', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
