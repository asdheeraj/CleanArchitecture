package com.dheeraj.cleanarchitecture.domain.usecase

import com.dheeraj.cleanarchitecture.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute() = newsRepository.getSavedNewsHeadlines()
}