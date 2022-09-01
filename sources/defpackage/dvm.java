package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dvm  reason: default package */
/* loaded from: classes.dex */
public final class dvm implements hwu {
    public hfy a = null;
    public dsx b = dsx.a;
    public boolean c = false;
    private final dxe d;

    public dvm(dxe dxeVar, byte[] bArr) {
        this.d = dxeVar;
    }

    public static hww g() {
        hsk b = hsx.b();
        if (b == null) {
            return null;
        }
        return b.V();
    }

    private static void i(boolean z) {
        ijl.b().g(new jcc(z));
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void a(ibz ibzVar, ice iceVar, View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final void d(View view) {
        h();
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    public final void h() {
        hfy hfyVar = this.a;
        if (hfyVar != null) {
            dxe dxeVar = this.d;
            if (((Boolean) dsu.m.c()).booleanValue() && dxeVar.b() && hfyVar.q() != null) {
                dsx dsxVar = this.b;
                if (dsxVar.c) {
                    if (!dsxVar.c()) {
                        dsx dsxVar2 = this.b;
                        if (dsxVar2.b) {
                            if (!dsxVar2.d) {
                                return;
                            }
                            i(true);
                            return;
                        }
                    }
                    i(false);
                    return;
                }
            }
        }
        i(false);
    }
}
