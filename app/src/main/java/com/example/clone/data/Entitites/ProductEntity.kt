package com.example.clone.data.Entitites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "water_pump")
data class WaterPumpEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0
)
@Entity(tableName = "grinder")
data class GrinderEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "drill")
data class DrillEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "electric_saw")
data class ElectricSawEntity(


    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "brush_cutter")
data class BrushCutterEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)

@Entity(tableName = "welding_machine")
data class WeldingMachineEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "vacuum")
data class VacuumEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "heat_gun")
data class HeatGunEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)
@Entity(tableName = "hydraulic_jacks")
data class HydraulicJacksEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="product_id")
    val productId: Int = 0,
    @ColumnInfo(name ="category")
    val productName: String,
    @ColumnInfo(name ="modelId")
    val modelId: String,
    @ColumnInfo(name = "qty") val quantity: Int = 0

)



