package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aay  reason: default package */
/* loaded from: classes.dex */
public class aay extends aax {
    private vq c = null;
    private vq f = null;
    private vq g = null;

    public aay(abc abcVar, WindowInsets windowInsets) {
        super(abcVar, windowInsets);
    }

    @Override // defpackage.aav, defpackage.aba
    public abc d(int i, int i2, int i3, int i4) {
        return abc.m(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.aaw, defpackage.aba
    public void m(vq vqVar) {
    }

    @Override // defpackage.aba
    public vq q() {
        if (this.f == null) {
            this.f = vq.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.f;
    }

    @Override // defpackage.aba
    public vq r() {
        if (this.c == null) {
            this.c = vq.e(this.a.getSystemGestureInsets());
        }
        return this.c;
    }

    @Override // defpackage.aba
    public vq s() {
        if (this.g == null) {
            this.g = vq.e(this.a.getTappableElementInsets());
        }
        return this.g;
    }
}
