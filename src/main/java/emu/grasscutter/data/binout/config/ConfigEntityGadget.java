package emu.grasscutter.data.binout.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigEntityGadget extends ConfigEntityBase {
    // There are more values that can be added that might be useful in the json
}
