package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jmc  reason: default package */
/* loaded from: classes.dex */
public final class jmc implements npe {
    private final oiy a;
    private final oiy b;
    private final /* synthetic */ int c;
    private final Object d;

    public jmc(jma jmaVar, oiy oiyVar, oiy oiyVar2, int i) {
        this.c = i;
        this.d = jmaVar;
        this.a = oiyVar;
        this.b = oiyVar2;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i) {
        this.c = i;
        this.d = oiyVar;
        this.b = oiyVar2;
        this.a = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, byte[] bArr) {
        this.c = i;
        this.d = oiyVar;
        this.a = oiyVar2;
        this.b = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, char[] cArr) {
        this.c = i;
        this.d = oiyVar;
        this.a = oiyVar2;
        this.b = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, float[] fArr) {
        this.c = i;
        this.d = oiyVar;
        this.a = oiyVar2;
        this.b = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, int[] iArr) {
        this.c = i;
        this.b = oiyVar;
        this.a = oiyVar2;
        this.d = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, short[] sArr) {
        this.c = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.d = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, boolean[] zArr) {
        this.c = i;
        this.b = oiyVar;
        this.d = oiyVar2;
        this.a = oiyVar3;
    }

    public jmc(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, int i, byte[][] bArr) {
        this.c = i;
        this.b = oiyVar;
        this.d = oiyVar2;
        this.a = oiyVar3;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        Executor executor;
        Object r;
        switch (this.c) {
            case 0:
                Object obj = this.d;
                Context b = ((lba) this.a).b();
                lfb lfbVar = (lfb) this.b.a();
                kor a = kos.a(b);
                a.d("mdd_pds_config");
                a.e(lxj.w("LoggingState", lfbVar));
                Uri a2 = a.a();
                kqg a3 = kqh.a();
                a3.f(a2);
                a3.e(jis.e);
                a3.g(false);
                jma jmaVar = (jma) obj;
                kqj d = kql.d(b, jmaVar.a);
                d.c = jez.t("gms_icing_mdd_network_usage_monitor", lfbVar);
                d.b();
                d.c(new jmm());
                a3.b(d.a());
                return ((kqi) jmaVar.b).a(a3.a());
            case 1:
                Random random = lfq.a;
                return new jmn((kqr) this.d.a(), (jjd) this.b.a(), (Executor) this.a.a());
            case 2:
                ?? r0 = this.d;
                oiy oiyVar = this.a;
                if (((kbt) this.b.a()).c) {
                    executor = (Executor) r0.a();
                } else {
                    executor = (Executor) oiyVar.a();
                }
                nxp.X(executor);
                return executor;
            case 3:
                return new kdu(((lba) this.d).b(), ((kbc) this.a).a(), (String) this.b.a());
            case 4:
                Executor executor2 = (Executor) this.a.a();
                kfx kfxVar = (kfx) this.b.a();
                gjz gjzVar = (gjz) this.d.a();
                return new kcu(null);
            case 5:
                lfb lfbVar2 = (lfb) ((npf) this.a).b;
                ?? r2 = this.d;
                if (((lfb) ((npf) this.b).b).e() || lfbVar2.e()) {
                    r = lmz.r((kdt) r2.a());
                } else {
                    r = lrr.a;
                }
                nxp.X(r);
                return r;
            case 6:
                gjz gjzVar2 = (gjz) this.a.a();
                return new khy((Random) this.b.a(), (khl) this.d.a());
            case 7:
                return new kiq(((lba) this.d).b(), (lfb) ((npf) this.a).b, ((kip) this.b).a(), new ClearcutMetricSnapshotTransmitter());
            default:
                return new lap(npd.b(this.b), npd.b(this.d), npd.b(this.a));
        }
    }
}
