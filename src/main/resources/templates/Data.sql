-- -----------------------------------------------------
-- Table "TYPE"
-- -----------------------------------------------------
INSERT INTO "type" VALUES (1, 'Movie');
INSERT INTO "type" VALUES (2, 'Serie');
INSERT INTO "type" VALUES (3, 'Videogame');
INSERT INTO "type" VALUES (4, 'Book');

-- -----------------------------------------------------
-- Table "category"
-- -----------------------------------------------------
INSERT INTO "category" VALUES (1, 'Action');
INSERT INTO "category" VALUES (2, 'Comedy');
INSERT INTO "category" VALUES (3, 'Drama');
INSERT INTO "category" VALUES (4, 'Sci-Fi');
INSERT INTO "category" VALUES (5, 'Fantasy');
INSERT INTO "category" VALUES (6, 'Adventure');
INSERT INTO "category" VALUES (7, 'Thriller');
INSERT INTO "category" VALUES (8, 'Horror');
INSERT INTO "category" VALUES (9, 'Animation');
INSERT INTO "category" VALUES (10, 'Romance');
INSERT INTO "category" VALUES (11, 'Shooter');
INSERT INTO "category" VALUES (12, 'RPG');
INSERT INTO "category" VALUES (13, 'Open World');
INSERT INTO "category" VALUES (14, 'Sports');
INSERT INTO "category" VALUES (15, 'Racing');
INSERT INTO "category" VALUES (16, 'Platformer');
INSERT INTO "category" VALUES (17, 'Battle Royale');
INSERT INTO "category" VALUES (18, 'Survival');
INSERT INTO "category" VALUES (19, 'Fighting');
INSERT INTO "category" VALUES (20, 'Simulation');

-- -----------------------------------------------------
-- Table "STREAM PAGE"
-- -----------------------------------------------------
INSERT INTO "stream_page" VALUES (1, 'Netflix');
INSERT INTO "stream_page" VALUES (2, 'HBO');
INSERT INTO "stream_page" VALUES (3, 'Amazon Prime');
INSERT INTO "stream_page" VALUES (4, 'Disney+');
INSERT INTO "stream_page" VALUES (5, 'AppleTV');
INSERT INTO "stream_page" VALUES (6, 'Star+');
INSERT INTO "stream_page" VALUES (7, 'Others');

-- -----------------------------------------------------
-- Table "state"
-- -----------------------------------------------------
INSERT INTO "state" VALUES (1, 'New');
INSERT INTO "state" VALUES (2, 'Read');
INSERT INTO "state" VALUES (3, 'Reading');
INSERT INTO "state" VALUES (4, 'Watching');
INSERT INTO "state" VALUES (5, 'Watched');
INSERT INTO "state" VALUES (6, 'Playing');
INSERT INTO "state" VALUES (7, 'Played');

-- -----------------------------------------------------
-- Table "GAME STORE"
-- -----------------------------------------------------
INSERT INTO "game_store" VALUES (1, 'Epic Games');
INSERT INTO "game_store" VALUES (2, 'Steam');

-- -----------------------------------------------------
-- Table "author"
-- -----------------------------------------------------
INSERT INTO "author" VALUES (1, 'J.K. Rowling');
INSERT INTO "author" VALUES (2, 'James Dashner');
INSERT INTO "author" VALUES (3, 'Ernest Cline');
INSERT INTO "author" VALUES (4, 'Brandon Sanderson');
INSERT INTO "author" VALUES (5, 'Stephen King');

-- -----------------------------------------------------
-- Table "movie"
-- -----------------------------------------------------
INSERT INTO "movie" VALUES (1, 'Resident Evil: Death Island', 91, 7, 7, 'https://upload.wikimedia.org/wikipedia/en/thumb/4/4f/Resident_Evil_-_Death_Island.png/220px-Resident_Evil_-_Death_Island.png', 'https://youtu.be/L-vkuA8oqMY', 1);
INSERT INTO "movie" VALUES (2, 'No Hard Feelings', 103, 2, 7, 'https://www.huelvainformacion.es/2023/06/16/destino-huelva/Preestreno-Malos-Rollos_1802830226_186979653_1200x675.jpg', 'https://youtu.be/P15S6ND8kbQ', 1);

-- -----------------------------------------------------
-- Table "serie"
-- -----------------------------------------------------
INSERT INTO "serie" VALUES (1, 'Chucky', 2, 16, 47, 8, 6, 'https://es.web.img3.acsta.net/pictures/21/09/06/17/25/5742155.jpg', 'https://youtu.be/Za3L68Y6ZFY', 0, 0, 1);

-- -----------------------------------------------------
-- Table "videogame"
-- -----------------------------------------------------
INSERT INTO "videogame" VALUES (1, 'Resident Evil IV Remake', 8, 2, 267900, 'https://cdn.akamai.steamstatic.com/steam/apps/2050650/header.jpg?t=1688636510', 'https://youtu.be/EyvrjE9jaKw', 1);
INSERT INTO "videogame" VALUES (2, 'Hogwarts Legacy', 5, 1, 229999, 'https://www.semana.com/resizer/WM6jfKmRlrYJAsVPca3PENPcf5s=/1280x720/smart/filters:format(jpg):quality(80)/cloudfront-us-east-1.images.arcpublishing.com/semana/7DO7DYGD4FDKFKTJWUYOG3SNI4.jpg', 'https://youtu.be/S6GTl_vPRvU', 1);

