public class Modulo13 {
    
    static int MOD = (int)(1e9 + 7);
    
    // Function to find the count of integers
    // obtained by replacing '?' in a given
    // string such that formed integer
    // gives remainder 5 when it is divided by 13
    static int modulo_13(String s, int n)
    {
        long [][]arrfor13 = new long[n + 1][13];
        long [][]arrfor11 = new long[n + 1][11];
    
        // Initialise
        arrfor13[0][0] = 1;
        arrfor11[0][0] = 1;
    
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                int nxt = s.charAt(i) - '0';
    
                // Place digit j at ? position
                if (s.charAt(i) == '?')
                    nxt = j;
    
                // Get the remainder
                for (int k = 0; k < 13; k++)
                {
                    int rem = (10 * k + nxt) % 13;
                    arrfor13[i + 1][rem] += arrfor13[i][k];
                    arrfor13[i + 1][rem] %= MOD;
                }
                // Get the remainder
                for (int l = 0; l < 11; l++)
                {
                    int rem = (10 * l + nxt) % 11;
                    arrfor13[i + 1][rem] += arrfor11[i][l];
                    arrfor13[i + 1][rem] %= MOD;
                }
                if (s.charAt(i) != '?')
                    break;
            }
        }
    
        // Return the required answer
        return (int)arrfor13[n][7]+(int)arrfor11[n][7];
    }
    
    // Driver code
    public static void main(String []args)
    {
        String s = "?44";
        int n = s.length();
    
        System.out.println(modulo_13(s, n));
    }
}