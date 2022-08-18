use TestingSystem;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT A.Email, A.Username , A.FullName, D.DepartmentName
FROM `Account` A
INNER JOIN Department D ON A.DepartmentID = D.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `Account`
WHERE CreateDate < '2020-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT A.FullName, A.Email, P.PositionName
FROM `Account` A
INNER JOIN Position P ON A.PositionID = P.PositionID
WHERE P.PositionName = 'Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT * FROM `Account`;
SELECT D.DepartmentName, count(A.DepartmentID) AS SoLuong FROM `Account` A
INNER JOIN department D ON A.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.DepartmentID) >= 3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT EQ.QuestionID, Q.Content , count(EQ.QuestionID) as SL 
from ExamQuestion AS EQ
join Question AS Q
on EQ.QuestionID = Q.QuestionID
GROUP BY EQ.QuestionID
HAVING count(EQ.QuestionID) = (SELECT MAX(countQ) 
			FROM  (SELECT COUNT(EQ.QuestionID) AS countQ FROM ExamQuestion EQ GROUP BY EQ.QuestionID) AS countTable
            );

-- Question 6: Thông kê mỗi Category Question được sử dụng trong bao nhiêu Question
SELECT CQ.CategoryID, CQ.CategoryName, count(Q.CategoryID) FROM CategoryQuestion CQ
JOIN Question Q ON CQ.CategoryID = Q.CategoryID
GROUP BY Q.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT Q.QuestionID, Q.Content, COUNT(EQ.QuestionID) AS 'SoLuong'
FROM Question Q
LEFT JOIN ExamQuestion EQ ON EQ.QuestionID = Q.QuestionID
GROUP BY Q.QuestionID
ORDER BY Q.QuestionID ASC;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT Q.QuestionID, Q.Content, count(A.QuestionID) AS 'SoLanXuatHien' FROM Answer A
INNER JOIN Question Q ON Q.QuestionID = A.QuestionID
GROUP BY A.QuestionID
HAVING count(A.QuestionID) = 
		(	SELECT max(countQues) FROM
			(SELECT count(B.QuestionID) AS countQues FROM Answer B
			GROUP BY B.QuestionID) AS countAnsw
        );
        
-- Question 9: Thống kê số lượng account trong mỗi group
SELECT * FROM `Group`;
SELECT G.GroupID, G.GroupName, COUNT(GA.AccountID) AS 'SoLuong'
FROM GroupAccount GA
JOIN `Group` G ON GA.GroupID = G.GroupID
GROUP BY G.GroupID
ORDER BY G.GroupID ASC;

-- Question 10: Tìm chức vụ có ít người nhất
SELECT P.PositionID, P.PositionName, count( A.PositionID) AS SL FROM account A
INNER JOIN position P ON A.PositionID = P.PositionID
GROUP BY A.PositionID
HAVING count(A.PositionID)= (	SELECT MIN(minP) FROM(
								SELECT count(B.PositionID) AS minP FROM account B
								GROUP BY B.PositionID) AS minPA);
                                
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT D.DepartmentID,D.DepartmentName, p.PositionName, count(P.PositionName) 
FROM `Account` A
INNER JOIN Department D ON A.DepartmentID = D.DepartmentID
INNER JOIN `Position` P ON A.PositionID = P.PositionID
GROUP BY D.DepartmentID, P.PositionID;

-- Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
SELECT Q.QuestionID, Q.Content, A.FullName, TQ.TypeName AS Author, ANS.Content FROM Question Q
INNER JOIN CategoryQuestion CQ ON Q.CategoryID = CQ.CategoryID
INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
INNER JOIN `Account` A ON A.AccountID = Q.CreatorID
INNER JOIN Answer AS ANS ON Q.QuestionID = ANS.QuestionID
ORDER BY Q.QuestionID ASC;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT TQ.TypeID, TQ.TypeName, COUNT(Q.TypeID) AS SL FROM question Q
INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
GROUP BY Q.TypeID;

-- Question 14:Lấy ra group không có account nào
SELECT * FROM `Group` G
LEFT JOIN GroupAccount GA ON G.GroupID = GA.GroupID
WHERE GA.AccountID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT Q.QuestionID, Q.Content FROM Answer Ans
RIGHT JOIN Question Q on Ans.QuestionID = Q.QuestionID
WHERE Ans.AnswerID IS NULL;