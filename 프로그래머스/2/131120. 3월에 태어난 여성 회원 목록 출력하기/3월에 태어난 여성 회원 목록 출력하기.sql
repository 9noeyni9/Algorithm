-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, SUBSTR(DATE_OF_BIRTH,1,10)
FROM MEMBER_PROFILE
WHERE GENDER = "W" AND SUBSTR(DATE_OF_BIRTH,6,2) = "03" AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC
