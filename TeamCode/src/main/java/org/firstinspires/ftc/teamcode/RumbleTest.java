package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class RumbleTest extends OpMode {
    double endGameStart;
    boolean isEndGame;
    // boolean wasA, isA;

    @Override
    public void init() {

    }

    @Override
    public void start() {
        endGameStart = getRuntime() + 90;
    }

    @Override
    public void loop() {
        // end game check
        if (endGameStart >= getRuntime() && !isEndGame) {
            gamepad1.rumbleBlips(3);
            isEndGame = true;
        }

        /*
        isA = gamepad1.a;
        if (isA && !wasA) {
            gamepad1.rumbleBlips(3); // or gamepad1.rumble(1.0, 0, 100);
        }
        wasA = isA;

         */
    }
}
