package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fdx  reason: default package */
/* loaded from: classes.dex */
public final class fdx extends hst {
    final /* synthetic */ fdy a;

    public fdx(fdy fdyVar) {
        this.a = fdyVar;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        hqt b;
        if (editorInfo2 != null || (b = hqp.b()) == null) {
            return;
        }
        final fdy fdyVar = this.a;
        final Context a = b.a();
        if (!fdyVar.f.a(a, fdyVar.e, fdyVar.c)) {
            return;
        }
        hkr a2 = hkt.a();
        a2.d(R.layout.f147110_resource_name_obfuscated_res_0x7f0e0614);
        a2.i(a.getString(R.string.f152110_resource_name_obfuscated_res_0x7f14025a));
        a2.e("tag_on_device_notice");
        a2.f(fdy.b);
        a2.g(1);
        a2.e = new fci(fdyVar, 4);
        a2.c = new fci(fdyVar, 5);
        a2.f = new hks() { // from class: fdv
            @Override // defpackage.hks
            public final boolean a() {
                fdy fdyVar2 = fdy.this;
                Context context = a;
                if (!fdyVar2.d.x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, true) || !fdyVar2.d.x(R.string.f160930_resource_name_obfuscated_res_0x7f14067d, false) || fdy.c(fdyVar2.c) || !fdyVar2.e.q() || !fdyVar2.e.n() || !fbr.m(context)) {
                    return false;
                }
                hpy b2 = hqj.b();
                return b2 == null || !b2.e();
            }
        };
        hkv.b(a2.a());
    }
}
