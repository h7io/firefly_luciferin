package org.dpsoftware.portal;

import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "power-saver-enabled", type = Boolean.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface PowerProfileMonitor extends DBusInterface {



}
