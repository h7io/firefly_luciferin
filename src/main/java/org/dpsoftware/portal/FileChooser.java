package org.dpsoftware.portal;

import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

import java.util.Map;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface FileChooser extends DBusInterface {


    public DBusPath OpenFile(String parentWindow, String title, Map<String, Variant<?>> options);
    public DBusPath SaveFile(String parentWindow, String title, Map<String, Variant<?>> options);
    public DBusPath SaveFiles(String parentWindow, String title, Map<String, Variant<?>> options);

}
