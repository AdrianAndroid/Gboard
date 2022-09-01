package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gka  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gka implements gel {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gka(ewt ewtVar, String str, ewv ewvVar, int i) {
        this.d = i;
        this.a = ewtVar;
        this.c = str;
        this.b = ewvVar;
    }

    public /* synthetic */ gka(gdh gdhVar, String str, Executor executor, int i) {
        this.d = i;
        this.a = gdhVar;
        this.b = str;
        this.c = executor;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gel
    public final void e(Object obj) {
        if (this.d == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            ?? r2 = this.c;
            Void r8 = (Void) obj;
            boolean z = gkb.a;
            String str = (String) obj3;
            ((gdh) obj2).d(str).h(r2, new doq(str, 12));
            return;
        }
        Object obj4 = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Void r82 = (Void) obj;
        ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$scheduleBrellaTask$2", 417, "SpeechFederationTrainerManager.java")).w("Successfully scheduled %s.", obj5);
        ((ewt) obj4).d((ewv) obj6);
    }
}
