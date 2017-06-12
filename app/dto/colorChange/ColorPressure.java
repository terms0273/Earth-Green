package dto.colorChange;

/**
 * 気圧の値の変化で色を変化させる処理
 * @author a-yamamoto
 */
public class ColorPressure extends ColorChange {

    private static final String UNIT = "hPa";

    public ColorPressure(int pressure) {
        setColorPressure(pressure);
        super.elem = pressure + UNIT;
    }

    /**
     * 2hPa変化すると体調に影響するという情報を見たため 平均の気圧の高さである1013hPaを基準に、3hPaずつ色を変化させている。
     */
    public void setColorPressure(int pressure) {
        if (pressure >= 1016) {
            super.color = "#f29900";
        } else if (pressure >= 1013) {
            super.color = "#f2a200";
        } else if (pressure >= 1010) {
            super.color = "#f2aa00";
        } else if (pressure >= 1007) {
            super.color = "#f2b200";
        } else if (pressure >= 1004) {
            super.color = "#f2ba00";
        } else if (pressure >= 1001) {
            super.color = "#f2c200";
        } else if (pressure >= 998) {
            super.color = "#f2c679";
        } else if (pressure >= 997) {
            super.color = "#f2cf91";
        } else if (pressure >= 996) {
            super.color = "#f2d8aa";
        } else {
            super.color = "#f2e0c2";
        }
    }

}
