CREATE TABLE bookings(
    id SERIAL PRIMARY KEY,
    start_date DATE,
    end_date DATE,
    space_id INT REFERENCES spaces(id)
);