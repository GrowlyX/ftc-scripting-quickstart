package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import io.liftgate.ftc.scripting.opmode.DevLinearOpMode;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * Since this class implements the DevLinearOpMode class, the code editor web
 * server will be started alongside the configured TeleOp, if not already started.
 *
 * Additionally, implementing "DevLinearOpMode" enables hot-reload
 * functionality for scripts (when a file is saved from the web editor, changes are
 * automatically applied to the robot's running OpMode instance).
 *
 * The implemented methods in this class are in the {@link KotlinScript} class, so
 * to avoid boilerplate, you can proxy methods from a shared KotlinScript
 * implementation.
 *
 * @author GrowlyX
 * @since 8/20/2023
 */
@TeleOp
public class DevScriptedTeleOp extends DevLinearOpMode {
    @Override
    public @NotNull String getScriptName() {
        /*
         * Script name can contain directories, delimited by the "/"
         * character. Script names must also end with the .kts extension.
         */
        return "dev/TeleOp.kts";
    }

    @Override
    public @NotNull List<ImpliedVariable> getImpliedVariables() {
        /*
         * Implied variables allow you to use variables in your script without
         * having to define them directly. Implied variables can be either methods
         * or variables.
         *
         * FTCScript offers default implied variables, which can be found in the
         * {@link ProdLinearOpMode} class on GitHub.
         *
         * Example script using the following implied variables:
         * <pre>
         * while (!isStopRequested)
         * {
         *      // this will compile even though we didn't explicitly define
         *      leftMotor.power = 1000
         * }
         * </pre>
         */
        return Arrays.asList(
            /*ImpliedVariable.of(
                "leftMotor",
                hardwareMap.get(DcMotor.class, "leftMotor")
            ),
            ImpliedVariable.of(
                "myServo",
                hardwareMap.get(Servo.class, "myServo")
            )*/
        );
    }
}
