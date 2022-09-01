package defpackage;

import com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme;

/* compiled from: PG */
/* renamed from: drs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class drs implements dsj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ drs(SimpleJapaneseIme simpleJapaneseIme, int i) {
        this.b = i;
        this.a = simpleJapaneseIme;
    }

    public /* synthetic */ drs(dqx dqxVar, int i) {
        this.b = i;
        this.a = dqxVar;
    }

    public /* synthetic */ drs(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.dsj
    public final void a(ggc ggcVar, iay iayVar) {
        gfv gfvVar;
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            if (iayVar == null) {
                ((ltd) SimpleJapaneseIme.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/ime/SimpleJapaneseIme", "lambda$new$1", 159, "SimpleJapaneseIme.java")).t("triggeringKeyEvent should not be null in sendKeyCallback.");
                return;
            }
            SimpleJapaneseIme simpleJapaneseIme = (SimpleJapaneseIme) obj;
            drq drqVar = simpleJapaneseIme.d;
            if (drqVar.a != null && drq.a(iayVar)) {
                boolean isEmpty = drqVar.b.isEmpty();
                while (!drqVar.b.isEmpty() && drqVar.b.pollFirst() != iayVar) {
                }
                if (!isEmpty && drqVar.b.isEmpty() && drqVar.d) {
                    drqVar.a.y(2048L, drqVar.c);
                }
            }
            simpleJapaneseIme.e.a(ggcVar, iayVar);
        } else if (i != 1) {
            if (i == 2) {
                Object obj2 = this.a;
                jdg.u(iayVar);
                ((SimpleJapaneseIme) obj2).E.O(hfd.d(iayVar));
                return;
            }
            ?? r6 = this.a;
            lug lugVar = dsn.a;
            r6.run();
        } else {
            Object obj3 = this.a;
            if (ggcVar != null && (ggcVar.a & 1) != 0) {
                ggh gghVar = ggcVar.b;
                if (gghVar == null) {
                    gghVar = ggh.o;
                }
                if ((gghVar.a & 8) != 0) {
                    ggh gghVar2 = ggcVar.b;
                    if (gghVar2 == null) {
                        gghVar2 = ggh.o;
                    }
                    ggt ggtVar = gghVar2.e;
                    if (ggtVar == null) {
                        ggtVar = ggt.f;
                    }
                    int f = guw.f(ggtVar.b);
                    if (f != 0 && f == 16) {
                        if ((ggcVar.a & 2) != 0) {
                            ggn ggnVar = ggcVar.c;
                            if (ggnVar == null) {
                                ggnVar = ggn.k;
                            }
                            gfvVar = ggnVar.f;
                            if (gfvVar == null) {
                                gfvVar = gfv.e;
                            }
                        } else {
                            gfvVar = null;
                        }
                        dqx dqxVar = (dqx) obj3;
                        dqxVar.c = gfvVar;
                        dqxVar.a(Integer.MAX_VALUE, true, false);
                        return;
                    }
                }
            }
            ((luc) dqx.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/ime/CandidateSupplier", "lambda$sendCandidatesToImeDelegate$0", 160, "CandidateSupplier.java")).t("command should be EXPAND_SUGGESTION command this callback.");
        }
    }
}
