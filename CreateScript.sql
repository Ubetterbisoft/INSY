DROP DATABASE IF EXISTS Autos;
CREATE DATABASE Autos;
USE Autos;

CREATE  TABLE Autos.Typ(
    bezeichung VARCHAR(10),
    marke VARCHAR(20),
    leistung INTEGER,
    PRIMARY KEY (bezeichung)
);

CREATE TABLE Autos.Auto (
    kennzeichen VARCHAR(20),
    baujahr YEAR,
    bezeichnung VARCHAR(10),
    PRIMARY KEY (kennzeichen),
    FOREIGN KEY (bezeichnung) REFERENCES Typ(bezeichung)

);