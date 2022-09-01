package defpackage;

import android.os.SystemClock;
import com.google.android.keyboard.client.delight5.Decoder;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cbz  reason: default package */
/* loaded from: classes.dex */
public final class cbz {
    public final Decoder a;
    public final idk b;
    public volatile ifn c;
    public final boe d = new boe((byte[]) null, (byte[]) null);
    private final hyn e;

    public cbz(Decoder decoder, hyn hynVar, idk idkVar) {
        this.a = decoder;
        this.e = hynVar;
        this.b = idkVar;
    }

    public final mrv a(mrt mrtVar) {
        long o = this.d.o();
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mru mruVar = (mru) mrtVar.b;
        mru mruVar2 = mru.l;
        mruVar.a |= 8;
        mruVar.e = o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mrv checkSpelling = this.a.checkSpelling(mrtVar);
        this.b.g(caq.DELIGHT_CHECK_SPELLING, SystemClock.elapsedRealtime() - elapsedRealtime);
        this.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(((mru) mrtVar.b).e));
        return checkSpelling;
    }

    public final mvn b(mvm mvmVar) {
        nfh t = mvn.d.t();
        long o = this.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvn mvnVar = (mvn) t.b;
        int i = mvnVar.a | 2;
        mvnVar.a = i;
        mvnVar.c = o;
        mvmVar.getClass();
        mvnVar.b = mvmVar;
        mvnVar.a = i | 1;
        return (mvn) t.cz();
    }

    public final void c(mqb mqbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d(mti.CRANK_SET_RUNTIME_PARAMS);
        this.a.setEngineRuntimeParams(mqbVar);
        e(mti.CRANK_SET_RUNTIME_PARAMS);
        this.b.g(cac.CRANK_SET_RUNTIME_PARAMS, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    public final void d(mti mtiVar) {
        hyn hynVar = this.e;
        oll.e(mtiVar, "nativeCall");
        if (hynVar.b.get(mtiVar.ar) == null) {
            mkq a = hynVar.a.a(new hvg(mtiVar, 10), 4L, TimeUnit.SECONDS);
            oll.d(a, "nativeCall: NativeCalls)…imeUnit.SECONDS\n        )");
            hynVar.b.put(mtiVar.ar, a);
            hynVar.c = mtiVar;
        }
    }

    public final void e(mti mtiVar) {
        this.e.a(mtiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(mvm mvmVar, ids idsVar, idu iduVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mvn b = b(mvmVar);
        boolean loadLanguageModel = this.a.loadLanguageModel(b);
        this.b.g(idsVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        this.b.f(cap.LOG_NATIVE_METRICS, iduVar, Long.valueOf(b.c));
        return loadLanguageModel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mtc g(nfh nfhVar, caq caqVar, idu iduVar) {
        long o = this.d.o();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mtb mtbVar = (mtb) nfhVar.b;
        mtb mtbVar2 = mtb.i;
        mtbVar.a |= 32;
        mtbVar.f = o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mtc decode = this.a.decode((mtb) nfhVar.cz());
        this.b.g(caqVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        msg msgVar = ((mtb) nfhVar.b).e;
        if (msgVar == null) {
            msgVar = msg.l;
        }
        this.b.f(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, iduVar, Long.valueOf(((mtb) nfhVar.b).f), Long.valueOf(msgVar.d));
        return decode;
    }
}
