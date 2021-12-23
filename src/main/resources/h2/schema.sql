DROP TABLE IF EXISTS USER;
CREATE TABLE USER(
    email VARCHAR(30) PRIMARY KEY,
    id INT,
    userType VARCHAR(30),
    createdAt DATE,
    updatedAt DATE
);

DROP TABLE IF EXISTS DISPATCH;
CREATE TABLE DISPATCH(
    ID INTEGER PRIMARY KEY,
    ADDRESS VARCHAR(50),
    DRIVERID INT,
    PASSENGERID INT,
    STATUS VARCHAR(8),
    ACCEPTEDAT DATE,
    CREATEDAT DATE,
    UPDATEDAT DATE,
    FOREIGN KEY (DRIVERID) REFERENCES USER(ID),
    FOREIGN KEY (PASSENGERID) REFERENCES USER(ID)
);
