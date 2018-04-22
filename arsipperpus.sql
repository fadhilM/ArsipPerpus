-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2018 at 05:17 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `arsipperpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_Admin` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_Buku` int(11) NOT NULL,
  `judul` varchar(16) NOT NULL,
  `pengarang` varchar(16) NOT NULL,
  `penerbit` varchar(16) NOT NULL,
  `ISBN` varchar(16) NOT NULL,
  `kategori` varchar(16) NOT NULL,
  `tgl_Terbit` date NOT NULL,
  `tgl_masuk` date NOT NULL,
  `sumber` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_Buku`, `judul`, `pengarang`, `penerbit`, `ISBN`, `kategori`, `tgl_Terbit`, `tgl_masuk`, `sumber`) VALUES
(2, 'Anak Desa', 'Kurniawan', 'Indo Book', 'BK440', 'Sosial', '2009-07-12', '2011-01-15', 'Beli'),
(3, 'Tahun Baru', 'Adi', 'PT cahya', 'BK016', 'Pendidikan', '2010-06-20', '2012-10-10', 'Beli');

-- --------------------------------------------------------

--
-- Table structure for table `dvd`
--

CREATE TABLE `dvd` (
  `id_DVD` int(11) NOT NULL,
  `judulDVD` varchar(16) NOT NULL,
  `bahasa` varchar(16) NOT NULL,
  `penerbitDVD` varchar(16) NOT NULL,
  `kategori` varchar(16) NOT NULL,
  `tglTerbit` date NOT NULL,
  `tglMasuk` date NOT NULL,
  `sumber` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dvd`
--

INSERT INTO `dvd` (`id_DVD`, `judulDVD`, `bahasa`, `penerbitDVD`, `kategori`, `tglTerbit`, `tglMasuk`, `sumber`) VALUES
(3, 'Sejarah Jember', 'Madura', 'PT dua angka', 'Pendidikan', '2009-01-10', '2011-10-15', 'Beli');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_Admin`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_Buku`);

--
-- Indexes for table `dvd`
--
ALTER TABLE `dvd`
  ADD PRIMARY KEY (`id_DVD`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_Admin` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_Buku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `dvd`
--
ALTER TABLE `dvd`
  MODIFY `id_DVD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
