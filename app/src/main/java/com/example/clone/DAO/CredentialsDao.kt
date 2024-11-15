package com.example.clone.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.example.clone.data.Entitites.CredentialEntity

@Dao
interface CredentialsDao {

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateCredentials(cred:CredentialEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCredentials(cred: CredentialEntity)
}