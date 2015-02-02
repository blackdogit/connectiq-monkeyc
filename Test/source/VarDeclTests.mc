module VarDeclTests {
    var a = 0, b = 1;
    const c = 0, d = 2;
    function f() {
        var a = 0, b = 1;
    }

    class C {
        var a = 0, b = 1;
        const c = 0, d = 2;
        function f() {
            var a = 0, b = 1;
        }
    }
}