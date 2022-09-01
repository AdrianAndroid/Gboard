package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: cde  reason: default package */
/* loaded from: classes.dex */
public final class cde implements cdd {
    public final ixi b;
    public final iov a = new iov();
    public ixh c = null;
    public final lex d = lex.c(' ');

    public cde() {
        ixe ixeVar = null;
        try {
            ixeVar = (ixe) iwy.a.b().get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ltd) ((ltd) ((ltd) cdf.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/dlam/training/DlamTrainingData$TrainingCacheTrainingData", "<init>", 'M', "DlamTrainingData.java")).t("Failed to get storage adapter.");
        }
        this.b = ixeVar;
    }

    @Override // defpackage.cdd, java.lang.AutoCloseable
    public final void close() {
        ixh ixhVar = this.c;
        if (ixhVar != null) {
            gvt.a(ixhVar);
            this.c = null;
        }
        ixi ixiVar = this.b;
        if (ixiVar != null) {
            gvt.a(ixiVar);
        }
    }
}
