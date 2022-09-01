package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* renamed from: kaj  reason: default package */
/* loaded from: classes.dex */
public final class kaj implements kax {
    private final opu a;

    public kaj(opu opuVar, byte[] bArr, byte[] bArr2) {
        this.a = opuVar;
    }

    @Override // defpackage.kax
    public final HttpURLConnection a(String str) {
        opu opuVar = this.a;
        URLConnection openConnection = ((CronetEngine) opuVar.a).openConnection(new URL(str));
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Cronet connection is not an HttpURLConnection");
        }
        return (HttpURLConnection) openConnection;
    }

    @Override // defpackage.kax
    public final void b() {
    }

    @Override // defpackage.kax
    public final void c() {
    }

    @Override // defpackage.kax
    public final void d(HttpURLConnection httpURLConnection, int i) {
        if (!(httpURLConnection instanceof oxm)) {
            TrafficStats.setThreadStatsTag(i);
        } else {
            oxm oxmVar = (oxm) httpURLConnection;
            throw null;
        }
    }

    @Override // defpackage.kax
    public final /* synthetic */ void e() {
    }
}
