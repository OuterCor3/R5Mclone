package com.example.clone.data.Entitites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "login_credentials")

data class CredentialEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo(name = "user_name") val username:Int,
    @ColumnInfo(name = "password") val password: Int
)

