Для тестирования необходимо создать PostgreSQL БД mybatis и выпонить схему: 

CREATE TABLE users (
  id int NOT NULL PRIMARY KEY,
  name varchar(100) NOT NULL,
  age varchar(20) NOT NULL
);

Далее для тестировния нужно воспользоваться Postman и выполнить следующие запросы:

POST: http://localhost:8080/rest/user/save

   {
        "id": 1,
        "name": "Ivan Ivanov I",
        "age": 25
    }
    
GET (получить всех): http://localhost:8080/rest/user/allUsers

GET (поиск по id): http://localhost:8080/rest/user/find/1

DELETE (удалить по id): http://localhost:8080/rest/user/delete/1
