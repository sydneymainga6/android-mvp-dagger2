package com.inspiringteam.mrnews.data.source;

import androidx.annotation.NonNull;

import com.inspiringteam.mrnews.data.models.News;

import java.util.List;

import io.reactivex.disposables.Disposable;

/**
 * Repository interface
 */

public interface NewsDataSource {
    interface LoadNewsCallback {
        void onDisposableAcquired(Disposable disposable);

        void onNewsLoaded(List<News> news);

        void onDataNotAvailable();
    }

    interface LoadSavedNewsCallback {

        void onNewsLoaded(List<News> news);

        void onDataNotAvailable();
    }

    void getNews(String category, @NonNull LoadNewsCallback callback);

    void getArchivedNews(@NonNull LoadSavedNewsCallback callback);

    void insertNews(News news);

    void updateNews(News news);

    void refreshNews(String category);

    void deleteNews();

}
