package com.pdpano.designpatternmvvm.data


/*
    Singleton: Uma classe que só ser instânciada
    UMA UNICA VEZ.
    Esta classe é private para ela mesmo ser instânciada.
*/
class FakeDatabase private constructor(){

    val quoteDao = FakeQuoteDao()

    companion object {
        @Volatile private var instance: FakeDatabase? = null

//      synchronized() garante que 2 threads,
//      não executem ao mesmo tempo
        fun getInstance() =
                instance ?: synchronized(this) {
//                  checa se a instância, já não foi chamada
                    instance ?: FakeDatabase().also { instance = it }
                }
    }
}