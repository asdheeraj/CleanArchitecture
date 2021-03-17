package com.dheeraj.cleanarchitecture.domain.repository

import com.dheeraj.cleanarchitecture.data.model.Article
import com.dheeraj.cleanarchitecture.data.model.News
import com.dheeraj.cleanarchitecture.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines() : Resource<News>

    suspend fun saveNews(article: Article)

    fun getSavedNewsHeadlines() : Flow<List<Article>>

    suspend fun deleteNews(article: Article)

    suspend fun searchNewsHeadlines(searchQuery: String): Resource<News>
}