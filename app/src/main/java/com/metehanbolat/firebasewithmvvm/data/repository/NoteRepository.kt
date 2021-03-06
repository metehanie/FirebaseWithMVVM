package com.metehanbolat.firebasewithmvvm.data.repository

import com.metehanbolat.firebasewithmvvm.data.model.Note
import com.metehanbolat.firebasewithmvvm.util.UiState

interface NoteRepository {

    fun getNotes(result: (UiState<List<Note>>) -> Unit)
    fun addNote(note: Note, result: (UiState<Pair<Note, String>>) -> Unit)
    fun updateNote(note: Note, result: (UiState<String>) -> Unit)
    fun deleteNote(note: Note, result: (UiState<String>) -> Unit)
}