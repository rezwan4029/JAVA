public static String[] Split(String x, String tkn) {
        StringTokenizer StrTkn = new StringTokenizer(x, tkn);
        ArrayList<String> ArrLis = new ArrayList<String>(x.length());
        while (StrTkn.hasMoreTokens()) ArrLis.add(StrTkn.nextToken());
        return ArrLis.toArray(new String[0]);
}
