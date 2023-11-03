package org.dpsoftware.portal;

import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

import java.util.Map;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "AvailableDeviceTypes", type = UInt32.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface RemoteDesktop extends DBusInterface {


    public DBusPath CreateSession(Map<String, Variant<?>> options);
    public DBusPath SelectDevices(DBusPath sessionHandle, Map<String, Variant<?>> options);
    public DBusPath Start(DBusPath sessionHandle, String parentWindow, Map<String, Variant<?>> options);
    public void NotifyPointerMotion(DBusPath sessionHandle, Map<String, Variant<?>> options, double dx, double dy);
    public void NotifyPointerMotionAbsolute(DBusPath sessionHandle, Map<String, Variant<?>> options, UInt32 stream, double x, double y);
    public void NotifyPointerButton(DBusPath sessionHandle, Map<String, Variant<?>> options, int button, UInt32 state);
    public void NotifyPointerAxis(DBusPath sessionHandle, Map<String, Variant<?>> options, double dx, double dy);
    public void NotifyPointerAxisDiscrete(DBusPath sessionHandle, Map<String, Variant<?>> options, UInt32 axis, int steps);
    public void NotifyKeyboardKeycode(DBusPath sessionHandle, Map<String, Variant<?>> options, int keycode, UInt32 state);
    public void NotifyKeyboardKeysym(DBusPath sessionHandle, Map<String, Variant<?>> options, int keysym, UInt32 state);
    public void NotifyTouchDown(DBusPath sessionHandle, Map<String, Variant<?>> options, UInt32 stream, UInt32 slot, double x, double y);
    public void NotifyTouchMotion(DBusPath sessionHandle, Map<String, Variant<?>> options, UInt32 stream, UInt32 slot, double x, double y);
    public void NotifyTouchUp(DBusPath sessionHandle, Map<String, Variant<?>> options, UInt32 slot);

}
