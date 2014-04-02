-module(daythree).
-behaviour(supervisor). %using the supervisor to monitor and restart translation
-export([run/0, loop/0, start/0, translate/1]).

run() -> erlang:display("hello there erlang").

%exercise one - monitor the translate_service and restart it should it die

%the translate service:
loop() ->

  receive
    {From, "casa"} ->
      From ! "house",
      loop();

    {From, "blanca"} ->
      From ! "white",
      loop();

    {From, Message} ->
      From ! "I don't understand.",
      exit({Message, not_understood, received_at, erlang:time()})
  end.

translate(Word) ->
  translator ! {self(), Word},
  receive
    Translation -> Translation
  end.

%the monitor:
start() ->
  register(translator, spawn_link(translate_service_sup, loop, [])),
  {ok, whereis(translator)}.



%exercise two - make the doctor process restart itself should it die

%exercise three - make a monitor for the doctor monitor. If either monitor dies, restart it