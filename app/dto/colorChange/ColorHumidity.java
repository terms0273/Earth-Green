

package dto.colorChange;

/**
 * 湿度を色分けできるようにした
 * 今回は色分けなし
 * @author a-yamamoto
 */
public class ColorHumidity extends ColorChange {
    public ColorHumidity(int humidity){
        
        super.elem = humidity + "%";
    }
}
