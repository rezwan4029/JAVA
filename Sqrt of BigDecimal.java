BigDecimal sqrt(BigDecimal x) {
            int setPrecision = 10 ;
            MathContext mc = new MathContext(setPrecision); 
            BigDecimal g = x.divide(BigDecimal.valueOf(2), mc);
            boolean done = false;
            final int maxIterations = mc.getPrecision() + 1;
            for (int iter = 0; !done && iter < maxIterations; iter++ ) {
                BigDecimal r = x.divide(g, mc);
                r = r.add(g);
                r = r.divide(BigDecimal.valueOf(2), mc);
                done = r.equals(g);
                g = r;
            }
            return g;
}
