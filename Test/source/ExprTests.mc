module ExprTests {
    function testSimpleExpr() {
        a = 1;
        a = "";
        a = 1.3;

        a = 1+2*3/4;
        a = a << 0;
    }

    function testElifExpr() {
        a = true ? 1 : 2;
    }

    function testFunctionCall() {
        f();
        f(a,b,c);
        e.f();
        e[0].f();

        (f+2).r();
        f().a.f()[0].f()[0][0].f();

        // DOES NOT FAIL! Matches procedureCall -> factor
        !a;
        1;
        (2+3);
        1.abs();
        new TT();
        a = (new Test()).a;
        a = new Test().a;
        a = new Test()[0];
        a = new Test().f();

        // a+2; FAILS
    }

    function testLValue() {
        a = 0;
        a[0] = 0;
        a.a = 0;
        // f(a).a = 0; FAILS
    }

    function testSymbol() {
        a = :symbol;
    }
}