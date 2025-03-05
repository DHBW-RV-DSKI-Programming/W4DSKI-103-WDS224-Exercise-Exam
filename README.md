# Programmentwurf - Übung

## Teilbereich 1 - Harmonia App (20 Punkte)

Du bist Junior Java-Softwareentwickler bei der Firma *Harmonia*. *Harmonia* ist ein Unternehmen, das sich auf die
Entwicklung von Software für die Musikindustrie spezialisiert hat. Das Unternehmen hat eine App entwickelt, die es
Musikern ermöglicht, ihre Musik zu veröffentlichen und zu streamen. Die App ist bereits auf dem Markt und wird von
vielen Musikern genutzt. *Harmonia* hat dich beauftragt, an der App zu arbeiten und neue Funktionen hinzuzufügen.

Am Ende der folgenden Aufgaben soll die Main-Methode in der Klasse `MusicApp` korrekt ausgeführt werden.

### Aufgabe 1: Implementiere die Klasse `Genre` (5 Punkte)

Erstelle die Enum-Klasse mit dem Namen `Genre`. Ein Genre kann die folgenden Werte annehmen:

- `ROCK`
- `POP`
- `HIPHOP`
- `CLASSICAL`

Achte auf die korrekte Schreibweise. Da der Enum im gleichen Paket weiter genutzt wird, soll der Zugriffsmodifikator
`package-private` verwendet werden.

### Aufgabe 2: Implementiere die Klasse `Song` (11 Punkte)

Erstelle die Klasse `Song` mit den folgenden Eigenschaften:

- `songName` (`String`)
- `genre` (`Genre`-Enum)
- `tempo` (`int`)

Jede dieser Eigenschaften soll nur in der eigenen Klasse direkt verwendet werden können. Verwende dementsprechend den
dafür korrekten Zugriffsmodifikator. Anschließend, erstelle den gleichnamigen Konstruktor der Klasse. Der Konstruktor
der Klasse Song initialisiert jede dieser Eigenschaften. Der Zugriff ist hier `package-private`.

Zusätzlich sind zu jeder Eigenschaft entsprechende Getter- und Setter-Methoden zu implementieren. Lege diese an. Achte
dabei auf den korrekten Zugriff durch `package-private` und eine korrekte Schreibweise der Methoden nach der Oracle
Naming Convention.

### Aufgabe 3: Erweitere die Klasse `Album` (4 Punkte)

Füge der Klasse `Album` - bereits angelegt - die Methode mit der Signatur `addSong(Song song)` hinzu. Diese Methode:

- Erwartet ein `Song`-Objekt als Parameter und fügt es zur Liste `songs` hinzu.
- Prüft, ob die Liste `songs` bereits initialisiert wurde, und initialisiert sie gegebenenfalls.

Verwende den korrekten Zugriffsmodifikator `package-private` und schreibe die Methode als Prozedur.

Die Main-Methode in der Klasse `MusicApp` muss nun korrekt funktionieren.

## Teilbereich 2 - Ghostwriter, ListenManager und Fahrzeug-Pool (40 Punkte)

### Aufgabe 4: Implementiere die Klasse `TextAnalyzer` (8 Punkte)

Schreibe eine Klasse `TextAnalyzer` mit folgender Methode:

```java
static int countVowels(String text) {}
```

- Die Methode zählt und gibt zurück, wie viele Vokale (`a`, `e`, `i`, `o`, `u`) insgesamt im übergebenen Text enthalten
sind. Es wird dabei nicht zwischen Groß- und Kleinschreibung unterschieden, sondern zusammengezählt.
- Falls `null` übergeben wird, soll `-1` zurückgegeben werden.

Die Main-Methode in der Klasse `GhostWriterApp` muss nun korrekt funktionieren.

### Aufgabe 5: Implementiere die Klasse `SimpleIntList` (15 Punkte)

Erstelle eine Klasse `SimpleIntList`, die eine vereinfachte Liste für ganze Zahlen darstellt. Das Attribut `values` ist
bereits vorgegeben und speichert die Werte. Der Datentyp von `values` darf keinesfalls durch eine ArrayList ausgetauscht
werden, sondern bleibt stets bei `int[]`. Die Klasse `SimpleIntList` soll die folgenden Methoden enthalten:

- `void add(int value)` – Fügt eine Zahl zur Liste hinzu. Die Liste soll automatisch um einen Platz vergrößert werden,
wenn sie voll ist.
- `int get(int index)` – Gibt das Element an der angegebenen Position zurück. Falls der Index ungültig ist, soll `-1`
zurückgegeben werden.
- `int size()` – Gibt die Anzahl der gespeicherten Elemente zurück. Falls die Liste noch nicht initialisiert wurde, soll
`0` zurückgegeben werden.

Die Main-Methode in der Klasse `ListManagerApp` muss nun korrekt funktionieren.

### Aufgabe 6: Implementiere die Klassen `Vehicle`, `Car` und `Bicycle` (17 Punkte)

Ein Unternehmen verwaltet Fahrzeuge in einer Software. Erstelle eine einfache Vererbungshierarchie mit folgenden
Anforderungen:

1. Erstelle eine abstrakte Klasse `Vehicle` mit:
   - Einem `String`-Attribut `brand`, das nur innerhalb des Pakets sichtbar sein soll. Es wird kein Wert gesetzt.
   - Einem `int`-Attribut `maxSpeed`, das nur innerhalb des Pakets sichtbar sein soll. Es wird kein Wert gesetzt.
   - Einer Prozedur `printInfo()`, die eine folgende Fahrzeugbeschreibung auf der Konsole ausgibt:
   `"Brand <brand>, Max Speed: <maxSpeed> km/h"`. Die `<>` sind Platzhalter für die Werte der Attribute. Für diese
   Prozedur gilt die gleiche Sichtbarkeit wie für die Attribute.
   
