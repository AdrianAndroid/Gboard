package defpackage;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ime  reason: default package */
/* loaded from: classes.dex */
public final class ime implements iln {
    public final Point b = new Point(a);
    public final Point c = new Point(a);
    public final List d = new ArrayList();
    final /* synthetic */ imh e;

    public ime(imh imhVar) {
        this.e = imhVar;
    }

    @Override // defpackage.iln
    public final int a() {
        return this.e.e.d.b;
    }

    @Override // defpackage.iln
    public final int b() {
        return this.e.e.d.a;
    }

    @Override // defpackage.iln
    public final int c() {
        return this.e.e.d.e;
    }

    @Override // defpackage.iln
    public final int d() {
        return this.e.e.d.d;
    }
}
