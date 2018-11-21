# Create app database
1. Inspect running containers looking for postgres container id with `docker ps`
2. Open a terminal into postgres container with `docker exec -ti <CONTAINER_ID> bash`
3. Open a connection with the database with `psql -U postgres`
4. Execute the follow SQL statements:
```
CREATE DATABASE spring_transactions;
CREATE USER spring WITH ENCRYPTED PASSWORD 'spring';
GRANT ALL PRIVILEGES ON DATABASE spring_transactions TO spring;
```