package org.firstinspires.ftc.teamcode.modules;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.CarModules;
import org.firstinspires.ftc.teamcode.ICarModule;

public class GamepadControl implements ICarModule {

    public static boolean ENABLE_MODULE = true;

    public Gamepad gamepad1, gamepad2;
    private final CarModules car;

    public GamepadControl(Gamepad gamepad1, Gamepad gamepad2, CarModules car){
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;
        this.car = car;
    }

    private void steering(){
        car.steering.setSteeringAngle(gamepad1.left_stick_x);
    }

    private void powerTrainControl(){
        car.pt.setSpeed(gamepad1.right_trigger - gamepad1.left_trigger);
//        car.pt.setRawSpeed(-gamepad1.right_stick_y);
    }

    @Override
    public void loop() {
        steering();
        powerTrainControl();
    }

    @Override
    public void emergencyStop() {

    }
}
