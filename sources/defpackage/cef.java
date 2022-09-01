package defpackage;

import com.google.android.keyboard.client.delight5.DynamicLm;

/* compiled from: PG */
/* renamed from: cef  reason: default package */
/* loaded from: classes.dex */
final class cef extends cav {
    private final ced a;

    public cef(ced cedVar) {
        this.a = cedVar;
    }

    @Override // defpackage.cav
    protected final void a(mvm mvmVar, DynamicLm dynamicLm) {
        dynamicLm.openDynamicLm(mvmVar);
        dynamicLm.clearDynamicLm(mvmVar);
        int i = 0;
        for (String str : this.a.b) {
            nfh t = muk.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muk mukVar = (muk) t.b;
            mvmVar.getClass();
            mukVar.d = mvmVar;
            mukVar.a |= 4;
            nfh t2 = mur.f.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mur murVar = (mur) t2.b;
            str.getClass();
            int i2 = murVar.a | 1;
            murVar.a = i2;
            murVar.b = str;
            int i3 = i2 | 2;
            murVar.a = i3;
            murVar.c = "";
            murVar.a = i3 | 4;
            murVar.d = 1;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muk mukVar2 = (muk) t.b;
            mur murVar2 = (mur) t2.cz();
            murVar2.getClass();
            mukVar2.b = murVar2;
            mukVar2.a |= 1;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muk mukVar3 = (muk) t.b;
            mukVar3.a |= 2;
            mukVar3.c = 1;
            dynamicLm.incrementNgramInDynamicLm((muk) t.cz());
            i++;
        }
        int i4 = 0;
        for (String str2 : this.a.a.keySet()) {
            nfh t3 = muk.e.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            muk mukVar4 = (muk) t3.b;
            mvmVar.getClass();
            mukVar4.d = mvmVar;
            mukVar4.a |= 4;
            nfh t4 = mur.f.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mur murVar3 = (mur) t4.b;
            str2.getClass();
            int i5 = murVar3.a | 1;
            murVar3.a = i5;
            murVar3.b = str2;
            int i6 = i5 | 2;
            murVar3.a = i6;
            murVar3.c = "";
            murVar3.a = i6 | 4;
            murVar3.d = 1;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            muk mukVar5 = (muk) t3.b;
            mur murVar4 = (mur) t4.cz();
            murVar4.getClass();
            mukVar5.b = murVar4;
            mukVar5.a |= 1;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            muk mukVar6 = (muk) t3.b;
            mukVar6.a |= 2;
            mukVar6.c = 1;
            dynamicLm.incrementNgramInDynamicLm((muk) t3.cz());
            i4++;
        }
        dynamicLm.flushDynamicLm(mvmVar);
        dynamicLm.closeDynamicLm(mvmVar);
        ((ltd) ((ltd) ceg.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/personaldictionary/PersonalLanguageModelUpdater$UpdateOperation", "performInternal", 160, "PersonalLanguageModelUpdater.java")).y("run() : Added %d words and %d shortcuts", i, i4);
    }
}
