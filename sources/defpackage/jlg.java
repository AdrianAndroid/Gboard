package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: jlg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jlg implements miy {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jlg(gwo gwoVar, long j, String str, int i) {
        this.d = i;
        this.c = gwoVar;
        this.a = j;
        this.b = str;
    }

    public /* synthetic */ jlg(jli jliVar, long j, jit jitVar, int i) {
        this.d = i;
        this.b = jliVar;
        this.a = j;
        this.c = jitVar;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        if (this.d == 0) {
            Object obj2 = this.b;
            long j = this.a;
            Object obj3 = this.c;
            jiu jiuVar = (jiu) obj;
            if (j > jiuVar.e) {
                nfh nfhVar = (nfh) jiuVar.N(5);
                nfhVar.cG(jiuVar);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jiu jiuVar2 = (jiu) nfhVar.b;
                jiuVar2.a |= 8;
                jiuVar2.e = j;
                return ((jli) obj2).b.g((jit) obj3, (jiu) nfhVar.cz());
            }
            return kcu.K(true);
        }
        Object obj4 = this.c;
        long j2 = this.a;
        Object obj5 = this.b;
        if (obj != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            gwo gwoVar = (gwo) obj4;
            gwoVar.a((String) obj5, obj);
            ids idsVar = gwoVar.f;
            if (idsVar != null) {
                gwoVar.b.g(idsVar, elapsedRealtime);
            }
        }
        return kcu.K(obj);
    }
}
