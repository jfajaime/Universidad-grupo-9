-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-09-2023 a las 00:43:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidadgrupo9`
--
CREATE DATABASE IF NOT EXISTS `universidadgrupo9` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidadgrupo9`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNac` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNac`, `estado`) VALUES
(1, 79639007, 'Etoile', 'Arin', '1980-10-17', 0),
(2, 84103159, 'Danilovic', 'Olivie', '1998-10-23', 1),
(3, 94598660, 'Blackader', 'Kris', '1995-07-06', 1),
(4, 43739749, 'Dearnaley', 'Leoine', '1992-04-22', 1),
(5, 15649621, 'Feldharker', 'Dulce', '1986-08-16', 1),
(6, 16024938, 'D\'Souza', 'Traver', '1989-10-16', 1),
(7, 55874372, 'Rudgerd', 'Joni', '1983-12-15', 1),
(8, 7976725, 'Coade', 'Thomas', '1989-02-13', 1),
(9, 97056331, 'Sywell', 'Robyn', '1983-06-14', 1),
(10, 98154216, 'Dubbin', 'Vaclav', '1993-08-15', 1),
(11, 99527337, 'Tuddenham', 'Balduin', '1992-10-13', 0),
(12, 79894631, 'Bonney', 'Mallory', '1982-09-17', 1),
(13, 92441737, 'Whate', 'Samara', '2000-04-18', 1),
(14, 87369651, 'Berrey', 'Codi', '1990-01-10', 0),
(15, 56340995, 'Yallop', 'Addy', '1991-02-01', 0),
(16, 29236266, 'Olesen', 'Teador', '1997-01-11', 0),
(17, 43148660, 'L\' Estrange', 'Katinka', '1998-11-10', 0),
(18, 43799554, 'Stack', 'Valentia', '1994-06-16', 0),
(19, 14114187, 'Habberjam', 'Orton', '1991-05-29', 0),
(20, 29306165, 'Lilburn', 'Adrien', '1992-08-11', 1),
(21, 73596344, 'Patillo', 'Gasparo', '1988-06-03', 1),
(22, 52620021, 'Rollingson', 'Maxy', '1989-11-21', 1),
(23, 87703883, 'Brixey', 'Alyssa', '1987-07-05', 1),
(24, 96477973, 'McCurry', 'Jonis', '1983-12-27', 0),
(25, 33433637, 'Lantiff', 'Bentlee', '1995-01-14', 0),
(26, 3680275, 'Tuffell', 'Kippar', '2000-06-28', 0),
(27, 2074176, 'Kupper', 'Sibbie', '1986-04-08', 1),
(28, 59447382, 'Barnhill', 'Livvyy', '1989-05-29', 1),
(29, 58821484, 'Craiker', 'Udall', '1994-08-23', 1),
(30, 49639547, 'Bendell', 'Jodi', '1994-12-20', 0),
(31, 56781324, 'Saleway', 'Danyelle', '1991-12-19', 1),
(32, 47702265, 'Milksop', 'Baldwin', '1992-06-07', 1),
(33, 68473052, 'Leasor', 'Care', '2000-06-21', 0),
(34, 3225192, 'Sawney', 'Sinclare', '1993-05-22', 1),
(35, 40406676, 'Langwade', 'Benni', '1985-06-17', 1),
(36, 5974932, 'Eidelman', 'Oates', '1985-12-09', 0),
(37, 45125567, 'Kevlin', 'Devonne', '1993-08-17', 1),
(38, 1622662, 'McCreery', 'Silvia', '1986-08-08', 1),
(39, 9800368, 'Geistmann', 'Pyotr', '1983-02-19', 0),
(40, 69076225, 'Pane', 'Janine', '1980-12-13', 0),
(41, 38221704, 'Guidera', 'Hubie', '1999-02-24', 1),
(42, 24336275, 'Swan', 'Gypsy', '1986-02-24', 1),
(43, 44425358, 'MacVaugh', 'Idell', '1981-02-17', 1),
(44, 73281184, 'Reide', 'Misti', '1995-09-12', 1),
(45, 91172099, 'Klement', 'Junie', '1997-04-25', 0),
(46, 26990818, 'Pickering', 'Harrietta', '1996-10-25', 1),
(47, 79050789, 'Vanelli', 'Carolin', '1983-02-06', 0),
(48, 62744505, 'Motherwell', 'Catlaina', '1991-06-17', 0),
(49, 15521667, 'D\'Alwis', 'Blair', '1986-07-19', 1),
(50, 52235989, 'Willatt', 'Bald', '1982-09-09', 1),
(51, 10305957, 'Richardeau', 'Lily', '1985-07-02', 1),
(52, 61790822, 'Hold', 'Aldous', '1980-12-06', 0),
(53, 5574525, 'Torrent', 'Rubie', '1991-02-14', 1),
(54, 38738633, 'Brennen', 'Nickolaus', '1996-10-21', 0),
(55, 84652731, 'Rolph', 'Dunstan', '1988-03-29', 1),
(56, 86546147, 'Scragg', 'Meyer', '1995-10-06', 0),
(57, 75775691, 'Beamiss', 'Wilton', '1981-05-24', 0),
(58, 2918122, 'Searles', 'Myriam', '2000-05-21', 0),
(59, 93099700, 'Boots', 'Vassili', '1984-01-10', 1),
(60, 39220198, 'Pendlington', 'Ambrosio', '1986-12-02', 1),
(61, 44093193, 'Bewlie', 'Lisetta', '1993-06-11', 1),
(62, 36700699, 'Dreakin', 'Albrecht', '1987-10-19', 0),
(63, 8664914, 'Wharin', 'Benjamin', '1989-06-01', 0),
(64, 21693127, 'Sciusscietto', 'Garek', '1992-02-04', 1),
(65, 33578039, 'Tutill', 'Agna', '1999-01-05', 0),
(66, 45472496, 'Bigland', 'Malcolm', '1989-02-22', 1),
(67, 33720300, 'Shingfield', 'Joe', '1980-10-14', 1),
(68, 42721029, 'Powland', 'Dorie', '1986-10-27', 0),
(69, 55761968, 'Duiguid', 'Grove', '1981-01-21', 1),
(70, 30067340, 'Sellman', 'Denice', '1984-12-16', 1),
(71, 94633538, 'Feyer', 'Berkly', '1997-05-27', 1),
(72, 87252414, 'Penas', 'Blake', '1986-02-19', 1),
(73, 15336153, 'Byre', 'Gerrie', '1987-03-04', 0),
(74, 11332829, 'Jorioz', 'Kordula', '1981-12-12', 0),
(75, 93394204, 'Bing', 'Letti', '1992-11-21', 1),
(76, 48460766, 'Bodega', 'Koenraad', '1982-04-13', 0),
(77, 49327131, 'Satterley', 'Dickie', '1995-10-30', 1),
(78, 25634146, 'Marien', 'Zachary', '1996-05-07', 1),
(79, 53052729, 'Madders', 'Jamill', '1990-12-01', 1),
(80, 97935122, 'Claridge', 'Doyle', '1984-06-10', 1),
(81, 80068514, 'Standingford', 'Yule', '1981-02-05', 1),
(82, 65499411, 'Eskriett', 'Jonie', '1987-10-01', 1),
(83, 86023077, 'Sanger', 'Rahel', '1995-11-18', 1),
(84, 75813541, 'Folshom', 'Lindie', '1981-02-24', 0),
(85, 30516365, 'Jina', 'Tabbitha', '1983-05-14', 1),
(86, 73135400, 'Sarfas', 'Ashly', '2000-04-26', 1),
(87, 31399332, 'Ditter', 'Timmie', '1987-02-16', 0),
(88, 65962329, 'Kreber', 'Luz', '1981-04-05', 0),
(89, 94991664, 'Clere', 'Duffie', '1981-06-01', 0),
(90, 55081548, 'Tunmore', 'Dominica', '1983-09-22', 0),
(91, 45547978, 'January 1st', 'Janna', '1988-10-23', 1),
(92, 60625225, 'Kuhnt', 'Nap', '1980-11-03', 1),
(93, 22171967, 'Pearton', 'Alfreda', '1989-09-14', 0),
(94, 76704973, 'Grishakin', 'Daren', '1992-10-22', 0),
(95, 96613033, 'Gilpin', 'Sherlock', '1990-12-12', 1),
(96, 89654230, 'Szymanowski', 'Denice', '1997-08-26', 1),
(97, 67970319, 'Boyne', 'Opaline', '1998-12-27', 1),
(98, 46021520, 'Cressey', 'Shantee', '1983-12-31', 1),
(99, 15823442, 'Gerardeaux', 'Mead', '1995-11-04', 0),
(100, 97343376, 'Ivashnyov', 'Raddy', '1981-08-16', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripcion` int(11) NOT NULL,
  `nota` double NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(3, 'Matematica I', 1, 0),
(4, 'Matemáticas', 2023, 1),
(5, 'Historia', 2023, 1),
(6, 'Biología', 2023, 0),
(7, 'Física', 2023, 1),
(8, 'Literatura', 2023, 0),
(9, 'Química', 2023, 1),
(10, 'Geografía', 2023, 0),
(11, 'Inglés', 2023, 1),
(12, 'Arte', 2023, 0),
(13, 'Educación Física', 2023, 1),
(14, 'Música', 2023, 0),
(15, 'Informática', 2023, 1),
(16, 'Economía', 2023, 0),
(17, 'Psicología', 2023, 1),
(18, 'Filosofía', 2023, 0),
(19, 'Sociología', 2023, 1),
(20, 'Ciencias Políticas', 2023, 0),
(21, 'Derecho', 2023, 1),
(22, 'Medicina', 2023, 0),
(23, 'Arquitectura', 2023, 1),
(24, 'Ingeniería Civil', 2023, 0),
(25, 'Diseño Gráfico', 2023, 1),
(26, 'Administración de Empresas', 2023, 0),
(27, 'Marketing', 2023, 1),
(28, 'Turismo', 2023, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripcion`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripcion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
