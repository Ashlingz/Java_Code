-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 21, 2023 at 12:23 PM
-- Server version: 8.0.31
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `carts`
--

DROP TABLE IF EXISTS `carts`;
CREATE TABLE IF NOT EXISTS `carts` (
  `cart_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `qty` int NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`cart_id`),
  KEY `product_id` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(25) CHARACTER SET utf16 COLLATE utf16_general_ci NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_name`) VALUES
(6, 'Skincares'),
(12, 'Shampoo'),
(13, 'Drinks'),
(14, 'Furniture');

-- --------------------------------------------------------

--
-- Table structure for table `imports`
--

DROP TABLE IF EXISTS `imports`;
CREATE TABLE IF NOT EXISTS `imports` (
  `import_id` int NOT NULL AUTO_INCREMENT,
  `total` decimal(10,2) NOT NULL,
  `import_date` date NOT NULL,
  PRIMARY KEY (`import_id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `imports`
--

INSERT INTO `imports` (`import_id`, `total`, `import_date`) VALUES
(87, '192.00', '2023-10-06'),
(88, '192.00', '2023-10-06'),
(89, '128.00', '2023-10-06'),
(90, '160.00', '2023-10-06'),
(91, '890.00', '2023-10-06'),
(92, '700.00', '2023-10-20'),
(93, '0.00', '2023-11-02'),
(94, '0.00', '2023-11-02'),
(95, '46.00', '2023-11-02'),
(96, '200000.00', '2023-11-02'),
(97, '455200.00', '2023-11-02');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `total` decimal(10,2) NOT NULL,
  `order_date` date NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `total`, `order_date`) VALUES
(47, '400.00', '2023-10-05'),
(48, '81.00', '2023-10-06'),
(49, '49.00', '2023-10-06'),
(50, '36.00', '2023-10-06'),
(51, '540.00', '2023-10-20'),
(52, '11072.00', '2023-11-01'),
(53, '126.00', '2023-11-02'),
(54, '82.00', '2023-11-02'),
(55, '2.00', '2023-11-02'),
(56, '8.00', '2023-11-02');

-- --------------------------------------------------------

--
-- Table structure for table `order_cart`
--

DROP TABLE IF EXISTS `order_cart`;
CREATE TABLE IF NOT EXISTS `order_cart` (
  `order_cart_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `qty` int NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY (`order_cart_id`),
  KEY `product_id` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE IF NOT EXISTS `order_detail` (
  `order_detail_id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `product_id` int NOT NULL,
  `qty` int NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY (`order_detail_id`),
  KEY `product_id` (`product_id`),
  KEY `order_id_2` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `order_detail`
--

INSERT INTO `order_detail` (`order_detail_id`, `order_id`, `product_id`, `qty`, `price`, `amount`) VALUES
(29, 47, 16, 12, '60.00', '34.00'),
(30, 48, 10, 9, '9.00', '81.00'),
(31, 49, 14, 7, '7.00', '49.00'),
(32, 50, 10, 6, '6.00', '36.00'),
(33, 51, 17, 12, '45.00', '540.00'),
(34, 52, 14, 23, '2.00', '46.00'),
(35, 52, 10, 12, '2.00', '24.00'),
(36, 52, 18, 23, '5.00', '46.00'),
(37, 52, 17, 54, '1.00', '54.00'),
(38, 52, 19, 6, '567.00', '3402.00'),
(39, 52, 19, 10, '750.00', '7500.00'),
(40, 53, 14, 45, '2.00', '90.00'),
(41, 53, 10, 12, '3.00', '36.00'),
(43, 54, 17, 23, '2.00', '46.00'),
(44, 54, 18, 12, '3.00', '36.00'),
(46, 55, 17, 2, '1.00', '2.00'),
(47, 56, 18, 2, '4.00', '8.00');

-- --------------------------------------------------------

--
-- Table structure for table `order_detail_cart`
--

DROP TABLE IF EXISTS `order_detail_cart`;
CREATE TABLE IF NOT EXISTS `order_detail_cart` (
  `order_detail_carts_id` int NOT NULL AUTO_INCREMENT,
  `total` decimal(10,2) NOT NULL,
  `order_date` date NOT NULL,
  PRIMARY KEY (`order_detail_carts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `category_id` int NOT NULL,
  `product` varchar(25) NOT NULL,
  `qty` int NOT NULL,
  `expire_date` date NOT NULL,
  `created_date` date NOT NULL,
  PRIMARY KEY (`product_id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `category_id`, `product`, `qty`, `expire_date`, `created_date`) VALUES
(10, 6, 'Toner ', 783, '2023-09-30', '2023-09-15'),
(14, 6, 'VitaminC', 998, '2023-09-18', '2023-09-18'),
(16, 14, '2 Ass Sofa', 440, '2023-09-29', '2023-09-29'),
(17, 13, 'Coke', 882, '2023-09-29', '2023-09-29'),
(18, 12, 'Dendro Clear', 946, '2023-09-29', '2023-09-29'),
(19, 14, 'King_Bed', 902, '2023-09-29', '2023-09-29');

-- --------------------------------------------------------

--
-- Table structure for table `sessions`
--

DROP TABLE IF EXISTS `sessions`;
CREATE TABLE IF NOT EXISTS `sessions` (
  `session_id` int NOT NULL AUTO_INCREMENT,
  `total` decimal(10,2) NOT NULL,
  `session_date` date NOT NULL,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `supplies`
--

DROP TABLE IF EXISTS `supplies`;
CREATE TABLE IF NOT EXISTS `supplies` (
  `supply_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `import_id` int NOT NULL,
  `qty` int NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  PRIMARY KEY (`supply_id`),
  KEY `product_id` (`product_id`),
  KEY `import_id` (`import_id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf16;

--
-- Dumping data for table `supplies`
--

INSERT INTO `supplies` (`supply_id`, `product_id`, `import_id`, `qty`, `price`, `subtotal`) VALUES
(64, 10, 88, 8, '8.00', '64.00'),
(65, 10, 88, 8, '8.00', '64.00'),
(66, 10, 88, 8, '8.00', '64.00'),
(67, 14, 89, 8, '8.00', '64.00'),
(68, 14, 89, 8, '8.00', '64.00'),
(70, 17, 90, 90, '1.00', '90.00'),
(71, 18, 90, 70, '1.00', '70.00'),
(73, 10, 91, 40, '2.00', '80.00'),
(74, 14, 91, 60, '6.00', '360.00'),
(75, 16, 91, 60, '2.00', '120.00'),
(76, 18, 91, 60, '3.00', '180.00'),
(77, 19, 91, 50, '3.00', '150.00'),
(78, 14, 92, 100, '2.00', '200.00'),
(79, 10, 92, 100, '2.00', '200.00'),
(80, 18, 92, 100, '3.00', '300.00'),
(81, 10, 95, 23, '2.00', '46.00'),
(82, 16, 96, 500, '400.00', '200000.00'),
(83, 10, 97, 700, '1.00', '700.00'),
(84, 14, 97, 900, '2.00', '1800.00'),
(85, 17, 97, 900, '1.00', '900.00'),
(86, 18, 97, 900, '2.00', '1800.00'),
(87, 19, 97, 900, '500.00', '450000.00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `carts`
--
ALTER TABLE `carts`
  ADD CONSTRAINT `carts_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `order_cart`
--
ALTER TABLE `order_cart`
  ADD CONSTRAINT `order_cart_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD CONSTRAINT `order_detail_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `order_detail_ibfk_3` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `supplies`
--
ALTER TABLE `supplies`
  ADD CONSTRAINT `import_ibfk_2` FOREIGN KEY (`import_id`) REFERENCES `imports` (`import_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `supplies_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
