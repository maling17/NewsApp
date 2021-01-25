package com.kresna.newsapp.repository

import com.kresna.newsapp.api.RetrofitInstance
import com.kresna.newsapp.db.ArticleDatabase
import com.kresna.newsapp.model.Article

class NewsRepository(
    val db: ArticleDatabase
    ) {

    suspend fun getBreakingNews(countryCode:String,pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery:String,pageNumber: Int)=
        RetrofitInstance.api.searchforNews(searchQuery,pageNumber)

    suspend fun upsert(article:Article) = db.getArticleDao().upsert(article)

    fun getSavedNews()= db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}