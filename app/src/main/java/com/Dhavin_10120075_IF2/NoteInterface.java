package com.Dhavin_10120075_IF2;

import android.database.Cursor;

import com.Dhavin_10120075_IF2.model.Note;

/**
 * NAMA    : Dhavin Ilham Zulfah
 * NIM     : 10120075
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
