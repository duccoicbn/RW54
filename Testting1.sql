drop database if exists Testing_System_Assignment_1;
create database Testing_System_Assignment_1;
use Testing_System_Assignment_1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	DepartmentID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	DepartmentName NVARCHAR(30) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Position;
CREATE TABLE `Position` (
	PositionID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	PositionName ENUM('Dev','Test','Scrum Master','PM') NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
		AccountID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
		Email VARCHAR(50) NOT NULL UNIQUE KEY,
		Username VARCHAR(50) NOT NULL UNIQUE KEY,
		FullName NVARCHAR(50) NOT NULL,
		DepartmentID TINYINT UNSIGNED NOT NULL,
		PositionID TINYINT UNSIGNED NOT NULL,
		CreateDate DATETIME,
		FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
		FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
	GroupID		TINYINT UNSIGNED PRIMARY KEY,
    GroupName	VARCHAR(50),
    CreatorID	TINYINT UNSIGNED,
    CreateDate	DATE,
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID)
);
CREATE TABLE GroupAccount (
	GroupID 	TINYINT UNSIGNED PRIMARY KEY,
    AccountID	TINYINT UNSIGNED,
    JoinDate	DATE,
	FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID)
);
CREATE TABLE TypeQuestion (
	TypeID		TINYINT UNSIGNED PRIMARY KEY,
    TypeName	VARCHAR(100)
);
CREATE TABLE CategoryQuestion (
	CategoryID		TINYINT UNSIGNED PRIMARY KEY,
    CategoryName	VARCHAR(100)
);
CREATE TABLE Question (
	QuestionID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Content			VARCHAR(200),
    CategoryID		TINYINT UNSIGNED,
    TypeID			TINYINT UNSIGNED,
    CreatorID		TINYINT UNSIGNED,
    CreateDate		DATE,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountId),
    FOREIGN KEY(TypeID) REFERENCES TypeQuestion(TypeID)
);
CREATE TABLE Answer (
	AnswerID	TINYINT UNSIGNED PRIMARY KEY,
    Content		VARCHAR(200),
    QuestionID	TINYINT UNSIGNED,
    isCorrect	ENUM('DUNG','SAI'),
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
);
CREATE TABLE Exam (
	ExamID		TINYINT UNSIGNED PRIMARY KEY,
    Code		VARCHAR(20),
    Title		VARCHAR(50),
    CategoryID	TINYINT UNSIGNED,
    Duration	TIME,
    CreatorID	TINYINT UNSIGNED,
    CreteDate	DATE,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
	FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountId)
);
CREATE TABLE ExamQuestion (
	ExamID		TINYINT UNSIGNED NOT NULL,
    QuestionID	TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
	FOREIGN KEY(ExamID) REFERENCES Exam(ExamID) ,
	PRIMARY KEY (ExamID,QuestionID)
);

-- inserts data
INSERT INTO Department(DepartmentName)
VALUES
		(N'Marketing' ),
		(N'Sale' ),
		(N'B???o v???' ),
		(N'Nh??n s???' ),
		(N'K??? thu???t' ),
		(N'T??i ch??nh' ),
		(N'Ph?? gi??m ?????c'),
		(N'Gi??m ?????c' ),
		(N'Th?? k??' ),
		(N'No person' ),
		(N'B??n h??ng' );
        
INSERT INTO Position (PositionName )
VALUES ('Dev' ),('Test' ),('Scrum Master'),('PM' );

INSERT INTO `Account`(Email , Username, FullName , DepartmentID , PositionID, CreateDate)
VALUES 	('Email1@gmail.com' ,'Username1' ,'Fullname1' , '5' , '1','2020-03-05'),
		('Email2@gmail.com' ,'Username2' ,'Fullname2' , '1' , '2','2020-03-05'),
		('Email3@gmail.com' , 'Username3' ,'Fullname3', '2' , '2' ,'2020-03-07'),
		('Email4@gmail.com' , 'Username4' ,'Fullname4', '3' , '4' ,'2020-03-08'),
		('Email5@gmail.com' , 'Username5' ,'Fullname5', '4' , '4' ,'2020-03-10'),
		('Email6@gmail.com' , 'Username6' ,'Fullname6', '6' , '3' ,'2020-04-05'),
		('Email7@gmail.com' , 'Username7' ,'Fullname7', '2' , '2' , NULL ),
		('Email8@gmail.com' , 'Username8' ,'Fullname8', '8' , '1' ,'2020-04-07'),
		('Email9@gmail.com' , 'Username9' ,'Fullname9', '2' , '2' ,'2020-04-07'),
		('Email10@gmail.com' , 'Username10' ,'Fullname10', '10' , '1' ,'2020-04-09'),
		('Email11@gmail.com' , 'Username11' ,'Fullname11', '10' , '1' , DEFAULT),
		('Email12@gmail.com' , 'Username12','Fullname12' , '10' , '1' , DEFAULT);
        
        
