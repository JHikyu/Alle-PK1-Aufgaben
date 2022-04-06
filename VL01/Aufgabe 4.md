# Aufgabe 4
> Wie viele Objekte werden in der folgenden Sequenz erzeugt?
```java
static void foo(){
  Auto meinAuto;
  meinAuto = new Auto("Audi", 2015);
  Auto lieblingsAuto = meinAuto;
  Auto mariasAuto = new Auto("BMW", 2017);
  Auto franksAuto = new Auto("Audi", 2015);
  //...
}
```

Hier wird klar, dass der Ausdruck `new` ein neues Auto erzeugt.
Somit sind es 3 neu erzeugte Autos.

## (b)
> Welchen Wert liefert dann der folgende Ausdruck? `(meinAuto == franksAuto)`

Bei dem `==` Operator wird geprüft, ob beide Variablen den gleichen Wert haben.
Da es sich hier um zwei unterschiedliche Autos handelt, wirft der Vergleich `false` zurück.