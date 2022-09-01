package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.LatinIme;

/* compiled from: PG */
/* renamed from: dok  reason: default package */
/* loaded from: classes.dex */
public final class dok implements hli {
    final /* synthetic */ hls a;
    final /* synthetic */ LatinIme b;

    public dok(LatinIme latinIme, hls hlsVar) {
        this.b = latinIme;
        this.a = hlsVar;
    }

    @Override // defpackage.hli
    public final void d() {
        this.a.x();
        this.a.hW();
        this.b.k(false, true, 2);
        this.a.D();
        this.b.z(false, 0L);
    }

    @Override // defpackage.hli
    public final void k() {
        cbg cbgVar = this.b.k;
        cbgVar.n();
        this.a.hY(cbgVar.B());
    }
}
