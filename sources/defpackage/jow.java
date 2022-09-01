package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: jow  reason: default package */
/* loaded from: classes.dex */
public final class jow implements joz {
    private final Context a;
    private final fwe b;
    private final fwo c;
    private final gaa d;
    private final jnw e;
    private final jnt f;

    public jow(Context context, fwe fweVar, fwo fwoVar, gaa gaaVar, jnw jnwVar, jnt jntVar) {
        this.a = context;
        this.b = fweVar;
        this.c = fwoVar;
        this.d = gaaVar;
        this.e = jnwVar;
        this.f = jntVar;
    }

    @Override // defpackage.joz
    public final void a(nfh nfhVar, boolean z, mfx mfxVar) {
        int c = mhb.c(((mgm) nfhVar.b).b);
        if (c == 0) {
            c = 1;
        }
        int i = c - 1;
        if (i != 0 && i != 7 && i != 11) {
            nfh t = mgj.e.t();
            lcv a = this.f.a();
            long j = a.b * 1000;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mgj mgjVar = (mgj) t.b;
            int i2 = mgjVar.a | 2;
            mgjVar.a = i2;
            mgjVar.c = j;
            int i3 = a.c;
            int i4 = i2 | 1;
            mgjVar.a = i4;
            mgjVar.b = i3 * 1000;
            int i5 = a.a;
            mgjVar.a = i4 | 8;
            mgjVar.d = i5 * 1000;
            mgj mgjVar2 = (mgj) t.cz();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mgm mgmVar = (mgm) nfhVar.b;
            mgjVar2.getClass();
            mgmVar.g = mgjVar2;
            mgmVar.a |= 512;
            int c2 = mhb.c(mgmVar.b);
            if (c2 == 0) {
                c2 = 1;
            }
            boolean aI = this.b.aI();
            boolean aG = this.b.aG();
            if (!aI) {
                if (aG) {
                    aG = true;
                }
            }
            nfh nfhVar2 = (nfh) mfxVar.N(5);
            nfhVar2.cG(mfxVar);
            mgm mgmVar2 = mfxVar.c;
            if (mgmVar2 == null) {
                mgmVar2 = mgm.l;
            }
            nfh nfhVar3 = (nfh) mgmVar2.N(5);
            nfhVar3.cG(mgmVar2);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            mgm mgmVar3 = (mgm) nfhVar3.b;
            mgmVar3.b = c2 - 1;
            mgmVar3.a |= 1;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mfx mfxVar2 = (mfx) nfhVar2.b;
            mgm mgmVar4 = (mgm) nfhVar3.cz();
            mgmVar4.getClass();
            mfxVar2.c = mgmVar4;
            mfxVar2.a |= 4;
            mfx mfxVar3 = (mfx) nfhVar2.cz();
            if (aI) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                long j2 = memoryInfo.totalMem;
                long j3 = memoryInfo.availMem;
                long j4 = memoryInfo.threshold;
                if (c2 == 2 || c2 == 39) {
                    this.c.i(9, mfxVar3, memoryInfo.totalMem);
                }
                this.c.i(10, mfxVar3, memoryInfo.availMem);
                this.c.i(11, mfxVar3, memoryInfo.threshold);
                this.c.i(12, mfxVar3, memoryInfo.availMem - memoryInfo.threshold);
                this.c.i(13, mfxVar3, true != memoryInfo.lowMemory ? 0L : 1L);
            }
            if (aG) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                int i6 = runningAppProcessInfo.importance;
                int i7 = runningAppProcessInfo.lru;
                long j5 = mgjVar2.c;
                long j6 = mgjVar2.b;
                long j7 = mgjVar2.d;
                this.c.i(14, mfxVar3, runningAppProcessInfo.importance);
                this.c.i(15, mfxVar3, runningAppProcessInfo.lru);
                this.c.i(16, mfxVar3, mgjVar2.c);
                this.c.i(17, mfxVar3, mgjVar2.b);
            }
        }
        int c3 = mhb.c(((mgm) nfhVar.b).b);
        if (c3 == 0) {
            c3 = 1;
        }
        int i8 = c3 - 1;
        if (i8 == 0 || i8 == 7 || i8 == 11) {
            return;
        }
        gab a2 = this.d.a();
        nfh t2 = mfw.f.t();
        int d = mhb.d(a2.a);
        if (d != 0) {
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mfw mfwVar = (mfw) t2.b;
            mfwVar.d = d - 1;
            mfwVar.a |= 4;
        }
        int e = mhb.e(a2.b);
        if (e != 0) {
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mfw mfwVar2 = (mfw) t2.b;
            mfwVar2.e = e - 1;
            mfwVar2.a |= 8;
        }
        float f = a2.c;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mfw mfwVar3 = (mfw) t2.b;
        int i9 = 1 | mfwVar3.a;
        mfwVar3.a = i9;
        mfwVar3.b = f;
        long j8 = a2.d;
        mfwVar3.a = 2 | i9;
        mfwVar3.c = j8;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mgm mgmVar5 = (mgm) nfhVar.b;
        mfw mfwVar4 = (mfw) t2.cz();
        mfwVar4.getClass();
        mgmVar5.h = mfwVar4;
        mgmVar5.a |= 2048;
        if (!z) {
            return;
        }
        int a3 = this.e.a();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mgm mgmVar6 = (mgm) nfhVar.b;
        mgmVar6.j = a3 - 1;
        mgmVar6.a |= 65536;
    }
}