-- -----------------------------------------------------
-- Table "book"
-- -----------------------------------------------------
INSERT INTO "book" VALUES (1, 'Harry Potter and the Prisoner of Azkaban', 5, 52000, 'https://panamericana.vtexassets.com/arquivos/ids/488370-1200-auto?v=638150967634470000&width=1200&height=auto&aspect=true', 435, 1, 1);
INSERT INTO "book" VALUES (2, 'Harry Potter and the Goblet of Fire', 5, 62000, 'https://panamericana.vtexassets.com/arquivos/ids/461225-1200-auto?v=638008375812330000&width=1200&height=auto&aspect=true', 734, 1, 1);
INSERT INTO "book" VALUES (3, 'Harry Potter and the Order of the Phoenix', 5, 62000, 'https://panamericana.vtexassets.com/arquivos/ids/293484-1200-auto?v=636628506433670000&width=1200&height=auto&aspect=true', 870, 1, 1);
INSERT INTO "book" VALUES (4, 'Harry Potter and the Half-Blood Prince', 5, 62000, 'https://panamericana.vtexassets.com/arquivos/ids/293488-1200-auto?v=636628506607230000&width=1200&height=auto&aspect=true', 652, 1, 1);
INSERT INTO "book" VALUES (5, 'Harry Potter and the Deathly Hallows', 5, 62000, 'https://panamericana.vtexassets.com/arquivos/ids/293489-1200-auto?v=636628506647700000&width=1200&height=auto&aspect=true', 759, 1, 1);

-- -----------------------------------------------------
-- Table "type_state"
-- -----------------------------------------------------
INSERT INTO "type_state" VALUES (1, 1); -- Movie - New
INSERT INTO "type_state" VALUES (1, 4); -- Movie - Watching
INSERT INTO "type_state" VALUES (1, 5); -- Movie - Watched
INSERT INTO "type_state" VALUES (2, 1); -- Serie - New
INSERT INTO "type_state" VALUES (2, 4); -- Serie - Watching
INSERT INTO "type_state" VALUES (2, 5); -- Serie - Watched
INSERT INTO "type_state" VALUES (3, 1); -- Videogame - New
INSERT INTO "type_state" VALUES (3, 6); -- Videogame - Playing
INSERT INTO "type_state" VALUES (3, 7); -- Videogame - Played
INSERT INTO "type_state" VALUES (4, 1); -- Book - New
INSERT INTO "type_state" VALUES (4, 2); -- Book - Read
INSERT INTO "type_state" VALUES (4, 3); -- Book - Reading

-- -----------------------------------------------------
-- Table "type_category"
-- -----------------------------------------------------
INSERT INTO "type_category" VALUES (1, 1); -- Movie - Action
INSERT INTO "type_category" VALUES (1, 2); -- Movie - Comedy
INSERT INTO "type_category" VALUES (1, 3); -- Movie - Drama
INSERT INTO "type_category" VALUES (1, 4); -- Movie - Sci-Fi
INSERT INTO "type_category" VALUES (1, 5); -- Movie - Fantasy
INSERT INTO "type_category" VALUES (1, 6); -- Movie - Adventure
INSERT INTO "type_category" VALUES (1, 7); -- Movie - Thriller
INSERT INTO "type_category" VALUES (1, 8); -- Movie - Horror
INSERT INTO "type_category" VALUES (1, 9); -- Movie - Animation
INSERT INTO "type_category" VALUES (1, 10); -- Movie - Romance
INSERT INTO "type_category" VALUES (2, 1); -- Serie - Action
INSERT INTO "type_category" VALUES (2, 2); -- Serie - Comedy
INSERT INTO "type_category" VALUES (2, 3); -- Serie - Drama
INSERT INTO "type_category" VALUES (2, 4); -- Serie - Sci-Fi
INSERT INTO "type_category" VALUES (2, 5); -- Serie - Fantasy
INSERT INTO "type_category" VALUES (2, 6); -- Serie - Adventure
INSERT INTO "type_category" VALUES (2, 7); -- Serie - Thriller
INSERT INTO "type_category" VALUES (2, 8); -- Serie - Horror
INSERT INTO "type_category" VALUES (2, 9); -- Serie - Animation
INSERT INTO "type_category" VALUES (2, 10); -- Serie - Romance
INSERT INTO "type_category" VALUES (3, 11); -- Videogame - Shooter
INSERT INTO "type_category" VALUES (3, 12); -- Videogame - RPG
INSERT INTO "type_category" VALUES (3, 13); -- Videogame - Open World
INSERT INTO "type_category" VALUES (3, 14); -- Videogame - Sports
INSERT INTO "type_category" VALUES (3, 15); -- Videogame - Racing
INSERT INTO "type_category" VALUES (3, 16); -- Videogame - Platformer
INSERT INTO "type_category" VALUES (3, 17); -- Videogame - Battle Royale
INSERT INTO "type_category" VALUES (3, 18); -- Videogame - Survival
INSERT INTO "type_category" VALUES (3, 19); -- Videogame - Fighting
INSERT INTO "type_category" VALUES (3, 20); -- Videogame - Simulation
INSERT INTO "type_category" VALUES (4, 1); -- Book - Action
INSERT INTO "type_category" VALUES (4, 2); -- Book - Comedy
INSERT INTO "type_category" VALUES (4, 3); -- Book - Drama
INSERT INTO "type_category" VALUES (4, 4); -- Book - Sci-Fi
INSERT INTO "type_category" VALUES (4, 5); -- Book - Fantasy
INSERT INTO "type_category" VALUES (4, 6); -- Book - Adventure
INSERT INTO "type_category" VALUES (4, 7); -- Book - Thriller
INSERT INTO "type_category" VALUES (4, 8); -- Book - Horror
INSERT INTO "type_category" VALUES (4, 9); -- Book - Animation
INSERT INTO "type_category" VALUES (4, 10); -- Book - Romance