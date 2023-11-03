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
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface OpenURI extends DBusInterface {


    public DBusPath OpenURI(String parentWindow, String uri, Map<String, Variant<?>> options);
    public DBusPath OpenFile(String parentWindow, FileDescriptor fd, Map<String, Variant<?>> options);
    public DBusPath OpenDirectory(String parentWindow, FileDescriptor fd, Map<String, Variant<?>> options);

}
