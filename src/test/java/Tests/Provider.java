package Tests;

import org.testng.annotations.DataProvider;

public class Provider {
    @DataProvider
    public static Object[][] testEqualsSum() {
        return new Object[][]{
                {0, 0, 0},
                {4, 2, 2},
                {-4, -2, -2},
                {7, 10, -3},
                {-7, -10, 3},
                {-1, -1, 0},
                {-1, 0, -1},
                {1, 1, 0},
                {1, 0, 1},
                {null, "a", -3},
                {null, "a", 3},
                {null, "a", 0},
                {null, 1, "c"},
                {null, -1, "c"},
                {null, 0, "c"},
                {null,"a","c"},

        };
    }

    @DataProvider
    public static Object[][] testEqualsDiv() {
        return new Object[][]{
                {null, 0, 0},
                {null, -2, 0},
                {null, 1, 0},
                {null, "f", 0},
                {null, 0, "f"},
                {0, 0, -2},
                {0, 0, 1},
                {8, 8, 1},
                {3, 7, 2},
                {0, 6, 7},
                {-5, -10, 2},
                {5, -10, -2},
                {-5, 10, -2}
        };
    }

    @DataProvider
    public static Object[][] testEqualsMult() {
        return new Object[][]{
                {0, 0, 0},
                {0 , 1, 0},
                {0 , 0 , 1},
                {7 , 7, 1},
                {7 , 1, 7},
                {20,4,5},
                {-10,-2,5},
                {-10,2,-5},
                {10,-2,-5},
                {null, "a", -3},
                {null, -1, "c"}
        };
    }

    @DataProvider
    public static Object[][] testEqualsSubst() {
        return new Object[][]{
                {0, 0, 0},
                {0, 2, 2},
                {1, -1, -2},
                {13, 10, -3},
                {-13, -10, 3},
                {-1, -1, 0},
                {1, 0, -1},
                {-1, 0, 1},
                {1 , 1, 0},
                {null, "a", -3},
                {null, 1, "c"},
                {null, "d","f"}
        };
    }

}
