package j$.sun.security.action;

import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public final class a implements PrivilegedAction {
    private String a = "file.encoding";

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty(this.a);
        if (property == null) {
            return null;
        }
        return property;
    }
}
