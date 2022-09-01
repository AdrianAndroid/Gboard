package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* renamed from: lbn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lbn implements Runnable {
    public final /* synthetic */ lbs a;
    public final /* synthetic */ long b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    private final /* synthetic */ int f;

    public /* synthetic */ lbn(lbs lbsVar, long j, List list, List list2, List list3, int i) {
        this.f = i;
        this.a = lbsVar;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    public /* synthetic */ lbn(lbs lbsVar, List list, List list2, List list3, long j, int i) {
        this.f = i;
        this.a = lbsVar;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f != 0) {
            lbs lbsVar = this.a;
            List list = this.c;
            List list2 = this.d;
            List list3 = this.e;
            long j = this.b;
            if (lbsVar.e.get()) {
                lbsVar.l(-6);
                return;
            } else if (lbsVar.d.a() != null) {
                lbsVar.j(list, list2, list3, j, false);
                return;
            } else {
                lbsVar.k(list2, list3, j);
                return;
            }
        }
        lbs lbsVar2 = this.a;
        long j2 = this.b;
        List list4 = this.c;
        List list5 = this.d;
        List list6 = this.e;
        long j3 = j2 / 3;
        long j4 = 0;
        int i = 0;
        while (i < 3) {
            long min = Math.min(j2, j4 + j3);
            int i2 = i;
            lbsVar2.m(2, 0, Long.valueOf(min), Long.valueOf(j2), null, null, null);
            SystemClock.sleep(lbs.a);
            int i3 = lbsVar2.h().b;
            if (i3 == 9 || i3 == 7 || i3 == 6) {
                return;
            }
            i = i2 + 1;
            j4 = min;
        }
        lbsVar2.c.execute(new lbn(lbsVar2, list4, list5, list6, j2, 1));
    }
}
