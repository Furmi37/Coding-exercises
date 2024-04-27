package com.furmi.katas;

public class SQLquerries {

    /*BooksThatAreAlwaysBeingReturned

    SELECT b.book_id, b.title
    FROM books b
    JOIN loans l
    ON b.book_id = l.book_id
    WHERE b.book_id NOT IN (SELECT book_id FROM loans WHERE return_date IS NULL)
    GROUP BY b.book_id ORDER BY b.book_id DESC;

    */

    /* Q Sum of triangular numbers
    SELECT n, CASE                                  --Case much like a Switch Statement in other languages
            WHEN n > 0 THEN ((n*(n+1)*(n+2))/6) --Sum of Triangular Numbers Equation
            ELSE 0                              --Constraint for Negative Numbers
          END AS res                            --Casting to Column res
       FROM sumtriangular;
     */
}
