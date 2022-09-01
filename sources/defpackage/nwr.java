package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: nwr  reason: default package */
/* loaded from: classes2.dex */
public final class nwr {
    private static final int a;
    private static final Queue b;

    static {
        int max = Math.max(16384, 8192);
        a = max;
        b = new LinkedBlockingQueue(131072 / max);
    }

    public static void a(byte[] bArr) {
        if (bArr.length == a) {
            b.offer(bArr);
        }
    }

    public static byte[] b() {
        return c(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) b.poll()) == null) ? new byte[i] : bArr;
    }
}
