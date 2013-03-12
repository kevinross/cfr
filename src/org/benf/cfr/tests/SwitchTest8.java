package org.benf.cfr.tests;

import org.benf.cfr.reader.util.Troolean;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest8 {

    private static class hasIntVal {
        private final int x;

        private hasIntVal(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }
    }

    public boolean test(hasIntVal a, hasIntVal b) {
        return Troolean.get(a.getX() == 3, b.getX() == 4) == Troolean.BOTH;
    }
}