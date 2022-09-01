package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bcf  reason: default package */
/* loaded from: classes.dex */
final class bcf extends bce {
    private bcf(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static axh g(Drawable drawable) {
        if (drawable != null) {
            return new bcf(drawable);
        }
        return null;
    }

    @Override // defpackage.axh
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.axh
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.axh
    public final void e() {
    }
}
