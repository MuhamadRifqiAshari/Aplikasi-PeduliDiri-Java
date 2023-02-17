-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Jan 2023 pada 00.48
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ukk_p1`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `catatan`
--

CREATE TABLE `catatan` (
  `id_catatan` int(11) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `waktu` time NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `suhu_tubuh` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `catatan`
--

INSERT INTO `catatan` (`id_catatan`, `nik`, `nama_lengkap`, `tanggal`, `waktu`, `lokasi`, `suhu_tubuh`) VALUES
(0, '019283', 'Vidi Ariel Simanjuntak', '2005-04-23', '09:10:00', 'Japan', '36'),
(0, '019283', 'Vidi Ariel Simanjuntak', '2023-01-09', '07:04:00', 'Jakarta', '36'),
(0, '019283', 'Vidi Ariel Simanjuntak', '2023-01-20', '16:04:00', 'Hirishima', '26'),
(0, '123456789', 'ren', '2023-04-02', '04:01:00', 'Osaka', '2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `nik` varchar(225) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `foto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`nik`, `nama`, `foto`) VALUES
('123456789', 'ren', 'src\\upload\\123456789.jpeg'),
('1234567890\r\n', 'Vidi Ariel Simanjuntak', 'src\\upload\\019283.jpg'),
('1234567890', 'Vidi', 'src\\upload\\1234567890.jpg');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
