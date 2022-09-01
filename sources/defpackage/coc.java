package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: coc  reason: default package */
/* loaded from: classes.dex */
public final class coc implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/gif/GifCategoryManager");
    static final hhl b = hhq.f("tenor_category_refresh_duration_hours", 24);
    public final Context c;
    public final mkr d;
    public final Locale e;
    public mko f;
    public final dxs g;
    private final Resources h;
    private final iqi i = iqi.m(cyj.q, 3);

    private coc(Context context, Locale locale, dxs dxsVar, mkr mkrVar, byte[] bArr, byte[] bArr2) {
        this.c = context.getApplicationContext();
        this.e = locale;
        this.h = jbi.f(context, locale);
        this.g = dxsVar;
        this.d = mkrVar;
    }

    public static coc a(Context context) {
        mks a2 = gxo.a(6);
        Locale e = hqp.e();
        djc t = dxs.t();
        t.b = a2;
        return new coc(context, e, t.g(), a2, null, null);
    }

    public static llp c(cob cobVar) {
        return llp.o(lre.H(cobVar.a, cli.h));
    }

    public static File d(Context context, Locale locale) {
        return new File(new File(context.getCacheDir(), "tenor_categories/"), String.format(Locale.US, "%s.pb", locale.toLanguageTag()));
    }

    private static llp e(Resources resources) {
        return llp.o(lre.H(Arrays.asList(resources.getStringArray(R.array.f2070_resource_name_obfuscated_res_0x7f030070)), cli.i));
    }

    public final hiz b() {
        if (!this.i.e(this.e)) {
            return hiz.n(e(this.h));
        }
        cob cobVar = (cob) hji.b(this.f);
        if (cobVar == null || cobVar.b()) {
            return hiz.k(mio.h(this.d.hQ(new aty(this, 2)), new coa(this, 0), gyc.b)).u(cli.g, this.d).c(e(this.h));
        }
        return hiz.n(c(cobVar));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }
}
