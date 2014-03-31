-module(daythree).
-export([run/0]).

run() -> erlang:display("hello there erlang").

%exercise one - monitor the translate_service and restart it should it die

%exercise two - make the doctor process restart itself should it die

%exercise three - make a monitor for the doctor monitor. If either monitor dies, restart it