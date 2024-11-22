package com.example.clone.Databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clone.DAO.CredentialsDao
import com.example.clone.data.Entitites.CredentialEntity

@Database(entities = [CredentialEntity::class], version  = 1, exportSchema = true)
abstract class CredentialDatabase : RoomDatabase() {
    abstract fun credentialsDao(): CredentialsDao

    companion object {
        @Volatile
        private var INSTANCE: CredentialDatabase? = null

        fun getDatabase(context: Context): CredentialDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context, CredentialDatabase::class.java, "credential_database"
                ).build()
                INSTANCE = instance
                instance
            }

        }
    }
}
