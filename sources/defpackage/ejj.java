package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ejj  reason: default package */
/* loaded from: classes.dex */
public final class ejj {
    static final Runnable a = bsd.d;
    public static final Object b = new Object();
    static final Object c = new Object();

    public static int a(View view) {
        int layoutDirection;
        jav c2 = hqp.c();
        if (c2 != null) {
            layoutDirection = c2.a();
        } else {
            layoutDirection = view.getLayoutDirection();
        }
        return layoutDirection == 1 ? 4 : 3;
    }

    public static cuw b(ot otVar) {
        gmi i = cnx.i();
        i.o();
        i.n(R.layout.f146540_resource_name_obfuscated_res_0x7f0e05cc, new ebi(otVar, 7));
        return i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cuw c(Context context, dpe dpeVar, his hisVar, his hisVar2) {
        gmi i = cnx.i();
        i.c = ehk.n;
        i.n(R.layout.f146500_resource_name_obfuscated_res_0x7f0e05c8, new eiy(context, dpeVar, hisVar, hisVar2, 0, null, null));
        i.n(R.layout.f146570_resource_name_obfuscated_res_0x7f0e05cf, new ebi(hisVar, 4));
        return i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cuw d(dpe dpeVar, his hisVar, Runnable runnable) {
        gmi i = cnx.i();
        i.o();
        i.c = ehk.o;
        i.n(R.layout.f146510_resource_name_obfuscated_res_0x7f0e05c9, new cjq(dpeVar, hisVar, 17, (byte[]) null, (byte[]) null));
        i.n(R.layout.f143600_resource_name_obfuscated_res_0x7f0e0478, new ebi(hisVar, 5));
        i.n(R.layout.f146530_resource_name_obfuscated_res_0x7f0e05cb, new ebi(hisVar, 6));
        i.n(R.layout.f146520_resource_name_obfuscated_res_0x7f0e05ca, new crj(dpeVar, hisVar, runnable, 6, (byte[]) null, (byte[]) null));
        return i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cuw e(his hisVar, dxs dxsVar, leq leqVar) {
        gmi i = cnx.i();
        i.n(R.layout.f133540_resource_name_obfuscated_res_0x7f0e002b, new crj(hisVar, dxsVar, leqVar, 5, (byte[]) null, (byte[]) null));
        return i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cuw f(his hisVar, dxs dxsVar, leq leqVar) {
        gmi i = cnx.i();
        i.n(R.layout.f133540_resource_name_obfuscated_res_0x7f0e002b, new crj(hisVar, dxsVar, leqVar, 4, (byte[]) null, (byte[]) null));
        return i.m();
    }
}
