# Aufgabe 9
> Ist die folgende Zuweisung gültig? `Manager m = new Angestellter("James Gosling", 60000.00);`

Ja, da es sich bei 60000.00 um einen Float oder Double wert handelt.
Am besten noch ein d hinter die 60000.00d.

# Aufgabe 10 ?

# Aufgabe 11
> Es ist eine abstrakte Klasse Person und ein Interface Druckbar gegeben. Welche der beiden folgenden Zuweisungen ist erlaubt?
```java
Person p = new Person();
Druckbar d = new Druckbar();
```

Lediglich die Person ist erlaubt.
Interfaces sind keine Templates und können somit nicht erzeugt werden.

# Aufgabe 12
> Es ist das folgende Klassendiagramm gegeben

![Klassendiagramm](https://i.imgur.com/Jo0DnrB.png)

## (a)
> Wie wird diese Assoziation in der Implementierung realisiert?
Man kann erkennen, dass 'Privatkunde' genau ein 'Konto' hat.
Und, dass jedes 'Konto' auch nur einem 'Privatkunde'n zugeteilt sein kann.
```java
private Konto konto = new Konto();
```

## (b)
> Wie wird diese Assoziation implementiert, wenn der Kunde n Konten besitzen kann?
```java
private Konto[] konto = Konto[n];
```

# Aufgabe 14
> Was bedeutet es, wenn eine Klasse als final definiert wird? Was bedeutet es, wenn eine Methode als final definiert wird?

Eine 'final' Methode kann nicht überschrieben werden.
Eine 'final' Klasse kann nicht 'extended' werden.
Eine 'final' Variable kann nicht geändert werden.