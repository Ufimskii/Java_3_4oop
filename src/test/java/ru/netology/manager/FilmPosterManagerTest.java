package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmPosterManagerTest {
    FilmPosterManager manager = new FilmPosterManager(10);

    @Test
    void shouldPosterEmpty() {

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldAdd() {
        FilmPoster movie01 = new FilmPoster(5090, "https://www.kinopoisk.ru/film/5090/", "Евротур", "Комедия");
        FilmPoster movie02 = new FilmPoster(555, "https://www.kinopoisk.ru/film/555/", "Большой Лебовски", "Криминал");
        FilmPoster movie03 = new FilmPoster(197532, "https://www.kinopoisk.ru/film/197532/", "Из машины", "Фантастика");

        manager.add(movie01);
        manager.add(movie02);
        manager.add(movie03);

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{movie03, movie02, movie01};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMoreTenFilms() {
        FilmPoster movie01 = new FilmPoster(462682,"https://www.kinopoisk.ru/film/462682/","Волк с Уолл-стрит","Драма");
        FilmPoster movie02 = new FilmPoster(1043758, "https://www.kinopoisk.ru/film/1043758/", "Паразиты", "Триллер");
        FilmPoster movie03 = new FilmPoster(645118, "https://www.kinopoisk.ru/film/645118/", "Головоломка", "Мультфильм");
        FilmPoster movie04 = new FilmPoster(377, "https://www.kinopoisk.ru/film/377/", "Семь", "Детектив");
        FilmPoster movie05 = new FilmPoster(75871, "https://www.kinopoisk.ru/film/75871/", "Олдбой","Триллер");
        FilmPoster movie06 = new FilmPoster(93377,"https://www.kinopoisk.ru/film/93377/","Типа крутые легавые","Комедия");
        FilmPoster movie07 = new FilmPoster(424692, "https://www.kinopoisk.ru/film/424692/", "Сербский фильм","Триллер");
        FilmPoster movie08 = new FilmPoster(539550, "https://www.kinopoisk.ru/film/539550/","Артист","Мелодрама");
        FilmPoster movie09 = new FilmPoster(736206, "https://www.kinopoisk.ru/film/736206/","Лок","Драма");
        FilmPoster movie10 = new FilmPoster(103412, "https://www.kinopoisk.ru/film/103412/", "Спуск","Ужасы");
        FilmPoster movie11 = new FilmPoster(655800,"https://www.kinopoisk.ru/series/655800/","Черное зеркало","Финтастика");
        FilmPoster movie12 = new FilmPoster(395523,"https://www.kinopoisk.ru/film/395523/","Дорога","Постапокалипсис");

        manager.add(movie01);
        manager.add(movie02);
        manager.add(movie03);
        manager.add(movie04);
        manager.add(movie05);
        manager.add(movie06);
        manager.add(movie07);
        manager.add(movie08);
        manager.add(movie09);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{
                movie12, movie11, movie10, movie09, movie08,
                movie07, movie06, movie05, movie04, movie03
        };

        assertArrayEquals(expected, actual);

    }
}