package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.DynamicLm;
import j$.time.Duration;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caw  reason: default package */
/* loaded from: classes.dex */
public final class caw extends cav {
    final /* synthetic */ cax a;

    public caw(cax caxVar) {
        this.a = caxVar;
    }

    @Override // defpackage.cav
    protected final void a(mvm mvmVar, DynamicLm dynamicLm) {
        muo muoVar;
        long j;
        ltg ltgVar = cax.a;
        nfh t = muo.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        muo muoVar2 = (muo) t.b;
        mvmVar.getClass();
        muoVar2.b = mvmVar;
        muoVar2.a |= 1;
        mvl mvlVar = mvl.UNKNOWN;
        mvl b = mvl.b(mvmVar.b);
        if (b == null) {
            b = mvl.UNKNOWN;
        }
        if (b.ordinal() != 3) {
            ltd ltdVar = (ltd) ((ltd) cax.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/DynamicLanguageModelPruner", "getPruneRequest", 100, "DynamicLanguageModelPruner.java");
            mvl b2 = mvl.b(mvmVar.b);
            if (b2 == null) {
                b2 = mvl.UNKNOWN;
            }
            ltdVar.u("getPruneRequest() : Unexpected LM type: %d", b2.A);
            muoVar = null;
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muo muoVar3 = (muo) t.b;
            muoVar3.a |= 2;
            muoVar3.c = true;
            muoVar = (muo) t.cz();
        }
        if (muoVar == null) {
            return;
        }
        nfh nfhVar = (nfh) muoVar.N(5);
        nfhVar.cG(muoVar);
        mvl b3 = mvl.b(mvmVar.b);
        if (b3 == null) {
            b3 = mvl.UNKNOWN;
        }
        if (b3 == mvl.USER_HISTORY) {
            j = cbw.a(mvmVar);
            ieh.j().e(dda.USER_HISTORY_SIZE_BEFORE_PRUNE, Long.valueOf(j));
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            muo muoVar4 = (muo) nfhVar.b;
            muoVar4.a |= 16;
            muoVar4.e = true;
            long seconds = ((int) Duration.ofMillis(System.currentTimeMillis()).getSeconds()) - cax.b.getSeconds();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            muo muoVar5 = (muo) nfhVar.b;
            muoVar5.a |= 4;
            muoVar5.d = seconds;
        } else {
            j = -1;
        }
        dynamicLm.openDynamicLm(mvmVar);
        dynamicLm.pruneDynamicLmIfNeeded((muo) nfhVar.cz());
        dynamicLm.flushDynamicLm(mvmVar);
        dynamicLm.closeDynamicLm(mvmVar);
        mvl b4 = mvl.b(mvmVar.b);
        if (b4 == null) {
            b4 = mvl.UNKNOWN;
        }
        if (b4 != mvl.USER_HISTORY) {
            return;
        }
        if (cfm.e(mvmVar.d, ino.M(this.a.d).y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f), this.a.d)) {
            this.a.c.A(mvmVar, false);
            Context context = this.a.d;
            Locale locale = new Locale(mvmVar.g, mvmVar.h);
            String y = ino.M(this.a.d).y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f);
            int y2 = jco.y(mvmVar.k);
            if (y2 == 0) {
                y2 = 87010621;
            }
            mvm f = cfm.f(context, locale, y, y2);
            this.a.c.A(f, true);
            this.a.c.L(f);
        }
        ieh.j().e(dda.USER_HISTORY_PRUNE_SIZE, Long.valueOf(Math.max(0L, j - cbw.a(mvmVar))));
    }
}
