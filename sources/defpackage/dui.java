package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dui  reason: default package */
/* loaded from: classes.dex */
public final class dui {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardActiveSessionStreamManager");
    static final Duration b = Duration.ofHours(1);
    public final duz c;
    public final dun d;
    private long g;
    private final idk j;
    private final ScheduledExecutorService k;
    private final oqv l;
    private List f = llp.q();
    private Optional h = Optional.empty();
    private Optional i = Optional.empty();
    public boolean e = false;

    public dui(duz duzVar, dun dunVar, oqv oqvVar, byte[] bArr) {
        ieh j = ieh.j();
        mks a2 = gxo.a(6);
        this.c = duzVar;
        this.d = dunVar;
        this.l = oqvVar;
        this.j = j;
        this.k = a2;
    }

    private final synchronized dvg g() {
        nuq nuqVar;
        if (this.h.isPresent()) {
            return (dvg) this.h.get();
        }
        oqv oqvVar = this.l;
        duh duhVar = new duh(this);
        Object obj = oqvVar.b;
        nuq nuqVar2 = fgy.b;
        if (nuqVar2 == null) {
            synchronized (fgy.class) {
                nuqVar = fgy.b;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.BIDI_STREAMING;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "KeyboardActiveSession");
                    a2.b();
                    a2.a = ohw.b(fhy.d);
                    a2.b = ohw.b(fgz.c);
                    nuqVar = a2.a();
                    fgy.b = nuqVar;
                }
            }
            nuqVar2 = nuqVar;
        }
        dvg dvgVar = new dvg(oig.b(((nsb) obj).a(nuqVar2, (nsa) oqvVar.a), duhVar));
        this.h = Optional.of(dvgVar);
        return dvgVar;
    }

    private final synchronized void h() {
        if (this.h.isPresent()) {
            this.h = Optional.empty();
            ((oin) this.h.get()).a();
        }
    }

    public final void a() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardActiveSessionStreamManager", "closeStream", 116, "KeyboardActiveSessionStreamManager.java")).t("Closing stream.");
        h();
    }

    public final synchronized void b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isAfter = Instant.ofEpochMilli(this.g).plus(b).isAfter(Instant.ofEpochMilli(elapsedRealtime));
        if (this.f.size() == list.size()) {
            Stream stream = Collection$EL.stream(this.f);
            Objects.requireNonNull(list);
            if (stream.allMatch(new cjx(list, 8)) && isAfter) {
                return;
            }
        }
        this.j.e(dua.NGA_EXPERIMENTS, list);
        this.f = list;
        this.g = elapsedRealtime;
    }

    public final synchronized void c(bkl bklVar) {
        this.i.ifPresent(dug.b);
        nfh h = ebl.h();
        nfh t = fhx.c.t();
        nfh t2 = fhw.b.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        bklVar.getClass();
        ((fhw) t2.b).a = bklVar;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fhx fhxVar = (fhx) t.b;
        fhw fhwVar = (fhw) t2.cz();
        fhwVar.getClass();
        fhxVar.b = fhwVar;
        fhxVar.a = 1;
        if (h.c) {
            h.cD();
            h.c = false;
        }
        fhy fhyVar = (fhy) h.b;
        fhx fhxVar2 = (fhx) t.cz();
        fhy fhyVar2 = fhy.d;
        fhxVar2.getClass();
        fhyVar.b = fhxVar2;
        fhyVar.a = 1;
        f((fhy) h.cz());
    }

    public final void d(boolean z) {
        this.e = z;
        nfh h = ebl.h();
        nfh t = fhu.b.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((fhu) t.b).a = z;
        if (h.c) {
            h.cD();
            h.c = false;
        }
        fhy fhyVar = (fhy) h.b;
        fhu fhuVar = (fhu) t.cz();
        fhy fhyVar2 = fhy.d;
        fhuVar.getClass();
        fhyVar.b = fhuVar;
        fhyVar.a = 4;
        f((fhy) h.cz());
    }

    public final synchronized void e() {
        nfh h = ebl.h();
        nfh t = fhx.c.t();
        nez nezVar = nez.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fhx fhxVar = (fhx) t.b;
        nezVar.getClass();
        fhxVar.b = nezVar;
        fhxVar.a = 2;
        if (h.c) {
            h.cD();
            h.c = false;
        }
        fhy fhyVar = (fhy) h.b;
        fhx fhxVar2 = (fhx) t.cz();
        fhy fhyVar2 = fhy.d;
        fhxVar2.getClass();
        fhyVar.b = fhxVar2;
        fhyVar.a = 1;
        f((fhy) h.cz());
        this.i.ifPresent(dug.a);
        this.i = Optional.of(kcu.M(new clc(this, 2), ((Long) dsu.n.c()).longValue(), TimeUnit.MILLISECONDS, this.k));
    }

    public final void f(fhy fhyVar) {
        g().c(fhyVar);
    }
}
