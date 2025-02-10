# Harmonia App

## Kontext

Du bist Junior Java-Softwareentwickler bei der Firma Harmonia. Harmonia ist ein Unternehmen, das sich auf die
Entwicklung von Software für die Musikindustrie spezialisiert hat. Harmonia hat eine App entwickelt, die es Musikern
ermöglicht, ihre Musik zu veröffentlichen und zu streamen. Die App ist bereits auf dem Markt und wird von vielen
Musikern genutzt. Harmonia hat dich beauftragt, an der App zu arbeiten und neue Funktionen hinzuzufügen.

## Aufgaben

### Aufgabe 1: Implementiere die Klasse `Genre`

Erstelle die Klasse `Genre`. Ein `Genre` kann die folgenden Werte annehmen: `ROCK`, `POP`, `HIPHOP`, `JAZZ`,
`CLASSICAL`.

### Aufgabe 2: Implementiere die Klassen `Song`

Erstelle die Klasse `Song`. Ein `Song` hat die folgenden Eigenschaften: `songName`, `duration`, `genre`,
`mode`, `key`, `timeSignature` und `tempo`. Die Eigenschaft `genre` ist ein `Enum`, die `duration` ist ein `double` und
das `tempo` ist ein `int`. Alle anderen Eigenschaften sind vom Typ `String`.

Der Konstruktor der Klasse `Song` initialisiert jede Eigenschaft.

Lege zu jeder Eigenschaft eine entsprechende Setter- und Getter-Methode an.

### Aufgabe 3: Implementiere die Klasse `Album`

Erstelle die Klasse `Album`. Ein `Album` hat die folgenden Eigenschaften: `albumName` und `songs`. `albumName` ist dabei
ein `String` und `songs` ist eine `ArrayList` von `Song`-Objekten. Der Konstruktor der Klasse `Album` initialisiert
beide Variablen. Lege außerdem zu beiden Variablen entsprechende Setter- und Getter-Methoden an.

### Aufgabe 4: Erweitere die Klasse `Song`

Erweitere die Klasse `Song` um die Methode `play()`. Die Methode `play()` gibt den Text
`Playing a <genre> song: <songName>`

Zudem benötigt die Klasse `Song` eine Überschreibung der Methode `toString()`. Ergänze diese Methode dementsprechend.

### Aufgabe 5: Erweitere die Klasse `Album`

Die Klasse `Album` benötigt eine Methode `addSong`, welche als Parameter ein `Song`-Objekt erwartet und dieses der Liste
`songs` hinzufügt. Des Weiteren benötigt die Methode eine Prüfung, ob die Liste bereits initialisiert wurde. Falls
nicht, soll die Liste initialisiert werden.

### Aufgabe 6: Implementiere die Klasse `LiveSong`

Erstelle die Klasse `LiveSong`. Ein `LiveSong` ist ein spezieller `Song`, der zusätzlich die Eigenschaft `location` hat.
Die Eigenschaft `location` ist vom Typ `String`. Der Konstruktor der Klasse `LiveSong` initialisiert jede vererbte und
eigene Eigenschaft. Lege zu jeder Eigenschaft eine entsprechende Setter- und Getter-Methode an.

Die Klasse `LiveSong` benötigt eine Überschreibung der Methode `play()`. Die Methode `play()` gibt den Text
`Playing <songName> live at <location>`. Ergänze die Methode dementsprechend.

### Aufgabe 7: Lege das Interface `Searchable` an

Erstelle das Interface `Searchable`. Das Interface hat die folgenden Methoden:

- `ArrayList<Song> search(String keyword)`
-
`ArrayList<Song> findSuitableSongs(String genre, double duration, String key, String mode, String timeSignature, int tempo, String location)`
- `Song randomSong()`

### Aufgabe 8: Implementiere das Interface `Searchable`

Implementiere das Interface `Searchable` durch die Klasse `HarmoniaSearchable`. Beachte dabei folgende Anforderungen:

- Die Methode `search` gibt eine Liste von Songs zurück, die den Suchbegriff enthalten. Groß- oder Kleinschreibung soll
  dabei keine Rolle spielen.
- Die Methode `findSuitableSongs` gibt eine Liste von Songs zurück, die den übergebenen Kriterien entsprechen. Die
  Methode soll dabei alle Kriterien berücksichtigen, die nicht `null` sind.
- Die Methode `randomSong` gibt einen zufälligen Song zurück.

Ferner sollen zwei weitere Methoden implementiert werden, welche `createMixTape` heißen. Der Zugriffsmodifikator soll
`protected` sein. Die Methode `createMixTape` soll eine Liste von Songs zurückgeben. Die erste Methode nimmt die
Parameter `minTempo`, `maxTempo`, `baseSignature` und `numSongs` entgegen. Die zweite Methode nimmt die so eben
erwähnten Parameter sowie den Parameter `duration` entgegen.

---
Was als Transfer-Aufgabe?