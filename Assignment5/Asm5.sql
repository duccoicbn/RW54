-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
DROP VIEW IF EXISTS DSNV_Sale;
CREATE VIEW DSNV_Sale AS
SELECT A.AccountID, A.Email, A.Username, A.FullName, D.DepartmentName
FROM `Account` A
JOIN Department D ON A.DepartmentID = D.DepartmentID
WHERE D.DepartmentName = (
							SELECT DepartmentName FROM Department
							WHERE DepartmentName = 'Sale'
);

SELECT * FROM DSNV_Sale;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
DROP VIEW IF EXISTS GetAccount;
CREATE VIEW GetAccount AS
-- tao cte lay danh sach account
WITH CTE_GetListCountAccount AS(
	SELECT count(GA1.AccountID) AS countGA1 FROM GroupAccount GA1
	GROUP BY GA1.AccountID
)
SELECT A.AccountID, A.Username, count(GA.AccountID) AS SL FROM GroupAccount GA
JOIN `Account` A ON GA.AccountID = A.AccountID
GROUP BY GA.AccountID
HAVING count(GA.AccountID) = (
SELECT MAX(countGA1) AS maxCount FROM CTE_GetListCountAccount
);
SELECT * FROM GetAccount;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
DROP VIEW IF EXISTS ContenLonHon300;
CREATE VIEW ContenLonHon300 AS
SELECT * FROM Question
WHERE LENGTH(Content) > 300;

-- Xóa content
DELETE FROM ContenLonHon300;
SELECT * FROM ContenLonHon300;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
DROP VIEW IF EXISTS MaxNV;
CREATE VIEW MaxNV AS
WITH CTE_countDepID AS ( SELECT count(A1.DepartmentID) AS countDep_ID 
                         FROM `Account` A1
						 GROUP BY A1.DepartmentID)
SELECT D.DepartmentName, count(A.DepartmentID) AS SL
FROM `Account` A
JOIN Department D ON D.DepartmentID = A.DepartmentID
GROUP BY A.DepartmentID
HAVING count(A.DepartmentID) = (
					SELECT MAX(countDEP_ID) AS maxDep_ID 
						FROM CTE_countDepID);

SELECT * FROM MaxNV;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
DROP VIEW IF EXISTS Que5;
CREATE VIEW Que5 AS
SELECT Q.CategoryID, Q.Content, A.FullName AS Creator FROM Question Q
JOIN `Account` A ON A.AccountID = Q.CreatorID
WHERE SUBSTRING_INDEX( A.FullName, ' ', 1 ) = 'Nguyễn';
SELECT * FROM Que5;