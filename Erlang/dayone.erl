-module(dayone).
-export([run/0]).
-export([counting/0]).
-export([counting/1]).

run() -> io:fwrite(count_words("hello")).

counting(N) -> if
                 N < 11 ->
                   io:fwrite("~w ", [N]),
                   counting(N + 1);
                 N == 11 ->
                   N
               end.

counting() -> counting(1).

words_in_string(Input) -> [_ | Tail] = Input, 1 + words_in_string(Input).

list_length([]) -> 0;
list_length(String) ->
  [_ | Tail] = String,
  1 + list_length(Tail).
count_words(Text) ->
  R = re:split(Text, " "),
  list_length(R).
