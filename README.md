# medERP

MedERP is a medical ERP desktop application you can use to manage emloyees - clients - facturations - etc...

### DataBase

usign a `maria-db` database i created thoes tables

#### Users

| id                  | username        | nom            | prenom          | password        | role         | specialite      |
| ------------------- | --------------- | -------------- | --------------- | --------------- | ------------ | --------------- |
| INT `AUTOINCREMENT` | Varchar`100`    | Varchar`100`   | Varchar`100`    | Varchar`100`    | Varchar`100` | Varchar`100`    |
| User Identifier     | User Identifier | User Last Name | User First Name | User Password   | User Role    | User Speciality |

#### Clients

| id                  | nom              | prenom            | cin          | sexe                      | email         | phone        |
| ------------------- | ---------------- | ----------------- | ------------ | ------------------------- | ------------- | ------------ |
| INT `AUTOINCREMENT` | Varchar`100`     | Varchar`100`      | Varchar`100` | Varchar`100`              | Varchar`100`  | Varchar`100` |
| User Identifier     | Client Last Name | Client First Name | Client CIN   | Male/Female/Not Specified | Email address | Phone number |

#### Assurances

| id                  | Nom          |
| ------------------- | ------------ |
| INT `AUTOINCREMENT` | Varchar`100` |
| identifier          | Company Name |

#### Medicines

| id                  | Nom           |
| ------------------- | ------------- |
| INT `AUTOINCREMENT` | Varchar`100`  |
| identifier          | Medicine Name |

#### Apointments

| id                     | client    | datetimestamp                  | description   |
|------------------------|-----------|--------------------------------|---------------|
| INT `AUTOINCREMENT`    | INT       | TIMESTAMP                      | VARCHAR       |
| appointment identifier | client id | date & time of the appointment | a description |

### User Interfaces

#### Login
<img src="https://cdn.discordapp.com/attachments/752833198211334206/803610918088343563/Screenshot_2021-01-26_at_14.06.02.png">

#### Main app
<img src="https://cdn.discordapp.com/attachments/752833198211334206/803610418853445652/Screenshot_2021-01-26_at_13.50.38.png">

<img src="https://cdn.discordapp.com/attachments/752833198211334206/803610419326746634/Screenshot_2021-01-26_at_13.53.11.png">

<img src="https://cdn.discordapp.com/attachments/752833198211334206/803610422171009024/Screenshot_2021-01-26_at_13.54.40.png">

<img src="https://cdn.discordapp.com/attachments/752833198211334206/803610423655661658/Screenshot_2021-01-26_at_14.00.26.png">

<p align="center">Made with 💙 for 3 billions devices</p>
