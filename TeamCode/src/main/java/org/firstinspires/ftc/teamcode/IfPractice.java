package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        /*
        boolean aButton = gamepad1.a; // press TRUE, depress FALSE

        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else {
            telemetry.addData("A Button", "NOT Pressed");
        }
        telemetry.addData("A Button State", aButton);

         */

        double motorSpeed = gamepad1.left_stick_y;
        if (!gamepad1.a) {
            motorSpeed *= 0.5;
        }

        /*
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "is in Dead Zone");
        }


        if (leftY < 0) {
            telemetry.addData("Left Stick", "is negative");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "is positive");
        }
        else {
            telemetry.addData("Left Stick", "is zero.");
        }
        telemetry.addData("Left Stick Value", leftY);
        */
    }
}
