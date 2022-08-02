create database if not exists Testing_System_Assignment_1;
use Testing_System_Assignment_1;
CREATE TABLE Department(
	DeparmentID 	INT,
    DeparmentName 	VARCHAR(50)
);

CREATE TABLE Position1(
	PositionID 		INT,
    PositionName 	VARCHAR(50)
);

CREATE TABLE Account(
	AccountID 		INT,
    Email			VARCHAR(100),
    Username		VARCHAR(100),
    FullName		VARCHAR(100),
    DepartmentID	INT,
    PositionID		INT,
    CreateDate		DATE
);
CREATE TABLE Group1(
	GroupID		INT,
    GroupName	VARCHAR(50),
    CreatorID	INT,
    CreateDate	DATE
);
CREATE TABLE GroupAccount(
	GroupID 	INT,
    AccountID	INT,
    JoinDate	DATE
);
CREATE TABLE TypeQuestion(
	TypeID		INT,
    TypeName	VARCHAR(100)
);
CREATE TABLE CategoryQuestion(
	CategoryID		INT,
    CategoryName	VARCHAR(100)
);
CREATE TABLE Question(
	QuestionID 		INT,
    Content			VARCHAR(200),
    CategoryID		INt,
    TypeID			INT,
    CreatorID		INT,
    CreateDate		DATE
);
CREATE TABLE Answer(
	AnswerID	INT,
    Content		VARCHAR(200),
    QuestionID	INT,
    isCorrect	ENUM('DUNG','SAI')
);
CREATE TABLE Exam(
	ExamID		INT,
    Code		VARCHAR(20),
    Title		VARCHAR(50),
    CategoryID	INT,
    Duration	TIME,
    CreatorID	INT,
    CreteDate	DATE
);
CREATE TABLE ExamQuestion(
	ExamID		INT,
    QuestionID	INT
);