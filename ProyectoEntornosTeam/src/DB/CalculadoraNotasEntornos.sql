CREATE DATABASE calculadoraNotasEntornos
CHARACTER SET utf8 
COLLATE utf8_spanish_ci;

USE calculadoraNotasEntornos;



CREATE TABLE Grupos (
  CodigoGrupo INTEGER AUTO_INCREMENT,
  NombreGrupo VARCHAR(30) NOT NULL,
  PRIMARY KEY (CodigoGrupo)
) ENGINE = innodb;

CREATE TABLE Gruposkk (
  CodigoGrupo INTEGER ,
  NombreGrupo VARCHAR(30) NOT NULL,
  PRIMARY KEY (CodigoGrupo)
) ENGINE = innodb;


CREATE TABLE Alumnos (
  CodigoGrupo INTEGER NOT NULL,
  NIA INTEGER NOT NULL AUTO_INCREMENT,
  Nombre VARCHAR(30) NOT NULL,
  Apellido1 VARCHAR(50) NOT NULL,
  NotaExamenClasico1 FLOAT NOT NULL,
  NotaExamenClasico2 FLOAT NOT NULL,
  NotaExamenClasico3 FLOAT NOT NULL,
  Test1NumPreguntas INTEGER NOT NULL,
  Test1NumAciertos INTEGER NOT NULL,
  Test1NumFallos INTEGER NOT NULL,
  Test1Nota INTEGER NOT NULL,
  Test2NumPreguntas INTEGER NOT NULL,
  Test2NumAciertos INTEGER NOT NULL,
  Test2NumFallos INTEGER NOT NULL,
  Test2Nota INTEGER NOT NULL,
  Trabajo1Estado BOOLEAN NOT NULL,
  Trabajo2Estado BOOLEAN NOT NULL,
  Trabajo3Estado BOOLEAN NOT NULL,
  Trabajo1Retraso BOOLEAN NOT NULL,
  Trabajo2Retraso BOOLEAN NOT NULL,
  Trabajo3Retraso BOOLEAN NOT NULL,
  Trabajo1Penalizacion BOOLEAN NOT NULL,
  Trabajo2Penalizacion BOOLEAN NOT NULL,
  Trabajo3Penalizacion BOOLEAN NOT NULL,
  CONSTRAINT Codigo_Grupo_FK FOREIGN KEY (CodigoGrupo) REFERENCES Grupos (CodigoGrupo),
  PRIMARY KEY (NIA)
) engine=innodb;