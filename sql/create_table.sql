create table Usager (
    id int(11) primary key auto_increment,
    code varchar(255) unique,
    nom varchar(255) not null,
    prenom varchar(255) not null,
    dateNaissance Date
) engine=InnoDB;
