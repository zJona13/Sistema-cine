CREATE TABLE USUARIO (
  idUsuario        INTEGER NOT NULL, 
  nombre           VARCHAR(100) NOT NULL, 
  apellidos        VARCHAR(100) NOT NULL, 
  email            VARCHAR(50) NOT NULL UNIQUE, 
  celular          CHAR(9) NOT NULL, 
  contraseña       VARCHAR(15) NOT NULL, 
  tipoDocIdentidad VARCHAR(30) NOT NULL, 
  nroDocIdentidad  VARCHAR(15) NOT NULL, 
  idDistrito       INTEGER NOT NULL, 
  sexo             VARCHAR(12) NOT NULL, 
  fechaNac         DATE NOT NULL, 
  idTipoUsuario    INTEGER NOT NULL, 
  idTipoSocio      INTEGER NOT NULL,
  PRIMARY KEY (idUsuario));

CREATE TABLE DEPARTAMENTO (
  idDpto SERIAL NOT NULL, 
  nombre VARCHAR(50) NOT NULL, 
  PRIMARY KEY (idDpto));
  
CREATE TABLE PROVINCIA (
  idProvincia SERIAL NOT NULL, 
  nombre      VARCHAR(50) NOT NULL, 
  idDpto      INTEGER NOT NULL, 
  PRIMARY KEY (idProvincia));
  
CREATE TABLE DISTRITO (
  idDistrito  SERIAL NOT NULL, 
  nombre      VARCHAR(50) NOT NULL, 
  idProvincia INTEGER NOT NULL, 
  PRIMARY KEY (idDistrito));
  
CREATE TABLE TIPO_SOCIO (
  idTipoSocio SERIAL NOT NULL, 
  nombre      VARCHAR(25) NOT NULL, -- Clasico, Plata, Oro y Black
  PRIMARY KEY (idTipoSocio));

CREATE TABLE CINE (
  idCine     INTEGER NOT NULL, 
  nombre     VARCHAR(50) NOT NULL, 
  direccion  VARCHAR(100) NOT NULL, 
  cantSalas  SMALLINT NOT NULL, 
  tipoSalas  VARCHAR(30) NOT NULL, 
  idDistrito INTEGER NOT NULL, 
  PRIMARY KEY (idCine));
  
CREATE TABLE TIPO_TARIFA (
  idTipoTarifa SERIAL NOT NULL, 
  nombre       VARCHAR(30) NOT NULL, -- General, Niño, Adulto, etc.
  PRIMARY KEY (idTipoTarifa));

CREATE TABLE TIPO_TARIFA_CINE (
  idTipoTarifa INTEGER NOT NULL, 
  idCine       INTEGER NOT NULL, 
  precioActual NUMERIC(9, 2) NOT NULL, 
  PRIMARY KEY (idTipoTarifa, 
  idCine));
  
CREATE TABLE SALA (
  idSala INTEGER NOT NULL, 
  nombre VARCHAR(10) NOT NULL, 
  idCine INTEGER NOT NULL, 
  PRIMARY KEY (idSala));
  
CREATE TABLE ASIENTOS (
  idAsiento    INTEGER NOT NULL, 
  idSala       INTEGER NOT NULL, 
  nombre       VARCHAR(5) NOT NULL, 
  cantAsientos SMALLINT NOT NULL, 
  estado       VARCHAR(35) NOT NULL, 
  PRIMARY KEY (idAsiento, 
  idSala));
  
CREATE TABLE PELICULA (
  idPelicula    INTEGER NOT NULL, 
  nombre        VARCHAR(100) NOT NULL, 
  idGenero      INTEGER NOT NULL, 
  duracionHoras VARCHAR(10) NOT NULL, 
  aptoPara      VARCHAR(25) NOT NULL, 
  sipnosis      VARCHAR(150) NOT NULL, 
  director      VARCHAR(100) NOT NULL, 
  vigente       BOOLEAN NOT NULL, 
  PRIMARY KEY (idPelicula));

CREATE TABLE CARTELERA (
  idCartelera INTEGER NOT NULL, 
  fecha       DATE NOT NULL, 
  idPelicula  INTEGER NOT NULL, 
  idFormato   INTEGER NOT NULL, 
  idIdioma    INTEGER NOT NULL, 
  horaInicio  TIME NOT NULL, 
  idSala      INTEGER NOT NULL, 
  PRIMARY KEY (idCartelera));
  
