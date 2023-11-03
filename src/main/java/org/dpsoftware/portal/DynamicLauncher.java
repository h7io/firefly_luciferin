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
@DBusProperty(name = "SupportedLauncherTypes", type = UInt32.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface DynamicLauncher extends DBusInterface {


    public void Install(String token, String desktopFileId, String desktopEntry, Map<String, Variant<?>> options);
    public DBusPath PrepareInstall(String parentWindow, String name, Variant<?> iconV, Map<String, Variant<?>> options);
    public String RequestInstallToken(String name, Variant<?> iconV, Map<String, Variant<?>> options);
    public void Uninstall(String desktopFileId, Map<String, Variant<?>> options);
    public String GetDesktopEntry(String desktopFileId);
    public GetIconTuple GetIcon(String desktopFileId);
    public void Launch(String desktopFileId, Map<String, Variant<?>> options);

}
