package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: iur  reason: default package */
/* loaded from: classes.dex */
public final class iur implements ixd {
    public static final mxy a = mxy.c;
    public static final lmz b = lmz.s(mxz.LIKE, mxz.GLOB);
    public static final lfy c = lfy.c(',');
    public static final lex d = lex.c(',');
    public volatile llw e = lrq.b;
    private final ija f;

    public iur(Context context) {
        ija a2 = ijf.a(new idx(this, context, 13), hrx.d);
        this.f = a2;
        a2.e(mjl.a);
    }

    @Override // defpackage.ixd
    public final /* synthetic */ ipz a(ngz ngzVar, llw llwVar) {
        osr a2;
        int i;
        myc mycVar = (myc) ngzVar;
        if (mycVar.equals(myc.h)) {
            return ipz.c;
        }
        if ((mycVar.a & 1) != 0) {
            mye myeVar = mycVar.b;
            if (myeVar == null) {
                myeVar = mye.c;
            }
            jyw jywVar = new jyw(this, llwVar);
            Objects.requireNonNull(llwVar);
            ipz a3 = iti.a(myeVar, jywVar, new opu(llwVar));
            a2 = ipz.b(a3.d, a3.e);
            a2.c = a3.f;
            a2.d = a3.g;
            a2.e = a3.h;
        } else {
            a2 = ipz.a();
        }
        if (mycVar.c > 0) {
            a2.m("_timestamp_", ipy.GREATER_OR_EQUAL, String.valueOf(System.currentTimeMillis() - mycVar.c));
        }
        if (mycVar.d) {
            a2.o("_timestamp_", true);
        } else {
            a2.q("_timestamp_");
        }
        int i2 = mycVar.e;
        if (i2 > 0) {
            a2.n(i2);
        }
        ipw ipwVar = new ipw();
        ipwVar.f = 1;
        ipwVar.e = (byte) (ipwVar.e | 1);
        ipwVar.a(0);
        ipwVar.c(0, 0);
        ipwVar.b(false);
        ipwVar.b(mycVar.g);
        myb mybVar = mycVar.f;
        if (mybVar == null) {
            mybVar = myb.f;
        }
        int i3 = mybVar.c;
        int i4 = mybVar.b;
        int i5 = mybVar.d;
        int i6 = mybVar.e;
        int i7 = mybVar.a;
        int r = jco.r(i7);
        if (r != 0 && r != 1 && (i4 < 0 || i5 < 0 || i6 > i3 || i5 >= i6)) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[5];
            int r2 = jco.r(mybVar.a);
            if (r2 == 0) {
                r2 = 1;
            }
            objArr[0] = Integer.valueOf(r2 - 1);
            objArr[1] = Integer.valueOf(i3);
            objArr[2] = Integer.valueOf(i4);
            objArr[3] = Integer.valueOf(i5);
            objArr[4] = Integer.valueOf(i6);
            throw new IllegalArgumentException(String.format(locale, "Illegal parameters for the slicing strategy %d. NumberOfSlices: %d, modDelta: %d, rangeBegin: %d, rangeEnd: %d", objArr));
        }
        int r3 = jco.r(i7);
        if (r3 == 0) {
            r3 = 1;
        }
        int i8 = r3 - 1;
        if (i8 == 1) {
            a2.m("_id_", ipy.DELTA_MOD_BETWEEN, String.valueOf(i4), String.valueOf(i3), String.valueOf(i5), String.valueOf(i6 - 1));
        } else if (i8 == 2) {
            ipwVar.f = 3;
            ipwVar.a(i3);
            ipwVar.c(i5, i6);
        }
        if (ipwVar.e == 31 && (i = ipwVar.f) != 0) {
            a2.e = new ipx(i, ipwVar.a, ipwVar.b, ipwVar.c, ipwVar.d);
            return a2.k();
        }
        StringBuilder sb = new StringBuilder();
        if (ipwVar.f == 0) {
            sb.append(" slicingType");
        }
        if ((ipwVar.e & 1) == 0) {
            sb.append(" modDelta");
        }
        if ((ipwVar.e & 2) == 0) {
            sb.append(" numberOfSlices");
        }
        if ((ipwVar.e & 4) == 0) {
            sb.append(" sliceRangeBegin");
        }
        if ((ipwVar.e & 8) == 0) {
            sb.append(" sliceRangeEnd");
        }
        if ((ipwVar.e & 16) == 0) {
            sb.append(" random");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
