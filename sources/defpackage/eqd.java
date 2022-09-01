package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: eqd  reason: default package */
/* loaded from: classes.dex */
public final class eqd implements erb {
    public final boolean a;
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

    private eqd(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16844176});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.a = z;
        if (z) {
            this.b = context.getColor(17170491);
            this.c = context.getColor(17170503);
            this.d = context.getColor(17170516);
            this.e = context.getColor(17170495);
            this.f = context.getColor(17170508);
            this.g = context.getColor(17170521);
            this.h = context.getColor(17170504);
            this.i = context.getColor(17170472);
            this.j = context.getColor(17170483);
            this.k = context.getColor(17170481);
            this.l = context.getColor(17170463);
            this.m = context.getColor(17170478);
            this.n = context.getColor(17170480);
            this.o = context.getColor(17170463);
            this.p = context.getColor(17170464);
            this.q = context.getColor(17170461);
            this.r = context.getColor(17170477);
            return;
        }
        this.b = context.getColor(17170490);
        this.c = context.getColor(17170503);
        this.d = context.getColor(17170516);
        this.e = context.getColor(17170492);
        this.f = context.getColor(17170505);
        this.g = context.getColor(17170518);
        this.h = context.getColor(17170504);
        this.i = context.getColor(17170463);
        this.j = context.getColor(17170478);
        this.k = context.getColor(17170480);
        this.l = context.getColor(17170472);
        this.m = context.getColor(17170483);
        this.n = context.getColor(17170481);
        this.o = context.getColor(17170472);
        this.p = context.getColor(17170471);
        this.q = context.getColor(17170461);
        this.r = context.getColor(17170470);
    }

    public static eqd a(Context context, int i) {
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        return new eqd(new ContextThemeWrapper(context, i));
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
        t.cO(d("color_silk_accent_primary", this.b));
        t.cO(d("color_silk_accent_secondary", this.c));
        t.cO(d("color_silk_accent_tertiary", this.d));
        t.cO(d("color_silk_accent_primary_variant", this.e));
        t.cO(d("color_silk_accent_secondary_variant", this.f));
        t.cO(d("color_silk_accent_tertiary_variant", this.g));
        t.cO(d("color_silk_accent_secondary_a2200", this.h));
        t.cO(d("color_silk_text_primary", this.i));
        t.cO(d("color_silk_text_primary_a80", (this.i & 16777215) | (Math.round(204.0f) << 24)));
        t.cO(d("color_silk_text_secondary", this.j));
        t.cO(d("color_silk_text_tertiary", this.k));
        t.cO(d("color_silk_text_primary_inverse", this.l));
        t.cO(d("color_silk_text_secondary_inverse", this.m));
        t.cO(d("color_silk_text_tertiary_inverse", this.n));
        t.cO(d("color_silk_background", this.o));
        t.cO(d("color_silk_background_floating", this.p));
        t.cO(d("color_silk_background_white", this.q));
        t.cO(d("color_silk_surface_variant", this.r));
        return (euw) t.cz();
    }

    @Override // defpackage.erb
    public final String c() {
        return String.format(Locale.US, "dynamic-%s-%x-%x-%s", true != this.a ? "dark" : "light", Integer.valueOf(this.o), Integer.valueOf(this.b), jbs.a(lex.c('-').h(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r))));
    }
}
