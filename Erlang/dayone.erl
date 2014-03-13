-module(dayone).
-export([run/0]).
-export([counting/0]).
-export([counting/1]).

run() -> counting().

counting(N) -> if
                 N < 11 ->
                   io:fwrite("~w ", [N]),
                   counting(N + 1);
                 N == 11 ->
                   N
               end.

counting() -> counting(1).
