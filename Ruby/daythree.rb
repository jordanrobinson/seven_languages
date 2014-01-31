module ActsAsCsv
  def self.included(base)
    base.extend ClassMethods
  end

  module ClassMethods
    def acts_as_csv
      include InstanceMethods
    end
  end

  module InstanceMethods
    def read
      @rows = []
      @csv_contents = []
      filename = self.class.to_s.downcase + '.txt'
      file = File.new(filename)
      @headers = file.gets.chomp.split(', ')

      file.each do |row|
        csv_contents << row.chomp.split(', ')
        @rows << CsvRow.new(@headers, csv_contents)
      end
    end

    def each &block
      @rows.each &block
    end

    attr_accessor :headers, :csv_contents, :rows
    def initialize
      read
    end
  end
end

class CsvRow

  def initialize header_row, content_row
    @header_row = header_row
    @content_row = content_row
  end

  def method_missing name, *args
    puts name.to_s
    content_index = @header_row.index(name.to_s)
    puts content_index
    @content_row[content_index]
  end

  attr_accessor :content_row, :header_row
end

class RubyCsv  # no inheritance! You can mix it in
  include ActsAsCsv
  acts_as_csv
end

m = RubyCsv.new

m.each {|row| puts row.first}
