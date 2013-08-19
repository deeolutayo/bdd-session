Given /^a library$/ do
  @library = Library.new
end

When /^I add a book '(.+)' to the library$/ do |title|
  add_book_to_library(title)
end

Then /^the book should be available in the library$/ do
  @library.has_book(@book).should be_true
end

Given /^a book '(.+)' in the library$/ do |title|
  @library = Library.new
  add_book_to_library(title)
end

When /^I search for '(.+)'$/ do |title|
  @book_search_result = @library.find_book(title)
end

Then /^I should find the book$/ do
  @book_search_result.should == @book
end

When /^I reserve the book$/ do
  @library.reserve_for_user(@book, User.new)
end

Then /^the book should be added to the library's reservations$/  do
  @library.reservation_exists_on(@book).should be_true
end


def add_book_to_library(title)
  @book = Book.new(title)
  @library.add(@book)
end