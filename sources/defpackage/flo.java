package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: flo  reason: default package */
/* loaded from: classes.dex */
public final class flo {
    public static final String[] a = new String[0];
    public static final List b = new CopyOnWriteArrayList();
    public static volatile int c = -1;
    public static final fgy l;
    @Deprecated
    public static final ijk m;
    final flp d;
    public final Context e;
    public final String f;
    public final EnumSet g;
    public final fln h;
    public final List i;
    public final String j;
    public int k;

    static {
        flj fljVar = new flj();
        l = fljVar;
        m = new ijk("ClearcutLogger.API", fljVar, null, null, null);
    }

    public flo(Context context, String str) {
        this(context, str, fmd.e, fmi.b(context), new fmn(context));
    }

    public static flk a(Context context, String str) {
        return new flk(context, str);
    }

    public static flo d(Context context, String str) {
        flk a2 = a(context, str);
        a2.b(fmd.f);
        return a2.a();
    }

    public static String e(Iterable iterable) {
        return lex.d(", ").f(iterable);
    }

    public static void f(EnumSet enumSet) {
        if (enumSet.equals(fmd.g) || enumSet.equals(fmd.e) || enumSet.equals(fmd.f)) {
            return;
        }
        throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
    }

    public static int[] h(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public static void i(EnumSet enumSet) {
        if (!enumSet.contains(fmd.ACCOUNT_NAME)) {
            fyb.az(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        f(enumSet);
    }

    public final flm b(lgb lgbVar) {
        return new flm(this, lgbVar);
    }

    @Deprecated
    public final flm c(ngz ngzVar) {
        Objects.requireNonNull(ngzVar);
        return b(new etm(ngzVar, 4));
    }

    public final boolean g() {
        return this.g.equals(fmd.f);
    }

    public flo(Context context, String str, EnumSet enumSet, flp flpVar, fln flnVar) {
        this.i = new CopyOnWriteArrayList();
        this.k = 1;
        i(enumSet);
        this.e = context.getApplicationContext();
        this.f = context.getPackageName();
        this.j = str;
        this.g = enumSet;
        this.d = flpVar;
        this.k = 1;
        this.h = flnVar;
    }
}
