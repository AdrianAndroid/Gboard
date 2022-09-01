package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: hqd  reason: default package */
/* loaded from: classes.dex */
public final class hqd {
    public final int a;
    public final int b;

    public hqd(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            return;
        }
        this.a = i2;
        this.b = i;
    }

    public final boolean a() {
        return this.a == this.b;
    }

    public final String toString() {
        return String.format(Locale.US, "[%d, %d]", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
