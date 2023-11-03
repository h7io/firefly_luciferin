package org.dpsoftware.portal;

import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

import java.util.Map;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "IsCameraPresent", type = Boolean.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface Camera extends DBusInterface {


    public DBusPath AccessCamera(Map<String, Variant<?>> options);
    public FileDescriptor OpenPipeWireRemote(Map<String, Variant<?>> options);

}
