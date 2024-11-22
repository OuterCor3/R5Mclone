package com.example.clone.Databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clone.DAO.ContactsDao
import com.example.clone.DAO.CredentialsDao
import com.example.clone.data.Entitites.ContactsEntity

@Database(entities = [ContactsEntity::class], version = 1 , exportSchema = false)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactsDao

    companion object {
        @Volatile
        private var INSTANCE: ContactDatabase? = null

        fun getDatabase(context: Context): ContactDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ContactDatabase::class.java,"contact_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}