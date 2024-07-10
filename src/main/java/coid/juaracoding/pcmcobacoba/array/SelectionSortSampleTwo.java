package coid.juaracoding.pcmcobacoba.array;

public class SelectionSortSampleTwo {

	static StringBuilder sBuild = new StringBuilder();

    public static void main(String[] args)
    {
        int val[] = {69,89,31,56,99};
        double ipk[] = {4.0,1.1,3.2,3.9,2.4};
        String []nameList = {"Nirmala","Ayam","Monalisa","Elena","Lamida","Ebuset","Susi","Similikiti"};
        char []characters = {'V','K','Z','X','H','M','C','N'};

        String bef = "";
        String aft = "";
        int initz = 0;
        int intContainer = 0;
        double doubleContainer = 0.0;
        String strContainer = "";
        char charContainer = 'b';
        //DESC INT
        sBuild.setLength(0);
        //before
        System.out.println("==BEFORE==");
        for (int num:val)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < val.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=val.length-1)
            {
                for (int j = i ; j < val.length ; j++)
                {
                    if(val[initz] < val[j])
                    {
                        initz = j;
                    }
                }
            }
            intContainer = val[i];
            val[i] = val[initz];
            val[initz] = intContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:val)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));


        //ASC INT
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (int num:val)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < val.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=val.length-1)
            {
                for (int j = i ; j < val.length ; j++)
                {
                    if(val[initz] > val[j])
                    {
                        initz = j;
                    }
                }
            }
            intContainer = val[i];
            val[i] = val[initz];
            val[initz] = intContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:val)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //desc double
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (double num:ipk)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < ipk.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=ipk.length-1)
            {
                for (int j = i ; j < ipk.length ; j++)
                {
                    if(ipk[initz] < ipk[j])
                    {
                        initz = j;
                    }
                }
            }
            doubleContainer = ipk[i];
            ipk[i] = ipk[initz];
            ipk[initz] = doubleContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (double num:ipk)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //asc double
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (double num:ipk)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < ipk.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=ipk.length-1)
            {
                for (int j = i ; j < ipk.length ; j++)
                {
                    if(ipk[initz] > ipk[j])
                    {
                        initz = j;
                    }
                }
            }
            doubleContainer = ipk[i];
            ipk[i] = ipk[initz];
            ipk[initz] = doubleContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (double num:ipk)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //ASCENDING / ASC ADALAH MENGURUTKAN DATA DARI KECIL KE BESAR
        //DESCENDING / DESC ADALAH MENGURUTKAN DATA DARI BESAR KE KECIL
        //desc string
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nameList)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nameList.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nameList.length-1)
            {
                for (int j = i ; j < nameList.length ; j++)
                {
                    if(nameList[initz].compareTo(nameList[j]) < 0)
                    {
                        initz = j;
                    }
                }
            }
            strContainer = nameList[i];
            nameList[i] = nameList[initz];
            nameList[initz] = strContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nameList)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //asc string
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nameList)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < nameList.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nameList.length-1)
            {
                for (int j = i ; j < nameList.length ; j++)
                {
                    if(nameList[initz].compareTo(nameList[j]) > 0)
                    {
                        initz = j;
                    }
                }
            }
            strContainer = nameList[i];
            nameList[i] = nameList[initz];
            nameList[initz] = strContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nameList)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //desc char
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:characters)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < characters.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=characters.length-1)
            {
                for (int j = i ; j < characters.length ; j++)
                {
                    if(characters[initz] < characters[j])
                    {
                        initz = j;
                    }
                }
            }
            charContainer = characters[i];
            characters[i] = characters[initz];
            characters[initz] = charContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:characters)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));

        //asc char
        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:characters)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for(int i = 0 ; i < characters.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=characters.length-1)
            {
                for (int j = i ; j < characters.length ; j++)
                {
//                    if(characters[initz].compareTo(characters[j]) > 0)
                    if(characters[initz]>characters[j])
                    {
                        initz = j;
                    }
                }
            }
            charContainer = characters[i];
            characters[i] = characters[initz];
            characters[initz] = charContainer;
        }
        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:characters)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }
}