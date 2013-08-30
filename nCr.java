    
    BigInteger get(long n){return BigInteger.valueOf(n);}
    BigInteger mul(BigInteger x , BigInteger y){ return x.multiply(y);}
    BigInteger sub(BigInteger x , BigInteger y){ return x.subtract(y);}
    BigInteger add(BigInteger x , BigInteger y){ return x.add(y);}
    BigInteger div(BigInteger x , BigInteger y){ return x.divide(y);}
    BigInteger mod(BigInteger x , BigInteger y){ return x.mod(y);}
    
    static int SZ = 1007;
    static BigInteger[][] nCr  = new BigInteger[SZ][SZ];
    void combination(){
        nCr[0][0] = get(1);
	      for(int i = 1;i < SZ ; i++) {
		        nCr[i][0] = get(1);
		        for(int j = 1 ; j <= i ; j++) 
			            nCr[i][j] = add( nCr[i-1][j-1] , nCr[i-1][j] );
	      }
    }
