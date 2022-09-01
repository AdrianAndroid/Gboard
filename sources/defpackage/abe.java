package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: abe  reason: default package */
/* loaded from: classes.dex */
public final class abe extends abd {
    public abe(Window window) {
        super(window);
    }

    @Override // defpackage.uc
    public final boolean f() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.uc
    public final void e(boolean z) {
        if (!z) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            return;
        }
        this.a.clearFlags(67108864);
        this.a.addFlags(Integer.MIN_VALUE);
        View decorView2 = this.a.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
    }
}
