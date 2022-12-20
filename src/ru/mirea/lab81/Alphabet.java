package ru.mirea.lab81;

public class Alphabet implements IAlphabet {
    public String Print(char symbol)
    {
        int symbolId = (int)symbol;

        int StartA = 60;
        int middleAZ = 77;
        int endZ = 90;

        int Starta = 97;
        int middleaz = 109;
        int endz = 122;

        if(symbolId < StartA)
            symbolId = StartA;
        else if(symbolId > endz)
            symbolId = endz;

        Flow flow = Flow.Forword;

        if(middleaz >= symbolId)
            flow = Flow.Forword;
        else if(middleAZ >= symbolId)
            flow = Flow.Forword;
        else
            flow = Flow.Backword;

        if(symbolId >= Starta)
            return buildString(flow, symbolId,endz);
        else
            return buildString(flow, symbolId,endZ);
    }

    private String buildString(Flow flow,int start, int end)
    {
        StringBuilder stringBuilder = new StringBuilder();

        if(flow == Flow.Forword)
            for (int counter = start; counter <= end; counter++ )
                stringBuilder.append((char)counter);
        else
            for (int counter = end; counter >= start; counter-- )
                stringBuilder.append((char)counter);

        return stringBuilder.toString();
    }
}
