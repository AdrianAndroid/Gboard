package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: xj  reason: default package */
/* loaded from: classes2.dex */
public final class xj {
    static final xj a;
    static final xj b;
    static final kkc c;
    public final kkc d;

    static {
        kkc kkcVar = xo.a;
        c = kkcVar;
        Character.toString((char) 8206);
        Character.toString((char) 8207);
        a = new xj(kkcVar, null, null);
        b = new xj(kkcVar, null, null);
    }

    public xj(kkc kkcVar, byte[] bArr, byte[] bArr2) {
        this.d = kkcVar;
    }

    public static xj a() {
        return xq.a(Locale.getDefault()) == 1 ? b : a;
    }
}
