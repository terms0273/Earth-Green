package dto.colorChange;

/**
 * 天気マークを表示する アイコンに色がついてるので、色はつけなかった
 *
 * @author a-yamamoto
 */
public class ColorIcon extends ColorChange {

    public ColorIcon(String icon) {
        super.elem = "http://openweathermap.org/img/w/" + icon + ".png";
    }
}
