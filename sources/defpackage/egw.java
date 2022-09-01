package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: egw  reason: default package */
/* loaded from: classes.dex */
public final class egw implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public egw(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    public static egw c(oiy oiyVar) {
        return new egw(oiyVar, 1);
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final Integer b() {
        if (this.b == 0) {
            return Integer.valueOf(jbt.h(((egx) this.a).b(), R.attr.f6700_resource_name_obfuscated_res_0x7f0401d3));
        }
        return Integer.valueOf(jbt.h((Context) this.a.a(), R.attr.f6690_resource_name_obfuscated_res_0x7f0401d2));
    }
}
