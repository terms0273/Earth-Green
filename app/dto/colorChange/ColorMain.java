package dto.colorChange;

/**
 * *天気(晴れなどの表記方法部分)の行を色分け可能とするもの。
 * 今回は色分けは行っていない。
 * @author a-yamamoto
 */
public class ColorMain extends ColorChange {

    public ColorMain(String main) {
        super.elem = main;
    }
}
