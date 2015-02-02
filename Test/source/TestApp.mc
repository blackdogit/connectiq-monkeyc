using Toybox.Application as App;
using Toybox.WatchUi as Ui;
using Toybox.System as Sys;

static class TestApp extends App.AppBase {
    static const C = 42;
    static var V = 42;

    static enum {E}

    //! onStart() is called on application start up
    function onStart() {
        new ErrorAtan().testAtan();
        Sys.println("DONE");
    }

    function showProcentInSysPrintln() {
        Sys.println("7/3="+7/3);
        Sys.println("7%3="+7%3);
        Sys.println("-7/3="+-7/3);
        Sys.println("-7%3="+-7%3);
        Sys.println("-7/-3="+-7/-3);
        Sys.println("-7%-3="+-7%-3);
        Sys.println("7/-3="+7/-3);
        Sys.println("7%-3="+7%-3);
    }

    function assertTrue(b) {
        if (!b) { throw new AssertFailedException(); }
    }

    function assertEquals(expected, actual) {
        assertTrue(expected == actual);
    }

    function testProcent() {
        Sys.println("");
        Sys.println(">>>%<<<");
        Sys.println("111%111");
        Sys.println("aaa%aaa");
    }

    // Tests use of classes for parameters
    function testClassAsParameter() {
        var o = testClassAsParameter1(Test, 1);
        assertTrue(o instanceof Test);
        assertEquals(1, o.s);
    }

    // Tests use of self in classes - see Test class
    function testSelf() {
        var o = new Test(10);
        assertEquals(o, o.getSelf());
    }

    function testClassAsParameter1(clz, arg) {
        return new clz(arg);
    }

    // Tests use of classes for parameters
    function testModuleAsParameter() {
        var o = testModuleAsParameter1(App);
        assertTrue(o instanceof App.AppBase);
    }

    function testModuleAsParameter1(mod) {
        return new mod.AppBase();
        return new mod();
    }

    // Tests use of has and instanceof for various objects
    function testHasAndInstanceOf() {
        testHasAndInstanceOfOne("null", null);
        testHasAndInstanceOfOne("Number", 42);
        // FAILS has: testHasAndInstanceOfOne("TestApp class", new TestApp());
        testHasAndInstanceOfOne("TestApp obj", new TestApp());
        testHasAndInstanceOfOne("method", method(:t));
        testHasAndInstanceOfOne("App", App);
        testHasAndInstanceOfOne("Toybox", Toybox);
    }

    function testHasAndInstanceOfOne(what,m) {
        Sys.println("*** "+what+" ***");
        Sys.println("m: "+m);
        Sys.println("m == null: "+(m == null));
        Sys.println("m has invoke: "+(m has :invoke));
        Sys.println("m has AppBase: "+(m has :AppBase));
        Sys.println("m instanceof TestApp: "+(m instanceof TestApp));
    }

    //! onStop() is called when your application is exiting
    function onStop() {
    }

    //! Return the initial view of your application here
    function getInitialView() {
        return [ new TestView(), new TestDelegate() ];
    }
}

class TTT {
    //! 2. onStop
    function onStop() {
    }
}

class AssertFailedException {
}

class Test {
    var s;
    function initialize(i) {
        s = i;
    }

    function getSelf() {
        return self;
    }
}

class TestDelegate extends Ui.BehaviorDelegate {

    function onMenu() {
        Ui.pushView(new Rez.Menus.MainMenu(), new TestMenuDelegate(), Ui.SLIDE_UP);
    }

}