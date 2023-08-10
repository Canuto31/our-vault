-- -----------------------------------------------------
-- Table "TYPE"
-- -----------------------------------------------------
CREATE TABLE "type" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(15) NOT NULL,
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "CATEGORY"
-- -----------------------------------------------------
CREATE TABLE "category" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(15) NOT NULL
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "STREAM PAGE"
-- -----------------------------------------------------
CREATE TABLE "stream_page" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(15) NOT NULL,
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "STATE"
-- -----------------------------------------------------
CREATE TABLE "state" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(15) NOT NULL,
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "GAME STORE"
-- -----------------------------------------------------
CREATE TABLE "game_store" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(15) NOT NULL,
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "AUTHOR"
-- -----------------------------------------------------
CREATE TABLE "author" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(30) NOT NULL,
    PRIMARY KEY ("id")
);

-- -----------------------------------------------------
-- Table "MOVIE"
-- -----------------------------------------------------
CREATE TABLE "movie" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(50) NOT NULL,
    "duration" INT,
    "id_category" INT NOT NULL,
    "id_stream_page" INT,
    "image" VARCHAR,
    "trailer" VARCHAR,
    "id_state" INT NOT NULL,
    "rate" INT,
    PRIMARY KEY ("id"),
    CONSTRAINT "fk_movie_category" FOREIGN KEY ("id_category") REFERENCES "category" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_movie_stream_page" FOREIGN KEY ("id_stream_page") REFERENCES "stream_page" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_movie_state" FOREIGN KEY ("id_state") REFERENCES "state" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- -----------------------------------------------------
-- Table "SERIE"
-- -----------------------------------------------------
CREATE TABLE "serie" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(50) NOT NULL,
    "seasons" INT,
    "chapter_for_season" INT,
    "duration_for_chapter" INT,
    "id_category" INT NOT NULL,
    "id_stream_page" INT,
    "image" VARCHAR,
    "trailer" VARCHAR,
    "currently_season" INT,
    "currently_chapter" INT,
    "id_state" INT NOT NULL,
    "rate" INT,
    PRIMARY KEY ("id"),
    CONSTRAINT "fk_serie_category" FOREIGN KEY ("id_category") REFERENCES "category" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_serie_stream_page" FOREIGN KEY ("id_stream_page") REFERENCES "stream_page" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_serie_state" FOREIGN KEY ("id_state") REFERENCES "state" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- -----------------------------------------------------
-- Table "VIDEOGAME"
-- -----------------------------------------------------
CREATE TABLE "videogame" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(50) NOT NULL,
    "id_category" INT NOT NULL,
    "id_game_store" INT,
    "price" DECIMAL(10, 2),
    "image" VARCHAR,
    "trailer" VARCHAR,
    "id_state" INT NOT NULL,
    "rate" INT,
    PRIMARY KEY ("id"),
    CONSTRAINT "fk_videogame_category" FOREIGN KEY ("id_category") REFERENCES "category" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_videogame_game_store" FOREIGN KEY ("id_game_store") REFERENCES "game_store" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_videogame_state" FOREIGN KEY ("id_state") REFERENCES "state" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- -----------------------------------------------------
-- Table "BOOK"
-- -----------------------------------------------------
CREATE TABLE "book" (
    "id" SERIAL NOT NULL,
    "name" VARCHAR(50) NOT NULL,
    "id_category" INT NOT NULL,
    "price" DECIMAL(10, 2),
    "image" VARCHAR,
    "pages_amount" INT,
    "id_author" INT,
    "id_state" INT NOT NULL,
    "rate" INT,
    PRIMARY KEY ("id"),
    CONSTRAINT "fk_book_category" FOREIGN KEY ("id_category") REFERENCES "category" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_book_author" FOREIGN KEY ("id_author") REFERENCES "author" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT "fk_book_state" FOREIGN KEY ("id_state") REFERENCES "state" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- -----------------------------------------------------
-- Table "TYPE_STATE"
-- -----------------------------------------------------
CREATE TABLE "type_state" (
    "id_type" INT NOT NULL,
    "id_state" INT NOT NULL,
    PRIMARY KEY ("id_type", "id_state"),
    CONSTRAINT "fk_type_state_type" FOREIGN KEY ("id_type") REFERENCES "type" ("id") ON DELETE CASCADE,
    CONSTRAINT "fk_type_state_state" FOREIGN KEY ("id_state") REFERENCES "state" ("id") ON DELETE CASCADE
);

-- -----------------------------------------------------
-- Table "TYPE_CATEGORY"
-- -----------------------------------------------------
CREATE TABLE "type_category" (
    "id_type" INT NOT NULL,
    "id_category" INT NOT NULL,
    PRIMARY KEY ("id_type", "id_category"),
    CONSTRAINT "fk_type_category_type" FOREIGN KEY ("id_type") REFERENCES "type" ("id") ON DELETE CASCADE,
    CONSTRAINT "fk_type_category_category" FOREIGN KEY ("id_category") REFERENCES "category" ("id") ON DELETE CASCADE
);