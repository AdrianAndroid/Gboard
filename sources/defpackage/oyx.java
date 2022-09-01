package defpackage;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: oyx  reason: default package */
/* loaded from: classes2.dex */
public final class oyx {
    public final oyo a;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public oys f;

    public oyx() {
        oxz oxzVar = new oxz();
        this.a = oxzVar;
        try {
            this.f = new oyu();
        } catch (NoSuchAlgorithmException unused) {
            this.f = new oyq();
        }
    }

    public final long a() {
        return (b() + 3) & (-4);
    }

    public final long b() {
        return ols.q(this.e) + 1 + this.d + 4;
    }

    public final void c(long j, long j2) {
        long j3 = this.b + ((3 + j) & (-4));
        this.b = j3;
        long j4 = this.c + j2;
        this.c = j4;
        this.d += ols.q(j) + ols.q(j2);
        this.e++;
        if (j3 < 0 || j4 < 0 || a() > 17179869184L || j3 + 12 + a() + 12 < 0) {
            throw this.a;
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        oys oysVar = this.f;
        byte[] array = allocate.array();
        oysVar.a(array, 0, array.length);
    }
}
