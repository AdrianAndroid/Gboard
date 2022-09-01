package defpackage;

import android.graphics.Path;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjj  reason: default package */
/* loaded from: classes.dex */
public final class bjj extends bjm {
    public float a;
    public final float b;
    public final Path c;
    final /* synthetic */ bjo d;

    public bjj(bjo bjoVar, float f, float f2, Path path) {
        this.d = bjoVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.bjm
    public final void a(String str) {
        if (this.d.i()) {
            Path path = new Path();
            this.d.f.d.getTextPath(str, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        }
        this.a += this.d.f.d.measureText(str);
    }

    @Override // defpackage.bjm
    public final boolean b(bix bixVar) {
        if (bixVar instanceof biy) {
            bjo.h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }
        return true;
    }
}
