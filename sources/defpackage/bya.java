package defpackage;

import android.util.Pair;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bya  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bya implements hho {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bya(bxm bxmVar, int i) {
        this.b = i;
        this.a = bxmVar;
    }

    public /* synthetic */ bya(byb bybVar, int i) {
        this.b = i;
        this.a = bybVar;
    }

    public bya(cfd cfdVar, int i) {
        this.b = i;
        this.a = cfdVar;
    }

    public /* synthetic */ bya(Delight5Facilitator delight5Facilitator, int i) {
        this.b = i;
        this.a = delight5Facilitator;
    }

    public /* synthetic */ bya(feo feoVar, int i) {
        this.b = i;
        this.a = feoVar;
    }

    public /* synthetic */ bya(ieh iehVar, int i) {
        this.b = i;
        this.a = iehVar;
    }

    public /* synthetic */ bya(igq igqVar, int i) {
        this.b = i;
        this.a = igqVar;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        boolean z = true;
        switch (this.b) {
            case 0:
                byb bybVar = (byb) this.a;
                if (!((Boolean) bybVar.d().c()).booleanValue()) {
                    return;
                }
                bybVar.l();
                return;
            case 1:
                lmz lmzVar = bxm.a;
                boolean z2 = false;
                if (set.contains(bxn.a)) {
                    if (((Boolean) bxn.a.c()).booleanValue()) {
                        z2 = true;
                    } else {
                        ((bxm) this.a).g.g(mqc.TFLITE_NWP);
                    }
                }
                if (set.contains(bxn.b) && ((Boolean) bxn.a.c()).booleanValue()) {
                    z2 = true;
                }
                if (set.contains(bxn.c)) {
                    if (((Boolean) bxn.c.c()).booleanValue()) {
                        z2 = true;
                    } else {
                        ((bxm) this.a).g.g(mqc.EXPRESSIVE_CONCEPT_TRIGGERING);
                    }
                }
                if (!Collections.disjoint(bxm.a, set)) {
                    ((bxm) this.a).g.g(mqc.CONCEPT_PRED);
                    z2 = true;
                }
                if (!Collections.disjoint(bxm.b, set)) {
                    ((bxm) this.a).g.g(mqc.TRANSFORMER_EXPRESSION_PRED);
                } else {
                    z = z2;
                }
                if (set.contains(bxn.t)) {
                    ((bxm) this.a).g.f(byh.b());
                }
                if (!set.contains(bxn.p) && !z) {
                    return;
                }
                ((bxm) this.a).g.d();
                return;
            case 2:
                ((Delight5Facilitator) this.a).z();
                return;
            case 3:
                ((cfd) this.a).m.execute(new cfa(this, set, null));
                return;
            case 4:
                Object obj = this.a;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "refreshManifest", 355, "SpeechPackManager.java")).t("refreshManifest()");
                feo feoVar = (feo) obj;
                Pair b = feoVar.b();
                kcu.U((mko) b.second, new fel(feoVar, b, 1), feoVar.d);
                return;
            case 5:
                ((ieh) this.a).r();
                return;
            case 6:
                igq igqVar = (igq) this.a;
                igqVar.c.set(igqVar.a.a.d());
                igqVar.c(hqp.b());
                return;
            case 7:
                igq igqVar2 = (igq) this.a;
                igqVar2.d.set(igqVar2.a.a.c());
                igqVar2.b(hqr.b());
                return;
            default:
                igq igqVar3 = (igq) this.a;
                igqVar3.o = igr.h(igqVar3.a.a);
                boolean z3 = igqVar3.o;
                igqVar3.a();
                return;
        }
    }
}
