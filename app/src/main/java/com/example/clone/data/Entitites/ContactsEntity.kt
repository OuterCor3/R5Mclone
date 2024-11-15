package com.example.clone.data.Entitites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class ContactsEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "suppliers_name") val suppliersName: String,
    @ColumnInfo(name = "contact_number") val contactNumber: Int
)
