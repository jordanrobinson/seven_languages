//exercise one - fibonacci sequence
fib := method (end, x := 1
y := 1
z := 0
x println
y println
for(z, 1, end,
 (z = x) (x = y) (y = z + x) (x + y println)) 
 )

//fib(20)

//exercise two - / operator
//Number divMethod := Number getSlot("/") //we want to use the original div
//Number / = method(x, if(x == 0, 0 self divMethod(x))) //but check against 0 as well

//10 / 2 println
//10 / 1 println
//10 / 0 println

//exercise three - sum a 2d list

x := list(1, 2, 3)
y := list(4, 5, 6)
z := list(x,y)

sumall := method(array, array flatten sum)

sumall(z) println

//exercise four - myAverage function

List myAverage := method(self sum / self size)

x myAverage println

