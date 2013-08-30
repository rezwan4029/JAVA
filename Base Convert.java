    
    static BigInteger get(long n){return BigInteger.valueOf(n);}
    static BigInteger mul(BigInteger x , BigInteger y){ return x.multiply(y);}
    static BigInteger sub(BigInteger x , BigInteger y){ return x.subtract(y);}
    static BigInteger add(BigInteger x , BigInteger y){ return x.add(y);}
    static BigInteger div(BigInteger x , BigInteger y){ return x.divide(y);}
    static BigInteger mod(BigInteger x , BigInteger y){ return x.mod(y);}
    
    static String Conv(BigInteger x , int radix){
        return x.toString(radix);
    }
