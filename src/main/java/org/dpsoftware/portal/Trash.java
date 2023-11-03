package org.dpsoftware.portal;

import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface Trash extends DBusInterface {


    public UInt32 TrashFile(FileDescriptor fd);

}
