package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jmy  reason: default package */
/* loaded from: classes.dex */
public final class jmy implements kpj {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ jmz b;
    public final opu c;
    private final String d;

    public jmy(jmz jmzVar, String str, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = jmzVar;
        this.d = str;
        this.c = opuVar;
    }

    @Override // defpackage.kpj
    public final void a(int i) {
        this.a.getAndAdd(i);
        this.a.get();
        int i2 = jmk.a;
    }

    @Override // defpackage.kpj
    public final void b() {
        synchronized (jmz.class) {
            if (this.b.d.containsKey(this.d)) {
                this.b.b.execute(new ihi(this, 19));
            }
        }
    }
}
