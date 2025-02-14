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

Verwende den korrekten Zugriffsmodifikator - `package-private` - und schreibe die Methode als Prozedur.

## Teilbereich 2 - TODO (40 Punkte)

### Aufgabe 4: Implementiere die Klasse `TextAnalyzer` (10 Punkte)

Schreibe eine Klasse `TextAnalyzer` mit folgender Methode:

```java
static int countVowels(String text) {}
```

- Die Methode zählt und gibt zurück, wie viele Vokale (`a`, `e`, `i`, `o`, `u`) insgesamt im übergebenen Text enthalten
sind. Es wird dabei nicht zwischen Groß- und Kleinschreibung unterschieden, sondern zusammengezählt.
- Falls ...
  - `null`
  - ein leerer String (`""`)
  - ein String mit einem Leerzeichen (`" "`)
- übergeben wird, soll -1 zurückgegeben werden.

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

