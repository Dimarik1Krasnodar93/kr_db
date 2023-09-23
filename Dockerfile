# Указываем базовый образ, который содержит Java
FROM gradle:latest as gradle

# Создаем рабочую директорию внутри контейнера
WORKDIR /app_db

# Копируем JAR-файл вашего проекта в контейнер
COPY . .

# Указываем порт, на котором будет работать приложение
RUN gradle build

FROM openjdk:17.0.2-jdk
WORKDIR app_db
COPY --from=gradle /app_db/build/libs/kr_db-1.0.0.jar app_db.jar

# Команда для запуска приложения при старте контейнера
CMD ["java", "-jar", "app_db.jar"]