module CreationTests {

    function testNewObject(a) {
        a = new Test();
        a = new a();
        a = new a[0]();
        a = new a.f[0].t[0][1]();
    }

    function testNewArray() {
        a = new [10];
        a = new [a+b];
    }

    function testArrayConstants() {
        a = [];
        a = [0,0];
        a = [a+b];
        a = [0,[0,[0,[]]]];
    }

    function testDictionaryConstants() {
        a = {};
        a = {0=>0};
        a = {0=>null,1=>1};
    }

    function testMix() {
        a = {[0]=>[1], "1"=>new T(), 2=>{1=>2}};
        a = {"M" => CreationTests, "1"=>T};
    }

    class T {
    }
}