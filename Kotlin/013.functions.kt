
fun main(args: Array<String>) {
    // val lambdaName : Type = { argumentList -> codeBody }
    val mylambda :(String) -> Unit  = {s:String -> print(s)}
    val v:String = "Adicom.ir"
    mylambda(v)
}