2. Implementiere zwei Unterklassen `Car` und `Bicycle`, die von `Vehicle` erben:
   - Der `Car`-Konstruktor soll `brand` und `maxSpeed` setzen und `printInfo()` so überschreiben, dass
   `"The car of brand <brand> can reach a max speed of <maxSpeed> km/h."` ausgegeben wird.
   - Der `Bicycle`-Konstruktor soll ebenfalls `brand` und `maxSpeed` setzen, wobei `printInfo()` hier ebenso
   überschrieben wird und den folgenden Text ausgibt:
   `"The bicycle of brand <brand> can reach a max speed of <maxSpeed> km/h."`.

Für alle Klassen, Konstruktoren und Methoden gilt: Die Sichtbarkeit ist auf innerhalb des Pakets beschränkt.

Die Main-Methode in der Klasse `CarPoolApp` muss schlussendlich korrekt funktionieren.

## Teilbereich 3 - Optimierung und Bug Hunting (20 Punkte)

### Aufgabe 7: Optimierung mit HashMap und Set (10 Punkte)

Ein Unternehmen verwaltet eine große Liste von Produkten. Die Suche nach Produkten anhand ihrer **ID** ist momentan
ineffizient, da sie über eine Liste (`ArrayList<Product>`) läuft. Optimiere die Suche durch ein Caching mittels
des Datentyps `HashMap`, um schnelleren Zugriff zu ermöglichen. Eine HashMap funktioniert wie ein Wörterbuch: Jeder
Eintrag besteht aus einem Schlüssel und einem Wert. Der Schlüssel ist eindeutig und wird verwendet, um den Wert zu
identifizieren. Der Wert ist der eigentliche Inhalt, der gespeichert wird.

Gegeben ist die Klasse `Product`:
```java
class Product {
    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
```

Gegeben ist eine Klasse `ProductCatalog`, die eine Liste von `Produkten` speichert und eine _ineffiziente_ Suche
implementiert:
```java
import java.util.ArrayList;

class ProductCatalog {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        long startTime = System.nanoTime();
        
        products.add(product);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("addProduct of " + product.getName() + " took " + duration + " nanoseconds");
    }

    public Product findProductById(String id) {
        long startTime = System.nanoTime();

        Product foundProduct = null;
        
        for (Product product : products) {
            if (product.getId().equals(id)) {
                foundProduct = product;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("findProductById took " + duration + " nanoseconds");
        
        return foundProduct;
    }
}
```

***Aufgaben***
1. Lege das Attribut `productCache` in der Klasse `ProductCatalog` an. Dieses Attribut soll den Zugriffsmodifikator
`public` haben. Initialisiere das Attribut als leeres `HashMap`. Wie bei einer ArrayListe kannst Du innerhalb der
`<>` Operatoren die Typen der zu speichernden Daten angeben. In diesem Fall ist der Schlüssel die **Produkt-ID** und der
zu speichernde Wert ist das `Produkt`-Objekt selbst.
2. Die Methode `addProduct(Product product)` soll nun **anstatt** der Speicherung in der Liste, das Produkt in die
HashMap `productCache` einfügen.
3. Die Methode `findProductById(String id)` soll nun **anstatt** der Suche in der Liste, das Produkt aus der HashMap
`productCache` zurückgeben. Der Anwendungsfall, dass ein Produkt vorhanden ist, wird hier nicht betrachtet. Es ist
davon auszugehen, dass das Produkt immer vorhanden ist.

Die Main-Methode in der Klasse `ProductManagerApp` muss nun korrekt funktionieren und einen zeitlichen
Performance-Gewinn darstellen.

4. In der Main-Methode der Klasse `ProductManagerApp2` findet ab Zeile 30 eine Umwandlung der HashMap in einen
sogenannten `Set` statt. Dadurch, dass die HashMap ein Schlüssel-Wert-Paar speichert, sind die Schlüssel eindeutig.
Jedoch sind die Werte nicht eindeutig. Ein Set hingegen speichert nur eindeutige Werte. Ergänze die Umwandlung der
Produkt-Namen aus der HashMap in das Set `productNames`. Die Umwandlung soll in der Main-Methode der Klasse
`ProductManagerApp2` erfolgen.

### Aufgabe 8: Fehler in einer Anwendung (10 Punkte)

Ein Unternehmen hat eine Anwendung zur Verwaltung von Buchungen. Gelegentlich treten _unerwartete Fehler_ auf: Buchungen
werden nicht korrekt gespeichert oder überschrieben. Dein Ziel ist es, den/ die Fehler zu finden und zu beheben.

Gegeben ist die Klasse `Booking`:
```java
class Booking {

   private String id;
   private String customerName;

   Booking(String id, String customerName) {
      this.id = id;
      this.customerName = customerName;
   }

   String getId() {
       return id;
   }
   
   String getCustomerName() {
       return customerName;
   }
}
```

Gegeben ist folgende Klasse `BookingManager`:
```java
class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    void addBooking(Booking booking) {
        if (!bookings.contains(booking)) {
            bookings.add(booking);
        }
    }

    boolean isBookingPresent(String id) {
        return bookings.contains(new Booking(id, ""));
    }

    ArrayList<Booking> getBookings() {
        return bookings;
    }
}
```

**Fehlerbeschreibung:**

- Buchungen mit bereits existierender `id` sollten nicht doppelt gespeichert werden, aber dennoch passiert es.
- `isBookingPresent()` soll überprüfen, ob eine Buchung mit einer bestimmten `id` existiert, aber die Methode gibt
ein falsches Ergebnis zurück.

Die Main-Methode in der Klasse `BookingApp` muss am Ende korrekt funktionieren.