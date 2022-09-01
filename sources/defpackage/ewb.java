package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.trainingcache.ekho.LearningController;

/* compiled from: PG */
/* renamed from: ewb  reason: default package */
/* loaded from: classes.dex */
public final class ewb implements ewf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/ekho/EkhoWriterController");
    public final ewd b;
    public final ewe c;
    public final mkr d;
    public final LearningController e;
    private final iye f;

    public ewb(Context context) {
        ewd a2 = evw.a(context);
        ewe b = evw.b();
        LearningController learningController = new LearningController();
        mkr mkrVar = (mkr) evw.a.a();
        this.b = a2;
        this.c = b;
        this.d = mkrVar;
        this.e = learningController;
        new ewi(mkrVar, new gsd(b, learningController), null, null);
        ewa ewaVar = new ewa(this);
        this.f = ewaVar;
        ewaVar.d(mkrVar);
    }

    @Override // defpackage.ewf
    public final void a(lgb lgbVar) {
        if (!this.c.d()) {
            return;
        }
        b(3, (mud) lgbVar.a());
    }

    public final void b(final int i, final mud mudVar) {
        this.b.c(201, nni.GBOARD_VOICE_INPUT_CONTEXT, new lfr() { // from class: evy
            @Override // defpackage.lfr
            public final void a(Object obj) {
                int i2 = i;
                mud mudVar2 = mudVar;
                gil gilVar = (gil) obj;
                StringBuilder sb = new StringBuilder();
                nfh t = noa.f.t();
                int i3 = 0;
                while (i3 < mudVar2.a.size()) {
                    mue mueVar = (mue) mudVar2.a.get(i3);
                    if (i3 == 0) {
                        boolean z = !mueVar.b;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        noa noaVar = (noa) t.b;
                        noaVar.a |= 4;
                        noaVar.d = z;
                        i3 = 0;
                    }
                    if (i3 == mudVar2.a.size() - 1) {
                        boolean z2 = !mueVar.b;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        noa noaVar2 = (noa) t.b;
                        noaVar2.a |= 8;
                        noaVar2.e = z2;
                    }
                    sb.append(mueVar.a);
                    i3++;
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                noa noaVar3 = (noa) t.b;
                noaVar3.b = i2 - 1;
                int i4 = noaVar3.a | 1;
                noaVar3.a = i4;
                String sb2 = sb.toString();
                noaVar3.a = i4 | 2;
                noaVar3.c = sb2;
                gilVar.a((noa) t.cz());
            }
        });
    }
}
