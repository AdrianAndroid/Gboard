package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: brb  reason: default package */
/* loaded from: classes.dex */
public final class brb implements idm {
    public boolean c;
    public final Context d;
    public final ino e;
    public boolean f;
    public boolean g;
    public long h;
    private final idi k;
    private boolean l;
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/latin/metrics/PeriodicPingMetricsProcessor");
    public static final long a = TimeUnit.HOURS.toMillis(24);
    static final TimeZone b = TimeZone.getDefault();
    public int i = 3;
    private Account[] m = null;
    private final idb n = new brc(this);

    public brb(Context context, ino inoVar, idi idiVar) {
        this.d = context;
        this.e = inoVar;
        this.k = idiVar;
    }

    public static void b(ieh iehVar) {
        iehVar.x(brb.class);
    }

    public final void a() {
        int days;
        nfh t = mcx.l.t();
        boolean aj = this.e.aj(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar = (mcx) t.b;
        boolean z = true;
        mcxVar.a |= 1;
        mcxVar.b = aj;
        boolean d = dcd.d(this.d);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar2 = (mcx) t.b;
        mcxVar2.a |= 2;
        mcxVar2.c = d;
        long o = this.e.o(R.string.f161170_resource_name_obfuscated_res_0x7f140695, -1L);
        if (o < 0) {
            this.e.t(R.string.f161170_resource_name_obfuscated_res_0x7f140695, this.h);
            days = 0;
        } else {
            days = (int) TimeUnit.MILLISECONDS.toDays(this.h - o);
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar3 = (mcx) t.b;
        mcxVar3.a |= 8;
        mcxVar3.e = days;
        long o2 = this.e.o(R.string.f161630_resource_name_obfuscated_res_0x7f1406c4, -1L);
        int days2 = o2 < 0 ? -1 : (int) TimeUnit.MILLISECONDS.toDays(this.h - o2);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar4 = (mcx) t.b;
        int i = mcxVar4.a | 4;
        mcxVar4.a = i;
        mcxVar4.d = days2;
        boolean z2 = this.f;
        mcxVar4.a = i | 16;
        mcxVar4.f = z2;
        long o3 = this.e.o(R.string.f161630_resource_name_obfuscated_res_0x7f1406c4, -1L);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar5 = (mcx) t.b;
        mcxVar5.a |= 32;
        mcxVar5.g = o3;
        long o4 = this.e.o(R.string.f161170_resource_name_obfuscated_res_0x7f140695, -1L);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar6 = (mcx) t.b;
        mcxVar6.a |= 64;
        mcxVar6.h = o4;
        long h = jam.h(this.d);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar7 = (mcx) t.b;
        mcxVar7.a |= 128;
        mcxVar7.i = h;
        long c = gva.c();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcx mcxVar8 = (mcx) t.b;
        mcxVar8.a |= 256;
        mcxVar8.j = c;
        if (((Boolean) bqw.a.c()).booleanValue()) {
            long epochMilli = Instant.ofEpochMilli(this.e.c("last_federated_task_completed_timestamp", -1L)).truncatedTo(ChronoUnit.MINUTES).toEpochMilli();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcx mcxVar9 = (mcx) t.b;
            mcxVar9.a |= 512;
            mcxVar9.k = epochMilli;
        }
        nfh t2 = mbh.aT.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar = (mbh) t2.b;
        mcx mcxVar10 = (mcx) t.cz();
        mcxVar10.getClass();
        mbhVar.Q = mcxVar10;
        mbhVar.b |= 268435456;
        mde mdeVar = ieo.a().a;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar2 = (mbh) t2.b;
        mdeVar.getClass();
        mbhVar2.A = mdeVar;
        mbhVar2.a |= 536870912;
        hqt b2 = hqp.b();
        if (b2 != null) {
            nfh t3 = mbw.k.t();
            String str = b2.i().n;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbw mbwVar = (mbw) t3.b;
            str.getClass();
            mbwVar.a |= 1;
            mbwVar.b = str;
            String p = b2.p();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbw mbwVar2 = (mbw) t3.b;
            mbwVar2.a |= 2;
            mbwVar2.c = p;
            int e = dqc.e(this.d, b2);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbw mbwVar3 = (mbw) t3.b;
            mbwVar3.f = e - 1;
            mbwVar3.a |= 32;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbh mbhVar3 = (mbh) t2.b;
            mbw mbwVar4 = (mbw) t3.cz();
            mbwVar4.getClass();
            mbhVar3.R = mbwVar4;
            mbhVar3.b |= 536870912;
        }
        if (this.e.aj(R.string.f162080_resource_name_obfuscated_res_0x7f1406f1)) {
            nfh t4 = mck.h.t();
            boolean aj2 = this.e.aj(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8);
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar = (mck) t4.b;
            mckVar.a |= 1;
            mckVar.b = aj2;
            int j2 = lxj.j(this.e.C(R.string.f162270_resource_name_obfuscated_res_0x7f140704));
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar2 = (mck) t4.b;
            int i2 = j2 - 1;
            if (j2 == 0) {
                throw null;
            }
            mckVar2.c = i2;
            mckVar2.a |= 2;
            if (this.e.C(R.string.f162170_resource_name_obfuscated_res_0x7f1406fa) <= 0) {
                z = false;
            }
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar3 = (mck) t4.b;
            mckVar3.a |= 4;
            mckVar3.d = z;
            boolean aj3 = this.e.aj(R.string.f162140_resource_name_obfuscated_res_0x7f1406f7);
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar4 = (mck) t4.b;
            mckVar4.a |= 8;
            mckVar4.e = aj3;
            int j3 = lxj.j(this.e.C(R.string.f162340_resource_name_obfuscated_res_0x7f14070b));
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar5 = (mck) t4.b;
            int i3 = j3 - 1;
            if (j3 == 0) {
                throw null;
            }
            mckVar5.f = i3;
            mckVar5.a |= 16;
            boolean aj4 = this.e.aj(R.string.f162130_resource_name_obfuscated_res_0x7f1406f6);
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mck mckVar6 = (mck) t4.b;
            mckVar6.a |= 32;
            mckVar6.g = aj4;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbh mbhVar4 = (mbh) t2.b;
            mck mckVar7 = (mck) t4.cz();
            mckVar7.getClass();
            mbhVar4.ae = mckVar7;
            mbhVar4.c |= 65536;
        }
        boolean z3 = jam.z(this.d);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar5 = (mbh) t2.b;
        int i4 = mbhVar5.a | 2097152;
        mbhVar5.a = i4;
        mbhVar5.t = z3;
        boolean z4 = this.l;
        mbhVar5.a = i4 | 1048576;
        mbhVar5.s = z4;
        int d2 = dqc.d(this.d);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar6 = (mbh) t2.b;
        int i5 = d2 - 1;
        if (d2 == 0) {
            throw null;
        }
        mbhVar6.aj = i5;
        mbhVar6.c |= 4194304;
        mde mdeVar2 = ieo.a().b;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar7 = (mbh) t2.b;
        mdeVar2.getClass();
        mbhVar7.A = mdeVar2;
        mbhVar7.a |= 536870912;
        idi idiVar = this.k;
        mbh mbhVar8 = (mbh) t2.cz();
        idb idbVar = this.n;
        idiVar.f(mbhVar8, 111, idbVar.c, idbVar.d);
        this.g = this.f;
        this.f = false;
        this.e.t(R.string.f161610_resource_name_obfuscated_res_0x7f1406c2, this.h);
    }

    @Override // defpackage.idj
    public final void e() {
        try {
            if (this.m == null) {
                this.m = byq.a(this.d);
            }
            Account[] accountArr = this.m;
            if (accountArr == null) {
                return;
            }
            for (Account account : accountArr) {
                if (!TextUtils.isEmpty(account.name) && account.name.endsWith("@google.com")) {
                    this.l = true;
                    return;
                }
            }
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) j.c()).i(e)).k("com/google/android/apps/inputmethod/latin/metrics/PeriodicPingMetricsProcessor", "onAttached", (char) 172, "PeriodicPingMetricsProcessor.java")).t("Failed to check accounts.");
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j2, long j3, Object... objArr) {
        this.h = j2;
        this.n.b(idoVar, iduVar, j2, j3, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return brc.a;
    }
}
