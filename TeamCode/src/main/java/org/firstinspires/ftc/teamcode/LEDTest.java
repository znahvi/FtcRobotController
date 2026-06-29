package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchLED;

@Disabled
@TeleOp
public class LEDTest extends OpMode {
    TestBenchLED bench = new TestBenchLED();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) { // red
            bench.setRedLed(true);
            bench.setGreenLed(false);
        }
        else if (gamepad1.b) { // green
            bench.setRedLed(false);
            bench.setGreenLed(true);
        }
        else if (gamepad1.y) { // yellow
            bench.setGreenLed(true);
            bench.setRedLed(true);
        }
    }
}
