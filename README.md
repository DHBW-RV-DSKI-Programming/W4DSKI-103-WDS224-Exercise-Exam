# Harmonia App

## Kontext

Du bist Junior Java-Softwareentwickler bei der Firma *Harmonia*. *Harmonia* ist ein Unternehmen, das sich auf die
Entwicklung von Software für die Musikindustrie spezialisiert hat. Das Unternehmen hat eine App entwickelt, die es
Musikern ermöglicht, ihre Musik zu veröffentlichen und zu streamen. Die App ist bereits auf dem Markt und wird von
vielen Musikern genutzt. *Harmonia* hat dich beauftragt, an der App zu arbeiten und neue Funktionen hinzuzufügen.

## Aufgaben

### Aufgabe 1: Implementiere die Klasse `Genre`

Erstelle die Klasse `Genre`. Ein `Genre` kann die folgenden Werte annehmen:

- `ROCK`
- `POP`
- `HIPHOP`
- `JAZZ`
- `CLASSICAL`

### Aufgabe 2: Implementiere die Klasse `Song`

Erstelle die Klasse `Song` mit den folgenden Eigenschaften:

- `songName` (`String`)
- `duration` (`double`)
- `genre` (`Genre`-Enum)
- `mode` (`String`)
- `key` (`String`)
- `timeSignature` (`String`)
- `tempo` (`int`)

Der Konstruktor der Klasse `Song` initialisiert jede dieser Eigenschaften.
Zusätzlich sind zu jeder Eigenschaft entsprechende Getter- und Setter-Methoden zu implementieren.

### Aufgabe 3: Implementiere die Klasse `Album`

Erstelle die Klasse `Album` mit den folgenden Eigenschaften:

- `albumName` (`String`)
- `songs` (`ArrayList<Song>`)

Der Konstruktor der Klasse `Album` initialisiert beide Variablen. Zudem sind zu beiden Variablen die entsprechenden
Getter- und Setter-Methoden anzulegen.

### Aufgabe 4: Erweitere die Klasse `Song`

Erweitere die Klasse `Song` um:

- Die Methode `play()`, die den Text `Playing a <genre> song: <songName>` ausgibt.
- Eine Überschreibung der Methode `toString()`, um eine sinnvolle Zeichenkettenrepräsentation des Objekts
  bereitzustellen.

### Aufgabe 5: Erweitere die Klasse `Album`

Füge der Klasse `Album` die Methode `addSong(Song song)` hinzu. Diese Methode:

- Erwartet ein `Song`-Objekt als Parameter und fügt es zur Liste `songs` hinzu.
- Prüft, ob die Liste bereits initialisiert wurde, und initialisiert sie gegebenenfalls.

### Aufgabe 6: Implementiere die Klasse `LiveSong`

Erstelle die Klasse `LiveSong`, die von `Song` erbt und zusätzlich die Eigenschaft `location` (`String`) besitzt.

- Der Konstruktor initialisiert sowohl die geerbten als auch die neue Eigenschaft.
- Implementiere die entsprechenden Getter- und Setter-Methoden.
- Überschreibe die Methode `play()`, sodass sie den Text `Playing <songName> live at <location>` ausgibt.

### Aufgabe 7: Lege das Interface `Searchable` an

Erstelle das Interface `Searchable` mit den folgenden Methoden:

- `ArrayList<Song> search(String keyword)`
-
`ArrayList<Song> findSuitableSongs(String genre, double duration, String key, String mode, String timeSignature, int tempo, String location)`
- `Song randomSong()`

### Aufgabe 8: Implementiere das Interface `Searchable`

Implementiere das Interface `Searchable` durch die Klasse `HarmoniaSearchable` mit den folgenden Anforderungen:

- `search(String keyword)`: Gibt eine Liste von Songs zurück, die den Suchbegriff enthalten (Groß-/Kleinschreibung soll
  ignoriert werden).
- `findSuitableSongs(...)`: Gibt eine Liste von Songs zurück, die den übergebenen Kriterien entsprechen. Alle nicht-
  `null`-Kriterien sollen berücksichtigt werden.
- `randomSong()`: Gibt einen zufälligen Song zurück.

Zusätzlich sind zwei `protected` Methoden namens `createMixTape` zu implementieren:

- `createMixTape(int minTempo, int maxTempo, String baseSignature, int numSongs)`: Gibt eine Liste von Songs zurück, die
  innerhalb der angegebenen Tempo- und Taktart-Bereiche liegen.
- `createMixTape(int minTempo, int maxTempo, String baseSignature, int numSongs, double duration)`: Erweiterung der
  obigen Methode mit der Möglichkeit, eine maximale Dauer für das Mixtape anzugeben.

---
Was als Transfer-Aufgabe?