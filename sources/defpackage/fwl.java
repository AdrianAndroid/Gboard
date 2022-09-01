package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fwl  reason: default package */
/* loaded from: classes.dex */
public final class fwl {
    public int a;
    public long b;
    public fwq c;
    private String d;
    private String e;
    private Uri g;
    private Uri h;
    private Uri j;
    private int f = 0;
    private byte[] i = new byte[0];

    public final fwm a() {
        return new fwm(this.d, this.a, false, this.e, this.f, this.g, null, this.b, this.h, this.c, this.i, this.j);
    }

    public final void b(byte[] bArr) {
        jdg.u(bArr);
        this.i = Arrays.copyOf(bArr, bArr.length);
    }

    public final void c(String str) {
        jdg.u(str);
        jdg.v(!str.isEmpty());
        this.e = str;
    }

    public final void d(Uri uri, Uri uri2, Uri uri3) {
        fwm.b(uri);
        fwm.b(uri2);
        fwm.b(uri3);
        this.f = 3;
        this.g = uri;
        this.j = uri2;
        this.h = uri3;
    }

    public final void e(String str) {
        jdg.u(str);
        jdg.v(!str.isEmpty());
        this.d = str;
    }
}
