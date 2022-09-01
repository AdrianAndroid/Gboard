package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: eq  reason: default package */
/* loaded from: classes.dex */
public final class eq extends ew {
    private el d;
    private ep e;
    private int f;
    private int g;
    private boolean h;

    public eq() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(r19.getPositionDescription()).concat(": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eq b(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.b(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):eq");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ew
    /* renamed from: a */
    public final el d() {
        return new el(this.d, this, null);
    }

    @Override // defpackage.ew, defpackage.et
    public final void e(es esVar) {
        super.e(esVar);
        if (esVar instanceof el) {
            this.d = (el) esVar;
        }
    }

    @Override // defpackage.ew, defpackage.et, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.et, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ep epVar = this.e;
        if (epVar != null) {
            epVar.b();
            this.e = null;
            h(this.f);
            this.f = -1;
            this.g = -1;
        }
    }

    @Override // defpackage.ew, defpackage.et, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h) {
            super.mutate();
            this.d.d();
            this.h = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if (h(r2) != false) goto L7;
     */
    @Override // defpackage.ew, defpackage.et, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.onStateChange(int[]):boolean");
    }

    @Override // defpackage.et, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        ep epVar = this.e;
        if (epVar != null && (visible || z2)) {
            if (z) {
                epVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public eq(el elVar, Resources resources) {
        super(null);
        this.f = -1;
        this.g = -1;
        e(new el(elVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
