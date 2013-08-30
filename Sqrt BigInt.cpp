
BigInteger get(long n){return BigInteger.valueOf(n);}
BigInteger mul(BigInteger x , BigInteger y){ return x.multiply(y);}
BigInteger sub(BigInteger x , BigInteger y){ return x.subtract(y);}
BigInteger add(BigInteger x , BigInteger y){ return x.add(y);}
BigInteger div(BigInteger x , BigInteger y){ return x.divide(y);}
    
BigInteger sqrt(BigInteger n) {
        BigInteger a = get(1);
        BigInteger b = new BigInteger( n.shiftRight(5).add(get(8)).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mul(mid,mid).compareTo(n) > 0) b = sub( mid , get(1) );
            else a = add(mid,get(1));
         }
        return sub(a,get(1));
}
