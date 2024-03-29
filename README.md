# Patient management

## 0. Instrukcja instalacji
Potrzebne nam będzie: Java wraz z Maven, MySQL Server, npm package manager. Przyda się nam też naturalnie do zarządzania bazą danych MySQL - MySQL Workbench

Spring:

1. Pobieramy archiwum i wypakowujemy je w dowolnym folderze
2. Uruchamiamy terminal i wpisujemy polecenie `mvn clean install`
3. Przechodzimy do folderu target lub wpisujemy polecenie do terminala: `cd target`
4. W terminalu wprowadzamy komendę `java -jar patientmanagement-0.0.1-SNAPSHOT.jar`
5. Nasz serwer właśnie startuje

Baza danych:

1. Wchodzimy tutaj https://github.com/Vemtor/patient-management-front-data/tree/main/database
2. Pobieramy archiwum i wypakowujemy je w dowolnym folderze.
3. Uruchamiamy MySQL Workbech i dla naszego serwer dodajemy użytkownika o nazwie: springstudent i haśle: springstudent
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/0d123137-aa3d-48c6-af12-ce9274fce5e1)
4. Teraz klikamy domek w lewym górnym rogu i logujemy się na połączenie spring student
wykonujemy polecenie "CREATE DATABASE  IF NOT EXISTS `patient-management`;
USE `patient-management`;" 
5. Przechodzimy do folderu Database z naszego archiwum i otwieramy plik `patient-management_patient.sql` za pomocą MySQL Workbench lub kopiujemy jego zawartość do query. Klikamy CTRL + A i żółtą błyskawicę
