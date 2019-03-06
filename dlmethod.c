/* An Implementation of The Duckworth Lewis Method */

#include <stdio.h>

int main(void)
{
    int t1_innings , t2_innings , overs_played , overs_left , t2_wckts_lost , t1_parscore;
    float resource;
    printf ("Enter the total innings for Team 1: ");
    scanf ("%d",&t1_innings);
    printf ("Enter the total innings for Team 2: ");
    scanf ("%d",&t2_innings);
    printf ("Enter the number of overs played by Team 2: ");
    scanf ("%d",&overs_played);
    overs_left = 50 - overs_played;
    printf ("Enter the numbers of Wickets lost by Team 2 at the stoppage of play: ");
    scanf ("%d",&t2_wckts_lost);

/* To Calculate Resource Percentage */
   if (overs_left == 50 && t2_wckts_lost == 0)
   {
        resource = 100;
   }
   else if (overs_left == 40 && t2_wckts_lost == 0) 
   {
        resource = 89.3;
   }
   else if (overs_left == 30 && t2_wckts_lost == 0) 
   {
       resource = 75.1;
   }
   else if (overs_left == 25 && t2_wckts_lost == 0) 
   {
       resource = 66.5;
   }
   else if (overs_left == 20 && t2_wckts_lost == 0) 
   {
       resource = 56.6;
   }
   else if (overs_left == 10 && t2_wckts_lost == 0) 
   {
       resource = 32.1;
   }
   else if (overs_left == 5 && t2_wckts_lost == 0) 
   {
       resource = 17.2;
   }
   else if (overs_left == 50 && t2_wckts_lost == 2) 
   {
       resource = 85.1;
   }
   else if (overs_left == 40 && t2_wckts_lost == 2) 
   {
       resource = 77.8;
   }
   else if (overs_left == 30 && t2_wckts_lost == 2) 
   {
       resource = 67.3;
   }
   else if (overs_left == 25 && t2_wckts_lost == 2) 
   {
       resource = 6.5;
   }
   else if (overs_left == 20 && t2_wckts_lost == 2) 
   {
       resource = 52.4;
   }
   else if (overs_left == 10 && t2_wckts_lost == 2) 
   {
       resource = 30.8;
   }
   else if (overs_left == 5 && t2_wckts_lost == 2) 
   {
       resource = 16.8;
   }
   else if (overs_left == 50 && t2_wckts_lost == 5) 
   {
       resource = 49;
   }
   else if (overs_left == 40 && t2_wckts_lost == 5) 
   {
       resource = 47.6;
   }
   else if (overs_left == 30 && t2_wckts_lost == 5) 
   {
       resource = 44.7;
   }
   else if (overs_left == 25 && t2_wckts_lost == 5) 
   {
       resource = 42.2;
   }
   else if (overs_left == 20 && t2_wckts_lost == 5) 
   {
       resource = 38.6;
   }
   else if (overs_left == 10 && t2_wckts_lost == 5) 
   {
       resource = 26.1;
   }
   else if (overs_left == 5 && t2_wckts_lost == 5) 
   {
       resource = 15.4;
   }
   else if (overs_left == 50 && t2_wckts_lost == 7) 
   {
       resource = 22;
   }
   else if (overs_left == 40 && t2_wckts_lost == 7) 
   {
       resource = 22;
   }
   else if (overs_left == 30 && t2_wckts_lost == 7) 
   {
       resource = 21.8;
   }
   else if (overs_left == 25 && t2_wckts_lost == 7) 
   {
       resource = 21.6;
   }
   else if (overs_left == 20 && t2_wckts_lost == 7) 
   {
       resource = 21.2;
   }
   else if (overs_left == 10 && t2_wckts_lost == 7) 
   {
       resource = 17.9;
   }
   else if (overs_left == 5 && t2_wckts_lost == 7) 
   {
       resource = 12.5;
   }
   else if (overs_left == 50 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 40 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 30 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 25 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 20 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 10 && t2_wckts_lost == 9) 
   {
       resource = 4.7;
   }
   else if (overs_left == 5 && t2_wckts_lost == 9) 
   {
       resource = 4.6;
   }

t1_parscore = t1_innings * ((100 -resource) / 100); // Calculate par score for team 1

// Output the winner
if (t1_parscore < t2_innings)
{
    printf ("Team 2 Wins \n");
}
else if (t1_parscore > t2_innings)
{
    printf ("Team 1 Wins \n");
}
else if (t1_parscore == t2_innings)
{
    printf ("Its a tie! \n");
}

return 0;


}