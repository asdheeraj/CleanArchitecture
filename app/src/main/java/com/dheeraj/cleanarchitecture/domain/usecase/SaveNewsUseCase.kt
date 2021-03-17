package com.dheeraj.cleanarchitecture.domain.usecase

import com.dheeraj.cleanarchitecture.data.model.Article
import com.dheeraj.cleanarchitecture.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}