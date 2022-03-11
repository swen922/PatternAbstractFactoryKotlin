package factory

import combatvehicle.*

class IFVFactory : Factory {
    override fun makeCombatVehicle(): CombatVehicle {
        return IFV()
    }
}

class SPAIFactory : Factory {
    override fun makeCombatVehicle(): CombatVehicle {
        return SPAI()
    }
}

class TankFactory : Factory {
    override fun makeCombatVehicle(): CombatVehicle {
        return Tank()
    }
}
