class shift
{
    public static void main (String[]args)
    {
        int k[]={1,2,3,4,5,6,7,8};
        int j[] = {0,0,0,0,0,0,0,0};
        int m = 0;
        for(int i=(k.length)-1;i >= 0;i--)
        {
            j[m]=k[i];
            m++;
        }
        System.out.println("\nactual array");
          for(int i=0;i<k.length;i++)
        {
            System.out.print(k[i]+ "\t");
        }

        System.out.println("\n\nshifted array");
          for(int i=0;i<j.length;i++)
        {
            System.out.print(j[i]+"\t");
        }


       


    }




}