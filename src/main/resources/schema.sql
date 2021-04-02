create TABLE Billett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR (100) NOT NULL,
    antall INTEGER (3) NOT NULL,
    fornavn VARCHAR (60) NOT NULL,
    etternavn VARCHAR (70) NOT NULL,
    telefonNr INTEGER (8) NOT NULL,
    epost VARCHAR (60) NOT NULL,
    PRIMARY KEY (id)
);