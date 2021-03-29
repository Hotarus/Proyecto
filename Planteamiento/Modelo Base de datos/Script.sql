/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     28/03/2021 15:12:40                          */
/*==============================================================*/


drop table if exists Diseno;

drop table if exists Empleado;

drop table if exists Ensambladora;

drop table if exists Pedido;

drop table if exists Proveedor;

drop table if exists Suministro;

drop table if exists Verificador;

drop table if exists pedido_proveedor;

/*==============================================================*/
/* Table: Diseno                                                */
/*==============================================================*/
create table Diseno
(
   idDiseno             numeric(8,0) not null,
   dimenciones          varchar(25) not null,
   bateria              varchar(25) not null,
   procesador           varchar(25) not null,
   pinCarga             varchar(25) not null,
   pinAudifono          varchar(25) not null,
   sistemaOperativo     varchar(25) not null,
   camaraFrontal        varchar(25) not null,
   camaraPosterior      varchar(25) not null,
   giroscopio           varchar(25) not null,
   acelerometro         varchar(25) not null,
   detalles             varchar(50) not null,
   primary key (idDiseno)
);

/*==============================================================*/
/* Table: Empleado                                              */
/*==============================================================*/
create table Empleado
(
   cedula               numeric(10,0) not null,
   nombre               varchar(25) not null,
   apellido             varchar(25) not null,
   telefono             numeric(10,0) not null,
   correo               varchar(25) not null,
   direccion            varchar(25) not null,
   primary key (cedula)
);

/*==============================================================*/
/* Table: Ensambladora                                          */
/*==============================================================*/
create table Ensambladora
(
   idEnsambladora       numeric(8,0) not null,
   nombre               varchar(25) not null,
   direccion            varchar(25) not null,
   telefono             numeric(8,0) not null,
   primary key (idEnsambladora)
);

/*==============================================================*/
/* Table: Pedido                                                */
/*==============================================================*/
create table Pedido
(
   idPedido             numeric(8,0) not null,
   idVerificador        numeric(8,0) not null,
   idEnsambladora       numeric(8,0) not null,
   codigosuministro     numeric(8,0) not null,
   item                 varchar(25) not null,
   cantidad             numeric(8,0) not null,
   fechaCreacion        date not null,
   fechaFinalizacion    date not null,
   primary key (idPedido)
);

/*==============================================================*/
/* Table: Proveedor                                             */
/*==============================================================*/
create table Proveedor
(
   codigoProveedor      numeric(8,0) not null,
   nombre               varchar(25) not null,
   telefono             numeric(8,0) not null,
   ciudad               varchar(25) not null,
   pais                 varchar(25) not null,
   correo               varchar(25) not null,
   primary key (codigoProveedor)
);

/*==============================================================*/
/* Table: Suministro                                            */
/*==============================================================*/
create table Suministro
(
   codigosuministro     numeric(8,0) not null,
   nombre               varchar(25) not null,
   bodega               varchar(25) not null,
   ubicacion            varchar(25) not null,
   descripcion          varchar(25) not null,
   tipo                 varchar(25) not null,
   primary key (codigosuministro)
);

/*==============================================================*/
/* Table: Verificador                                           */
/*==============================================================*/
create table Verificador
(
   idVerificador        numeric(8,0) not null,
   idDiseno             numeric(8,0) not null,
   cedula               numeric(10,0) not null,
   aprobacion           bool not null,
   primary key (idVerificador)
);

/*==============================================================*/
/* Table: pedido_proveedor                                      */
/*==============================================================*/
create table pedido_proveedor
(
   codigoProveedor      numeric(8,0) not null,
   idPedido             numeric(8,0) not null,
   primary key (codigoProveedor, idPedido)
);

alter table Pedido add constraint FK_pedido_ensambladora foreign key (idEnsambladora)
      references Ensambladora (idEnsambladora) on delete restrict on update restrict;

alter table Pedido add constraint FK_pedido_suministro foreign key (codigosuministro)
      references Suministro (codigosuministro) on delete restrict on update restrict;

alter table Pedido add constraint FK_pedido_verificador foreign key (idVerificador)
      references Verificador (idVerificador) on delete restrict on update restrict;

alter table Verificador add constraint FK_Verificador_Empleado foreign key (cedula)
      references Empleado (cedula) on delete restrict on update restrict;

alter table Verificador add constraint FK_verificador_diseno foreign key (idDiseno)
      references Diseno (idDiseno) on delete restrict on update restrict;

alter table pedido_proveedor add constraint FK_pedido_proveedor foreign key (idPedido)
      references Pedido (idPedido) on delete restrict on update restrict;

alter table pedido_proveedor add constraint FK_pedido_proveedor foreign key (codigoProveedor)
      references Proveedor (codigoProveedor) on delete restrict on update restrict;

