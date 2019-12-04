class Garaje (var nombre: String, var maxp: Int){
    var libre = maxp //Variable de control de plazas libres
    fun aparcamiento(entrada: coche){
        var c1=entrada
        if(libre==0){ //Si el garaje esta completo lo imprime en pantalla
            println("Garaje completo")
        }else { //Si hay plaza, imprime la info del coche y reduce las plazas libre
            println("Coche aparcado con matricula:${c1.matricula}\nhora de entrada: ${c1.tentrada}\nHora de salida:${c1.tsalida}")
            libre--
        }
    }
}