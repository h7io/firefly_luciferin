package org.dpsoftware.portal;

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
public interface NetworkMonitor extends DBusInterface {


    public boolean GetAvailable();
    public boolean GetMetered();
    public UInt32 GetConnectivity();
    public Map<String, Variant<?>> GetStatus();
    public boolean CanReach(String hostname, UInt32 port);

}
