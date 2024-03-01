package com.example.contact.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Contact::class],
    version = 1
)
abstract class Database:RoomDatabase() {
    abstract val dao:ContactDao
}