# Videothek

| Objekttyp    | Attribut                                                     | key           |
| ------------ | ------------------------------------------------------------ | ------------- |
| Kunde        | Kundennummer, Adresse, Name                                  | Pin-Code      |
| Filme        | Speicherformat (DVD,Video), Filmtitel, Spieldauer, Name des Verleihers | Artikelnummer |
| Kategorien   | Science fiction, Heimatfilm, Kriegsfilm, Komödie             | nr            |
| Tarife       | Aktion, Standard, Aktuell                                    | nr            |
| Schauspieler | Name, Geb dat                                                | Name          |
|              |                                                              |               |



| Objekttypen | Verbindungssätze                                             | Kardinalität |
| ----------- | ------------------------------------------------------------ | ------------ |
| Kunde, Film | Ein Film kann von vielen Kunden ausgeliehen werden. Ein Film kann auch mehrmals pro Tag verliehen werde | 1:m          |
| Tarif, film | Ein Tarif kann für mehrere Filme gelten                      | 1:m          |
|             |                                                              |              |

