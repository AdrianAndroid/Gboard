package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gjk  reason: default package */
/* loaded from: classes.dex */
public final class gjk {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final Object e;

    public gjk(int i, Integer num, int i2, boolean z, int i3) {
        this.a = i;
        this.e = num;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }

    @Deprecated
    public gjk(Uri uri, int i, int i2, boolean z, int i3) {
        nq.g(uri);
        this.e = uri;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }
}
