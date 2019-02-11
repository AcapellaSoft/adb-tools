package ru.acapella.db

import sqlline.SqlLine

fun main(args: Array<String>) {
    SqlLine.main(arrayOf("-d", "ru.acapella.db.jdbc.Driver", *args))
}