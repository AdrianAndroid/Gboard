package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: yh  reason: default package */
/* loaded from: classes2.dex */
public final class yh implements yg {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public yh(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.yg
    public final yl a() {
        return new yl(new yk(this));
    }

    @Override // defpackage.yg
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.yg
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.yg
    public final void d(Uri uri) {
        this.d = uri;
    }
}
