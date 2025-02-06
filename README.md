## Описание проекта
 это серверная часть системы управления экзаменами, разработанная на Java 17 с использованием Spring Boot и PostgreSQL. Она обеспечивает RESTful API для создания, редактирования и удаления экзаменов, а также управления пользователями и проверкой результатов.

## Технологии
- Язык программирования: Java 17  
- Фреймворк: Spring Boot 3.x  
- База данных: PostgreSQL  
- Аутентификация: JWT JSON Web Token  
- Контейнеризация: Docker, Docker Compose  
- Управление зависимостями: Gradle  

## Установка и запуск

### Клонирование репозитория

git clone https://github.com/BaldruevSergei/Exmdirect_back-.git
cd Exmdirect_back-

### Настройка базы данных

Для работы приложения требуется база данных PostgreSQL.

Создайте базу данных в PostgreSQL:

CREATE DATABASE exmdirect_db;

Настройте application properties или application yml

Если используется application properties, добавьте:

spring.datasource.url=jdbc:postgresql://localhost:5432/exmdirect_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Если используется application yml, добавьте:

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/exmdirect_db
    username: your_username
    password: your_password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

### Запуск Backend-сервера без Docker

Сборка проекта с помощью Gradle:

./gradlew clean build

Запуск приложения:

java -jar build/libs/exmdirect_back-.jar

После успешного запуска API будет доступно по адресу:

http://localhost:8080

### Запуск с помощью Docker

Если у вас установлен Docker, можно развернуть приложение через docker-compose.

Создайте env файл если требуется:

POSTGRES_DB=exmdirect_db
POSTGRES_USER=your_username
POSTGRES_PASSWORD=your_password

Запуск контейнера:

docker-compose up --build -d

Проверка запущенных контейнеров:

docker ps

После успешного запуска API будет доступно по адресу:

http://localhost:8080

## Функциональность
- Регистрация и аутентификация пользователей JWT  
- Создание и редактирование экзаменов  
- Управление пользователями и ролями  
- Отправка результатов экзамена  
- Логирование запросов и действий пользователей  

## Полезные ссылки
- Swagger API http://localhost:8080/swagger-ui.html  
- Frontend репозиторий https://github.com/BaldruevSergei/Exmdirect_front- если имеется  

