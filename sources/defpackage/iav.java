package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: iav  reason: default package */
/* loaded from: classes.dex */
public final class iav {
    private static final ltg E = ltg.j("com/google/android/libraries/inputmethod/metadata/ImeDef");
    public static final iav a = a().d();
    public final boolean A;
    public final jav B;
    public final boolean C;
    public final boolean D;
    private final int F;
    public final String b;
    public final String c;
    @Deprecated
    public final String d;
    public final jav e;
    public final ibw f;
    public final String g;
    public final boolean h;
    public final int[] i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final iau n;
    public final int o;
    public final boolean p;
    public final iap q;
    public final icm r;
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final iav y;
    public final int z;

    public iav(iat iatVar, String str) {
        ibw ibwVar;
        icm icmVar;
        this.b = iatVar.b;
        this.c = iatVar.c;
        this.d = iatVar.d;
        this.e = jav.f(iatVar.d);
        this.F = iatVar.e;
        if (iatVar.a.isEmpty()) {
            ibwVar = ibw.b;
        } else {
            if (str != null) {
                ArrayList arrayList = iatVar.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    ibw ibwVar2 = (ibw) arrayList.get(i);
                    i++;
                    if (str.equals(ibwVar2.c)) {
                        ibwVar = ibwVar2;
                        break;
                    }
                }
            }
            ibwVar = (ibw) iatVar.a.get(0);
        }
        this.f = ibwVar;
        this.h = iatVar.g;
        this.k = iatVar.h;
        this.g = iatVar.f;
        this.l = iatVar.i;
        this.m = iatVar.j;
        this.i = iatVar.k;
        this.j = iatVar.l;
        iau iauVar = iatVar.m;
        this.n = iauVar == null ? iau.SOFT : iauVar;
        this.o = iatVar.n;
        this.p = iatVar.o;
        this.q = iatVar.A.b();
        icl iclVar = iatVar.B;
        int size2 = iclVar.a.size();
        jav javVar = null;
        if (size2 > 0) {
            icmVar = new icm((krm[]) iclVar.a.toArray(new krm[size2]), null);
        } else {
            icmVar = icm.a;
        }
        this.r = icmVar;
        this.s = iatVar.p;
        this.t = iatVar.q;
        this.u = iatVar.r;
        this.v = iatVar.s;
        this.w = iatVar.t;
        this.x = iatVar.u;
        iat iatVar2 = iatVar.C;
        this.y = iatVar2 != null ? iatVar2.e(str) : null;
        this.z = iatVar.v;
        this.A = iatVar.w;
        this.B = !TextUtils.isEmpty(iatVar.x) ? jav.f(iatVar.x) : javVar;
        this.C = iatVar.y;
        this.D = iatVar.z;
    }

    public static iat a() {
        return new iat();
    }

    public static iat b(iav iavVar) {
        iat iatVar = new iat();
        iatVar.b = iavVar.b;
        iatVar.c = iavVar.c;
        iatVar.j(iavVar.d);
        iatVar.e = iavVar.F;
        iatVar.f = iavVar.g;
        iatVar.g = iavVar.h;
        iatVar.h = iavVar.k;
        iatVar.i = iavVar.l;
        iatVar.j = iavVar.m;
        iatVar.k = iavVar.i;
        iatVar.l = iavVar.j;
        iatVar.m = iavVar.n;
        iatVar.n = iavVar.o;
        iatVar.o = iavVar.p;
        iap iapVar = iavVar.q;
        String str = null;
        if (iapVar == null) {
            iatVar.A.e();
        } else {
            iao iaoVar = iatVar.A;
            SparseArray sparseArray = iapVar.c;
            if (sparseArray == null) {
                iaoVar.a = null;
            } else {
                iaoVar.a = sparseArray.clone();
            }
        }
        icm icmVar = iavVar.r;
        icl iclVar = iatVar.B;
        iclVar.a.clear();
        int i = 0;
        while (true) {
            krm[] krmVarArr = icmVar.b;
            if (i >= krmVarArr.length) {
                break;
            }
            List list = iclVar.a;
            krm krmVar = krmVarArr[i];
            list.add(new krm(krmVar.a, (String) krmVar.b));
            i++;
        }
        iatVar.p = iavVar.s;
        iatVar.i(iavVar.f);
        iatVar.u = iavVar.x;
        iatVar.v = iavVar.z;
        iatVar.w = iavVar.A;
        jav javVar = iavVar.B;
        if (javVar != null) {
            str = javVar.n;
        }
        iatVar.x = str;
        iatVar.y = iavVar.C;
        iatVar.z = iavVar.D;
        return iatVar;
    }

    public static iat d(jls jlsVar) {
        iat iatVar = new iat();
        iatVar.D = jlsVar;
        return iatVar;
    }

    public static iav e(Context context, int i, String str, jls jlsVar) {
        iat d = d(jlsVar);
        int i2 = iat.E;
        d.g(context, i);
        return d.e(str);
    }

    public static llp f(Context context, jls jlsVar) {
        llk e = llp.e();
        try {
            jfy.f(context, R.xml.f210320_resource_name_obfuscated_res_0x7f17011c, jlsVar, new iba(new iat(), e, 1));
        } catch (IOException | XmlPullParserException e2) {
            ((ltd) ((ltd) ((ltd) E.d()).i(e2)).k("com/google/android/libraries/inputmethod/metadata/ImeDef", "loadImeDefs", 315, "ImeDef.java")).w("Failed to load ImeDefs from %s", jbi.i(R.xml.f210320_resource_name_obfuscated_res_0x7f17011c));
        }
        return e.g();
    }

    public final String c(Context context) {
        int i = this.F;
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }
}
