package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: iqi  reason: default package */
/* loaded from: classes.dex */
public final class iqi extends iqg {
    public iqi(hhl hhlVar, int i) {
        super(lfb.g(hhlVar), iqj.COMMA_SEPARATED, i);
    }

    public static iqi a(hhl hhlVar) {
        return m(hhlVar, 1);
    }

    public static boolean g(hhl hhlVar) {
        return new iqi(hhlVar, 1).f();
    }

    public static iqi m(hhl hhlVar, int i) {
        iqi iqiVar = new iqi(hhlVar, i);
        iqiVar.i();
        return iqiVar;
    }

    public static boolean n(hhl hhlVar, Iterable iterable) {
        return new iqi(hhlVar, 1).k(lre.ab(iterable, hwy.l));
    }

    public static boolean p(hhl hhlVar) {
        return new iqi(hhlVar, 1).o();
    }

    @Override // defpackage.iqg
    public final /* synthetic */ Object b(String str) {
        return jav.f(str);
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return ((jav) obj) != null;
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ boolean d(Object obj, lmz lmzVar) {
        return ((jav) obj).h(lmzVar) != null;
    }

    public final boolean e(Locale locale) {
        return locale != null && j(jav.d(locale));
    }

    public final boolean f() {
        return k(lre.ab(hqr.b(), hwy.k));
    }

    public final boolean l() {
        return e(hqp.e());
    }

    public final boolean o() {
        hqt b = hqp.b();
        if (b == null) {
            return e(Locale.getDefault());
        }
        if (j(b.i())) {
            return true;
        }
        lmz k = b.k();
        return !k.isEmpty() && k(k);
    }
}
