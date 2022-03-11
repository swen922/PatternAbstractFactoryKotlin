package combatvehicle

class IFV : CombatVehicle {
    override fun drive() {
        println("BZ-Z-Z-Z-ZZ! IFV!")
    }

    override fun shoot() {
        println("DYH-DYH-DYH-DYH! IFV!")
    }
}

class SPAI : CombatVehicle {
    override fun drive() {
        println("TR-TR-TR-TR-TR! SPAI")
    }

    override fun shoot() {
        println("TRAAA-BAA-BAAAHHHHHH!  SPAI")
    }
}

class Tank : CombatVehicle {
    override fun drive() {
        println("R-R-R-R-R-R-R! TANK!")
    }

    override fun shoot() {
        println("BABAHHHH!! TANK!")
    }
}