CREATE TABLE ENTRADAS (
  idEntrada   INTEGER NOT NULL, 
  idCartelera INTEGER NOT NULL, 
  idSala      INTEGER NOT NULL, 
  idAsiento   INTEGER NOT NULL, 
  estado      VARCHAR(50) NOT NULL, 
  PRIMARY KEY (idEntrada));
  
CREATE TABLE VENTA (
  idVenta   SERIAL NOT NULL, 
  fechaHora TIMESTAMP NOT NULL, 
  estado    VARCHAR(50) NOT NULL, -- Cancelado, Completado, etc.
  idUsuario INTEGER NOT NULL, 
  PRIMARY KEY (idVenta));
  
CREATE TABLE COMPROBANTE_PAGO (
  idComprobante SERIAL NOT NULL, 
  tipo          VARCHAR(20) NOT NULL, 
  numero        VARCHAR(15) NOT NULL, 
  fechaHora     TIMESTAMP NOT NULL, 
  estado        BOOLEAN NOT NULL, 
  IGV           NUMERIC(8, 2) NOT NULL, 
  total         NUMERIC(9, 2) NOT NULL, 
  idVenta       INTEGER NOT NULL, 
  idUsuario     INTEGER NOT NULL, 
  idFormaPago   INTEGER NOT NULL, 
  PRIMARY KEY (idComprobante));
  
CREATE TABLE FORMA_PAGO (
  idFormaPago SERIAL NOT NULL, 
  nombre      VARCHAR(30) NOT NULL, 
  PRIMARY KEY (idFormaPago));
  
CREATE TABLE DETALLE_VENTA (
  idVenta      INTEGER NOT NULL, 
  idEntrada    INTEGER NOT NULL, 
  idCine       INTEGER NOT NULL, 
  idTipoTarifa INTEGER NOT NULL, 
  cantEntradas SMALLINT NOT NULL, 
  precioVenta  NUMERIC(9, 2) NOT NULL, 
  PRIMARY KEY (idVenta, 
  idEntrada));
  
CREATE TABLE GENERO_PELICULA (
  idGenero SERIAL NOT NULL, 
  nombre   VARCHAR(25) NOT NULL, -- Drama, Comedia, etc.
  PRIMARY KEY (idGenero));
  
CREATE TABLE IDIOMA (
  idIdioma SERIAL NOT NULL, 
  nombre   VARCHAR(25) NOT NULL, -- Doblada, Subtitulada, etc
  PRIMARY KEY (idIdioma));
  
CREATE TABLE FORMATO (
  idFormato SERIAL NOT NULL, 
  nombre    VARCHAR(15) NOT NULL, -- 2D, 3D, etc.
  PRIMARY KEY (idFormato));
  
CREATE TABLE FORMATO_PELICULA (
  idIdioma   INTEGER NOT NULL, 
  idPelicula INTEGER NOT NULL, 
  idFormato  INTEGER NOT NULL, 
  PRIMARY KEY (idIdioma, 
  idPelicula, 
  idFormato));
  
CREATE TABLE TIPO_USUARIO (
  idTipoUsuario SERIAL NOT NULL, 
  nombre        VARCHAR(50) NOT NULL, -- Cliente y Administrador. 
  PRIMARY KEY (idTipoUsuario));
  
CREATE TABLE PRODUCTO (
  idProducto  INTEGER NOT NULL, 
  nombre      VARCHAR(100) NOT NULL, 
  descripcion VARCHAR(255) NOT NULL, 
  precio      NUMERIC(9, 2) NOT NULL, 
  PRIMARY KEY (idProducto));
  
CREATE TABLE DETALLE_PRODUCTO_VENTA (
  idVenta        INTEGER NOT NULL, 
  idProducto     INTEGER NOT NULL, 
  cantidad       SMALLINT NOT NULL, 
  precioUnitario NUMERIC(9, 2) NOT NULL, 
  total          NUMERIC(9, 2) NOT NULL, 
  PRIMARY KEY (idVenta, 
  idProducto));
  
