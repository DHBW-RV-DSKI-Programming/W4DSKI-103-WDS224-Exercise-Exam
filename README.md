# Harmonia App

## Kontext

Du bist Junior Java-Softwareentwickler bei der Firma *Harmonia*. *Harmonia* ist ein Unternehmen, das sich auf die
Entwicklung von Software für die Musikindustrie spezialisiert hat. Das Unternehmen hat eine App entwickelt, die es
Musikern ermöglicht, ihre Musik zu veröffentlichen und zu streamen. Die App ist bereits auf dem Markt und wird von
vielen Musikern genutzt. *Harmonia* hat dich beauftragt, an der App zu arbeiten und neue Funktionen hinzuzufügen.

## Teilbereich 1

### Aufgabe 1: Implementiere die Klasse `Genre`

Erstelle die Enum-Klasse mit dem Namen `Genre`. Ein Genre kann die folgenden Werte annehmen:

- `ROCK`
- `POP`
- `HIPHOP`
- `CLASSICAL`

Achte auf die korrekte Schreibweise. Da der Enum im gleichen Paket weiter genutzt wird, soll der Zugriffsmodifikator
`package-private` verwendet werden.

### Aufgabe 2: Implementiere die Klasse `Song`

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

### Aufgabe 3: Erweitere die Klasse `Album`

Füge der Klasse `Album` - bereits angelegt - die Methode mit der Signatur `addSong(Song song)` hinzu. Diese Methode:

- Erwartet ein `Song`-Objekt als Parameter und fügt es zur Liste `songs` hinzu.
- Prüft, ob die Liste `songs` bereits initialisiert wurde, und initialisiert sie gegebenenfalls.

Verwende den korrekten Zugriffsmodifikator - `package-private` - und schreibe die Methode als Prozedur.