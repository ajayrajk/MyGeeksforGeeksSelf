package z1media

class StringProblem {

    companion object{
        fun printValue(){

            var log_dump : String = "name=John Trust, username=john3, email=john3@gmail.com, id=434453; name=Hannah Smith, username=hsmith, email=hsm@test.com, id=23312; name=Hannah Smith, username=hsmith, id=3223423, email=hsm@test.com; name=Robert M, username=rm44, id=222342, email=rm@me.com; name=Robert M, username=rm4411, id=5535, email=rm@me.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com; name=Robert Nick, username=rnick33, id=23432, email=rnick@gmail.com; name=Robert Nick II, username=rnickTemp34, id=23432, email=rnick@gmail.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com;"

            val array = log_dump.split(";")
            var map = emptyMap<String, String>()
            var set= HashSet<String>()
            var resultString=""
            for (a in array) {
                if (a.isNotEmpty())
                  map = a.split(",").associate {
                    val (left, right)   = it.split("=")

                           left.trim() to right.toString()


                 }
                if (!set.contains(map.getValue("username").toString()) ) {
                    set.add(map.getValue("username"))
                    println(map)

                     for (element in map){
                         if (element.key!="id")
                         resultString+=element.key+"="+element.value+", "
                     }
                     resultString=resultString.trim().dropLast(1)
                     resultString+= " ;"
                    }

            }
            println("result "+resultString)
        }

    }


}

fun main(){
    StringProblem.printValue()
}