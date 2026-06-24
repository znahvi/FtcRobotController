package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled /* prevents test code from showing up on robot controller */
@TeleOp /* Can change to @Autonomous to run in autonomous mode, would have to change line 4 too */

/* OpMode is from FTC Software Development Kit */
/* HelloWorld is kind of like a subclass of OpMode */

public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Zahra");
    }

    @Override
    public void loop() {

    }
}
