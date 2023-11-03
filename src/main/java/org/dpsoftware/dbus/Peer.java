package org.dpsoftware.dbus;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

/**
 * Auto-generated class.
 */
@DBusInterfaceName("org.freedesktop.DBus.Peer")
public interface Peer extends DBusInterface {


    public void Ping();
    public String GetMachineId();

}
