
/*==============================================================*/
/* Table: t_custorageomer                                       */
/*==============================================================*/
create table t_custorageomer
(
  custorageomer_id     varchar(36) not null,
  custorageomer_name   varchar(50),
  custorageomer_idcard varchar(18),
  custorageomer_tel    varchar(12)
);

alter table t_custorageomer comment '顾客表';

alter table t_custorageomer
  add primary key (custorageomer_id);

/*==============================================================*/
/* Table: t_department                                          */
/*==============================================================*/
create table t_department
(
  department_id        varchar(36) not null,
  department_name      varchar(50)
);

alter table t_department comment '部门';

alter table t_department
  add primary key (department_id);

/*==============================================================*/
/* Table: t_employee                                            */
/*==============================================================*/
create table t_employee
(
  employee_id          varchar(36) not null,
  employee_name        varchar(50),
  employee_sex         int,
  employee_birthday    date,
  department_name      varchar(100),
  department_id        varchar(36),
  employee_idcard      varchar(18),
  employee_temployeenm varchar(15)
);

alter table t_employee comment '员工表';

alter table t_employee
  add primary key (employee_id);

/*==============================================================*/
/* Table: t_goods                                               */
/*==============================================================*/
create table t_goods
(
  goods_id             varchar(36) not null,
  goods_number         varchar(36),
  goods_name           varchar(100),
  goodtype_id          varchar(36),
  goods_price          decimal,
  goods_lowstorage     int,
  goods_topstorage     int,
  storageorage_name    varchar(100),
  goods_remark         varchar(500)
);

alter table t_goods
  add primary key (goods_id);

/*==============================================================*/
/* Table: t_goodtype                                            */
/*==============================================================*/
create table t_goodtype
(
  goodtype_id          varchar(36) not null,
  goodtype_name        varchar(50)
);

alter table t_goodtype comment '商品类型表';

alter table t_goodtype
  add primary key (goodtype_id);

/*==============================================================*/
/* Table: t_provide                                             */
/*==============================================================*/
create table t_provide
(
  goods_id             varchar(36),
  goods_name           varchar(50),
  providecmp_id        varchar(36),
  providecmp_name      varchar(100),
  provide_id           varchar(36) not null
);

alter table t_provide comment '供应表';

alter table t_provide
  add primary key (provide_id);

/*==============================================================*/
/* Table: t_providecmp                                          */
/*==============================================================*/
create table t_providecmp
(
  providecmp_id        varchar(36) not null,
  providecmp_number    varchar(36),
  providecmp_name      varchar(100),
  providecmp_adress    varchar(200),
  providecmp_person    varchar(50),
  providecmp_tel       varchar(12)
);

alter table t_providecmp comment '供应商';

alter table t_providecmp
  add primary key (providecmp_id);

/*==============================================================*/
/* Table: t_semployeel                                          */
/*==============================================================*/
create table t_semployeel
(
  semployeel_id        varchar(36) not null,
  goods_id             varchar(36),
  goods_name           varchar(50),
  goods_number         varchar(36),
  semployeel_number    varchar(36),
  semployeel_date      datetime,
  employee_number      varchar(36),
  custorageomer_id     varchar(36),
  semployeel_num       int,
  semployeel_price_total decimal
);

alter table t_semployeel comment '销售表';

alter table t_semployeel
  add primary key (semployeel_id);

/*==============================================================*/
/* Table: t_storageock                                          */
/*==============================================================*/
create table t_storageock
(
  storageock_id        varchar(36) not null,
  goods_id             varchar(36),
  goods_name           varchar(50),
  goods_price          decimal,
  employee_id          varchar(36),
  employee_name        varchar(50),
  storageock_num       int,
  storageock_price_total decimal
);

alter table t_storageock comment '采购表';

alter table t_storageock
  add primary key (storageock_id);

/*==============================================================*/
/* Table: t_storageorage                                        */
/*==============================================================*/
create table t_storageorage
(
  storageorage_id      varchar(36) not null,
  storageorage_name    varchar(100)
);

alter table t_storageorage
  add primary key (storageorage_id);

/*==============================================================*/
/* Table: t_storageore                                          */
/*==============================================================*/
create table t_storageore
(
  storageore_id        varchar(36) not null,
  goods_id             varchar(36),
  goods_number         varchar(36),
  goods_name           varchar(50),
  goods_num            int
);

alter table t_storageore comment '库存表';

alter table t_storageore
  add primary key (storageore_id);

/*==============================================================*/
/* Table: t_user_info                                           */
/*==============================================================*/
create table t_user_info
(
  user_id              varchar(36) not null,
  username             varchar(50),
  password             varchar(100)
);

alter table t_user_info
  add primary key (user_id);
