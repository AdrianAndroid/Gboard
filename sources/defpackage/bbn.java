package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* renamed from: bbn  reason: default package */
/* loaded from: classes.dex */
public final class bbn implements axh, axe {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public bbn(Bitmap bitmap, axp axpVar, int i) {
        this.a = i;
        ce.q(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        ce.q(axpVar, "BitmapPool must not be null");
        this.c = axpVar;
    }

    public static axh f(Resources resources, axh axhVar) {
        if (axhVar == null) {
            return null;
        }
        return new bbn(resources, axhVar, 0);
    }

    public static bbn g(Bitmap bitmap, axp axpVar) {
        if (bitmap == null) {
            return null;
        }
        return new bbn(bitmap, axpVar, 1);
    }

    @Override // defpackage.axh
    public final Class b() {
        return this.a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [axh, java.lang.Object] */
    @Override // defpackage.axh
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.axe
    public final void d() {
        if (this.a == 0) {
            Object obj = this.c;
            if (!(obj instanceof axe)) {
                return;
            }
            ((axe) obj).d();
            return;
        }
        ((Bitmap) this.b).prepareToDraw();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axh, java.lang.Object] */
    @Override // defpackage.axh
    public final int a() {
        if (this.a == 0) {
            return this.c.a();
        }
        return bgj.a((Bitmap) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [axp, java.lang.Object] */
    @Override // defpackage.axh
    public final void e() {
        if (this.a == 0) {
            this.c.e();
        } else {
            this.c.d((Bitmap) this.b);
        }
    }

    private bbn(Resources resources, axh axhVar, int i) {
        this.a = i;
        ce.m(resources);
        this.b = resources;
        ce.m(axhVar);
        this.c = axhVar;
    }
}
