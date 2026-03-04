INSERT INTO spaces
(name, description, price, rules)
VALUES
('Cosy Cottage', 'A lovely, cosy cottage overlooking the rolling hills of the Cotswolds', 250, 'No smoking'),
('London Penthouse', 'Swanky London penthouse overlooking the river Thames', 600, 'No hen/stag parties'),
('Brighton Lighthouse', 'Popular lighthouse stay on Brighton beach', 550, 'No drinking'),
('Forest Treehouse', 'Relive childhood memories in this fun forest treehouse', 220, 'No smoking'),
('Manchester Townhouse', 'Tastefully decorated townhouse in central Manchester', 300, 'No noise after 11pm');

INSERT INTO bookings
(start_date, end_date, space_id)
VALUES
('2026-03-15', '2026-03-18', 1),
('2026-04-01', '2026-04-04', 2),
('2026-05-05', '2026-05-10', 3),
('2026-03-12', '2026-03-20', 4),
('2026-04-01', '2026-04-12', 5),
('2026-06-05', '2026-06-10', 2);
