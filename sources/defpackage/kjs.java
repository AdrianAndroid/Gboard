package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: kjs  reason: default package */
/* loaded from: classes.dex */
public final class kjs {
    final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    final boolean f;
    public final boolean g;
    public final boolean h;
    final leq i;

    public kjs(Uri uri) {
        this(uri, "", "", false, false, false);
    }

    public kjs(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = null;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = false;
        this.g = z2;
        this.h = z3;
        this.i = null;
    }

    public final kjs a() {
        return new kjs(this.b, this.c, this.d, this.e, true, this.h);
    }

    public final kjs b() {
        Uri uri = this.b;
        if (uri != null) {
            return new kjs(uri, this.c, this.d, this.e, this.g, true);
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }

    public final kjs c() {
        if (this.c.isEmpty()) {
            return new kjs(this.b, this.c, this.d, true, this.g, this.h);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final kju d(String str, double d) {
        return new kjo(this, str, Double.valueOf(d));
    }

    public final kju e(String str, long j) {
        return new kjm(this, str, Long.valueOf(j));
    }

    public final kju f(String str, String str2) {
        return new kjp(this, str, str2);
    }

    public final kju g(String str, boolean z) {
        return new kjn(this, str, Boolean.valueOf(z));
    }

    public final kju h(String str, Object obj, kjr kjrVar) {
        return kju.b(this, str, obj, kjrVar, true);
    }
}
