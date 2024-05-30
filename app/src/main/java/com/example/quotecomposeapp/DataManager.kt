package com.example.quotecomposeapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotecomposeapp.models.Quotes
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {

    var currentQuote:Quotes?=null
    var data= emptyArray<Quotes>()
    var currentPage= mutableStateOf(Pages.LISTING)
    var isDataLoaded= mutableStateOf(false)
    fun loadAssetfromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer, Charsets.UTF_8)
        val gson= Gson()
        data=gson.fromJson(json,Array<Quotes>::class.java)
 isDataLoaded.value=true

    }

    fun     switchPages(quote:Quotes?){
        if (currentPage.value==Pages.LISTING){
            currentQuote=quote
            currentPage.value=Pages.DETAIL
        }else{
            currentPage.value=Pages.LISTING
        }
    }
}