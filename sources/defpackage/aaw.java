package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaw  reason: default package */
/* loaded from: classes.dex */
public class aaw extends aav {
    private vq c = null;

    public aaw(abc abcVar, WindowInsets windowInsets) {
        super(abcVar, windowInsets);
    }

    @Override // defpackage.aba
    public final vq j() {
        if (this.c == null) {
            this.c = vq.d(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.aba
    public abc k() {
        return abc.m(this.a.consumeStableInsets());
    }

    @Override // defpackage.aba
    public abc l() {
        return abc.m(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.aba
    public void m(vq vqVar) {
        this.c = vqVar;
    }

    @Override // defpackage.aba
    public boolean n() {
        return this.a.isConsumed();
    }
}
