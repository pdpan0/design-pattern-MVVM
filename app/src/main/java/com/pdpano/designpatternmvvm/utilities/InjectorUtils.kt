package com.pdpano.designpatternmvvm.utilities

import com.pdpano.designpatternmvvm.data.FakeDatabase
import com.pdpano.designpatternmvvm.data.QuoteRepository
import com.pdpano.designpatternmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun providerQuotesViewModelFactory(): QuotesViewModelFactory {
        val quotesRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}