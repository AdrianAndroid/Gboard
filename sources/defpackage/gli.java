package defpackage;

import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* compiled from: PG */
/* renamed from: gli  reason: default package */
/* loaded from: classes.dex */
public final class gli extends NetworkQualityRttListener {
    private final opu a;

    public gli(Executor executor, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(executor);
        this.a = opuVar;
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        opu opuVar = this.a;
        long time = new Date().getTime();
        nfh t = lzw.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        lzw lzwVar = (lzw) t.b;
        int i3 = lzwVar.a | 2;
        lzwVar.a = i3;
        lzwVar.c = i;
        int i4 = i3 | 1;
        lzwVar.a = i4;
        lzwVar.b = time;
        lzwVar.a = i4 | 4;
        lzwVar.d = i2;
        ((gmo) opuVar.a).a.j((lzw) t.cz());
    }
}
