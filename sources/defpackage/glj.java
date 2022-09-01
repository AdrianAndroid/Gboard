package defpackage;

import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* compiled from: PG */
/* renamed from: glj  reason: default package */
/* loaded from: classes.dex */
public final class glj extends NetworkQualityThroughputListener {
    private final opu a;

    public glj(Executor executor, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(executor);
        this.a = opuVar;
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i, long j, int i2) {
        opu opuVar = this.a;
        long time = new Date().getTime();
        nfh t = lzx.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        lzx lzxVar = (lzx) t.b;
        int i3 = lzxVar.a | 2;
        lzxVar.a = i3;
        lzxVar.c = i;
        int i4 = i3 | 1;
        lzxVar.a = i4;
        lzxVar.b = time;
        lzxVar.a = i4 | 4;
        lzxVar.d = i2;
        ((gmo) opuVar.a).b.j((lzx) t.cz());
    }
}
