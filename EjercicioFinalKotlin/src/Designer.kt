class Designer(name:String,salary: Double):Employees(name,salary) {
    override fun work() {
        println("Creating and optimizing visual design")
    }
    override fun calculateAnnualBonus(emp:Employees): Double {
        val bonus: Double=0.15
        return emp.salary*bonus
    }

    override fun details(){
        println("Empleado de nombre: $name y salario: $salary")
    }
}