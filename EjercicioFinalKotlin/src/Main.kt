//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val empleados=mutableListOf<Employees>()

    val m1=Manager("Carlos Jose",1050.50)
    val dv1=Developer("Luis",1250.25)
    val ds1=Designer("José Luis",8500.24)

    empleados.add(m1)
    empleados.add(dv1)
    empleados.add(ds1)

    for (emp in empleados) {
        emp.work()
        println(emp.calculateAnnualBonus(emp))
        emp.details()
    }

    m1.evaluatePerformance()
    dv1.evaluatePerformance()
    ds1.evaluatePerformance()
}