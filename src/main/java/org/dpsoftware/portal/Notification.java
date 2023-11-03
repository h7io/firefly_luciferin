package org.dpsoftware.portal;

import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

import java.util.List;
import java.util.Map;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface Notification extends DBusInterface {


    public void AddNotification(String id, Map<String, Variant<?>> notification);
    public void RemoveNotification(String id);


    public static class ActionInvoked extends DBusSignal {

        private final String id;
        private final String action;
        private final List<Variant<?>> parameter;

        public ActionInvoked(String _path, String _id, String _action, List<Variant<?>> _parameter) throws DBusException {
            super(_path, _id, _action, _parameter);
            this.id = _id;
            this.action = _action;
            this.parameter = _parameter;
        }


        public String getId() {
            return id;
        }

        public String getAction() {
            return action;
        }

        public List<Variant<?>> getParameter() {
            return parameter;
        }


    }
}
