package com.ftninfomatika.kontrolnatacka2.providers;

import com.ftninfomatika.kontrolnatacka2.models.Glumac;

import java.util.ArrayList;
import java.util.List;

public class GlumacProvider {

    private static List<Glumac> glumci = null;

    private static void init() {

        if (glumci == null) {
            glumci = new ArrayList<>();
            glumci.add(new Glumac(0, "Dragan", "Bjelogrlic", "biografija", "fotografija", "filmovi", 7.00, "01.01.1945.", "20.09.2017",));
            glumci.add(new Glumac(1, "Stevo", "Zigon", "biografija1", "fotografija1", "filmovi1", 7.5, "23.07.1934.", "17.12.2002.", ));
            glumci.add(new Glumac(2, "Zoran", "Cvijanovic", "biografija2", "fotografija", "filmovi2", 8.00, "30.09.1959.", "",));

        }
    }


            public static List<Glumac> getAllGlumci() {
                init();

                return glumci;
            }

            public static Glumac getGlumacById(int id) {
                init();

                if (id >= 0 && id < glumci.size()) {
                    return glumci.get(id);
                }
                return null;
            }
        }



