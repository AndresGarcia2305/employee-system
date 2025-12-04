open abstract class Employees(val name: String, val salary: Double) : Evaluable{
   abstract fun work()
    abstract fun calculateAnnualBonus(emp:Employees): Double
    open fun details(){
        println("El empleado de nombre: $name y salario: $salary")
    }

    override fun evaluatePerformance() {
        println("Buen empleado")
    }

}