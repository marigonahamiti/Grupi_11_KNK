-- Database: `hotel_management`
--

-- --------------------------------------------------------

--
--
create database hotel_managment;
use  hotel_managment;
drop table bills;
create TABLE `bills` (
  `billID` int(50) NOT NULL,
  `reservationID` int(50) NOT NULL,
  `billDate` date NOT NULL,
  `billAmount` int(50) NOT NULL
);
select * from bills;
--
--

insert into `bills` (`billID`, `reservationID`, `billDate`, `billAmount`) values
(1, 2, '2021-12-12', 33000);
-- --------------------------------------------------------

--
--
drop table customers;

create TABLE `customers` (
  `customerIDNumber` int(50) NOT NULL,
  `customerName` varchar(50) NOT NULL,
  `customerNationality` varchar(20) NOT NULL,
  `customerGender` varchar(10) NOT NULL,
  `customerPhoneNo` int(50) NOT NULL,
  `customerEmail` varchar(50) NOT NULL
)
--
--

insert into `customers` (`customerIDNumber`, `customerName`, `customerNationality`, `customerGender`, `customerPhoneNo`, `customerEmail`) values
(422510092, 'Test', 'Kosovo', 'Female', 97938274, 'm3000@gmail.com'),
(255100992, 'Test1', 'Kosovo', 'Female', 97938274, 'm3000@gmail.com'),
(355184941, 'Test2', 'Kosovo', 'Female', 97938274, 'm3000@gmail.com');
-- --------------------------------------------------------
select * from customers;
--
-- Table structure for table `reservations`
--
drop table reservations
create TABLE `reservations` (
  `reservationID` int(50) NOT NULL,
  `customerIDNumber` int(10) NOT NULL,
  `roomNumber` varchar(20) NOT NULL,
  `checkInDate` date NOT NULL,
  `checkOutDate` date NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT 'Checked In'
) 

--
--
select * from reservations;
insert into `reservations` (`reservationID`, `customerIDNumber`, `roomNumber`, `checkInDate`, `checkOutDate`, `status`) values
(1, 422510092, '100', '2021-12-01', '2021-12-14', 'Checked In'),
(2, 255100992, '303', '2021-12-01', '2021-12-12', 'Checked Out'),
(3, 355184941, '202', '2021-12-01', '2021-12-13', 'Checked In');
-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

create TABLE `rooms` (
  `roomNumber` varchar(20) NOT NULL,
  `roomType` varchar(50) NOT NULL,
  `price` int(20) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'Not Booked'
) 

--
--

insert into `rooms` (`roomNumber`, `roomType`, `price`, `status`) values
('100', 'Single', 1000, 'Booked'),
('101', 'Double', 1500, 'Not Booked'),
('102', 'Single', 1000, 'Booked'),
('200', 'Family', 3000, 'Not Booked'),
('201', 'Luxury', 5000, 'Not Booked'),
('202', 'Double', 1500, 'Booked'),
('301', 'Luxury', 5000, 'Not Booked'),
('302', 'Luxury', 5000, 'Not Booked'),
('303', 'Family', 3000, 'Not Booked'),
('401', 'Single', 1000, 'Not Booked'),
('402', 'Double', 1000, 'Not Booked'),
('501', 'Suite', 10000, 'Not Booked'),
('502', 'Suite', 10000, 'Not Booked'),
('701', 'Double', 1500, 'Not Booked');

select * from rooms;
drop table rooms
-- --------------------------------------------------------

--
-- Table structure for table `users`
--
drop table users
create TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `securityQuestion` varchar(100) NOT NULL,
  `answer` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `status` varchar(20) DEFAULT NULL
) 
drop table users;
select * from users;
--

--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`billID`),
  ADD UNIQUE KEY `fk_bills_res` (`reservationID`) USING BTREE;

-
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customerIDNumber`);

-
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservationID`),
  ADD KEY `fk_customers_res` (`customerIDNumber`),
  ADD KEY `fk_rooms_res` (`roomNumber`);

--

--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`roomNumber`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `billID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `reservationID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE users ALTER COLUMN id SET DEFAULT 0;

ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bills`
--
ALTER TABLE `bills`
  ADD CONSTRAINT `fk_bills_res` FOREIGN KEY (`reservationID`) REFERENCES `reservations` (`reservationID`) ON update CASCADE;

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `fk_customers_res` FOREIGN KEY (`customerIDNumber`) REFERENCES `customers` (`customerIDNumber`) ON update CASCADE,
  ADD CONSTRAINT `fk_rooms_res` FOREIGN KEY (`roomNumber`) REFERENCES `rooms` (`roomNumber`) ON update CASCADE;
COMMIT;

