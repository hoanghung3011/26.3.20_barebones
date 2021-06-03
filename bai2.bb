clear Y;
clear Temp;
while X not 0 do
    incr Y;
    incr Temp;
    decr X;
end;
while Temp not 0 do
    incr X;
    decr Temp;
end;
clear M;
clear Temp;
while X not 0 do
    incr M;
    incr Temp;
    decr X;
end;
while Temp not 0 do
    incr X;
    decr Temp;
end;
clear Z;
while X not 0 do
    clear W;
    while Y not 0 do
        incr Z;
        incr W;
        decr Y;
    end;
    while W not 0 do
        incr Y;
        decr W;
    end;
    decr X;
end;
clear P;
while Z not 0 do
    incr P;
    decr Z;
end;
while M not 0 do
    incr P;
    decr M;
end;
N:=2
clear Z;
clear kq;
incr kq;
while N not 0 do
    while kq not 0 do
        clear W;
        while X not 0 do
            decr P;
            decr N;
            incr W;
        end;
        while W not 0 do
            incr N;
            decr W;
        end;
        incr Z;
    end;
    clear N;
end;
