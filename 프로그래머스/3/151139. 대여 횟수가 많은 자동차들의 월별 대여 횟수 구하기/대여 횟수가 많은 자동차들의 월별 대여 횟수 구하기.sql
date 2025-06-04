WITH CarRentalCounts AS (
    SELECT
        CAR_ID,
        TO_CHAR(START_DATE, 'FMMM') AS MONTH_NUM, -- 월만 추출하고 앞의 '0' 제거
        COUNT(HISTORY_ID) AS MONTHLY_RECORDS -- 월별/차량별 대여 횟수
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE
        START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
        AND START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD') -- 10월 31일까지 포함
    GROUP BY
        CAR_ID,
        TO_CHAR(START_DATE, 'FMMM')
),
FrequentCars AS (
    SELECT
        CAR_ID
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE
        START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
        AND START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD')
    GROUP BY
        CAR_ID
    HAVING
        COUNT(HISTORY_ID) >= 5
)
SELECT
    CAST(CRC.MONTH_NUM AS INT) AS MONTH, -- 정렬을 위해 INT 타입으로 변환
    CRC.CAR_ID,
    CRC.MONTHLY_RECORDS AS RECORDS
FROM
    CarRentalCounts CRC
JOIN
    FrequentCars FC ON CRC.CAR_ID = FC.CAR_ID
WHERE
    CRC.MONTHLY_RECORDS > 0 -- 특정 월의 총 대여 횟수가 0인 경우 제외 (사실상 GROUP BY 결과로 0이 나오진 않음)
ORDER BY
    MONTH ASC,
    CAR_ID DESC;