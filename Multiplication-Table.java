public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
    
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        // Your code goes here!!!
        
        //2 for loops, both go to 10, multiplying. 
        
        //start at 1, end at equal to 10, increase by 1
        for(int i=1; i <=10; i++)
        {
            //start at 1, end at equal to 10, increase by 1. 
            for(int m=1; m<= 10; m++)
            {
                //this will multiply and print the result and will also
                //evenly space out the results. 
                System.out.print(i * m + "\t");
            }
            
            //will create a new line for the next row of multiples to go on. 
            System.out.println("");
        }
    }
}