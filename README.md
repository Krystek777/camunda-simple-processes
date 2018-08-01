# camunda-simple-processes

Projekt zawiera 5 prostych procesow

Swim Process - ServiceTask sterowany za pomoca klasy SwimDelegate.

User Process - pobiera dane za pomoca formularza w User Task i dodaje lub odejmuje liczbe 1 od przesylanego identyfikatora (IncrementDelegate i DecrementDelegate).

User Start Form Process - To samo co powyzej, z tym, ze formularz zawarty jest juz w evencie startowym,a nie w User Task.
Klasa UserController to prosty RestController, ktory pobiera parametry metoda Get i uruchamia ten proces z poziomu kodu Java.

Manual Process - prezentacja Manual Task, ktory w zasadzie nic nie robi

Embedded Form Process - uzywa formularza w pliku task-form.html, ktory wczytuje imie uzytkownika i jego ulubiony dowcip wypisywany do konoli prze klase JokeDelegate.
http://localhost:8080 - wejscie do panelu Camunda. uzytkownik - demo, haslo - demo (tak jak w application.yml)

przykladowe zapytania wbudownaego w Camunde REST API:

lista wszystkich procesow
http://localhost:8080/rest/process-definition (GET)

lista taskow
http://localhost:8080/rest/task (GET)

rozpoczenie procesu userProcess
http://localhost:8080/rest/process-definition/key/userProcess/start (POST)
