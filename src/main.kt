fun main() {
     var y= numb(listOf("Jane","Elizabeth","Macklin","Trousment","Kyomukama","Ahumuza","Hellen","Mugume","Mercy","Sara"))
println(y)
    var w=people(listOf(1,34,5,45,33,3))
    println(w)
    var m=person("Jane",23,45,74F)
    var m2=person("Sam",12,45,67F)
    var them= listOf(m.age,m2.age,)
    var sorted=them.sortedDescending()
    println(sorted)
    var mycar=car("Ug 23",500.0)
    var toyota=car("Ky 231",490.0)
    var subaru=car("Nj230",500.0)
   println( good(listOf(mycar,toyota,subaru)))



}
fun numb(names:List<String>):List<String> {
    var themList= mutableListOf<String>()
    names.forEachIndexed { index, i ->
        if (index % 2 == 0)
themList.add(i)
        }
        return themList

    }
fun people(persons:List<Int>):String{
    var y=persons.average()
    var x=persons.sum()
    var v="average is $y the sum is $x"
    return v
}
class person(var name:String,var age:Int,var height:Int, var weight:Float)

data class car(var registration:String,var mileage:Double)
fun good(galax:List<car>):Double{
    var sum=0.0
    var x=galax.count()
    var t=galax.forEach{i->
        sum+=i.mileage

    }
    return sum/x
}



