clear Z;
clear kq;
incr kq;
clear re;
while Y not 0 do
    while kq not 0 do
        clear W;
        while X not 0 do
            decr X;
            decr Y;
            incr W;
        end;
        while W not 0 do
            incr Y;
            decr W;
        end;
        incr Z;
clear kq;
clear X1;
    clear Temp;
    while X not 0 do
        incr X1;
        incr Temp;
        decr X;
    end;
    while Temp not 0 do
        incr X;
        decr Temp;
    end;
clear Y1;
    clear Temp;
    while Y not 0 do
        incr Y1;
        incr Temp;
        decr Y;
    end;
    while Temp not 0 do
        incr Y;
        decr Temp;
    end;

 

    while Y1 not 0 do
        incr kq;
        decr Y1;
    end;

 
    while X1 not 0 do
        decr kq;
        decr X1;
    end;

 

    if kq not 0 then
        #kq <- X
        clear kq;
        clear Temp;
        while X not 0 do
                incr kq;
                incr Temp;
                decr X;
        end;
        while Temp not 0 do
                incr X;
                decr Temp;
        end;
    end;
    clear N;
end;