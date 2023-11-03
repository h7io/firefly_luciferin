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
public interface Settings extends DBusInterface {


    public Map<String, Map<String, Variant<?>>> ReadAll(List<String> namespaces);
    public Variant<?> Read(String namespace, String key);


    public static class SettingChanged extends DBusSignal {

        private final String namespace;
        private final String key;
        private final Variant<?> value;

        public SettingChanged(String _path, String _namespace, String _key, Variant<?> _value) throws DBusException {
            super(_path, _namespace, _key, _value);
            this.namespace = _namespace;
            this.key = _key;
            this.value = _value;
        }


        public String getNamespace() {
            return namespace;
        }

        public String getKey() {
            return key;
        }

        public Variant<?> getValue() {
            return value;
        }


    }
}
