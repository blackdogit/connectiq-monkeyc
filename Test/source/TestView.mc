using Toybox.WatchUi as Ui;
using Toybox.Graphics as Gfx;

class TestView extends Ui.View {
    function onUpdate(dc) {
        dc.setColor(Gfx.COLOR_WHITE, Gfx.COLOR_BLACK);
        dc.clear();
        dc.drawText(dc.getWidth() / 2, dc.getHeight() / 2, Gfx.FONT_SMALL, "Click the menu button", Gfx.TEXT_JUSTIFY_CENTER);
    }
}