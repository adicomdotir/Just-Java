fun main(args: Array<String>) {
    try {
        val myVar:Int = 12;
        val v:String = "My Message";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace();
    } finally {
        println("Exception Handeling in Kotlin");
    }
}
