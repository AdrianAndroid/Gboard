package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.io.File;

/* compiled from: PG */
/* renamed from: exv  reason: default package */
/* loaded from: classes.dex */
public final class exv {
    private static volatile exv f;
    public final feo b;
    public final mkr c;
    public final ewj d;
    private final Context g;
    private final idk h;
    private final ino i;
    private static final llw e = llw.n("local_computation_plan.pb", "", "p13n_precompute_plan.pb", "-precompute", "p13n_training_plan.pb", "-train");
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager");

    public exv(Context context, feo feoVar, idk idkVar, mkr mkrVar, ino inoVar, ewj ewjVar, byte[] bArr) {
        this.g = context.getApplicationContext();
        this.b = feoVar;
        this.h = idkVar;
        this.c = mkrVar;
        this.i = inoVar;
        this.d = ewjVar;
    }

    public static exv a(Context context) {
        exv exvVar = f;
        if (exvVar == null) {
            synchronized (exv.class) {
                exvVar = f;
                if (exvVar == null) {
                    feo c = feo.c(context, "speech-packs");
                    ieh j = ieh.j();
                    mks a2 = gxo.a(10);
                    ino M = ino.M(context);
                    ewj ewjVar = new ewj(context);
                    mho mhoVar = mho.a;
                    exvVar = new exv(context, c, j, a2, M, ewjVar, null);
                    f = exvVar;
                }
            }
        }
        return exvVar;
    }

    public final fwm b(File file, String str, String str2, jav javVar) {
        File file2 = new File(file, str2);
        if (!file2.exists()) {
            return null;
        }
        String str3 = "SpeechPersonalization-" + file.getName() + str;
        File d = exr.d(this.g, javVar, str);
        haz a2 = evg.a();
        a2.e(false);
        return exc.b(this.g, str3, file2, file, d, a2.d(), null);
    }

    public final gen c(fwm fwmVar) {
        gen c = gbh.c(this.g, this.c, fwmVar);
        c.l(this.c, ewr.d);
        c.h(this.c, new doq(this, 8));
        return c;
    }

    public final void d(exx exxVar) {
        this.h.e(exw.a, exxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.exu e(defpackage.nfh r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exv.e(nfh, java.util.List):exu");
    }

    public final void f(File file, jav javVar, evg evgVar, String str, File file2, nfh nfhVar) {
        file.getName();
        file2.getName();
        long epochMilli = Instant.now().toEpochMilli();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        nji njiVar = (nji) nfhVar.b;
        nji njiVar2 = nji.n;
        njiVar.a |= 2048;
        njiVar.m = epochMilli;
        String str2 = "SpeechPersonalization-" + file.getName() + str;
        File d = exr.d(this.g, javVar, str);
        exc.e(d);
        njj njjVar = ((nji) nfhVar.b).b;
        if (njjVar == null) {
            njjVar = njj.g;
        }
        int ah = ndb.ah(njjVar.e);
        if (ah == 0) {
            ah = 1;
        }
        njj njjVar2 = ((nji) nfhVar.b).b;
        if (njjVar2 == null) {
            njjVar2 = njj.g;
        }
        int ag = ndb.ag(njjVar2.f);
        if (ag == 0) {
            ag = 1;
        }
        nfh t = nnq.i.t();
        String str3 = javVar.n;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnq nnqVar = (nnq) t.b;
        str3.getClass();
        int i = 1 | nnqVar.a;
        nnqVar.a = i;
        nnqVar.b = str3;
        boolean z = evgVar.a;
        int i2 = i | 2;
        nnqVar.a = i2;
        nnqVar.c = z;
        nnqVar.e = ah - 1;
        int i3 = i2 | 8;
        nnqVar.a = i3;
        nnqVar.f = ag - 1;
        nnqVar.a = i3 | 16;
        String file3 = file.toString();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnq nnqVar2 = (nnq) t.b;
        file3.getClass();
        nnqVar2.a |= 32;
        nnqVar2.g = file3;
        String file4 = file2.toString();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnq nnqVar3 = (nnq) t.b;
        file4.getClass();
        nnqVar3.a |= 64;
        nnqVar3.h = file4;
        gen c = c(exc.b(this.g, str2, file2, file, d, evgVar, (nnq) t.cz()));
        c.l(this.c, new exi(this, nfhVar, 4));
        c.h(this.c, new exj(this, nfhVar, 3));
    }
}
