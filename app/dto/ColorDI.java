package dto;

/**
 *
 * @author r-takahashi
 */
public class ColorDI extends ColorChange{
    public ColorDI(int temp, int humidity){            
        // 計算する 不快指数
        super.elem = 0.81 * temp + 0.01 * humidity  * (0.99 * temp - 14.3) + 46.3 + "";
        
    }
}
