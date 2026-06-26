package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {

    RobotLocationPractice robotLocationPractice = new RobotLocationPractice(0);

    @Override
    public void init() {
        robotLocationPractice.setAngle(0);
    }

    @Override
    public void loop() {
        if (gamepad1.a) { // turn right
            robotLocationPractice.turnRobot(0.1);
        }
        else if (gamepad1.b) { // turn left
            robotLocationPractice.turnRobot(-0.1);
        }

        telemetry.addData("Heading", robotLocationPractice.getHeading());
    }
}
