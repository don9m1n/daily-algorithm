/*
	CASE ~ THEN 문법: JAVA의 if ~ else 문법과 비슷하다고 생각!!
	CASE 
	WHEN '조건1' THEN '결과1'
	WHEN '조건2' THEN '결과2'
	ELSE '결과3'
	END
*/

SELECT ANIMAL_ID, NAME,
    (CASE 
    WHEN SEX_UPON_INTAKE  LIKE 'Intact%' THEN 'X'
    ELSE 'O'
    END) AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID