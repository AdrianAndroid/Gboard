package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gbj  reason: default package */
/* loaded from: classes.dex */
public final class gbj implements Closeable, fwo {
    private static final mgn c;
    final flo a;
    public final jnp b;
    private final fwe d;
    private final fma e;
    private final String f;
    private final mfx g;
    private final byte[] h;
    private final flt i;
    private final Set j;
    private final gkd k;
    private final opu l;

    static {
        nfh t = mgn.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mgn mgnVar = (mgn) t.b;
        mgnVar.a |= 1;
        mgnVar.b = 66005;
        c = (mgn) t.cz();
    }

    private gbj(Context context, fwe fweVar, jnp jnpVar, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        HashSet hashSet;
        this.d = fweVar;
        this.b = jnpVar;
        this.l = opuVar;
        String packageName = context.getPackageName();
        this.f = packageName;
        if (fweVar.aW()) {
            flk a = flo.a(context, "BRELLA");
            a.b(fmd.g);
            this.a = a.a();
        } else if (fweVar.aS()) {
            this.a = flo.d(context, "BRELLA");
        } else {
            this.a = new flo(context, "BRELLA");
        }
        this.k = gkd.a(context, new gjb(1513929663, R.raw.f147410_resource_name_obfuscated_res_0x7f13005b));
        if (fweVar.aa()) {
            fma fmaVar = new fma(this.a, "BRELLA_COUNTERS", fweVar.f());
            this.e = fmaVar;
            fmaVar.d();
            nfh t = mfy.c.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mfy.b((mfy) t.b);
            if (packageName != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mfy mfyVar = (mfy) t.b;
                mfyVar.a |= 1;
                mfyVar.b = packageName;
            }
            nfh t2 = mfx.h.t();
            mgn mgnVar = c;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mfx mfxVar = (mfx) t2.b;
            mgnVar.getClass();
            mfxVar.e = mgnVar;
            mfxVar.a |= 1024;
            mfy mfyVar2 = (mfy) t.cz();
            mfyVar2.getClass();
            mfxVar.b = mfyVar2;
            mfxVar.a |= 1;
            mfx mfxVar2 = (mfx) t2.cz();
            this.g = mfxVar2;
            this.h = mfxVar2.q();
            this.i = new flt(fweVar.e());
            hashSet = new HashSet(fweVar.X());
        } else {
            hashSet = null;
            this.e = null;
            this.g = null;
            this.h = null;
            this.i = null;
        }
        this.j = hashSet;
    }

    public static gbj k(Context context, fwe fweVar, jnp jnpVar) {
        return new gbj(context, fweVar, jnpVar, fweVar.aA() ? new opu(context) : null, null, null, null, null, null);
    }

    private final void m(String str, mfx mfxVar, long j) {
        l(str, mfxVar == null ? null : mfxVar.q(), j);
    }

    private final void n(int i, String str) {
        nfh t = mga.c.t();
        long j = i;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mga mgaVar = (mga) t.b;
        mgaVar.a |= 1;
        mgaVar.b = j;
        nfh t2 = mfx.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mfx mfxVar = (mfx) t2.b;
        mga mgaVar2 = (mga) t.cz();
        mgaVar2.getClass();
        mfxVar.d = mgaVar2;
        mfxVar.a |= 64;
        if (str == null) {
            str = this.f;
        }
        o(t2, str);
    }

