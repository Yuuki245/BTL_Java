-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 19, 2025 lúc 05:01 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlphonghoc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphonghoc`
--

CREATE TABLE `chitietphonghoc` (
  `maPhong` char(10) NOT NULL,
  `maND` char(10) NOT NULL,
  `ngay` date NOT NULL,
  `tietHocBatDau` int(10) NOT NULL,
  `tietHocKetThuc` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphonghoc`
--

INSERT INTO `chitietphonghoc` (`maPhong`, `maND`, `ngay`, `tietHocBatDau`, `tietHocKetThuc`) VALUES
('1', '005', '2022-06-04', 8, 9),
('1', '005', '2022-06-05', 12, 16),
('2', '005', '2022-06-04', 7, 9),
('1', '005', '2022-06-07', 1, 5),
('1', '005', '2022-06-08', 7, 9),
('2', '005', '2022-06-08', 12, 15),
('3', '005', '2022-06-09', 1, 3),
('3', '005', '2022-06-11', 7, 11),
('1', '007', '2022-06-06', 1, 5),
('1', '007', '2022-06-10', 7, 9),
('2', '007', '2022-06-12', 7, 9),
('3', '007', '2022-06-12', 12, 14),
('105', '007', '2022-06-08', 1, 3),
('131', '007', '2022-06-09', 1, 5),
('3', '007', '2022-06-08', 1, 5),
('1', '004', '2022-06-12', 12, 14),
('1', '004', '2022-06-06', 12, 14),
('2', '004', '2022-06-07', 12, 14),
('2', '004', '2022-06-09', 4, 5),
('3', '004', '2022-06-09', 7, 10),
('105', '004', '2022-06-09', 7, 10),
('105', '004', '2022-06-07', 7, 10),
('105', '004', '2022-06-11', 7, 10),
('131', '004', '2022-06-11', 7, 10),
('131', '004', '2022-06-06', 7, 10),
('131', '004', '2022-06-07', 1, 5),
('1', '003', '2022-06-08', 10, 11),
('3', '003', '2022-06-10', 9, 11),
('2', '003', '2022-06-07', 4, 5),
('2', '003', '2022-06-07', 7, 8),
('105', '003', '2022-06-11', 1, 5),
('131', '003', '2022-06-12', 1, 5),
('131', '003', '2022-06-08', 7, 11),
('131', '003', '2022-06-10', 7, 11),
('1', '003', '2022-06-01', 1, 5),
('1', '003', '2022-06-02', 7, 11),
('1', '003', '2022-06-03', 13, 15),
('1', '003', '2025-05-19', 1, 5),
('1', '005', '2025-05-19', 7, 9),
('2', '004', '2025-05-19', 12, 14),
('3', '007', '2025-05-19', 1, 3),
('105', '004', '2025-05-19', 7, 10),
('131', '003', '2025-05-20', 7, 11),
('1', '007', '2025-05-20', 1, 5),
('2', '005', '2025-05-20', 7, 9),
('3', '004', '2025-05-20', 12, 15),
('105', '003', '2025-05-20', 1, 5),
('1', '004', '2025-05-21', 7, 9),
('2', '007', '2025-05-21', 12, 14),
('3', '005', '2025-05-21', 1, 3),
('131', '004', '2025-05-21', 7, 10),
('105', '007', '2025-05-21', 12, 15),
('1', '003', '2025-05-22', 1, 5),
('2', '004', '2025-05-22', 7, 9),
('3', '005', '2025-05-22', 12, 14),
('105', '007', '2025-05-22', 1, 3),
('131', '003', '2025-05-22', 7, 11),
('1', '005', '2025-05-23', 1, 3),
('2', '007', '2025-05-23', 7, 9),
('3', '004', '2025-05-23', 12, 15),
('105', '003', '2025-05-23', 1, 5),
('131', '005', '2025-05-23', 7, 10),
('1', '004', '2025-05-26', 1, 5),
('2', '003', '2025-05-26', 7, 9),
('3', '005', '2025-05-26', 12, 14),
('105', '007', '2025-05-26', 1, 3),
('131', '004', '2025-05-26', 7, 11),
('1', '007', '2025-05-27', 1, 3),
('2', '005', '2025-05-27', 7, 10),
('3', '003', '2025-05-27', 12, 14),
('105', '004', '2025-05-27', 1, 5),
('131', '007', '2025-05-27', 7, 9),
('1', '003', '2025-05-28', 1, 5),
('2', '004', '2025-05-28', 7, 9),
('3', '007', '2025-05-28', 12, 15),
('105', '005', '2025-05-28', 1, 3),
('131', '003', '2025-05-28', 7, 11),
('1', '005', '2025-05-29', 1, 3),
('2', '007', '2025-05-29', 7, 11),
('3', '004', '2025-05-29', 12, 14),
('105', '003', '2025-05-29', 1, 5),
('131', '005', '2025-05-29', 7, 9),
('1', '004', '2025-05-30', 1, 5),
('2', '003', '2025-05-30', 7, 9),
('3', '005', '2025-05-30', 12, 15),
('105', '007', '2025-05-30', 1, 3),
('131', '004', '2025-05-30', 7, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `coso`
--

CREATE TABLE `coso` (
  `maCoSo` char(10) NOT NULL,
  `tenCoSo` varchar(150) NOT NULL,
  `diaChi` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `coso`
--

INSERT INTO `coso` (`maCoSo`, `tenCoSo`, `diaChi`) VALUES
('1', 'Trường Đại học Kinh tế - Kỹ thuật Công nghiệp cơ sở 1', 'Số 218 Đường Lĩnh Nam, Q.Hoàng Mai, TP.Hà Nội'),
('2', 'Trường Đại học Kinh tế - Kỹ thuật Công nghiệp cơ sở 2', 'Số 456 Minh Khai, P.Vĩnh Tuy, Q.Hai Bà Trưng, TP.Hà Nội'),
('3', 'Trường Đại học Kinh tế - Kỹ thuật Công nghiệp cơ sở 3', 'Số 353 Trần Hưng Đạo, P.Cửa Bắc, TP.Nam Định'),
('4', 'Khu xưởng Thực hành', 'Phường Mỹ Xá, TP.Nam Định');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `daynha`
--

CREATE TABLE `daynha` (
  `maDayNha` char(10) NOT NULL,
  `tenDayNha` varchar(150) NOT NULL,
  `maCoSo` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `daynha`
--

INSERT INTO `daynha` (`maDayNha`, `tenDayNha`, `maCoSo`) VALUES
('A1', 'Dãy nhà A1', '1'),
('A10', 'Dãy nhà A10', '1'),
('A8', 'Dãy nhà A8', '1'),
('A9', 'Dãy nhà A9', '1'),
('B1', 'Dãy nhà B1', '2'),
('B2', 'Dãy nhà B2', '2'),
('B3', 'Dãy nhà B3', '2'),
('C1', 'Dãy nhà C1', '3'),
('C2', 'Dãy nhà C2', '3'),
('C3', 'Dãy nhà C3', '3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoidung`
--

CREATE TABLE `nguoidung` (
  `maND` char(10) NOT NULL,
  `tenND` varchar(150) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` char(150) NOT NULL,
  `role` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nguoidung`
--

INSERT INTO `nguoidung` (`maND`, `tenND`, `email`, `password`, `role`) VALUES
('003', 'Hồ Sỹ Sơn', 'son@gmail.com', '$2a$10$GMwtQYMwB5t7aOcRkguIkOhXvxhQNslTvf2.Vm4q0mElNmCr6uY1u', 0),
('004', 'Nguyễn Khắc Nguyên', 'nguyen@gmail.com', '$2a$10$yQYcGXPe89Wm4jf32tqst.oblHaQpajwCJjzUyB58ZIDftxd9LLmi', 0),
('005', 'Nguyễn Long Nhật', 'nhat@gmail.com', '$2a$10$ZfOiorqM2gCayrPyvknBPOEdkf71BcUnVcVsRHPTF1KmXzltdNMyK', 0),
('006', 'Nguyễn Thị Huyền', 'huyen@gmail.com', '$2a$10$VPUTA/NVE4/zh7sS9ndHYuPesWRZCmHNCvio8VrDEfLL4n4zoMEnC', 1),
('007', 'Lê Minh Hưng', 'hung@gmail.com', '123456', 0),
('admin', 'admin', 'admin@gmail.com', 'admin123', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `maPhong` char(10) NOT NULL,
  `tenPhong` varchar(150) NOT NULL,
  `maTang` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`maPhong`, `tenPhong`, `maTang`) VALUES
('1', '601 - A1', '1'),
('10', '901 - A1', '4'),
('100', '704 - A10', '31'),
('101', '801 - A10', '32'),
('102', '802 - A10', '32'),
('103', '803 - A10', '32'),
('104', '804 - A10', '32'),
('105', '101 - B1', '33'),
('106', '102 - B1', '33'),
('107', '103 - B1', '33'),
('108', '201 - B1', '34'),
('109', '202 - B1', '34'),
('11', '902 - A1', '4'),
('110', '203 - B1', '34'),
('111', '301 - B1', '35'),
('112', '302 - B1', '35'),
('113', '303 - B1', '35'),
('114', '101 - B2', '37'),
('115', '102 - B2', '37'),
('116', '103 - B2', '37'),
('117', '201 - B2', '38'),
('118', '202 - B2', '38'),
('119', '203 - B2', '38'),
('12', '903 - A1', '4'),
('120', '301 - B2', '39'),
('121', '302 - B2', '39'),
('122', '303 - B2', '39'),
('123', '101 - B3', '40'),
('124', '102 - B3', '40'),
('125', '201 - B3', '41'),
('126', '202 - B3', '41'),
('127', '301 - B3', '42'),
('128', '302 - B3', '42'),
('129', '401 - B3', '43'),
('13', 'Phòng thực hành khoa Du lịch 1 - A1', '5'),
('130', '402 - B3', '43'),
('131', '101 - C1', '44'),
('132', '102 - C1', '44'),
('133', '103 - C1', '44'),
('134', '104 - C1', '44'),
('135', '201 - C1', '45'),
('136', '202 - C1', '45'),
('137', '203 - C1', '45'),
('138', '204 - C1', '45'),
('139', '301 - C1', '46'),
('14', 'Phòng thực hành khoa Du lịch 2 - A1', '5'),
('140', '306 - C1', '46'),
('141', '305 - C1', '46'),
('142', '304 - C1', '46'),
('143', '101 - C2', '47'),
('144', '102 - C2', '47'),
('145', '103 - C2', '47'),
('146', '103 - C2', '47'),
('147', '201 - C2', '48'),
('148', '202 - C2', '48'),
('149', '203 - C2', '48'),
('15', 'Phòng thực hành khoa Du lịch 3 - A1', '5'),
('150', '204 - C2', '48'),
('151', '301 - C2', '49'),
('152', '302 - C2', '49'),
('153', '303 - C2', '49'),
('154', '304 - C2', '49'),
('155', '101 - C3', '50'),
('156', '102 - C3', '50'),
('157', '103 - C3', '50'),
('158', '104 - C3', '50'),
('159', '201 - C3', '51'),
('16', 'Phòng thực hành khoa Ô tô 1 - A1', '6'),
('160', '202 - C3', '51'),
('161', '203 - C3', '51'),
('162', '204 - C3', '51'),
('163', '301 - C3', '52'),
('164', '302 - C3', '52'),
('165', '303 - C3', '52'),
('17', 'Phòng thực hành khoa Ô tô 2 - A1', '6'),
('18', 'Phòng thực hành khoa Ô tô 3 - A1', '6'),
('19', 'Phòng thực hành khoa Điện 1 - A1', '7'),
('2', '602 - A1', '1'),
('20', 'Phòng thực hành khoa Điện 1 - A1', '7'),
('21', 'Phòng thực hành khoa Điện 1 - A1', '7'),
('22', 'Phòng thực hành khoa Kiểm toán 1 - A1', '8'),
('23', 'Phòng thực hành khoa Kiểm toán 2 - A1', '8'),
('24', 'Phòng thực hành khoa Kiểm toán 6 - A1', '8'),
('25', '101 - A8', '13'),
('26', '102 - A8', '13'),
('27', '103 - A8', '13'),
('28', '104 - A8', '13'),
('29', '201 - A8', '14'),
('3', '603 - A1', '1'),
('30', '202 - A8', '14'),
('31', '203 - A8', '14'),
('32', '204 - A8', '14'),
('33', '301 - A8', '15'),
('34', '302 - A8', '15'),
('35', '303 - A8', '15'),
('36', '304 - A8', '15'),
('37', '401 - A8', '16'),
('38', '402 - A8', '16'),
('39', '403 - A8', '16'),
('4', '701 - A1', '2'),
('40', '404 - A8', '16'),
('41', '501 - A8', '17'),
('42', '502 - A8', '17'),
('43', '503 - A8', '17'),
('44', '504 - A8', '17'),
('45', '601 - A8', '18'),
('46', '602 - A8', '18'),
('47', '603 - A8', '18'),
('48', '604 - A8', '18'),
('49', '101 - A9', '19'),
('5', '6056', '2'),
('50', '102 - A9', '19'),
('51', '103 - A9', '19'),
('52', '104 - A9', '19'),
('53', '201 - A9', '20'),
('54', '202 - A9', '20'),
('55', '203 - A9', '20'),
('56', '204 - A9', '20'),
('57', '301 - A9', '21'),
('58', '302 - A9', '21'),
('59', '303 - A9', '21'),
('6', '703 - A1', '2'),
('60', '304 - A9', '21'),
('61', '401 - A9', '22'),
('62', '402 - A9', '22'),
('63', '403 - A9', '22'),
('64', '404 - A9', '22'),
('65', '501 - A9', '23'),
('66', '502 - A9', '23'),
('67', '503 - A9', '23'),
('68', '504 - A9', '23'),
('69', '601 - A9', '24'),
('7', '801 - A1', '3'),
('70', '602 - A9', '24'),
('71', '603- A9', '24'),
('72', '604 - A9', '24'),
('73', '101 - A10', '25'),
('74', '102 - A10', '25'),
('75', '103 - A10', '25'),
('76', '104 - A10', '25'),
('77', '201 - A10', '26'),
('78', '202 - A10', '26'),
('79', '203 - A10', '26'),
('8', '802 - A1', '3'),
('80', '204 - A10', '26'),
('81', '301 - A10', '27'),
('82', '302 - A10', '27'),
('83', '303 - A10', '27'),
('84', '304 - A10', '27'),
('85', '401 - A10', '28'),
('86', '402 - A10', '28'),
('87', '403 - A10', '28'),
('88', '404 - A10', '28'),
('89', '501 - A10', '29'),
('9', '803 - A1', '3'),
('90', '502 - A10', '29'),
('91', '503 - A10', '29'),
('92', '504 - A10', '29'),
('93', '601 - A10', '30'),
('94', '602 - A10', '30'),
('95', '603 - A10', '30'),
('96', '604 - A10', '30'),
('97', '701 - A10', '31'),
('98', '702 - A10', '31'),
('99', '703 - A10', '31');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tang`
--

CREATE TABLE `tang` (
  `maTang` char(10) NOT NULL,
  `tenTang` varchar(150) NOT NULL,
  `maDayNha` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tang`
--

INSERT INTO `tang` (`maTang`, `tenTang`, `maDayNha`) VALUES
('1', 'Tầng 6 - A1', 'A1'),
('13', 'Tầng 1 - A8', 'A8'),
('14', 'Tầng 2 - A8', 'A8'),
('15', 'Tầng 3 - A8', 'A8'),
('16', 'Tầng 4 - A8', 'A8'),
('17', 'Tầng 5 - A8', 'A8'),
('18', 'Tầng 6 - A8', 'A8'),
('19', 'Tầng 1 - A9', 'A9'),
('2', 'Tầng 7 - A1', 'A1'),
('20', 'Tầng 2 - A9', 'A9'),
('21', 'Tầng 3 - A9', 'A9'),
('22', 'Tầng 4 - A9', 'A9'),
('23', 'Tầng 5 - A9', 'A9'),
('24', 'Tầng 6 - A9', 'A9'),
('25', 'Tầng 1 - A10', 'A10'),
('26', 'Tầng 2 - A10', 'A10'),
('27', 'Tầng 3 - A10', 'A10'),
('28', 'Tầng 4 - A10', 'A10'),
('29', 'Tầng 5 - A10', 'A10'),
('3', 'Tầng 8 - A1', 'A1'),
('30', 'Tầng 6 - A10', 'A10'),
('31', 'Tầng 7 - A10', 'A10'),
('32', 'Tầng 8 - A10', 'A10'),
('33', 'Tầng 1 - B1', 'B1'),
('34', 'Tầng 2 - B1', 'B1'),
('35', 'Tầng 3 - B1', 'B1'),
('37', 'Tầng 1 - B2', 'B2'),
('38', 'Tầng 2 - B2', 'B2'),
('39', 'Tầng 3 - B2', 'B2'),
('4', 'Tầng 9 - A1', 'A1'),
('40', 'Tầng 1 - B3', 'B3'),
('41', 'Tầng 2 - B3', 'B3'),
('42', 'Tầng 3 - B3', 'B3'),
('43', 'Tầng 4 - B3', 'B3'),
('44', 'Tầng 1 - C1', 'C1'),
('45', 'Tầng 2 - C1', 'C1'),
('46', 'Tầng 3 - C1', 'C1'),
('47', 'Tầng 1 - C2', 'C2'),
('48', 'Tầng 2 - C2', 'C2'),
('49', 'Tầng 3 - C2', 'C2'),
('5', 'Tầng 10 - A1', 'A1'),
('50', 'Tầng 1 - C3', 'C3'),
('51', 'Tầng 2 - C3', 'C3'),
('52', 'Tầng 3 - C3', 'C3'),
('6', 'Tầng 11 - A1', 'A1'),
('7', 'Tầng 12 - A1', 'A1'),
('8', 'Tầng 13 - A1', 'A1');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietphonghoc`
--
ALTER TABLE `chitietphonghoc`
  ADD KEY `maPhong` (`maPhong`),
  ADD KEY `maND` (`maND`);

--
-- Chỉ mục cho bảng `coso`
--
ALTER TABLE `coso`
  ADD PRIMARY KEY (`maCoSo`);

--
-- Chỉ mục cho bảng `daynha`
--
ALTER TABLE `daynha`
  ADD PRIMARY KEY (`maDayNha`),
  ADD KEY `maCoSo` (`maCoSo`);

--
-- Chỉ mục cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`maND`);

--
-- Chỉ mục cho bảng `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`maPhong`),
  ADD KEY `maTang` (`maTang`);

--
-- Chỉ mục cho bảng `tang`
--
ALTER TABLE `tang`
  ADD PRIMARY KEY (`maTang`),
  ADD KEY `maDayNha` (`maDayNha`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietphonghoc`
--
ALTER TABLE `chitietphonghoc`
  ADD CONSTRAINT `chitietphonghoc_ibfk_1` FOREIGN KEY (`maPhong`) REFERENCES `phong` (`maPhong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `chitietphonghoc_ibfk_2` FOREIGN KEY (`maND`) REFERENCES `nguoidung` (`maND`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `daynha`
--
ALTER TABLE `daynha`
  ADD CONSTRAINT `daynha_ibfk_1` FOREIGN KEY (`maCoSo`) REFERENCES `coso` (`maCoSo`);

--
-- Các ràng buộc cho bảng `phong`
--
ALTER TABLE `phong`
  ADD CONSTRAINT `phong_ibfk_1` FOREIGN KEY (`maTang`) REFERENCES `tang` (`maTang`);

--
-- Các ràng buộc cho bảng `tang`
--
ALTER TABLE `tang`
  ADD CONSTRAINT `tang_ibfk_1` FOREIGN KEY (`maDayNha`) REFERENCES `daynha` (`maDayNha`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
