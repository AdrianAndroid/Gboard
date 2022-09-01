package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cni  reason: default package */
/* loaded from: classes.dex */
public final class cni implements cuw {
    public static final cng a;

    static {
        cnf a2 = cng.a();
        a2.c(false);
        a2.e(0);
        a2.h(R.layout.f134280_resource_name_obfuscated_res_0x7f0e008d);
        a = a2.a();
    }

    @Override // defpackage.cuw
    public final /* synthetic */ int a(Object obj) {
        return 0;
    }

    @Override // defpackage.cuw
    public final /* synthetic */ int b() {
        return 1;
    }

    @Override // defpackage.cuw
    public final /* bridge */ /* synthetic */ int c(Object obj) {
        cng cngVar = (cng) obj;
        return -1;
    }

    @Override // defpackage.cuw
    public final cum d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new cnh(context, layoutInflater, (ViewGroup) layoutInflater.inflate(R.layout.f134240_resource_name_obfuscated_res_0x7f0e0089, viewGroup, false));
    }
}