    private final void o(nfh nfhVar, String str) {
        mgn mgnVar = c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mfx mfxVar = (mfx) nfhVar.b;
        mfx mfxVar2 = mfx.h;
        mgnVar.getClass();
        mfxVar.e = mgnVar;
        mfxVar.a |= 1024;
        mfy mfyVar = ((mfx) nfhVar.b).b;
        if (mfyVar == null) {
            mfyVar = mfy.c;
        }
        nfh nfhVar2 = (nfh) mfyVar.N(5);
        nfhVar2.cG(mfyVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mfy.b((mfy) nfhVar2.b);
        if (str != null) {
            mfy mfyVar2 = ((mfx) nfhVar.b).b;
            if (mfyVar2 == null) {
                mfyVar2 = mfy.c;
            }
            if (mfyVar2.b.isEmpty()) {
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mfy mfyVar3 = (mfy) nfhVar2.b;
                mfyVar3.a |= 1;
                mfyVar3.b = str;
            }
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mfx mfxVar3 = (mfx) nfhVar.b;
        mfy mfyVar4 = (mfy) nfhVar2.cz();
        mfyVar4.getClass();
        mfxVar3.b = mfyVar4;
        mfxVar3.a |= 1;
        mfx mfxVar4 = (mfx) nfhVar.cz();
        flm c2 = this.a.c(mfxVar4);
        c2.j = this.k;
        c2.a();
        opu opuVar = this.l;
        if (opuVar != null) {
            gbk.a((Context) opuVar.a, mfxVar4);
        }
    }

    @Override // defpackage.fwo
    public final mfx a(mfx mfxVar) {
        mfx mfxVar2 = this.g;
        if (mfxVar2 == null) {
            return mfxVar;
        }
        nfh nfhVar = (nfh) mfxVar2.N(5);
        nfhVar.cG(mfxVar2);
        nfhVar.cG(mfxVar);
        return (mfx) nfhVar.cz();
    }

    @Override // defpackage.fwo
    public final void b() {
        fma fmaVar = this.e;
        if (fmaVar != null) {
            fmaVar.g();
        }
    }

    @Override // defpackage.fwo
    public final void c(mzd mzdVar, mfx mfxVar, long j) {
        m(mzdVar.name(), mfxVar, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // defpackage.fwo
    public final void d(jnx jnxVar) {
        f(jnxVar, null);
    }

    @Override // defpackage.fwo
    public final void e(job jobVar) {
        g(jobVar, null);
    }

    @Override // defpackage.fwo
    public final void f(jnx jnxVar, String str) {
        if (!this.d.aD() || !this.d.aB()) {
            return;
        }
        n(jnxVar.a(), str);
    }

    @Override // defpackage.fwo
    public final void g(job jobVar, String str) {
        if (!this.d.aD()) {
            return;
        }
        n(jobVar.a(), str);
    }

    @Override // defpackage.fwo
    public final void h(mfx mfxVar) {
        if (mfxVar == null) {
            return;
        }
        nfh nfhVar = (nfh) mfxVar.N(5);
        nfhVar.cG(mfxVar);
        o(nfhVar, this.f);
    }

    @Override // defpackage.fwo
    public final void i(int i, mfx mfxVar, long j) {
        String str;
        switch (i) {
            case 1:
                str = "EXAMPLE_STORE_ITERATOR_NEXT_LATENCY";
                break;
            case 2:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT";
                break;
            case 3:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE";
                break;
            case 4:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY";
                break;
            case 5:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY";
                break;
            case 6:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY";
                break;
            case 7:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY";
                break;
            case 8:
                str = "EXAMPLE_STORE_ERROR_COUNT";
                break;
            case 9:
                str = "TRAINING_SYSTEM_TOTAL_MEM";
                break;
            case 10:
                str = "TRAINING_SYSTEM_AVAILABLE_MEM";
                break;
            case 11:
                str = "TRAINING_SYSTEM_LOW_MEM_THRESHOLD";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                str = "TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                str = "TRAINING_SYSTEM_LOW_MEM_STATE";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                str = "TRAINING_PROCESS_MEM_IMPORTANCE_STATE";
                break;
            case 15:
                str = "TRAINING_PROCESS_MEM_LRU_STATE";
                break;
            case 16:
                str = "TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP";
                break;
            default:
                str = "TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS";
                break;
        }
        m(str, mfxVar, j);
    }

    @Override // defpackage.fwo
    public final gbi j(int i, mfx mfxVar) {
        return new gbi(this, i != 1 ? i != 2 ? i != 3 ? "EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY" : "EXAMPLE_STORE_START_QUERY_LATENCY" : "TRAINING_SAVE_CHECKPOINT_LATENCY" : "TRAINING_OVERALL_LATENCY", mfxVar, this.b.b());
    }

    public final void l(String str, byte[] bArr, long j) {
        fma fmaVar = this.e;
        if (fmaVar != null) {
            if (bArr == null) {
                bArr = this.h;
            }
            fmaVar.f(str, this.j.contains(str) ? fma.o : this.i).b(j, new flv(bArr));
        }
    }
}
