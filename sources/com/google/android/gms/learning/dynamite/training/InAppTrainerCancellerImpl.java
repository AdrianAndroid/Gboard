package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainerCancellerImpl extends gaw {
    private static final jns c = jnl.b("brella", "InAppTrnCnclImpl");
    public Context a;
    public Executor b;

    public final boolean b(fwo fwoVar, fwe fweVar) {
        if (!fweVar.az(this.a.getApplicationContext().getPackageName())) {
            fwoVar.e(job.IN_APP_TRAINING_API_DISABLED);
            return true;
        }
        return false;
    }

    @Override // defpackage.gax
    public void cancelJobsByType(int i, fpo fpoVar) {
        gni.j(new fym(this, i), fpoVar, this.b, c, this.a);
    }

    @Override // defpackage.gax
    public boolean init(ftm ftmVar, ftm ftmVar2, fpo fpoVar) {
        try {
            this.a = (Context) ftl.c(ftmVar);
            this.b = (Executor) ftl.c(ftmVar2);
            gni.j(new fyo(this, 1), fpoVar, this.b, c, this.a);
            return true;
        } catch (Error | RuntimeException e) {
            fyb.y(this.a, e);
            throw e;
        }
    }
}
