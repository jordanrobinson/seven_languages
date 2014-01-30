class DayTwo
  #Ruby exercises for day one of the seven languages seven weeks book.

  def run
    array_each

    simple_grep
  end

  def array_each
    a = []
    for i in 0..15
      a << i
    end

    a.each do |i|
      if a.rindex(i) % 4 == 0
        puts a[a.rindex(i)..a.rindex(i)+3].join(" ")
      end
    end
  end

  def simple_grep
    catch_group = 'sdf'

    count = 0
    File.open('daytwo.txt', 'r') do |file|
      while line = file.gets
        count += 1

        if line.include? catch_group
          print count
          puts ' ' + line
        end


      end
    end
  end





  self
end.new.run