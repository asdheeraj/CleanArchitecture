package com.dheeraj.cleanarchitecture.domain.usecase

import com.dheeraj.cleanarchitecture.domain.repository.NewsRepository

class SearchNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String) = newsRepository.searchNewsHeadlines(searchQuery)
}