ALTER TABLE PROVINCIA ADD CONSTRAINT FKPROVINCIA512913 FOREIGN KEY (idDpto) REFERENCES DEPARTAMENTO (idDpto);
ALTER TABLE DISTRITO ADD CONSTRAINT FKDISTRITO667807 FOREIGN KEY (idProvincia) REFERENCES PROVINCIA (idProvincia);
ALTER TABLE USUARIO ADD CONSTRAINT FKUSUARIO832246 FOREIGN KEY (idDistrito) REFERENCES DISTRITO (idDistrito);
ALTER TABLE USUARIO ADD CONSTRAINT FKUSUARIO579741 FOREIGN KEY (idTipoSocio) REFERENCES TIPO_SOCIO (idTipoSocio);
ALTER TABLE CINE ADD CONSTRAINT FKCINE902126 FOREIGN KEY (idDistrito) REFERENCES DISTRITO (idDistrito);
ALTER TABLE TIPO_TARIFA_CINE ADD CONSTRAINT FKTIPO_TARIF767004 FOREIGN KEY (idTipoTarifa) REFERENCES TIPO_TARIFA (idTipoTarifa);
ALTER TABLE TIPO_TARIFA_CINE ADD CONSTRAINT FKTIPO_TARIF637412 FOREIGN KEY (idCine) REFERENCES CINE (idCine);
ALTER TABLE SALA ADD CONSTRAINT FKSALA667526 FOREIGN KEY (idCine) REFERENCES CINE (idCine);
ALTER TABLE ASIENTOS ADD CONSTRAINT FKASIENTOS511015 FOREIGN KEY (idSala) REFERENCES SALA (idSala);
ALTER TABLE CARTELERA ADD CONSTRAINT FKCARTELERA487927 FOREIGN KEY (idSala) REFERENCES SALA (idSala);
ALTER TABLE VENTA ADD CONSTRAINT FKVENTA256959 FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario);
ALTER TABLE COMPROBANTE_PAGO ADD CONSTRAINT FKCOMPROBANT633248 FOREIGN KEY (idVenta) REFERENCES VENTA (idVenta);
ALTER TABLE COMPROBANTE_PAGO ADD CONSTRAINT FKCOMPROBANT813112 FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario);
ALTER TABLE COMPROBANTE_PAGO ADD CONSTRAINT FKCOMPROBANT116096 FOREIGN KEY (idFormaPago) REFERENCES FORMA_PAGO (idFormaPago);
ALTER TABLE ENTRADAS ADD CONSTRAINT FKENTRADAS902144 FOREIGN KEY (idAsiento, idSala) REFERENCES ASIENTOS (idAsiento, idSala);
ALTER TABLE DETALLE_VENTA ADD CONSTRAINT FKDETALLE_VE33731 FOREIGN KEY (idVenta) REFERENCES VENTA (idVenta);
ALTER TABLE PELICULA ADD CONSTRAINT FKPELICULA340687 FOREIGN KEY (idGenero) REFERENCES GENERO_PELICULA (idGenero);
ALTER TABLE FORMATO_PELICULA ADD CONSTRAINT FKFORMATO_PE269177 FOREIGN KEY (idIdioma) REFERENCES IDIOMA (idIdioma);
ALTER TABLE FORMATO_PELICULA ADD CONSTRAINT FKFORMATO_PE286621 FOREIGN KEY (idPelicula) REFERENCES PELICULA (idPelicula);
ALTER TABLE FORMATO_PELICULA ADD CONSTRAINT FKFORMATO_PE518949 FOREIGN KEY (idFormato) REFERENCES FORMATO (idFormato);
ALTER TABLE CARTELERA ADD CONSTRAINT FKCARTELERA846976 FOREIGN KEY (idIdioma, idPelicula, idFormato) REFERENCES FORMATO_PELICULA (idIdioma, idPelicula, idFormato);
ALTER TABLE ENTRADAS ADD CONSTRAINT FKENTRADAS134829 FOREIGN KEY (idCartelera) REFERENCES CARTELERA (idCartelera);
ALTER TABLE DETALLE_VENTA ADD CONSTRAINT FKDETALLE_VE737441 FOREIGN KEY (idTipoTarifa, idCine) REFERENCES TIPO_TARIFA_CINE (idTipoTarifa, idCine);
ALTER TABLE USUARIO ADD CONSTRAINT FKUSUARIO875353 FOREIGN KEY (idTipoUsuario) REFERENCES TIPO_USUARIO (idTipoUsuario);
ALTER TABLE DETALLE_VENTA ADD CONSTRAINT FKDETALLE_VE949623 FOREIGN KEY (idEntrada) REFERENCES ENTRADAS (idEntrada);
ALTER TABLE DETALLE_PRODUCTO_VENTA ADD CONSTRAINT FKDETALLE_PR648023 FOREIGN KEY (idVenta) REFERENCES VENTA (idVenta);
ALTER TABLE DETALLE_PRODUCTO_VENTA ADD CONSTRAINT FKDETALLE_PR763025 FOREIGN KEY (idProducto) REFERENCES PRODUCTO (idProducto);

