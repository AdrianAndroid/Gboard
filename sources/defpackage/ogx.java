package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: ogx  reason: default package */
/* loaded from: classes2.dex */
public final class ogx implements PrivilegedExceptionAction {
    private final /* synthetic */ int a;

    public ogx(int i) {
        this.a = i;
    }

    public static final Unsafe a() {
        Field[] declaredFields;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return a();
            }
            return i != 2 ? SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]) : SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
