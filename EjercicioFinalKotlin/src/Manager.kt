class Manager(name:String, salary: Double):Employees(name,salary) {
    override fun work() {
        println("Supervising the team and planning projects")
    }

    override fun calculateAnnualBonus(emp: Employees): Double {
        val bonus: Double=0.2
        return emp.salary*bonus
    }

    override fun details(){
        println("Empleado de nombre: $name y salario: $salary")
    }
}