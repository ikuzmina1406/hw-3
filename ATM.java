class ATM
{
  public int countBanknotes(int sum){
  int[] noteValues= {500,200,100,50,20,10,5,2,1};
  int count = 0;
  int i = 0;
    
    while (i<noteValues.length &&sum!=0){
    if(sum>=noteValues[i])
               count+=sum/noteValues[i];
           
                
             sum=sum%noteValues[i];
      i++;
    }
  
    
    
    return count;
  }
  
} 
