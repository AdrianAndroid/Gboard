package defpackage;

import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* renamed from: kay  reason: default package */
/* loaded from: classes.dex */
public final class kay implements kax {
    private final oul a;

    public kay(oqd oqdVar) {
        this.a = new oul(oqdVar);
    }

    @Override // defpackage.kax
    public final HttpURLConnection a(String str) {
        return this.a.d(new URL(str));
    }

    @Override // defpackage.kax
    public final /* synthetic */ void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // defpackage.kax
    public final /* synthetic */ void c() {
        TrafficStats.clearThreadStatsUid();
    }

    @Override // defpackage.kax
    public final /* synthetic */ void d(HttpURLConnection httpURLConnection, int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Override // defpackage.kax
    public final /* synthetic */ void e() {
    }
}
