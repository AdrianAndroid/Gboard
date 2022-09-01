package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* renamed from: ew  reason: default package */
/* loaded from: classes.dex */
class ew extends et {
    private ev d;
    private boolean e;

    public ew() {
        this(null, null);
    }

    @Override // defpackage.et, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.et
    /* renamed from: d */
    public ev c() {
        return new ev(this.d, this, null);
    }

    @Override // defpackage.et
    public void e(es esVar) {
        super.e(esVar);
        if (esVar instanceof ev) {
            this.d = (ev) esVar;
        }
    }

    @Override // defpackage.et, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.et, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.e) {
            super.mutate();
            this.d.d();
            this.e = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.et, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m = this.d.m(iArr);
        if (m < 0) {
            m = this.d.m(StateSet.WILD_CARD);
        }
        return h(m) || onStateChange;
    }

    public ew(byte[] bArr) {
    }

    public ew(ev evVar, Resources resources) {
        e(new ev(evVar, this, resources));
        onStateChange(getState());
    }
}
