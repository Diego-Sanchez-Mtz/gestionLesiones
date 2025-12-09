CREATE TABLE tPersona (
    idPersona SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellidoPaterno VARCHAR(50) NOT NULL,
    apellidoMaterno VARCHAR(50),
    fechaNacimiento DATE NOT NULL,
    telefono VARCHAR(15),
    correo VARCHAR(80)
);

CREATE TABLE tDoctor (
    idDoctor INT PRIMARY KEY,
    cedulaProfesional VARCHAR(20) NOT NULL,
    CONSTRAINT fk_doctor_persona 
    FOREIGN KEY (idDoctor) REFERENCES tPersona(idPersona)
    ON DELETE CASCADE
);

CREATE TABLE tJugadora (
    idJugadora INT PRIMARY KEY,
    posicion VARCHAR(50),
    CONSTRAINT fk_jugadora_persona 
    FOREIGN KEY (idJugadora) REFERENCES tPersona(idPersona)
    ON DELETE CASCADE
);

CREATE TABLE tTerapeuta (
    idTerapeuta INT PRIMARY KEY,
    especialidad VARCHAR(50),
    CONSTRAINT fk_terapeuta_persona 
    FOREIGN KEY (idTerapeuta) REFERENCES tPersona(idPersona)
    ON DELETE CASCADE
);

CREATE TYPE TipoLesion AS ENUM (
    'Fractura',
    'Esguince',
    'Tendinitis',
    'Sobrecarga muscular',
    'Hiperextensión',
    'Rotura de ligamento',
    'Contusión',
	'Desgarre muscular'
);

CREATE TYPE ZonaLesion AS ENUM (
    'Tobillo','Rodilla','Muslo','Espalda baja','Hombro','Pie','Pierna',
    'Cadera','Dedo del pie','Brazo','Codo','Antebrazo','Muñeca','Mano',
    'Dedo del la mano','Cuello','Espalda alta','Abdomen'
);

CREATE TABLE tLesion (
    idLesion SERIAL PRIMARY KEY,
    idJugadora INT NOT NULL,
    idDoctor INT NOT NULL,
    fechaInicio DATE NOT NULL,
    fechaAlta DATE,
    semanasRecuperacion INT,
    estado BOOLEAN NOT NULL,
    tipoLesion TipoLesion NOT NULL,
    zonaLesion ZonaLesion NOT NULL,
    CONSTRAINT fk_lesion_jugadora 
    FOREIGN KEY (idJugadora) REFERENCES tJugadora(idJugadora),
    CONSTRAINT fk_lesion_doctor 
    FOREIGN KEY (idDoctor) REFERENCES tDoctor(idDoctor)
);

CREATE TABLE tRehabilitacion (
    idRehabilitacion SERIAL PRIMARY KEY,
    idLesion INT NOT NULL,
    sesionesRealizadas INT,
    fechaInicio DATE,
    fechaFinal DATE,
    completada BOOLEAN,
    CONSTRAINT fk_rehab_lesion 
    FOREIGN KEY (idLesion) REFERENCES tLesion(idLesion)
);

CREATE TABLE tTratamiento (
    idTratamiento SERIAL PRIMARY KEY,
    idRehabilitacion INT NOT NULL,
    idTerapeuta INT NOT NULL,
    nombreTratamiento VARCHAR(100),
    descripcionTratamiento TEXT,
    fechaInicio DATE,
	fechaFin DATE,
    sesionesRequeridas INT,
    CONSTRAINT fk_tratamiento_rehab 
    FOREIGN KEY (idRehabilitacion) REFERENCES tRehabilitacion(idRehabilitacion),
    CONSTRAINT fk_tratamiento_terapeuta 
    FOREIGN KEY (idTerapeuta) REFERENCES tTerapeuta(idTerapeuta)
);

CREATE TABLE tSesion(
	idSesion SERIAL PRIMARY KEY,
	idTratamiento INT NOT NULL,
	idJugadora INT NOT NULL,
	fechaSesion DATE,
	observaciones TEXT,
	completada BOOLEAN,
	CONSTRAINT fk_sesion_jugadora 
	FOREIGN KEY(idJugadora) REFERENCES tJugadora(idJugadora),
	CONSTRAINT fk_sesion_tratamiento
	FOREIGN KEY(idTratamiento) REFERENCES tTratamiento(idTratamiento)
);