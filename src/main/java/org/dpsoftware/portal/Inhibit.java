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
public interface Inhibit extends DBusInterface {


    public DBusPath Inhibit(String window, UInt32 flags, Map<String, Variant<?>> options);
    public DBusPath CreateMonitor(String window, Map<String, Variant<?>> options);
    public void QueryEndResponse(DBusPath sessionHandle);


    public static class StateChanged extends DBusSignal {

        private final DBusPath sessionHandle;
        private final Map<String, Variant<?>> state;

        public StateChanged(String _path, DBusPath _sessionHandle, Map<String, Variant<?>> _state) throws DBusException {
            super(_path, _sessionHandle, _state);
            this.sessionHandle = _sessionHandle;
            this.state = _state;
        }


        public DBusPath getSessionHandle() {
            return sessionHandle;
        }

        public Map<String, Variant<?>> getState() {
            return state;
        }


    }
}
