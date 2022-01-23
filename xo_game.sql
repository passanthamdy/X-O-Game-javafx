-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 23, 2022 at 11:00 PM
-- Server version: 8.0.27-0ubuntu0.20.04.1
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `xo_game`
--

-- --------------------------------------------------------

--
-- Table structure for table `Game`
--

CREATE TABLE `Game` (
  `game_id` int NOT NULL,
  `player1` int NOT NULL,
  `player2` int NOT NULL,
  `winner` enum('0','1','2') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Player`
--

CREATE TABLE `Player` (
  `player_id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `total_games` int NOT NULL,
  `score` int NOT NULL,
  `status` enum('on','off','ongame') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Player`
--

INSERT INTO `Player` (`player_id`, `username`, `password`, `total_games`, `score`, `status`) VALUES
(1, 'newplayer', '0123456', 3, 30, 'on');

-- --------------------------------------------------------

--
-- Table structure for table `RecordedGames`
--

CREATE TABLE `RecordedGames` (
  `game_id` int NOT NULL,
  `player_id` int NOT NULL,
  `steps` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Game`
--
ALTER TABLE `Game`
  ADD PRIMARY KEY (`game_id`),
  ADD KEY `player1` (`player1`),
  ADD KEY `Fk` (`player2`);

--
-- Indexes for table `Player`
--
ALTER TABLE `Player`
  ADD PRIMARY KEY (`player_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `RecordedGames`
--
ALTER TABLE `RecordedGames`
  ADD PRIMARY KEY (`game_id`,`player_id`),
  ADD KEY `player_id` (`player_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Game`
--
ALTER TABLE `Game`
  ADD CONSTRAINT `Fk` FOREIGN KEY (`player2`) REFERENCES `Player` (`player_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Game_ibfk_1` FOREIGN KEY (`player1`) REFERENCES `Player` (`player_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `RecordedGames`
--
ALTER TABLE `RecordedGames`
  ADD CONSTRAINT `RecordedGames_ibfk_1` FOREIGN KEY (`game_id`) REFERENCES `Game` (`game_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `RecordedGames_ibfk_2` FOREIGN KEY (`player_id`) REFERENCES `Player` (`player_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
