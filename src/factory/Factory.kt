package factory

import combatvehicle.CombatVehicle

interface Factory {
    fun makeCombatVehicle() : CombatVehicle
}

