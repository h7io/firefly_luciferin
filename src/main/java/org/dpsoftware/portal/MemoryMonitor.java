package org.dpsoftware.portal;

import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.UInt32;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface MemoryMonitor extends DBusInterface {




    public static class LowMemoryWarning extends DBusSignal {

        private final byte level;

        public LowMemoryWarning(String _path, byte _level) throws DBusException {
            super(_path, _level);
            this.level = _level;
        }


        public byte getLevel() {
            return level;
        }


    }
}
