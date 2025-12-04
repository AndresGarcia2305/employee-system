class Developer( name: String, salary: Double) :Employees(name,salary) {
    override fun work(){
        println("Writing a reviewing code")
    }

    override fun calculateAnnualBonus(emp:Employees): Double{
        val bonus: Double=0.1
        return emp.salary*bonus
    }

    override fun details(){
        println("Empleado de nombre: $name y salario: $salary")
    }
}