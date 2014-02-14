%exercise one - simple knowledge base of authors and books
book('dick', 'a scanner darkly').
book('dick', 'the man in the high castle').
book('stephenson', 'snow crash').
book('kafka', 'the metamorphosis').
book('murakami', 'after dark').
book('murakami', 'kafka on the shore').

likes('after dark').
likes('a scanner darkly').
likes('snow crash').
likes('the metamorphosis').

%exercise two - find all books written by one author
%book('dick', What).

%exercise three - knowledge base of musicians and instruments
musician('yeah yeah yeahs', 'guitar').
musician('yeah yeah yeahs', 'drums').
musician('yeah yeah yeahs', 'vocals').
musician('flaming lips', 'guitar').
musician('flaming lips', 'drums').
musician('flaming lips', 'vocals').
musician('flaming lips', 'synth').
musician('anamanaguchi', 'synth').
musician('anamanaguchi', 'vocals').

%exercise four	- find all musicians that play the guitar
%musician(What, 'guitar').
