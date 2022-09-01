package defpackage;

import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bot  reason: default package */
/* loaded from: classes.dex */
final class bot implements hff {
    private final boq a;

    public bot(boq boqVar) {
        this.a = boqVar;
    }

    @Override // defpackage.hff
    public final boolean a() {
        hfw a;
        if (!ino.M(this.a).aj(R.string.f160740_resource_name_obfuscated_res_0x7f14066a)) {
            return false;
        }
        hfp hfpVar = this.a.R;
        if (hfpVar == null || (a = hfpVar.a(IEmojiSearchExtension.class)) == null || !a.aa() || a != hfpVar.f) {
            final boq boqVar = this.a;
            final ibz ibzVar = ibz.d;
            return new hff() { // from class: dce
                @Override // defpackage.hff
                public final boolean a() {
                    hox P;
                    dcu dcuVar = dcu.this;
                    ibz ibzVar2 = ibzVar;
                    boolean z = false;
                    if (dcuVar.v.aj(R.string.f160740_resource_name_obfuscated_res_0x7f14066a)) {
                        EditorInfo N = dcuVar.N();
                        if ((ibzVar2 != ibz.d || (!ham.V(N) && !ham.ak(dcuVar, N) && fhr.w(dcuVar))) && (P = dcuVar.P()) != null) {
                            hpi hpiVar = P.e;
                            z = true;
                            if (hpiVar.d == ibzVar2) {
                                ibzVar2 = ibz.a;
                            }
                            hpiVar.l(ibzVar2, null);
                        }
                    }
                    return z;
                }
            }.a();
        }
        a.D();
        hfpVar.m();
        return true;
    }
}
