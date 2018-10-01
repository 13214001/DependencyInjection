package example.com.Assignment;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component("DrawingService")
public class DrawingService implements Drawing {

    @Resource
    public Quadrilateral square;



    public void drawShape() {



        square.Draw();

    }


}
