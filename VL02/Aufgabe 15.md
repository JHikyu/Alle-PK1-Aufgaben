# Aufgabe 15
> Ist die folgende Zuweisung gueltig?
```java
Object a = new Manager("Bill Gates", 100000.00, 50000.00);
```
Diese zuweisung ist gueltig, muss aber bei benutzung von Methoden der Manager Klasse gecasted werden.
`((Manager) a).getJahresGehalt();`

Es koennen lediglich die Methoden equals hashcode und ein paar weitere benutzt werden, da diese von der Klasse `Object` sind.

# Aufgabe 16
> Welche Ausgabe erzeugt die folgende Sequenz (fuer die bisherige Implementierung der Klasse Angestellter)?
```java
Angestellter a = new Angestellter("Meier", 5000.00);
Angestellter b = a;
Angestellter c = new Angestellter("Meier", 5000.00);
System.out.println("1. " + (a == b));
System.out.println("2. " + (a == c));
System.out.println("3. " + (a.equals(c)));
```
1. true
2. false
3. false