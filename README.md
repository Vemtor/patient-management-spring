# Patient management

## O samej aplikacji
Aplikacja działa od strony backendowej na Javie z frameworkiem Spring oraz bazą danych MySQL, frontend zrealizowany jest przy użyciu react'a. System umożliwa rejestrację pacjentów ich usunięcie oraz podgląd. O ile osoba pracująca na recepcji nie może czytać pełnej dokumentacji medycznej pacjenta to może zobaczyć zlecone przez lekarzy badania.
Poza stworzeniem wyszukiwarki, dodaniem paginacji postanowiłem urozmaicić projekt właśnie o realizację tabeli ze zleconymi badanami dla pacjentów. Zatem wykorzystałem tutaj połączenie OneToMany o raz ManyToOne. Rzecz jasna usunięcie konkretnego badania przez lekarza nie może skutkować usunięcia pacjenta, ale usunięcie pacjenta skutuje usunięciem jego badań. Zaimplementowałem to w backendzie. Wprowadziłem również prostą weryfikację formularzy po stronie frontendowej, ale też i po stronie backendowej. 

Oto kilka zdjęć z aplikacji 
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/31592ebe-7bf6-43b5-813c-612f4ec32273)
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/d90ac7fa-772c-4465-a733-ae54e962daa0)

![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/7c03cdfa-c353-448d-9475-102161739de6)
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/c0675827-a72c-4c22-b862-30d7fc4b877d)
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/e5171f56-89b8-4afd-bb0f-89fc240a4690)





## Instrukcja instalacji
Potrzebne nam będzie: Java wraz z Maven, MySQL Server, npm package manager. Przyda się nam też naturalnie do zarządzania bazą danych MySQL - MySQL Workbench

Baza danych:
0. Nasz serwer MySQL powinien działać na localhost:http://localhost:8080/ 
w przypadku innej konfiguracji serwera MySQL możemy zmienić sposób na którym działa serwer spring przechodząc do folderu serwera spring `\patientmanagement\src\main\resources\` i edytując plik application.properties

1. Wchodzimy tutaj [https://github.com/Vemtor/patient-management-front-data/tree/main/database](https://github.com/Vemtor/patient-management-front-data)
2. Pobieramy archiwum i wypakowujemy je w dowolnym folderze.
3. Uruchamiamy MySQL Workbech i dla naszego serwer dodajemy użytkownika o nazwie: springstudent i haśle: springstudent
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/0d123137-aa3d-48c6-af12-ce9274fce5e1)
4. Teraz klikamy domek w lewym górnym rogu i logujemy się na połączenie spring student - oczywiście nazwa springstudent hasło springstudent
5. Przechodzimy do folderu Database z naszego archiwum i otwieramy plik `patient-management_patient.sql` za pomocą MySQL Workbench lub kopiujemy jego zawartość do query. Klikamy CTRL + A i żółtą błyskawicę
![image](https://github.com/Vemtor/patient-management-spring/assets/20191221/d3f93d2a-9bbe-432c-93c4-5614bafc235d)
6. Analogicznie robimy z plikiem `patient-management_medicaltest.sql`


Spring:

1. Pobieramy archiwum i wypakowujemy je w dowolnym folderze
2. Uruchamiamy terminal i wpisujemy polecenie `mvn clean install`
3. Przechodzimy do folderu target lub wpisujemy polecenie do terminala: `cd target`
4. W terminalu wprowadzamy komendę `java -jar patientmanagement-0.0.1-SNAPSHOT.jar`
5. Nasz serwer właśnie startuje

React: 

1. Przechodzimy do pobranego wcześniej przez nas już archiwum [https://github.com/Vemtor/patient-management-front-data/tree/main/database](https://github.com/Vemtor/patient-management-front-data) otwieramy folder react.
2. W innym dowolnym folderze uruchamiamy terminal i wpisujemy następujące polecenia
3. `npx create-react-app patient-management`
4. `cd patient-management`
5. `npm install react-router-dom`
6. `npm install axios`
7. Podmieniamy wszystkie pliki z pobranego archiwum(folder react).
8. Następnie wpisujemy polecenie `npm start`. Jeśli mamy uruchomiony serwer Spring i wykonane wcześniejsze kroki z bazą danych cała aplikacja powinna już funkcjonować. 



