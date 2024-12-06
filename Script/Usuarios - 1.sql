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
