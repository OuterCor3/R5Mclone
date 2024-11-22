package com.example.clone.Databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clone.DAO.BrushCutterDao
import com.example.clone.DAO.DrillDao
import com.example.clone.DAO.ElectricSawDao
import com.example.clone.DAO.GrinderDao
import com.example.clone.DAO.HeatGunDao
import com.example.clone.DAO.HydraulicJacksDao
import com.example.clone.DAO.VacuumDao
import com.example.clone.DAO.WaterPumpDao
import com.example.clone.DAO.WeldingMachineDao
import com.example.clone.data.Entitites.BrushCutterEntity
import com.example.clone.data.Entitites.DrillEntity
import com.example.clone.data.Entitites.ElectricSawEntity
import com.example.clone.data.Entitites.GrinderEntity
import com.example.clone.data.Entitites.HeatGunEntity
import com.example.clone.data.Entitites.HydraulicJacksEntity
import com.example.clone.data.Entitites.VacuumEntity
import com.example.clone.data.Entitites.WaterPumpEntity
import com.example.clone.data.Entitites.WeldingMachineEntity

@Database(entities = [WaterPumpEntity::class,GrinderEntity::class,DrillEntity::class,ElectricSawEntity::class,
    BrushCutterEntity::class,WeldingMachineEntity::class,VacuumEntity::class,HeatGunEntity::class,HydraulicJacksEntity::class] , version = 1, exportSchema = true)
abstract class ProductDatabase : RoomDatabase() {
    abstract fun waterpumpDao(): WaterPumpDao
    abstract fun grinderDao(): GrinderDao
    abstract fun drillDao(): DrillDao
    abstract fun electricsawDao(): ElectricSawDao
    abstract fun brushcutterDao(): BrushCutterDao
    abstract fun weldingmachineDao(): WeldingMachineDao
    abstract fun vacuumDao(): VacuumDao
    abstract fun heatgunDao(): HeatGunDao
    abstract fun hydraulicDjacksDao(): HydraulicJacksDao

    companion object {
        @Volatile
        private var INSTANCE: ProductDatabase? = null

        fun getDatabase(context: Context): ProductDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProductDatabase::class.java,
                    "product_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}