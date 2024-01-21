import psycopg2

con = None  # Initialize con to None

try:
    # Establish a connection to the PostgreSQL database
    con = psycopg2.connect(
        host='localhost',
        port='5432',
        user='postgres',
        password='Zomato@247',
        database='demo'
    )

    # Create a cursor to interact with the database
    cursor = con.cursor()

    # Execute the SQL query
    cursor.execute("SELECT * FROM bookings.personinfo WHERE Name='Abhisek'")

    # Fetch all rows from the result set
    rows = cursor.fetchall()

    # Print the result
    print(rows)

except psycopg2.Error as e:
    print("Error:", e)

finally:
    # Close the cursor and the connection
    if cursor:
        cursor.close()
    if con:
        con.close()
