
fun main(){
    println(calcularPrecio(21,"Sergio"))
    println(calcularPrecio2("Sergio", 21))
}

fun calcularPrecio(edad : Int, nombre : String) : String {

    var mensaje = ""

    when{
        edad<18 -> mensaje="$nombre,debes abonar 5 euros"
        edad in 18..65 -> mensaje="$nombre,debes abonar 10 euros"
        edad>65 -> mensaje="$nombre,para ti es gratis"
    }
    return(mensaje)
}
fun calcularPrecio2(nombre: String, edad: Int) : String {
    if (edad < 18) {
        return "$nombre, debes abonar 5€"
    } else if( edad < 65) {
        return "$nombre, debes abonar 10€"
    } else {
        return "$nombre, para ti es gratis"
    }
}