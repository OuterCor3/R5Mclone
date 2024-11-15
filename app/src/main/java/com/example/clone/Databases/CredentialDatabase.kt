package com.example.clone.Databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clone.data.Entitites.CredentialEntity

@Database(entities = [CredentialEntity::class], version  = 1, exportSchema = false)
abstract class CredentialDatabase : RoomDatabase() {

    abstract class
    }