package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: eqi  reason: default package */
/* loaded from: classes.dex */
public final class eqi implements erb {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    private final boolean L;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public eqi(Context context, boolean z) {
        this.L = z;
        this.a = a(context, R.attr.f9790_resource_name_obfuscated_res_0x7f040340);
        this.b = a(context, R.attr.f9850_resource_name_obfuscated_res_0x7f040346);
        this.c = a(context, R.attr.f9520_resource_name_obfuscated_res_0x7f040325);
        this.d = a(context, R.attr.f9570_resource_name_obfuscated_res_0x7f04032a);
        this.e = a(context, R.attr.f9800_resource_name_obfuscated_res_0x7f040341);
        this.f = a(context, R.attr.f9530_resource_name_obfuscated_res_0x7f040326);
        this.g = a(context, R.attr.f9540_resource_name_obfuscated_res_0x7f040327);
        this.h = a(context, R.attr.f9950_resource_name_obfuscated_res_0x7f040351);
        this.i = a(context, R.attr.f9970_resource_name_obfuscated_res_0x7f040353);
        this.j = a(context, R.attr.f9610_resource_name_obfuscated_res_0x7f04032e);
        this.k = a(context, R.attr.f9650_resource_name_obfuscated_res_0x7f040332);
        this.l = a(context, R.attr.f9960_resource_name_obfuscated_res_0x7f040352);
        this.m = a(context, R.attr.f9620_resource_name_obfuscated_res_0x7f04032f);
        this.n = a(context, R.attr.f9630_resource_name_obfuscated_res_0x7f040330);
        this.o = a(context, R.attr.f10050_resource_name_obfuscated_res_0x7f04035b);
        this.p = a(context, R.attr.f9750_resource_name_obfuscated_res_0x7f04033c);
        this.q = a(context, R.attr.f9760_resource_name_obfuscated_res_0x7f04033d);
        this.r = a(context, R.attr.f9430_resource_name_obfuscated_res_0x7f04031a);
        this.s = a(context, R.attr.f9450_resource_name_obfuscated_res_0x7f04031c);
        this.t = a(context, R.attr.f9500_resource_name_obfuscated_res_0x7f040323);
        this.u = a(context, R.attr.f9780_resource_name_obfuscated_res_0x7f04033f);
        this.v = a(context, 16842801);
        this.w = a(context, R.attr.f9470_resource_name_obfuscated_res_0x7f04031e);
        this.x = a(context, R.attr.f10000_resource_name_obfuscated_res_0x7f040356);
        this.y = a(context, R.attr.f9670_resource_name_obfuscated_res_0x7f040334);
        this.z = a(context, R.attr.f9690_resource_name_obfuscated_res_0x7f040336);
        this.A = a(context, R.attr.f10020_resource_name_obfuscated_res_0x7f040358);
        this.B = a(context, R.attr.f9710_resource_name_obfuscated_res_0x7f040338);
        this.C = a(context, R.attr.f9720_resource_name_obfuscated_res_0x7f040339);
        this.D = a(context, R.attr.f10010_resource_name_obfuscated_res_0x7f040357);
        this.E = a(context, R.attr.f9680_resource_name_obfuscated_res_0x7f040335);
        this.F = jdg.d(R.dimen.f34950_resource_name_obfuscated_res_0x7f070215, context);
        this.G = jdg.d(R.dimen.f34960_resource_name_obfuscated_res_0x7f070216, context);
        this.H = jdg.d(R.dimen.f34970_resource_name_obfuscated_res_0x7f070217, context);
        this.I = jdg.d(R.dimen.f34980_resource_name_obfuscated_res_0x7f070218, context);
        this.J = jdg.d(R.dimen.f34990_resource_name_obfuscated_res_0x7f070219, context);
        this.K = jdg.d(R.dimen.f35000_resource_name_obfuscated_res_0x7f07021a, context);
    }

    private static int a(Context context, int i) {
        return itb.c(context, i, 0);
    }

    private static eux d(String str, int i) {
        nfh t = eut.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eut eutVar = (eut) t.b;
        eutVar.a |= 1;
        eutVar.b = i;
        return era.q(str, (eut) t.cz());
    }

    @Override // defpackage.erb
    public final euw b() {
        nfh t = euw.c.t();
        t.cO(d("color_gm3_primary", this.a));
        t.cO(d("color_gm3_primary_state_content", this.b));
        t.cO(d("color_gm3_on_primary", this.c));
        t.cO(d("color_gm3_on_primary_state_content", this.d));
        t.cO(d("color_gm3_primary_container", this.e));
        t.cO(d("color_gm3_on_primary_container", this.f));
        t.cO(d("color_gm3_on_primary_container_state_content", this.g));
        t.cO(d("color_gm3_secondary", this.h));
        t.cO(d("color_gm3_secondary_state_content", this.i));
        t.cO(d("color_gm3_on_secondary", this.j));
        t.cO(d("color_gm3_on_secondary_state_content", this.k));
        t.cO(d("color_gm3_secondary_container", this.l));
        t.cO(d("color_gm3_on_secondary_container", this.m));
        t.cO(d("color_gm3_on_secondary_container_state_content", this.n));
        t.cO(d("color_gm3_tertiary_container", this.o));
        t.cO(d("color_gm3_on_tertiary_container", this.p));
        t.cO(d("color_gm3_on_tertiary_container_state_content", this.q));
        t.cO(d("color_gm3_error", this.r));
        t.cO(d("color_gm3_error_state_content", this.s));
        t.cO(d("color_gm3_on_error", this.t));
        t.cO(d("color_gm3_outline", this.u));
        t.cO(d("color_gm3_background", this.v));
        t.cO(d("color_gm3_on_background", this.w));
        t.cO(d("color_gm3_on_background_a80", (this.w & 16777215) | (Math.round(204.0f) << 24)));
        t.cO(d("color_gm3_surface", this.x));
        t.cO(d("color_gm3_on_surface", this.y));
        t.cO(d("color_gm3_on_surface_state_content", this.z));
        t.cO(d("color_gm3_surface_variant", this.A));
        t.cO(d("color_gm3_on_surface_variant", this.B));
        t.cO(d("color_gm3_on_surface_variant_state_content", this.C));
        t.cO(d("color_gm3_surface_inverse", this.D));
        t.cO(d("color_gm3_on_surface_inverse", this.E));
        t.cO(d("color_gm3_surface0", this.F));
        t.cO(d("color_gm3_surface1", this.G));
        t.cO(d("color_gm3_surface2", this.H));
        t.cO(d("color_gm3_surface3", this.I));
        t.cO(d("color_gm3_surface4", this.J));
        t.cO(d("color_gm3_surface5", this.K));
        return (euw) t.cz();
    }

    @Override // defpackage.erb
    public final String c() {
        return String.format(Locale.US, "material3-%s-%x-%x-%s", true != this.L ? "dark" : "light", Integer.valueOf(this.v), Integer.valueOf(this.a), jbs.a(lex.c('-').h(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.t), Integer.valueOf(this.s), Integer.valueOf(this.u), Integer.valueOf(this.v), Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Integer.valueOf(this.I), Integer.valueOf(this.J), Integer.valueOf(this.K))));
    }
}