-- INSERT TIPO DE SOCIOS
INSERT INTO TIPO_SOCIO (nombre) VALUES ('Clasico'), ('Plata'), ('Oro'), ('Black');

-- INSERT TIPO DE USUARIO
INSERT INTO TIPO_USUARIO (nombre) VALUES ('Administrador'), ('Cliente');

-- INSERT DEPARTAMENTO
INSERT INTO DEPARTAMENTO (nombre) VALUES ('Lima');

-- INSERT PROVINCIA
INSERT INTO PROVINCIA (nombre, idDpto) VALUES ('Lima', 1), ('Surco', 1), ('San Isidro', 1);

-- INSERT DISTRITO
INSERT INTO DISTRITO (nombre, idProvincia) VALUES ('Miraflores', 1), ('Santiago de Surco', 2), ('San Isidro', 3);

-- INSERT USUARIO

INSERT INTO USUARIO (
  idUsuario, nombre, apellidos, email, celular, contraseña, tipoDocIdentidad, nroDocIdentidad, 
  idDistrito, sexo, fechaNac, idTipoUsuario, idTipoSocio
) 
VALUES (
  1, 'Jonatan', 'Ching', 'admin@gmail.com', '987654321', '123', 'DNI', '12345678', 
  (SELECT idDistrito FROM DISTRITO WHERE nombre = 'San Isidro'), 
  'Masculino', '2003-05-13', 
  (SELECT idTipoUsuario FROM TIPO_USUARIO WHERE nombre = 'Administrador'), 
  (SELECT idTipoSocio FROM TIPO_SOCIO WHERE nombre = 'Black')
);

INSERT INTO USUARIO (
  idUsuario, nombre, apellidos, email, celular, contraseña, tipoDocIdentidad, nroDocIdentidad, 
  idDistrito, sexo, fechaNac, idTipoUsuario, idTipoSocio
) 
VALUES (
  2, 'Rodrigho', 'Pupuche', 'cliente1@gmail.com', '147852369', '123', 'DNI', '78456123', 
  (SELECT idDistrito FROM DISTRITO WHERE nombre = 'San Isidro'), 
  'Masculino', '2003-05-10', 
  (SELECT idTipoUsuario FROM TIPO_USUARIO WHERE nombre = 'Cliente'), 
  (SELECT idTipoSocio FROM TIPO_SOCIO WHERE nombre = 'Clasico')
);

-- INSERT PRODUCTOS
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (002, 'Combo 1 salado OL CC', '1 Canchita gigante(salada) + 2 Bebidas(32oz)', 50);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (003, 'Combo 3 mixto OL CC', '1 Canchita gigante(mixta) + 2 Bebidas(32oz)', 52);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (004, 'Combo Familiar OL CC', '2 Canchitas grandes(salada y dulce) + 4 Bebidas(32oz)', 95);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (005, 'Combo Nachos OL CC', 'Nachos con queso y jalapeños + 2 Bebidas(32oz)', 49);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (006, 'Combo Hot Dog OL CC', 'Hot Dog grande con papas + 1 Bebida(32oz)', 37);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (007, 'Combo Chicha Morada OL CC', 'Vaso grande de chicha morada con refill + 1 Canchita chica(salada)', 20);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (008, 'Combo Bebida OL CC', '2 Gaseosas grandes(32oz) con refill', 24);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (009, 'Combo Nachos + Gaseosa OL CC', 'Nachos con queso + 1 Gaseosa grande(32oz)', 45);
INSERT INTO producto (idproducto, nombre, descripcion, precio) VALUES (010, 'Combo Canchita y Gaseosa OL CC', 'Canchita gigante(dulce o salada) + 1 Gaseosa grande(32oz)', 55);

-- INSERT GENERO_PELICULA
INSERT INTO GENERO_PELICULA (nombre) VALUES ('Acción'), ('Comedia'), ('Drama'), ('Fantasía'), ('Terror'), ('Suspenso'), ('Aventura'), ('Romance');
