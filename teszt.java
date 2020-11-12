public static void rendezCsapatok(String[] s, double h[], String[] e, int ep[]) {
            System.out.println("\nCsapatok rendezve:\n");
            int csapatNevekMeret = h.length;
            Csapat csapatok[] = new Csapat[csapatNevekMeret];
            for (int i = 0; i < csapatNevekMeret; i++) {
            csapatok[i] = new Csapat(s[i], h[i]);
            }
            java.util.List<Csapat> rendezettCsapatok = java.util.Arrays.asList(csapatok);
            java.util.Collections.sort(rendezettCsapatok);
            java.util.Collections.reverse(rendezettCsapatok);
            java.util.Iterator iterv = rendezettCsapatok.iterator();
            ....
            ....
            ....
            class Csapat implements Comparable<Csapat> {
            protected String nev;
            protected double ertek;
            public Csapat(String nev, double ertek) {
            this.nev = nev;
            this.ertek = ertek;
            }
            public int compareTo(Csapat csapat) {
            if (this.ertek < csapat.ertek) {
            return -1;
            } else if (this.ertek > csapat.ertek) {
            return 1;
            } else {
            return 0;
            }
            }
            }