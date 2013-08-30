    
    BigInteger get(long n){return BigInteger.valueOf(n);}
    BigInteger mul(BigInteger x , BigInteger y){ return x.multiply(y);}
    BigInteger sub(BigInteger x , BigInteger y){ return x.subtract(y);}
    BigInteger add(BigInteger x , BigInteger y){ return x.add(y);}
    BigInteger div(BigInteger x , BigInteger y){ return x.divide(y);}
    BigInteger mod(BigInteger x , BigInteger y){ return x.mod(y);}
    
  static int SZ = 1007;
  public static BigInteger[]   fact = new BigInteger[SZ];
  
  BigInteger[] factorial(){
        fact[0] = fact[1] = get(1);
        for(int i = 2 ; i < SZ ; i++ ) fact[i] = mul( get(i) ,fact[i-1] );
        return fact;
  }
