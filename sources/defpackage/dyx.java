package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dyx  reason: default package */
/* loaded from: classes.dex */
public final class dyx implements dyz {
    private final Context a;
    private final AtomicReference b;

    public dyx(Context context) {
        this.a = context.getApplicationContext();
        this.b = new AtomicReference(c(context));
    }

    private static void b(View view, int i, int i2, boolean z) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setSelected(z);
            findViewById.setVisibility(i2);
        }
    }

    private static ewj c(Context context) {
        cuz cuzVar = cuz.a;
        boolean w = fhr.w(context);
        boolean w2 = fhr.w(context);
        boolean h = cuzVar.h();
        boolean g = cuzVar.g(context, h);
        boolean a = cuzVar.a(context, h);
        boolean e = cuzVar.e(context);
        boolean l = cuzVar.l(h, e);
        igr.d(context);
        boolean k = igr.k(RichSymbolExtension.class);
        lmx g2 = lmz.g();
        lmx g3 = lmz.g();
        (true != l ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_0));
        (true != w ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_1));
        (true != a ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_2));
        (true != g ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_3));
        (true != e ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_4));
        (true != w2 ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_5));
        (true != k ? g3 : g2).d(Integer.valueOf((int) R.id.key_pos_non_prime_category_6));
        if (jam.H(context)) {
            ieh.j().e(ctd.BITMOJI_INSTALLED, new Object[0]);
            if (a) {
                ieh j = ieh.j();
                ctd ctdVar = ctd.IMPRESSION;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 4;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 14;
                mbcVar2.a |= 2;
                objArr[0] = t.cz();
                j.e(ctdVar, objArr);
            }
        }
        return new ewj(g2.g(), g3.g());
    }

    @Override // defpackage.dyz
    public final void a(View view, int i) {
        this.b.set(c(this.a));
        lsz it = ((lmz) ((ewj) this.b.get()).a).iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            b(view, intValue, 0, intValue == i);
        }
        lsz it2 = ((lmz) ((ewj) this.b.get()).b).iterator();
        while (it2.hasNext()) {
            b(view, ((Integer) it2.next()).intValue(), 8, false);
        }
    }
}
