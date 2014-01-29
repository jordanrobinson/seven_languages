class DayTwo
  #Ruby exercises for day one of the seven languages seven weeks book.

  def run
    array_each
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



  self
end.new.run