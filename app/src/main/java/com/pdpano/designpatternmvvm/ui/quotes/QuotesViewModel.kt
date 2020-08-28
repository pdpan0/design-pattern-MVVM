package com.pdpano.designpatternmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.pdpano.designpatternmvvm.data.Quote
import com.pdpano.designpatternmvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}