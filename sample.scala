object sample {
def main(args: Array[String]) {
var a = List(1,2,3,4,5,6,7,8,9,10)
var result = for { numList <- a if numList != 3; if numList < 8 }yield numList
for (i <- result) {
println("value of i is : " + i)
}
}
}