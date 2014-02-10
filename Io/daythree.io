//exercise one - modify builder to show indent levels
counter := 0

indent := method(counter, counter repeat(" " print))

Builder := Object clone
Builder forward := method(
  counter = counter + 1
  indent(counter)
  writeln("<", call message name, ">")
    counter = counter + 1
  call message arguments foreach(
	arg, 
	content := self doMessage(arg); 
	if(content type == "Sequence", indent(counter) writeln(content)))
	counter = counter - 1
  indent(counter)
  counter = counter - 1
  writeln("</", call message name, ">"))
Builder  ul(
	li("Io"), 
	li("Lua"), 
	li("JavaScript"))

//output looks like:
// <ul>
//   <li>
//    Io
//   </li>
//   <li>
//    Lua
//   </li>
//   <li>
//    JavaScript
//   </li>
// </ul>

//exercise two - create a list syntax that uses brackets

curlyBrackets := method (call message arguments)

{1,2,3} println
