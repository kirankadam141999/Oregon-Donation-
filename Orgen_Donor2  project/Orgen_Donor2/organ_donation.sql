-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 21, 2021 at 12:01 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `organ_donation`
--

-- --------------------------------------------------------

--
-- Table structure for table `donar_data`
--

CREATE TABLE `donar_data` (
  `Donar_Name` text NOT NULL,
  `Donae_Age` text NOT NULL,
  `Donar_Address` text NOT NULL,
  `Donar_Email` text NOT NULL,
  `Donar_ConactNumber` text NOT NULL,
  `Donar_Gender` text NOT NULL,
  `DHeart` text NOT NULL,
  `DLiver` text NOT NULL,
  `DKidney` text NOT NULL,
  `DEye` text NOT NULL,
  `DBlood` text NOT NULL,
  `DBlood_Group` text NOT NULL,
  `Ddisease` text NOT NULL,
  `Date_of_FormSubmit` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user` text NOT NULL,
  `password` text NOT NULL,
  `date and time` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
