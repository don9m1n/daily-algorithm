/*
	SET으로 사용자 지정 변수를 만들 수 있음
	:=, =으로 변수에 값을 넣을 수 있고 :=로 쓰는 게 구분하기 편함
*/

SET @hour := -1;

SELECT (@hour := @hour + 1) as HOUR,
    (SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23;