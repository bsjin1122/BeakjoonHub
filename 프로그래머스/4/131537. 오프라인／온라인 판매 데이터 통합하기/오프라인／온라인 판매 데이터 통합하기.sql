 (SELECT DATE_FORMAT(sales_date, "%Y-%m-%d") SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
 FROM ONLINE_SALE
 WHERE DATE_FORMAT(sales_date, "%Y-%m") = "2022-03")

 UNION

 (SELECT DATE_FORMAT(sales_date, "%Y-%m-%d") SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT 
 FROM OFFLINE_SALE
 WHERE DATE_FORMAT(sales_date, "%Y-%m") = "2022-03")
 ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;

 # TO_CHAR(SALES_DATE,'YYYY-MM-DD')
 # EXTRACT(MONTH FROM SALES_DATE) = 3

# (SELECT DATE_FORMAT(sales_date, "%Y-%m-%d") sales_date,
#     product_id,
#     user_id,
#     sales_amount
# FROM online_sale
# WHERE DATE_FORMAT(sales_date, "%Y-%m") = "2022-03")

# UNION

# (SELECT DATE_FORMAT(sales_date, "%Y-%m-%d") sales_date,
#     product_id,
#     NULL AS user_id,
#     sales_amount
# FROM offline_sale
# WHERE DATE_FORMAT(sales_date, "%Y-%m") = "2022-03")
# ORDER BY sales_date, product_id, user_id