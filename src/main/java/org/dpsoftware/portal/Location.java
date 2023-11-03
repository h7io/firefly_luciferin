package org.dpsoftware.portal;

import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

import java.util.Map;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface Location extends DBusInterface {


    public DBusPath CreateSession(Map<String, Variant<?>> options);
    public DBusPath Start(DBusPath sessionHandle, String parentWindow, Map<String, Variant<?>> options);


    public static class LocationUpdated extends DBusSignal {

        private final DBusPath sessionHandle;
        private final Map<String, Variant<?>> location;

        public LocationUpdated(String _path, DBusPath _sessionHandle, Map<String, Variant<?>> _location) throws DBusException {
            super(_path, _sessionHandle, _location);
            this.sessionHandle = _sessionHandle;
            this.location = _location;
        }


        public DBusPath getSessionHandle() {
            return sessionHandle;
        }

        public Map<String, Variant<?>> getLocation() {
            return location;
        }


    }
}
