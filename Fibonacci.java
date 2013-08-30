    
    BigInteger get(long n){return BigInteger.valueOf(n);}
    BigInteger mul(BigInteger x , BigInteger y){ return x.multiply(y);}
    BigInteger sub(BigInteger x , BigInteger y){ return x.subtract(y);}
    BigInteger add(BigInteger x , BigInteger y){ return x.add(y);}
    BigInteger div(BigInteger x , BigInteger y){ return x.divide(y);}
    BigInteger mod(BigInteger x , BigInteger y){ return x.mod(y);}
    
    static int SZ = 1007;
    static BigInteger[]   fib  = new BigInteger[SZ];
    BigInteger[] fibonacci(){
        fib[0] = get(0);
        fib[1] = get(1);
        for(int i = 2 ; i < SZ ; i++ ) fib[i] = add(fib[i-1],fib[i-2]);
        return fib;
    }
