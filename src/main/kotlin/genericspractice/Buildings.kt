package genericspractice

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood: BaseBuildingMaterial(4)

class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(private val buildingMaterial: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Type of materials: ${buildingMaterial::class.simpleName}, number of materials: $actualMaterialsNeeded")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("Large building")
}

fun main() {
    val building = Building(Wood())
    building.build()
    isSmallBuilding(Building(Brick()))
}