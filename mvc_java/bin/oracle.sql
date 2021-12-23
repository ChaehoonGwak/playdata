SELECT *
FROM DEPARTMENTS;

SELECT *
FROM	COUNTRIES;

CREATE TABLE USER_TBL(
	ID 		VARCHAR2(50) PRIMARY KEY,
	PWD 	VARCHAR2(50) NOT NULL,
	NAME 	VARCHAR2(50) NOT NULL,
	POINT 	NUMBER 		 DEFAULT 1000
);

SELECT *
FROM USER_TBL	;



SELECT 	*
FROM	USER_TBL 
WHERE	ID = ? AND PWD = ? ; 

INSERT INTO USER_TBL
VALUES (?,?,?,?) ;

UPDATE 	USER_TBL 
SET		POINT = ?  
WHERE	ID = ? ; 

DELETE 	FROM USER_TBL
WHERE	ID = ? ; 

DELETE FROM USER_TBL
WHERE ID = 'admin';

CREATE TABLE BBS_TBL(
	SEQ		NUMBER 	PRIMARY KEY,
	SUBJECT VARCHAR2(50),
	CONTENT	VARCHAR2(1000),
	WRITER	VARCHAR2(50),
	REGDATE	DATE,
	VIEWCNT	NUMBER
);

CREATE SEQUENCE BBS_SEQ	;

INSERT INTO BBS_TBL
VALUES(BBS_SEQ.NEXTVAL , '공지', '냉무', 'chgwak' , sysdate , 0)

SELECT *
FROM BBS_TBL;

UPDATE BBS_TBL
SET VIEWCNT = VIEWCNT + 1
WHERE SEQ = 22;