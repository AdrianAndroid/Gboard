package defpackage;

import android.net.TrafficStats;
import java.util.List;

/* compiled from: PG */
/* renamed from: ihq  reason: default package */
/* loaded from: classes.dex */
public final class ihq implements iid {
    public final iid a;
    private final int b;

    public ihq(iid iidVar, int i) {
        this.a = iidVar;
        this.b = i;
    }

    public static ihq a(int i) {
        return b(iif.a(), i);
    }

    public static ihq b(iif iifVar, int i) {
        return new ihq(new ihu(((hiz) iio.a.a()).u(new hdp(iifVar, 19), mjl.a), jdg.n(new ihp(iifVar, 0))), i);
    }

    @Override // defpackage.iid
    public final mko c(iih iihVar) {
        try {
            TrafficStats.setThreadStatsTag(this.b);
            return this.a.c(iihVar);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // defpackage.iid
    public final nuf d(String str, List list) {
        return this.a.d(str, list);
    }
}
