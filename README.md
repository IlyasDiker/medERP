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

| id                  | nom              | prenom            | cin          | sex                       | email         | phone        |
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

### User Interfaces

#### Login
<img src="https://media.discordapp.net/attachments/627082450723405855/785562029532512336/unknown.png">

#### Main app
<img src="https://media.discordapp.net/attachments/627082450723405855/785828275225755688/unknown.png?width=742&height=440">

<img src="https://media.discordapp.net/attachments/627082450723405855/791641003638390794/unknown.png?width=834&height=477">

<img src="https://media.discordapp.net/attachments/627082450723405855/791642677241839646/unknown.png?width=831&height=477">

