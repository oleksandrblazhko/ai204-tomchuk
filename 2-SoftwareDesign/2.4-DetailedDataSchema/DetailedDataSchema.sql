DROP TABLE roles CASCADE;
DROP TABLE danceType CASCADE;
DROP TABLE group CASCADE;
DROP TABLE user CASCADE;
DROP TABLE userCard CASCADE;
DROP TABLE healthcondition CASCADE;

CREATE TABLE roles(
    idRoles INT PRIMARY KEY,
    roleName VARCHAR
);

CREATE TABLE danceType(
    idDance INT PRIMARY KEY,
    typeName VARCHAR
);

CREATE TABLE group(
    idGroup INT PRIMARY KEY,
    groupName VARCHAR,
    types VARCHAR,
);

CREATE TABLE user(
    idUser INT PRIMARY KEY,
    role_id INT REFERENCES roles(idRoles),
    userName VARCHAR,
    surname VARCHAR,
    balance DECIMAL(10,2),
    gender VARCHAR CHECK(GENDER in ('Male', 'Female', 'Unknown')),
    weights DECIMAL(10,2),
    heights DECIMAL(10,2),
    profession VARCHAR,
    dance_id INT REFERENCES danceType(idDance),
    about_me VARCHAR,
    interests VARCHAR,
    group_id INT REFERENCES group(idGroup),
    email VARCHAR CHECK(email ~* '^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$') UNIQUE,
	mobile VARCHAR CHECK (mobile ~* '^\+?3?8?(0[\s\.-]\d{2}[\s\.-]\d{3}[\s\.-]\d{2}[\s\.-]\d{2})$')
);

CREATE TABLE userCard(
    idCard INT REFERENCES user(idUser),
    PRIMARY KEY(idCard)
);

CREATE TABLE healthcondition(
    idHC INT PRIMARY KEY,
    calories DECIMAL(10,2),
    pulse DECIMAL(10,2),
    pace DECIMAL(10,2),
    pressure DECIMAL(10,2),
    dated DATE,
    card_id INT REFERENCES userCard(idCard)
);