package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: hvi  reason: default package */
/* loaded from: classes.dex */
public final class hvi {
    public final gqk a;
    public final gqk b;
    public final gqk c;
    public final ija d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;

    public hvi(Context context, hvh hvhVar) {
        gqk gqkVar;
        String string = context.getString(R.string.f153880_resource_name_obfuscated_res_0x7f140329);
        if (context.getPackageName().startsWith("com.google.android.inputmethod.japanese")) {
            gqkVar = new gqk(0, string, null, null);
        } else {
            Objects.requireNonNull(hvhVar);
            hvg hvgVar = new hvg(hvhVar, 6);
            gqe d = d(string);
            d.f(R.drawable.f47000_resource_name_obfuscated_res_0x7f0801aa);
            d.l(hvgVar);
            gqh a = d.a();
            Objects.requireNonNull(hvhVar);
            hvg hvgVar2 = new hvg(hvhVar, 2);
            gqe d2 = d(string);
            d2.f(R.drawable.f46970_resource_name_obfuscated_res_0x7f0801a7);
            d2.l(hvgVar2);
            d2.b("closeAction", true);
            gqkVar = new gqk(0, string, a, d2.a());
        }
        this.a = gqkVar;
        String string2 = context.getString(R.string.f153910_resource_name_obfuscated_res_0x7f14032c);
        Objects.requireNonNull(hvhVar);
        hvg hvgVar3 = new hvg(hvhVar, 5);
        gqe e = e(string2);
        e.f(R.drawable.f47020_resource_name_obfuscated_res_0x7f0801ac);
        e.l(hvgVar3);
        gqh a2 = e.a();
        Objects.requireNonNull(hvhVar);
        hvg hvgVar4 = new hvg(hvhVar, 2);
        gqe e2 = e(string2);
        e2.f(R.drawable.f46980_resource_name_obfuscated_res_0x7f0801a8);
        e2.l(hvgVar4);
        e2.b("closeAction", true);
        this.b = new gqk(0, string2, a2, e2.a());
        String string3 = context.getString(R.string.f153960_resource_name_obfuscated_res_0x7f140331);
        Objects.requireNonNull(hvhVar);
        hvg hvgVar5 = new hvg(hvhVar, 0);
        gqe f = f(string3);
        f.f(R.drawable.f47030_resource_name_obfuscated_res_0x7f0801ad);
        f.g(R.string.f156370_resource_name_obfuscated_res_0x7f140431);
        f.l(hvgVar5);
        f.d(R.string.f159370_resource_name_obfuscated_res_0x7f1405d2);
        gqh a3 = f.a();
        Objects.requireNonNull(hvhVar);
        hvg hvgVar6 = new hvg(hvhVar, 2);
        gqe f2 = f(string3);
        f2.f(R.drawable.f46990_resource_name_obfuscated_res_0x7f0801a9);
        f2.l(hvgVar6);
        f2.g(R.string.f155910_resource_name_obfuscated_res_0x7f140403);
        f2.b("closeAction", true);
        f2.d(R.string.f149500_resource_name_obfuscated_res_0x7f14011c);
        this.c = new gqk(0, string3, a3, f2.a());
        ija c = ijf.c(new hvg(this, 3), new hvg(this, 4), gqm.a);
        this.d = c;
        c.e(mjl.a);
    }

    public static int a(boolean z, boolean z2) {
        if (!z) {
            return 2;
        }
        return !z2 ? 0 : 1;
    }

    private static gqe d(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.g(R.string.f156000_resource_name_obfuscated_res_0x7f14040c);
        a.d(R.string.f152490_resource_name_obfuscated_res_0x7f140282);
        return a;
    }

    private static gqe e(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.g(R.string.f156070_resource_name_obfuscated_res_0x7f140413);
        a.d(R.string.f159320_resource_name_obfuscated_res_0x7f1405bc);
        return a;
    }

    private static gqe f(String str) {
        gqe a = gqh.a();
        a.i(str);
        return a;
    }

    public final void b(gqk gqkVar, int i) {
        if (this.e) {
            gqkVar.a(i);
        }
    }

    public final void c(boolean z, boolean z2) {
        int a = a(z, z2);
        this.g = a;
        b(this.b, a);
    }
}
