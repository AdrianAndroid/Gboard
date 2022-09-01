package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bnw  reason: default package */
/* loaded from: classes.dex */
public final class bnw implements hho, inm {
    static final hhl a = hhq.h("country_cutout_switches_fl", "US,USA,840,CA,CAN,124,BR,BRA,076,ID,IDN,360,AU,AUS,036,MX,MEX,484,NG,NGA,566,AR,ARG,032,ES,ESP,724,CO,COL,170,PE,PER,604,CL,CHL,152,GT,GTM,320,VE,VEN,862,EC,ECU,218");
    static final hhl b = hhq.h("country_cutout_switches_dp", "AT,BE,BG,CY,CZ,DE,DK,EE,ES,FI,FR,GR,HR,HU,IE,IT,LT,LU,LV,MT,NL,PL,PT,RO,SE,SI,SK,GB");
    static final hhl c = hhq.h("country_cutout_switches_ac", "US,USA,840");
    static final hhl d = hhq.a("fl_requires_setting_for_user_metrics", false);
    public final Context e;
    public final ino f;
    private final ieh i;
    public final iro g = new bnv(this);
    private final boolean h = true;
    private lmz j = h();
    private lmz k = g();
    private lmz l = e();
    private boolean m = ((Boolean) itm.e.c()).booleanValue();

    public bnw(Context context) {
        ino M = ino.M(context);
        ieh j = ieh.j();
        this.e = context;
        this.f = M;
        this.i = j;
    }

    private static lmz e() {
        return f(c);
    }

    private static lmz f(hhl hhlVar) {
        return lmz.o(lfy.c(',').h().b().i((String) hhlVar.c()));
    }

    private static lmz g() {
        return f(b);
    }

    private static lmz h() {
        return f(a);
    }

    private final boolean i(String str) {
        return this.l.contains(str.toUpperCase(Locale.US));
    }

    private final boolean j(String str) {
        return this.k.contains(str.toUpperCase(Locale.US));
    }

    private final boolean k(String str) {
        return this.j.contains(str.toUpperCase(Locale.US));
    }

    public final void c() {
        irp b2 = irp.b();
        String str = null;
        String str2 = b2 == null ? null : b2.a;
        if (b2 != null) {
            str = b2.b;
        }
        d(str2, str);
    }

    public final void d(String str, String str2) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        int i;
        Boolean bool6 = null;
        if (!TextUtils.isEmpty(str)) {
            bool2 = Boolean.valueOf(k(str));
            bool3 = Boolean.valueOf(j(str));
            bool = Boolean.valueOf(i(str));
        } else {
            bool = null;
            bool2 = null;
            bool3 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            bool6 = Boolean.valueOf(k(str2));
            bool5 = Boolean.valueOf(j(str2));
            bool4 = Boolean.valueOf(i(str2));
        } else {
            bool4 = null;
            bool5 = null;
        }
        boolean z = this.h && jam.b;
        boolean z2 = ((Boolean) d.c()).booleanValue() && !this.f.aj(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
        boolean z3 = (!z2) & (z || this.m || (bool2 != null && bool2.booleanValue() && bool6 != null && bool6.booleanValue()));
        boolean z4 = z || (bool3 != null && bool3.booleanValue()) || (bool5 != null && bool5.booleanValue());
        if (exb.b(z3, z4, z || this.m || (bool != null && bool.booleanValue() && bool4 != null && bool4.booleanValue()))) {
            boolean z5 = this.m;
            int i2 = 3;
            if (z2) {
                i = 7;
            } else if (z5) {
                i = 8;
            } else if (bool2 == null && bool6 == null) {
                i = 6;
            } else if (bool2 == null) {
                i = 4;
            } else if (bool6 == null) {
                i = 5;
            } else if (!bool2.booleanValue() && !bool6.booleanValue()) {
                i = 3;
            } else if (!bool2.booleanValue()) {
                i = 1;
            } else {
                i = !bool6.booleanValue() ? 2 : 0;
            }
            this.i.e(dda.FEDERATED_LEARNING_STATUS, Integer.valueOf(i), Boolean.valueOf(z3));
            if (bool3 != null && !bool3.booleanValue() && bool5 == null) {
                i2 = 1;
            } else if (bool3 == null && bool5 != null && !bool5.booleanValue()) {
                i2 = 2;
            } else if (bool3 == null || bool3.booleanValue() || bool5 == null || bool5.booleanValue()) {
                i2 = (bool3 == null && bool5 == null) ? 6 : 0;
            }
            this.i.e(dda.DIFFERENTIAL_PRIVACY_STATUS, Integer.valueOf(i2), Boolean.valueOf(z4));
        }
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        boolean contains = set.contains(d) | set.contains(dca.a(this.e));
        boolean z = true;
        if (set.contains(a)) {
            this.j = h();
            contains = true;
        }
        if (set.contains(itm.e)) {
            this.m = ((Boolean) itm.e.c()).booleanValue();
            contains = true;
        }
        if (set.contains(b)) {
            this.k = g();
        } else {
            z = contains;
        }
        if (set.contains(c)) {
            this.l = e();
        } else if (!z) {
            return;
        }
        c();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        c();
    }
}
