package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fsr  reason: default package */
/* loaded from: classes.dex */
public final class fsr implements fsk {
    public final fsu a;
    public volatile byte[] b;
    public volatile fsv c;
    private final long d;
    private final fth e;

    public fsr(fsu fsuVar, fsv fsvVar, long j, fth fthVar) {
        this.a = fsuVar;
        this.c = fsvVar;
        this.d = j;
        this.e = fthVar;
    }

    public fsr(fsu fsuVar, String str, fth fthVar) {
        this.a = fsuVar;
        this.e = fthVar;
        this.b = fyb.h(str);
        this.d = 0L;
    }

    @Override // defpackage.fsk
    public final String a(Map map) {
        byte[] i;
        fth a = this.e.a();
        a.c(14, fti.COARSE);
        if (this.b != null) {
            i = this.b;
        } else {
            ftf ftfVar = new ftf();
            this.a.e(new epv(this, map, ftfVar, 10));
            try {
                long j = this.d;
                if (!ftfVar.c) {
                    ftfVar.c = true;
                    i = (byte[]) ftfVar.a.poll(j, TimeUnit.MILLISECONDS);
                    if (i == null) {
                        i = fyb.h("Snapshot timeout: " + this.d + " ms");
                    }
                } else {
                    throw new RuntimeException("BlockingChannel can be read only once.");
                }
            } catch (InterruptedException e) {
                i = fyb.i("Results transfer failed: ".concat(e.toString()), e);
            }
        }
        a.c(15, fti.COARSE);
        if (npx.c()) {
            nfh t = ldq.f.t();
            nem u = nem.u(i);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ldq ldqVar = (ldq) t.b;
            ldqVar.a |= 2;
            ldqVar.c = u;
            ldp b = a.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ldq ldqVar2 = (ldq) t.b;
            b.getClass();
            ldqVar2.d = b;
            ldqVar2.a |= 4;
            ldn ldnVar = ldn.c;
            nfh t2 = ldn.c.t();
            if (ldnVar.b != nqg.c()) {
                boolean c = nqg.c();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ldn ldnVar2 = (ldn) t2.b;
                ldnVar2.a |= 1;
                ldnVar2.b = c;
            }
            ldn ldnVar3 = (ldn) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ldq ldqVar3 = (ldq) t.b;
            ldnVar3.getClass();
            ldqVar3.e = ldnVar3;
            ldqVar3.a |= 8;
            ldq ldqVar4 = (ldq) t.cz();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8];
                new Random().nextBytes(bArr);
                bArr[0] = 10;
                bArr[1] = 6;
                int i2 = 3;
                for (int i3 = 0; i3 < 8; i3++) {
                    i2 ^= bArr[i3];
                }
                bArr[2] = (byte) (bArr[2] ^ ((byte) i2));
                byteArrayOutputStream.write(bArr);
                nfh nfhVar = (nfh) ldqVar4.N(5);
                nfhVar.cG(ldqVar4);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                ldq ldqVar5 = (ldq) nfhVar.b;
                ldqVar5.a &= -2;
                ldqVar5.b = ldq.f.b;
                ((ldq) nfhVar.cz()).p(byteArrayOutputStream);
                i = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return Base64.encodeToString(i, 11);
    }

    @Override // defpackage.fsk
    public final void b() {
        this.a.e(new fqa(this, 2));
    }

    public fsr(fsu fsuVar, String str, fth fthVar, Throwable th) {
        this.a = fsuVar;
        this.e = fthVar;
        this.b = fyb.i(str, th);
        this.d = 0L;
    }
}
