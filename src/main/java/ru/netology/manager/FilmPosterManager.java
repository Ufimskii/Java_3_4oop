package ru.netology.manager;

public class FilmPosterManager {
    private FilmPoster[] items = new FilmPoster[0];
    private int returnFilms;

    public FilmPosterManager(int returnFilms) {
        this.returnFilms = returnFilms;
    }

    public FilmPosterManager() {
    }

    public void add(FilmPoster item) {
        int length = items.length + 1;
        FilmPoster[] tmp = new FilmPoster[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmPoster[] getLastFilms() {
        int length = returnFilms;
        if (length > items.length) {
            length = items.length;
        }

        FilmPoster[] result = new FilmPoster[length];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}


