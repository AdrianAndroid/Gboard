package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* renamed from: ayr  reason: default package */
/* loaded from: classes.dex */
public final class ayr implements azo, ayq {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public ayr(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.ayq
    public final avj a(AssetManager assetManager, String str) {
        return this.b != 0 ? new avq(assetManager, str) : new avy(assetManager, str);
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        return this.b != 0 ? new azv(this.a, this, 1) : new azv(this.a, this, 1);
    }

    @Override // defpackage.azo
    public final void c() {
    }
}
