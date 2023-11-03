package org.dpsoftware.portal;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

/**
 * Auto-generated class.
 */
public class GetIconTuple extends Tuple {
    @Position(0)
    private Variant<?> iconV;
    @Position(1)
    private String iconFormat;
    @Position(2)
    private UInt32 iconSize;

    public GetIconTuple(Variant<?> iconV, String iconFormat, UInt32 iconSize) {
        this.iconV = iconV;
        this.iconFormat = iconFormat;
        this.iconSize = iconSize;
    }

    public void setIconV(Variant<?> arg) {
        iconV = arg;
    }

    public Variant<?> getIconV() {
        return iconV;
    }
    public void setIconFormat(String arg) {
        iconFormat = arg;
    }

    public String getIconFormat() {
        return iconFormat;
    }
    public void setIconSize(UInt32 arg) {
        iconSize = arg;
    }

    public UInt32 getIconSize() {
        return iconSize;
    }


}
