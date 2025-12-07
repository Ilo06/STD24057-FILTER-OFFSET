CREATE DATABASE product_management_db;

--creation de l'utilisateur
CREATE USER product_manager_user WITH PASSWORD '123456';

-- Attribution des privilèges à l'utilisateur sur la base de données
GRANT CONNECT ON DATABASE product_management_db TO product_manager_user;

-- passer sur la nouvelle base de données
\c product_management_db;

-- garantir les privilèges sur le schéma public
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO product_manager_user;


GRANT SELECT, UPDATE, INSERT ON Product TO product_manager_user;
GRANT SELECT, UPDATE, INSERT ON Product_category TO product_manager_user;
