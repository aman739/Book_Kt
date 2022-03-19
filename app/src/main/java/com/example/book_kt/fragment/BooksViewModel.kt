package com.example.book_kt.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.book_kt.client.ClientBooks
import com.example.book_kt.model.NameModel

class BooksViewModel : ViewModel() {
    val description = MutableLiveData<String>()


    fun getBooks(): List<NameModel> {
        return ClientBooks.getBooks()
    }

    fun putDescription(text: String) {
        description.value = text
    }


}
