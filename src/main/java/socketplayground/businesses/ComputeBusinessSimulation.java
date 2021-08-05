package socketplayground.businesses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author jinxiaoyu
 * @version 1.0
 * @description: TODO
 * @date 2021/8/5 20:04
 */
public class ComputeBusinessSimulation implements Runnable {

    private final static Logger logger = LoggerFactory.getLogger(ComputeBusinessSimulation.class);
    public void run() {
        logger.info("Compute something...");
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();;
        }
    }
}
