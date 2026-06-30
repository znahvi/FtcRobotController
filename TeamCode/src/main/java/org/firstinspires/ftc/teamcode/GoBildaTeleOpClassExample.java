package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.GoBildaArcadeDrive;
import org.firstinspires.ftc.teamcode.mechanisms.GoBildaLauncher;

@Disabled
@TeleOp
public class GoBildaTeleOpClassExample extends OpMode {
    GoBildaArcadeDrive drive = new GoBildaArcadeDrive();
    GoBildaLauncher launcher = new GoBildaLauncher();

    @Override
    public void init() {
        drive.init(hardwareMap);
        launcher.init(hardwareMap);
    }

    @Override
    public void loop() {
        drive.drive(-gamepad1.left_stick_y, gamepad1.left_stick_x);

        if (gamepad1.y) {
            launcher.startLauncher();
        }
        else if (gamepad1.b) {
            launcher.stopLauncher();
        }

        // update state machine
        launcher.updateState();

        telemetry.addData("State", launcher.getState());
        telemetry.addData("Launcher Velocity", launcher.getVelocity());
    }
}
