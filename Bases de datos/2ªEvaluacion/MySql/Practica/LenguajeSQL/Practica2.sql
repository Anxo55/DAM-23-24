USE dam;

CREATE TABLE libros (
IdLibro INT PRIMARY KEY,
Titulo VARCHAR(50),
IdIdioma INT,
IdEditorial INT,
IdAutor INT,
IdTema INT,
AnhoPublicacion SMALLINT,
DiasMaxPrestamo INT);

CREATE TABLE ejemplares(
IdLibro INT,
IdEjemplar INT PRIMARY KEY,
Ubicacion CHAR(15),
Edicion CHAR(15),
Precio DOUBLE,
Disponible BOOL,
CONSTRAINT PRIMARY KEY (IdLibro) REFERENCES libros);

CREATE TABLE socios(
IdSocio INT PRIMARY KEY,
Nombre VARCHAR(20),
Apellidos VARCHAR(30),
Direccion VARCHAR(50),
Telefono CHAR(9),
Sexo ENUM('Hombre','Mujer'));

CREATE TABLE Prestamos(
IdPrestamo INT PRIMARY KEY,
IdLibro INT,
IdEjemplar INT,
IdSocio INT,
FechaPrestamo DATE,
FechaDevolucion DATE,
Devuelto BOOLEAN);









