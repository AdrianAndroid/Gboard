package defpackage;

import com.google.android.libraries.micore.learning.training.util.StatusOr;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jos  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jos implements mlt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jos(jom jomVar, String str, String str2, int i) {
        this.d = i;
        this.a = jomVar;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ jos(jov jovVar, byte[] bArr, byte[] bArr2, int i) {
        this.d = i;
        this.a = jovVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.mlt, java.util.concurrent.Callable
    public final Object call() {
        StatusOr statusOr;
        if (this.d != 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            try {
                File a = ((jom) obj).a.a((String) obj2, (String) this.c);
                ((jom) obj).b.add(a);
                return StatusOr.a(a.getAbsolutePath());
            } catch (IOException e) {
                return StatusOr.b(jnr.b(5, e.getMessage()));
            }
        }
        Object obj3 = this.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        synchronized (((jov) obj3).q) {
            final jol jolVar = ((jov) obj3).i;
            final mfx mfxVar = ((jov) obj3).r;
            final long j = ((jov) obj3).m;
            final byte[] bArr = (byte[]) obj5;
            final byte[] bArr2 = (byte[]) obj4;
            statusOr = (StatusOr) jolVar.d.a(new mlt() { // from class: joj
                @Override // defpackage.mlt, java.util.concurrent.Callable
                public final Object call() {
                    jol jolVar2 = jol.this;
                    byte[] bArr3 = bArr2;
                    byte[] bArr4 = bArr;
                    long j2 = j;
                    mfx mfxVar2 = mfxVar;
                    try {
                        ndd nddVar = (ndd) nfm.z(ndd.d, bArr3, nfb.b());
                        mzg mzgVar = (mzg) nfm.z(mzg.b, bArr4, nfb.b());
                        mzf mzfVar = mzgVar.a;
                        if (mzfVar == null) {
                            mzfVar = mzf.b;
                        }
                        nfh nfhVar = (nfh) mzfVar.N(5);
                        nfhVar.cG(mzfVar);
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        ((mzf) nfhVar.b).a = j2;
                        mzf mzfVar2 = (mzf) nfhVar.cz();
                        nfh nfhVar2 = (nfh) mzgVar.N(5);
                        nfhVar2.cG(mzgVar);
                        if (nfhVar2.c) {
                            nfhVar2.cD();
                            nfhVar2.c = false;
                        }
                        mzfVar2.getClass();
                        ((mzg) nfhVar2.b).a = mzfVar2;
                        try {
                            jog a2 = jolVar2.a.a(nddVar, (mzg) nfhVar2.cz(), mfxVar2);
                            synchronized (jolVar2.b) {
                                jolVar2.c.add(a2);
                            }
                            return StatusOr.a(new jok(jolVar2, a2));
                        } catch (joh e2) {
                            return StatusOr.b(jnr.b(3, e2.getMessage()));
                        }
                    } catch (ngd e3) {
                        throw new IllegalArgumentException(e3);
                    }
                }
            });
        }
        return statusOr;
    }
}
