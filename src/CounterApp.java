class CounterApp {


    public static void main(String [] args) {
        System.out.println("*** Counter ***");

        Counter c = new Counter();
        System.out.println("(After default constructor) c: " + c);
        System.out.println("getVal: " + c.getVal());
        for (int i = 0; i < 12; i++)
            c.up();
        System.out.println("(After 12 up's) c: " + c);
        for (int i = 0; i < 16; i++)
            c.down();
        System.out.println("(After 16 down's) c: " + c);
        System.out.println();

        c = new Counter(5);
        System.out.println("(After constructor(5)) c: " + c);
        System.out.println("getVal: " + c.getVal());
        for (int i = 0; i < 12; i++)
            c.up();
        System.out.println("(After 12 up's) c: " + c);
        for (int i = 0; i < 16; i++)
            c.down();
        System.out.println("(After 16 down's) c: " + c);
        System.out.println();

        System.out.println("*** UpperBoundedCounter ***"); //##############################################%

        UpperBoundedCounter ubc = new UpperBoundedCounter();
        System.out.println("(After default constructor) ubc: " + ubc);
        System.out.println("getVal: " + ubc.getVal() + "   getLimit: " + ubc.getLimit());
        for (int i = 0; i < 12; i++)
            ubc.up();
        System.out.println("(After 12 up's) ubc: " + ubc);
        for (int i = 0; i < 16; i++)
            ubc.down();
        System.out.println("(After 16 down's) ubc: " + ubc);
        System.out.println();

        ubc = new UpperBoundedCounter(5);
        System.out.println("(After constructor(5)) ubc: " + ubc);
        System.out.println("getVal: " + ubc.getVal() + "   getLimit: " + ubc.getLimit());
        for (int i = 0; i < 12; i++)
            ubc.up();
        System.out.println("(After 12 up's) ubc: " + ubc);
        for (int i = 0; i < 16; i++)
            ubc.down();
        System.out.println("(After 16 down's) ubc: " + ubc);
        System.out.println();

        ubc = new UpperBoundedCounter(3, 11);
        System.out.println("(After constructor(3, 11)) ubc: " + ubc);
        System.out.println("getVal: " + ubc.getVal() + "   getLimit: " + ubc.getLimit());
        for (int i = 0; i < 12; i++)
            ubc.up();
        System.out.println("(After 12 up's) ubc: " + ubc);
        for (int i = 0; i < 16; i++)
            ubc.down();
        System.out.println("(After 16 down's) ubc: " + ubc);
        System.out.println();

        System.out.println("*** LowerBoundedCounter ***");//###############################################

        LowerBoundedCounter lbc = new LowerBoundedCounter();
        System.out.println("(After default constructor) lbc: " + lbc);
        System.out.println("getVal: " + lbc.getVal() + "   getLimit: " + lbc.getLimit());
        for (int i = 0; i < 12; i++)
            lbc.up();
        System.out.println("(After 12 up's) lbc: " + lbc);
        for (int i = 0; i < 16; i++)
            lbc.down();
        System.out.println("(After 16 down's) lbc: " + lbc);
        System.out.println();

        lbc = new LowerBoundedCounter(5);
        System.out.println("(After constructor(5)) lbc: " + lbc);
        System.out.println("getVal: " + lbc.getVal() + "   getLimit: " + lbc.getLimit());
        for (int i = 0; i < 12; i++)
            lbc.up();
        System.out.println("(After 12 up's) lbc: " + lbc);
        for (int i = 0; i < 16; i++)
            lbc.down();
        System.out.println("(After 16 down's) lbc: " + lbc);
        System.out.println();

        lbc = new LowerBoundedCounter(4, 2);
        System.out.println("(After constructor(4, 2)) lbc: " + lbc);
        System.out.println("getVal: " + lbc.getVal() + "   getLimit: " + lbc.getLimit());
        for (int i = 0; i < 12; i++)
            lbc.up();
        System.out.println("(After 12 up's) lbc: " + lbc);
        for (int i = 0; i < 16; i++)
            lbc.down();
        System.out.println("(After 16 down's) lbc: " + lbc);
        System.out.println();

        System.out.println("*** BoundedCounter ***");//###############################################################

        BoundedCounter bc = new BoundedCounter();
        System.out.println("(After default constructor) bc: " + bc);
        System.out.println("getVal: " + bc.getVal() + "   getLowerLimit: " + bc.getLowerLimit() + "   getUpperLimit: " + bc.getUpperLimit());
        for (int i = 0; i < 12; i++)
            bc.up();
        System.out.println("(After 12 up's) bc: " + bc);
        for (int i = 0; i < 16; i++)
            bc.down();
        System.out.println("(After 16 down's) bc: " + bc);
        System.out.println();

        bc = new BoundedCounter(5);
        System.out.println("(After constructor(5)) bc: " + bc);
        System.out.println("getVal: " + bc.getVal() + "   getLowerLimit: " + bc.getLowerLimit() + "   getUpperLimit: " + bc.getUpperLimit());
        for (int i = 0; i < 12; i++)
            bc.up();
        System.out.println("(After 12 up's) bc: " + bc);
        for (int i = 0; i < 16; i++)
            bc.down();
        System.out.println("(After 16 down's) bc: " + bc);
        System.out.println();

        bc = new BoundedCounter(3, 11);
        System.out.println("(After constructor(3, 11)) bc: " + bc);
        System.out.println("getVal: " + bc.getVal() + "   getLowerLimit: " + bc.getLowerLimit() + "   getUpperLimit: " + bc.getUpperLimit());
        for (int i = 0; i < 12; i++)
            bc.up();
        System.out.println("(After 12 up's) bc: " + bc);
        for (int i = 0; i < 16; i++)
            bc.down();
        System.out.println("(After 16 down's) bc: " + bc);
        System.out.println();

        bc = new BoundedCounter(3, 11, 2);
        System.out.println("(After constructor(3, 11, 2)) bc: " + bc);
        System.out.println("getVal: " + bc.getVal() + "   getLowerLimit: " + bc.getLowerLimit() + "   getUpperLimit: " + bc.getUpperLimit());
        for (int i = 0; i < 12; i++)
            bc.up();
        System.out.println("(After 12 up's) bc: " + bc);
        for (int i = 0; i < 16; i++)
            bc.down();
        System.out.println("(After 16 down's) bc: " + bc);
    }
}