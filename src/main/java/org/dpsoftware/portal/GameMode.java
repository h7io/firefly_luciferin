package org.dpsoftware.portal;

import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt32;

/**
 * Auto-generated class.
 */
@DBusProperty(name = "Active", type = Boolean.class, access = Access.READ)
@DBusProperty(name = "version", type = UInt32.class, access = Access.READ)
public interface GameMode extends DBusInterface {


    public int QueryStatus(int pid);
    public int RegisterGame(int pid);
    public int UnregisterGame(int pid);
    public int QueryStatusByPid(int target, int requester);
    public int RegisterGameByPid(int target, int requester);
    public int UnregisterGameByPid(int target, int requester);
    public int QueryStatusByPIDFd(FileDescriptor target, FileDescriptor requester);
    public int RegisterGameByPIDFd(FileDescriptor target, FileDescriptor requester);
    public int UnregisterGameByPIDFd(FileDescriptor target, FileDescriptor requester);

}
