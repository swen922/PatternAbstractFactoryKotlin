import combatvehicle.CombatVehicle
import factory.*

class App {
    public val factory : Factory
    private  val cv : CombatVehicle
    constructor(f : Factory) {
        this.factory = f
        this.cv = f.makeCombatVehicle()
    }

    fun useCV() {
        cv.drive()
        cv.shoot()
    }

}


fun main(args : Array<String>) {
    val a1 = App(IFVFactory())
    a1.useCV()

    val a2 = App(SPAIFactory())
    a2.useCV()

    val a3 = App(TankFactory())
    a3.useCV()
}