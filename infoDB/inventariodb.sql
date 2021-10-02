CREATE DATABASE TECHNOLOGY;
USE TECHNOLOGY ;

CREATE TABLE  almacenes (
  id_almacen INT NOT NULL,
  nombre_almacen VARCHAR(45) ,
  direccion_almacen VARCHAR(200) ,
  telefono_almacen VARCHAR(45) , 
  PRIMARY KEY (id_almacen)
  );

CREATE TABLE usuarios (
  id_usuario BIGINT NOT NULL,
  nombreCompleto VARCHAR(45) ,
  usuario VARCHAR(45) ,
  contraseña_usuario VARCHAR(45) ,
  genero TinyInt(2),
  perfil_Ususario TinyInt(2),
  PRIMARY KEY (id_usuario)

  );


CREATE TABLE productos (
  id_producto INT NOT NULL,
  descripcion_producto VARCHAR(45) ,
  cantidad_producto INT NOT NULL,
  id_almacen INT NOT NULL,
  PRIMARY KEY (id_producto),
  CONSTRAINT almacenes_id_almacen_FK FOREIGN KEY (id_almacen) REFERENCES almacenes (id_almacen)
   );