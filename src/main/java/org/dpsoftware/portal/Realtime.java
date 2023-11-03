package org.dpsoftware.portal;

import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.UInt64;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "MaxRealtimePriority", type = Integer.class, access = Access.READ)
@DBusProperty(name = "MinNiceLevel", type = Integer.class, access = Access.READ)
@DBusProperty(name = "RTTimeUSecMax", type = Long.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface Realtime extends DBusInterface {


    public void MakeThreadRealtimeWithPID(UInt64 process, UInt64 thread, UInt32 priority);
    public void MakeThreadHighPriorityWithPID(UInt64 process, UInt64 thread, int priority);

}
