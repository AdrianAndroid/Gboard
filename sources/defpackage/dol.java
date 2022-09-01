package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.LatinIme;

/* compiled from: PG */
/* renamed from: dol  reason: default package */
/* loaded from: classes.dex */
public final class dol extends hlv {
    final /* synthetic */ LatinIme a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dol(LatinIme latinIme, hls hlsVar) {
        super(hlsVar);
        this.a = latinIme;
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hY(boolean z) {
        if (!this.a.g.a()) {
            if (this.a.d.g) {
                return;
            }
            super.hY(z);
            return;
        }
        dnz dnzVar = this.a.d;
        hlh hlhVar = dnzVar.j;
        boolean z2 = false;
        if (hlhVar != null) {
            hlhVar.a = 0;
        }
        if (z || dnzVar.g) {
            z2 = true;
        }
        super.hY(z2);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final boolean hZ(hln hlnVar, boolean z) {
        LatinIme latinIme = this.a;
        if (latinIme.q) {
            latinIme.A();
            return false;
        }
        return super.hZ(hlnVar, z);
    }
}
