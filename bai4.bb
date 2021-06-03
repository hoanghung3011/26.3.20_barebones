clear Z;
incr Z;
Y:=2;
while Y not 0 do
    while Z not 0 do
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
clear Z;
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
        incr Z;
        decr Y1;
    end;

 
    while X1 not 0 do
        decr Z;
        decr X1;
    end;

 

    if Z not 0 then
        Z:=1;
    else
	Z:=0;
    end;
    clear Y;
end;