-- 코드를 입력하세요
SELECT BOOK_ID, SUBSTR(PUBLISHED_DATE,1,10) "PUBLISHED_DATE"
FROM BOOK 
WHERE SUBSTR(PUBLISHED_DATE,1,4) = 2021 AND CATEGORY LIKE "인문"
ORDER BY PUBLISHED_DATE