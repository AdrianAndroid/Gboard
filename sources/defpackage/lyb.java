package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lyb  reason: default package */
/* loaded from: classes.dex */
final class lyb implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public lyb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new lyc(this.a, this.b);
    }
}
