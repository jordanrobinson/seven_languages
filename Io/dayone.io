//exercise one, strongly typed, as there seems to be no type coercion
//1 + 1 print
//1 + "one" print

//exercise two
0 and true println //true
"" and true println //true
nil and true println //no output :(
if (nil) println //false
"" println //output formatting
"" println

//exercise three
Object slotNames println
"" println
"" println

//exercise four
Car := Object clone //assign to non-existant slot
Car wheels := 4
Car wheels = 6 //assign to an existing slot
Car doors ::= 4 //assign to non-existant slot, and creates setter (should now have setDoors)
Car slotNames println
"" println
"" println

//exercise five
//Run code from a file. That would be this file! Huzzah!

//exercise six
Car radio := method("Hello Car" println)
Car radio
"" println