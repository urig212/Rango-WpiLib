// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package ma5951.utils.led;

import ma5951.utils.Shuffleboard;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/** Add your docs here. */
public interface AddressableLEDPattern {
    public void setLEDs(AddressableLEDBuffer buffer);
    default public boolean isAnimated() {
        return false;
    }
}