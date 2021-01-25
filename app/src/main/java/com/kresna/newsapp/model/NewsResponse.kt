package com.kresna.newsapp.model

import com.kresna.newsapp.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)