package com.dheeraj.cleanarchitecture.domain.usecase

import com.dheeraj.cleanarchitecture.domain.repository.NewsRepository

class GetNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute() = newsRepository.getNewsHeadlines()
}