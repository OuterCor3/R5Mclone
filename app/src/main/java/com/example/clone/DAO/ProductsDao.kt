package com.example.clone.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.clone.data.Entitites.BrushCutterEntity
import com.example.clone.data.Entitites.DrillEntity
import com.example.clone.data.Entitites.ElectricSawEntity
import com.example.clone.data.Entitites.GrinderEntity
import com.example.clone.data.Entitites.WaterPumpEntity

@Dao
interface WaterPumpDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWaterump(waterpump: WaterPumpEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateWaterpump(waterpump: WaterPumpEntity)

    @Delete
    suspend fun deleteWaterpump(waterpump:WaterPumpEntity)

    @Query("SELECT * FROM water_pump")
    suspend fun getAllwaterpump():LiveData<List<WaterPumpEntity>>

    @Query("SELECT * FROM water_pump WHERE product_id =:waterpumpId")
    suspend fun getWaterpump(waterpumpId:Int):LiveData<WaterPumpEntity>
}

@Dao
interface GrinderDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertGrinder(grinder:GrinderEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateGrider(grinder: GrinderEntity)

    @Delete
    suspend fun deleteGrinder(grinder: GrinderEntity)

    @Query("SELECT * FROM grinder")
    suspend fun getAllGrinder():LiveData<List<GrinderEntity>>


    @Query("SELECT * FROM grinder WHERE product_id=:grinderId")
    suspend fun getGrinder(grinderId:Int):LiveData<GrinderEntity>

}
@Dao
interface DrillDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDriill(grill:DrillEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateDrill(drill:DrillEntity)

    @Delete
    suspend fun delete(drill: DrillEntity)

    @Query("SELECT * FROM drill")
    suspend fun getAllDrill():LiveData<List<DrillEntity>>

    @Query("SELECT * FROM drill WHERE product_id=:drillId")
    suspend fun getDrill(drillId:Int):LiveData<DrillEntity>

}
@Dao
interface ElectricSawDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertElectricSaw(electricSaw:ElectricSawEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateElectricSaw(electricSaw:ElectricSawEntity)

    @Delete
    suspend fun deleteElectricSaw(electricSaw: ElectricSawEntity)

    @Query("SELECT * FROM electric_saw")
    suspend fun getAllelectricSaw():LiveData<List<ElectricSawEntity>>

    @Query("SELECT * FROM electric_saw WHERE product_id=:electricsawId")
    suspend fun getElectricSaw(electricsawId:Int):LiveData<ElectricSawEntity>
}
@Dao
interface BrushCutterdDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBrushCutter(brushCutter:BrushCutterEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateBrushCutter(brushCutter: BrushCutterEntity)


}