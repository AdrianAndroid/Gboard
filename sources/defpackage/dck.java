package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: dck  reason: default package */
/* loaded from: classes.dex */
public final class dck implements htc {
    public final /* synthetic */ dcu a;

    public dck(dcu dcuVar) {
        this.a = dcuVar;
    }

    @Override // defpackage.htc
    public final int a() {
        if (this.a.bA()) {
            return -1;
        }
        return dds.c(iin.m(this.a), this.a.A(), this.a.isFullscreenMode());
    }

    @Override // defpackage.htc
    public final int b(int i) {
        if (this.a.bA()) {
            return -1;
        }
        return dds.d(iin.m(this.a), this.a.A(), i, this.a.isFullscreenMode());
    }

    @Override // defpackage.htc
    public final int c() {
        dcu dcuVar = this.a;
        if (dcuVar.m) {
            return 0;
        }
        WindowInsets windowInsets = dcuVar.l;
        if (windowInsets != null) {
            return windowInsets.getStableInsetBottom();
        }
        return -1;
    }

    @Override // defpackage.htc
    public final int d() {
        WindowInsets windowInsets;
        dcu dcuVar = this.a;
        if (!dcuVar.m || (windowInsets = dcuVar.l) == null) {
            return 0;
        }
        return windowInsets.getStableInsetBottom();
    }

    @Override // defpackage.htc
    public final int e(ice[] iceVarArr) {
        return dds.b(iin.m(this.a), iceVarArr, this.a.y());
    }
}
