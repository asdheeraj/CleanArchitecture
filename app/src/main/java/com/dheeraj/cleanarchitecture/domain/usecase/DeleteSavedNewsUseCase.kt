package com.dheeraj.cleanarchitecture.domain.usecase

import com.dheeraj.cleanarchitecture.data.model.Article
import com.dheeraj.cleanarchitecture.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}