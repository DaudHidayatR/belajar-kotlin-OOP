package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("belajar")
    note.title = ""
    println(note.title)

    val bigNote = BigNote ("Belajar")
    println(bigNote.bigTitle)
    println(bigNote.title)
}