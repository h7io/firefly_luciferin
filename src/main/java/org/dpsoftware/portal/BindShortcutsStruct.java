package org.dpsoftware.portal;

import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.Variant;

import java.util.Map;

/**
 * Auto-generated class.
 */
public class BindShortcutsStruct extends Struct {
    @Position(0)
    private final String member0;
    @Position(1)
    private final Map<String, Variant<?>> member1;

    public BindShortcutsStruct(String member0, Map<String, Variant<?>> member1) {
        this.member0 = member0;
        this.member1 = member1;
    }


    public String getMember0() {
        return member0;
    }

    public Map<String, Variant<?>> getMember1() {
        return member1;
    }


}
