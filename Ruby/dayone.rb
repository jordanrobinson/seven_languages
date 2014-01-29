class DayOne
  #Ruby exercises for day one of the seven languages seven weeks book.

  def run
#Pring the string "Hello, World"
    puts "Hello, World"
#For the string "Hello, Ruby", find the index of the word "Ruby"
    puts "Hello, Ruby".index("Ruby")
#Print your name ten times
    x = 0
    until x == 10
      puts "Jordan Robinson"
      x += 1
      puts x
    end
#Print the string "this is sentence number 1", where the number 1 changes from 1 to 10
    for i in 0..10
      puts "this is sentence number " + i.to_s
    end

    number_guesser
  end

#bonus problem
  def number_guesser
    x = rand(10)
    continue = true

    puts "Begin!"
    input = gets

    while continue
      if Integer(input) == x
        puts "Correct!"
        continue = false
      elsif Integer(input) < x
        puts "too low"
        input = gets
      elsif Integer(input) > x
        puts "too high"
        input = gets
      end
    end
  end

  self
end.new.run