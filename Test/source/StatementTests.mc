module StatementTests {
    function testForStatement() {
        for (var a = 0; a < 10; a++) {
            //
        }
        for (var a = 0, b = 0; a < 10; a++) {
            //
        }
        for (a = 0; a < 10; a++) {
            //
        }
        for (a = 0; a < 10; a++) {
            //
        }
    }

    function testIfStatement() {
        if (a) { a = 0; }
        if (a) { a = 0; } else { a = 1; }
        if (a) {
            a = 0;
        } else {
            a = 1;
        }
        if (a) {
            a = 0;
        } else if (b) {
            a = 1;
        } else {
            a = 2;
        }
    }
}