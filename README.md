# camunda-simple-processes

Projekt zawiera 5 prostych procesow

Swim Process - ServiceTask sterowany za pomoca klasy SwimDelegate.

User Process - pobiera dane za pomoca formularza w User Task i dodaje lub odejmuje liczbe 1 od przesylanego identyfikatora.

User Start Form Process - To samo co powyzej, z tym, ze formularz zawarty jest juz w evencie startowych,a nie w User Task.
Klasa UserController to prosty RestController, ktory pobiera parametry metoda Get i uruchamia ten proces z poziomu kodu Java.

Manual Process - prezentacja Manual Task, ktory w zasadzie nic nie robi

Embedded Form Process - uzywa formularza w pliku task-form.html
