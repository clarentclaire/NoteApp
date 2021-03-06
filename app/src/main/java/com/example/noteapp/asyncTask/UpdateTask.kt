package com.example.noteapp.asyncTask

import android.os.AsyncTask
import com.example.noteapp.model.Note
import com.example.noteapp.roompersistence.DAO

class UpdateTask(noteDAO: DAO) : AsyncTask<Note, Void, Void>() {

    private val mNoteDAO = noteDAO

    override fun doInBackground(vararg notes: Note?): Void? {
        mNoteDAO.updateNotes(*notes)
        return null
    }
}