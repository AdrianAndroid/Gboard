package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oho  reason: default package */
/* loaded from: classes2.dex */
public final class oho implements ohr {
    public static final Logger a = Logger.getLogger(ohl.class.getName());
    public static final ouu b = ouu.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int b(out outVar) {
        return (outVar.d() & 255) | ((outVar.d() & 255) << 16) | ((outVar.d() & 255) << 8);
    }

    public static IOException c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    @Override // defpackage.ohr
    public final ohm e(out outVar) {
        return new ohm(outVar);
    }
}
