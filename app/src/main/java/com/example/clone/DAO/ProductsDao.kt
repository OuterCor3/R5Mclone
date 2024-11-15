package com.example.clone.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.clone.data.Entitites.BrushCutterEntity
import com.example.clone.data.Entitites.DrillEntity
import com.example.clone.data.Entitites.ElectricSawEntity
import com.example.clone.data.Entitites.GrinderEntity
import com.example.clone.data.Entitites.HeatGunEntity
import com.example.clone.data.Entitites.HydraulicJacksEntity
import com.example.clone.data.Entitites.VacuumEntity
import com.example.clone.data.Entitites.WaterPumpEntity
import com.example.clone.data.Entitites.WeldingMachineEntity
import org.jetbrains.annotations.ApiStatus.Internal

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
interface BrushCutterDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBrushCutter(brushCutter:BrushCutterEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateBrushCutter(brushCutter: BrushCutterEntity)

    @Delete
    suspend fun deleteBrushCutter(brushCutter: BrushCutterEntity)

    @Query("SELECT * FROM brush_cutter")
    suspend fun getAllBrushCutter():LiveData<List<BrushCutterEntity>>

    @Query("SELECT * FROM brush_cutter WHERE product_id=:brushcutterId")
    suspend fun getBrushCutter(brushcutterId:Int):LiveData<BrushCutterEntity>

}
@Dao
interface WeldingMachineDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWeldingMachine(weldingmachine:WeldingMachineEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateWeldingMachine(weldingmachine: WeldingMachineEntity)

    @Delete
    suspend fun deleteWeldingMachine(weldingmachine: WeldingMachineEntity)

    @Query("SELECT * FROM welding_machine")
    suspend fun getAllWeldingMachine():LiveData<List<WeldingMachineEntity>>

    @Query("SELECT * FROM welding_machine WHERE product_id=:weldingmachineId")
    suspend fun getWeldingMahcine(weldingmachineId:Int):LiveData<WeldingMachineEntity>


}
@Dao
interface VacuumDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertVacuum(vacuum:VacuumEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateVacuum(vacuum: VacuumEntity)

    @Delete
    suspend fun deleteVacuum(vacuumEntity: VacuumEntity)

    @Query("SELECT * FROM `vacuum`")
    suspend fun getAllVacuum():LiveData<List<VacuumEntity>>

    @Query("SELECT * FROM `vacuum` WHERE product_id=:vacuumId")
    suspend fun getVacuum(vacuumId:Int):LiveData<VacuumEntity>


}
@Dao
interface HeatGunDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertHeatGun(heatgun:HeatGunEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateHeatGun(heatgun: HeatGunEntity)

    @Delete
    suspend fun deleteHeatGun(heatgun: HeatGunEntity)

    @Query("SELECT * FROM heat_gun")
    suspend fun getAllHeatGun():LiveData<List<HeatGunEntity>>

    @Query("SELECT * FROM heat_gun WHERE product_id=:heatgunId")
    suspend fun getHeatGun(heatgunId:Int):LiveData<HeatGunEntity>
}
@Dao
interface HydraulicJacksDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertHydraulicJacks(hydraulicJacks:HydraulicJacksEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateHydrauclicJacks(hydraulicJacks: HydraulicJacksEntity)

    @Delete
    suspend fun deleteHydraulicJacks(hydraulicJacks: HydraulicJacksEntity)

    @Query("SELECT * FROM hydraulic_jacks")
    suspend fun getAllHydrauicJacks():LiveData<List<HydraulicJacksEntity>>

    @Query("SELECT * FROM hydraulic_jacks WHERE product_id =:hydraulicjacksId")
    suspend fun getHydraulicJacks(hydraulicjacksId:Int):LiveData<HydraulicJacksEntity>


}