package dto.colorChange;

/**
 * 空を雲が覆っている割合を表示する行の色分け可能とするもの。 今回は色分けは行っていない。
 *
 * @author a-yamamoto
 */
public class ColorCloudAll extends ColorChange {

    public ColorCloudAll(int cloudAll) {

        super.elem = cloudAll + "%";
    }
}
