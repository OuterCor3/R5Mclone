package com.example.clone.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.clone.data.Entitites.ContactsEntity

@Dao
interface ContactsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertContacts(contacts:ContactsEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateContacts(contacts: ContactsEntity)

    @Delete
    suspend fun deleteContacts(contactsEntity: ContactsEntity)

    @Query("SELECT * FROM contacts")
    fun getAllContacts():LiveData<List<ContactsEntity>>

}