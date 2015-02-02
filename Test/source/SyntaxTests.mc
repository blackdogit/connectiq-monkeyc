using Toybox.WatchUi as Ui;

enum {ENUM}

var E=3;
function f() {
    return "";
}

    (:test :runtime)
hidden module M {
using Toybox.Graphics as Gfx;

    (:test :runtime)
class TestView extends Ui.View {

    (:test :runtime)
    static var image;

    //! Load your resources here
    function onLayout(dc) {
        image = Ui.loadResource(Rez.Drawables.id_monkey);
    }

    enum {A}

    //! Restore the state of the app and prepare the view to be shown
    (:test :runtime)
    static function onShow() {
        if (b) {
            a=1;
        } else {
            a=2;
        }
        var a = [1+2,[3]];

        var y = {}; // Empty dictionary

        f = {};
        f = { 1 => 1, "a" => "a"};
        {};

        a = 0;
        // Comment
        // /* Another comment */

        b;

        a.b.c[0] = 0;

        (1+2).f();

        try {
            a = 1;
        }

        for (a = 1; a != 1; a ++) {
        }

        //switch (a) {
        //    case "a": b = 1;
        //    case 3+5: b = 2;
        //    default: b = 3;
       // }

        func(System);
    }

    function t(clz) {
        return new clz();
    }

    //! Update the view
    function onUpdate(dc) {
        dc.setColor(Gfx.COLOR_WHITE, Gfx.COLOR_BLACK);
        dc.clear();
        dc.drawText(dc.getWidth() / 2, (dc.getHeight() / 2) - (image.getHeight() / 2), Gfx.FONT_SMALL, "Click the menu button", Gfx.TEXT_JUSTIFY_CENTER);
        dc.drawBitmap((dc.getWidth() / 2) - (image.getWidth() / 2), (dc.getHeight() / 2) - (image.getHeight() / 2) + 10, image);
    }

    //! Called when this View is removed from the screen. Save the
    //! state of your app here.
    function onHide() {
    }

}
}