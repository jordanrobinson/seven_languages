-module(daytwo).
-export([run/0]).
-export([process_list/2]).
-export([quantity_comprehension/1]).

%run() -> io:fwrite(process_list(y, [{x,"fire"},{y,"fira"},{z,"firaga"}])).
run() -> erlang:display(quantity_comprehension([{pen, 1, 3}, {pencil, 2, 5}, {robopencil, 4, 13}])).

% exercise one - write a function that accepts a list and keyword, and returns the associated value for the keyword
process_list(Word, List) ->
  Tuple = lists:keyfind(Word, 1, List),
  case Tuple of
    {Word, Value} -> Value;
    _ -> false
  end
.

% exercise two - write a list comprehension that builds a list of items of the form
% [{item,quantity,price},...] where total price is quantity times price
quantity_comprehension(List) ->
  [{Item, (Quantity * Price)} || {Item, Quantity, Price} <- List]. %This is surprisingly elegant