package com.company;

public class StudentRecord
{
    private int[] scores;

    public StudentRecord(int[] scores)
    {
        this.scores = scores;
    }

    private double average(int first, int last)
    {
        double num = 0;
        for (int i = first; i < last; i++)
        {
            num+= scores[i];
        }
        return num/(last-first);
    }

    private boolean hasImproved()
    {
        for (int i = 0; i < scores.length - 1; i++)
        {
            if (scores[i + 1] < scores[i])
                return false;
        }
        return true;
    }

    public double finalAverage()
    {
        if (hasImproved())
            return average(scores.length/2, scores.length);
        else
            return average(0, scores.length);
    }
}
