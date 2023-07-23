package org.firstinspires.ftc.teamcode.masina;

import com.arcrobotics.ftclib.hardware.ServoEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

public class servonice extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        ServoEx servo = hardwareMap.get(ServoEx.class, "servo");
        double pos1 = .2;
        double pos2 = 1;
        servo.setPosition(pos1);

        ElapsedTime time = new ElapsedTime(ElapsedTime.MILLIS_IN_NANO);
        time.reset();
        time.startTime();

        while(time.milliseconds()<1000)
            servo.setPosition(pos1 + (pos2-pos1)*time.milliseconds()/1000);

        servo.setPosition(pos2);



    }
}
