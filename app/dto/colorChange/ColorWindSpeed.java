package dto.colorChange;

/**
 * 風速表示の行を色分け可能とするもの。 今回は色分けは行っていない。
 *
 * @author a-yamamoto
 */
public class ColorWindSpeed extends ColorChange {

    public ColorWindSpeed(double windSpeed) {

        super.elem = windSpeed + "m/s";
    }
}