INSERT INTO `Group` ( GroupName , CreatorID , CreateDate)
VALUES	(N'Testing System' , 5,'2019-03-05'),
		(N'Development' , 1,'2020-03-07'),
		(N'VTI Sale 01' , 2 ,'2020-03-09'),
		(N'VTI Sale 02' , 3 ,'2020-03-10'),
		(N'VTI Sale 03' , 4 ,'2020-03-28'),
		(N'VTI Creator' , 6 ,'2020-04-06'),
		(N'VTI Marketing 01' , 7 ,'2020-04-07'),
		(N'Management' , 8 ,'2020-04-08'),
		(N'Chat with love' , 9 ,'2020-04-09'),
		(N'Vi Ti Ai' , 10 ,'2020-04-10');
INSERT INTO GroupAccount ( GroupID , AccountID , JoinDate )
VALUES 	( 1 , 1, '2019-03-05'),
		( 1 , 2,'2020-03-07'),
		( 3 , 3,'2020-03-09'),
		( 3 , 4,'2020-03-10'),
        ( 5 , 5,'2020-03-28'),
		( 1 , 3,'2020-04-06'),
		( 1 , 7,'2020-04-07'),
		( 8 , 3,'2020-04-08'),
		( 1 , 9,'2020-04-09'),
		( 10 , 10,'2020-04-10');

INSERT INTO TypeQuestion (TypeName )
VALUES 	('Essay' ),
		('Multiple-Choice' );

INSERT INTO CategoryQuestion (CategoryName )
VALUES 	('Java' ),
		('ASP.NET' ),
		('ADO.NET' ),
		('SQL' ),
		('Postman' ),
		('Ruby' ),
		('Python' ),
		('C++' ),
		('C Sharp' ),
		('PHP' );

INSERT INTO Question (Content , CategoryID, TypeID , CreatorID, CreateDate )
VALUES 	(N'C??u h???i v??? Java' , 1 , '1' , '2' ,'2020-04-05'),
		(N'C??u H???i v??? PHP' , 10 , '2' , '2' ,'2020-04-05'),
		(N'H???i v??? C#' , 9 , '2' , '3' ,'2020-04-06'),
		(N'H???i v??? Ruby' , 6 , '1' , '4' ,'2020-04-06'),
		(N'H???i v??? Postman' , 5 , '1' , '5' ,'2020-04-06'),
		(N'H???i v??? ADO.NET' , 3 , '2' , '6' ,'2020-04-06'),
		(N'H???i v??? ASP.NET' , 2 , '1' , '7' ,'2020-04-06'),
		(N'H???i v??? C++' , 8 , '1' , '8' ,'2020-04-07'),
		(N'H???i v??? SQL' , 4 , '2' , '9' ,'2020-04-07'),
		(N'H???i v??? Python' , 7 , '1' , '10' ,'2020-04-07');

INSERT INTO Answer ( Content , QuestionID , isCorrect )
VALUES 	(N'Tr??? l???i 01' , 1 , 0),
		(N'Tr??? l???i 02' , 1 , 1),
		(N'Tr??? l???i 03', 1 , 0 ),
		(N'Tr??? l???i 04', 1 , 1 ),
		(N'Tr??? l???i 05', 2 , 1 ),
		(N'Tr??? l???i 06', 3 , 1 ),
		(N'Tr??? l???i 07', 4 , 0 ),
		(N'Tr??? l???i 08', 8 , 0 ),
		(N'Tr??? l???i 09', 9 , 1 ),
		(N'Tr??? l???i 10', 10 , 1 );

INSERT INTO Exam (Code , Title , CategoryID, Duration , CreatorID , CreateDate )
VALUES 	('VTIQ001' , N'????? thi C#' , 1 , 60 , '5' ,'2019-04-05'),
		('VTIQ002' , N'????? thi PHP' , 10 , 60 , '2' ,'2019-04-05'),
		('VTIQ003' , N'????? thi C++' , 9 , 120 , '2' ,'2019-04-07'),
		('VTIQ004' , N'????? thi Java' , 6 , 60 , '3' ,'2020-04-08'),
		('VTIQ005' , N'????? thi Ruby' , 5 , 120 , '4' ,'2020-04-10'),
		('VTIQ006' , N'????? thi Postman' , 3 , 60 , '6' ,'2020-04-05'),
		('VTIQ007' , N'????? thi SQL' , 2 , 60 , '7' ,'2020-04-05'),
		('VTIQ008' , N'????? thi Python' , 8 , 60 , '8' ,'2020-04-07'),
		('VTIQ009' , N'????? thi ADO.NET' , 4 , 90 , '9' ,'2020-04-07'),
		('VTIQ010' , N'????? thi ASP.NET' , 7 , 90 , '10' ,'2020-04-08');

INSERT INTO ExamQuestion(ExamID , QuestionID )
VALUES 	( 1 , 5 ),
		( 2 , 10 ),
		( 3 , 4 ),
		( 4 , 3 ),
		( 5 , 7 ),
		( 6 , 10 ),
		( 7 , 2 ),
		( 8 , 10 ),
		( 9 , 9 ),
		( 10 , 8 );