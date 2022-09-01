package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: owr  reason: default package */
/* loaded from: classes2.dex */
final class owr implements oxb {
    final /* synthetic */ boolean a;
    final /* synthetic */ ows b;
    private final /* synthetic */ int c;

    public owr(ows owsVar, boolean z, int i) {
        this.c = i;
        this.b = owsVar;
        this.a = z;
    }

    @Override // defpackage.oxb
    public final void a() {
        ows owsVar;
        if (this.c != 0) {
            this.b.c.flip();
            ows owsVar2 = this.b;
            long j = owsVar2.d;
            if (j == -1 || j - owsVar2.e >= owsVar2.c.remaining()) {
                ows owsVar3 = this.b;
                ByteBuffer byteBuffer = owsVar3.c;
                int i = 0;
                while (byteBuffer.hasRemaining()) {
                    i += owsVar3.g.write(byteBuffer);
                }
                owsVar3.h.flush();
                owsVar3.e += i;
                ows owsVar4 = this.b;
                long j2 = owsVar4.e;
                long j3 = owsVar4.d;
                if (j2 >= j3) {
                    if (j3 == -1) {
                        if (this.a) {
                            j3 = -1;
                        }
                    }
                    if (j3 == -1) {
                        owsVar4.e();
                        return;
                    } else if (j3 == j2) {
                        owsVar4.e();
                        return;
                    } else {
                        owsVar4.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e), Long.valueOf(this.b.d))));
                        return;
                    }
                }
                owsVar4.c.clear();
                this.b.a.set(0);
                this.b.a(new owq(this, 1, (byte[]) null));
                return;
            }
            this.b.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e + owsVar.c.remaining()), Long.valueOf(this.b.d))));
            return;
        }
        ows owsVar5 = this.b;
        owsVar5.d = owsVar5.b.getLength();
        ows owsVar6 = this.b;
        long j4 = owsVar6.d;
        if (j4 == 0) {
            owsVar6.e();
            return;
        }
        if (j4 <= 0 || j4 >= 8192) {
            owsVar6.c = ByteBuffer.allocateDirect(8192);
        } else {
            owsVar6.c = ByteBuffer.allocateDirect(((int) j4) + 1);
        }
        ows owsVar7 = this.b;
        long j5 = owsVar7.d;
        if (j5 > 0) {
            owsVar7.f.setFixedLengthStreamingMode(j5);
        } else {
            owsVar7.f.setChunkedStreamingMode(8192);
        }
        if (this.a) {
            this.b.b();
            return;
        }
        this.b.a.set(1);
        ows owsVar8 = this.b;
        owsVar8.b.rewind(owsVar8);
    }
}
